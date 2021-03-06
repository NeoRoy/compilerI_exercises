package de.tu.testing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import syntaxtree.Node;
import visitor.GJPigletInterpreter;
import minijava.MJParser;
import minijava.MJScanner;
import minijava.Program;
import beaver.Parser.Exception;

public class TestHelper {
	public static minijava.Program buildProgram(InputStream stream) throws IOException, Exception {
		MJParser parser = new MJParser();
		Program ast = (Program) parser.parse(new MJScanner(stream));
		return ast;
	}
	
	public static minijava.Program buildProgram(String codeToBeAppended) throws IOException, Exception {
		Program p = buildProgram(new ByteArrayInputStream(codeToBeAppended.getBytes(StandardCharsets.UTF_8)));
		return p;
	}

	public static minijava.Program buildProgram(File appendCode) throws IOException, Exception {
		if (appendCode != null) {
			BufferedReader r = new BufferedReader(new FileReader(appendCode));
			StringBuilder b = new StringBuilder();

			String line;
			while ((line = r.readLine()) != null) {
				b.append(line).append("\n");
			}
			r.close();
			return buildProgram(b.toString());
		} else {
			return buildProgram((String) null);
		}
	}
	
static Object pigletParser = null;
	
	public static piglet.Program buildPiglet(InputStream stream) throws IOException, Exception {
		minijava.Program p = buildProgram(stream);
		return TestEnvironmentFactory.getEnvironment().getPiglet(p);
	}

	public static piglet.Program buildPiglet(String codeToBeAppended) throws IOException, Exception {
		minijava.Program p = buildProgram(codeToBeAppended);
		return TestEnvironmentFactory.getEnvironment().getPiglet(p);
	}

	public static piglet.Program buildPiglet(File appendCode) throws IOException, Exception {
		minijava.Program p = buildProgram(appendCode);
		return TestEnvironmentFactory.getEnvironment().getPiglet(p);
	}
	
	public static List<String> getOutput(File code) throws FileNotFoundException, IOException, Exception, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException{
		piglet.Program p = buildPiglet(new FileInputStream(code));
		List<String> result = TestHelper.getOutput(p);
		return result;
	}
	
	public static spiglet.Program buildSpiglet(InputStream stream) throws IOException, Exception {
		piglet.Program p = buildPiglet(stream);
		return TestEnvironmentFactory.getEnvironment().getSPiglet(p);
	}

	public static spiglet.Program buildSpiglet(String codeToBeAppended) throws IOException, Exception {
		piglet.Program p = buildPiglet(codeToBeAppended);
		return TestEnvironmentFactory.getEnvironment().getSPiglet(p);
	}

	public static spiglet.Program buildSpiglet(File appendCode) throws IOException, Exception {
		piglet.Program p = buildPiglet(appendCode);
		return TestEnvironmentFactory.getEnvironment().getSPiglet(p);
	}
	
	public static List<String> getOutput(spiglet.Program p) throws IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException{
		return getOutput(p.toString());
	}
	
	public static List<String> getOutput(String pigletCode) throws IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException{
		PrintStream sout = System.out;
		InputStream sin = System.in;
		
		List<String> result = new ArrayList<>();
		PipedOutputStream outPipeOut = new PipedOutputStream();
		InputStream outPipeIn = new PipedInputStream(outPipeOut);
		PrintStream out = new PrintStream(outPipeOut);
		System.setOut(out);
		
		PipedOutputStream inPipeOut = new PipedOutputStream();
		InputStream inPipeIn = new PipedInputStream(inPipeOut);
		System.setIn(inPipeIn);
		
		Method s = Class.forName("PgInterpreter").getMethod("main", String[].class);
		SendTextRunnable str = new SendTextRunnable(pigletCode, inPipeOut);
		new Thread(str).start();
		Class pigletParserClass = Class.forName("PigletParser");
		if(pigletParser == null){
			Constructor parserConstructor = pigletParserClass.getConstructor(InputStream.class);
			pigletParser = parserConstructor.newInstance(System.in);
		} else {
			Method reinit = pigletParserClass.getMethod("ReInit", InputStream.class);
			reinit.invoke(pigletParser, System.in);
		}
		Method goal = pigletParserClass.getMethod("Goal");
		Node root = (Node) goal.invoke(pigletParser, new Object[]{});
		
		 root.accept(new GJPigletInterpreter("MAIN",null,root),root);
		sin.close();
		System.setOut(sout);
		System.setIn(sin);
		out.flush();
		out.close();
		BufferedReader in = new BufferedReader(new InputStreamReader(outPipeIn));
		String line;
		while((line = in.readLine()) != null){
			result.add(line);
		}
		in.close();
		return result;
	}
	
	public static List<String> getOutput(piglet.Program p) throws IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException{
		return getOutput(p.toString());
	}
	
	private static class SendTextRunnable implements Runnable {
		private static final int WAIT_DURATION = 200;
		private String text;
		private OutputStream streamToWriteTo;
		
		public SendTextRunnable(String text, OutputStream streamToWriteTo){
			this.text = text;
			this.streamToWriteTo = streamToWriteTo;
		}
		
		@Override
		public void run() {
			try {
				Thread.sleep(WAIT_DURATION);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			BufferedWriter w = new BufferedWriter(new OutputStreamWriter(streamToWriteTo));
			try {
				w.append(text);
				w.flush();
				w.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
