package carFrigge.kanga;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
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
import java.util.ArrayList;
import java.util.List;

import syntaxtree.Node;
import de.tu.testing.TestHelper;


public class KangaHelper {
	static Object kangaParser = null;
	
	public static List<String> getOutput(File f) throws IOException, Exception{
		spiglet.Program sp = TestHelper.buildSpiglet(f);
		kanga.Program kp = sp.toKanga();
		
//		return getOutput(kp.print().getString());
		
		PrintStream sout = System.out;
		PipedOutputStream outPipeOut = new PipedOutputStream();
		InputStream outPipeIn = new PipedInputStream(outPipeOut);
		PrintStream out = new PrintStream(outPipeOut);
		List<String> result = new ArrayList<>();
		System.setOut(out);
		kp.execute();
		System.setOut(sout);
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
//	
//	public static List<String> getOutput(String pigletCode) throws IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException{
//		PrintStream sout = System.out;
//		InputStream sin = System.in;
//		
//		List<String> result = new ArrayList<>();
//		PipedOutputStream outPipeOut = new PipedOutputStream();
//		InputStream outPipeIn = new PipedInputStream(outPipeOut);
//		PrintStream out = new PrintStream(outPipeOut);
//		System.setOut(out);
//		
//		PipedOutputStream inPipeOut = new PipedOutputStream();
//		InputStream inPipeIn = new PipedInputStream(inPipeOut);
//		System.setIn(inPipeIn);
//		
//		SendTextRunnable str = new SendTextRunnable(pigletCode, inPipeOut);
//		new Thread(str).start();
//		Class kangaParserClass = Class.forName("KangaParser");
//		if(kangaParser == null){
//			Constructor parserConstructor = kangaParserClass.getConstructor(InputStream.class);
//			kangaParser = parserConstructor.newInstance(System.in);
//		} else {
//			Method reinit = kangaParserClass.getMethod("ReInit", InputStream.class);
//			reinit.invoke(kangaParser, System.in);
//		}
//		Method goal = kangaParserClass.getMethod("Goal");
//		Node root = (Node) goal.invoke(kangaParser, new Object[]{});
//		
//		 root.accept(new KGInterpreter(),root);
//		sin.close();
//		System.setOut(sout);
//		System.setIn(sin);
//		out.flush();
//		out.close();
//		BufferedReader in = new BufferedReader(new InputStreamReader(outPipeIn));
//		String line;
//		while((line = in.readLine()) != null){
//			result.add(line);
//		}
//		in.close();
//		return result;
//	}
//	private static class SendTextRunnable implements Runnable {
//		private static final int WAIT_DURATION = 200;
//		private String text;
//		private OutputStream streamToWriteTo;
//		
//		public SendTextRunnable(String text, OutputStream streamToWriteTo){
//			this.text = text;
//			this.streamToWriteTo = streamToWriteTo;
//		}
//		
//		@Override
//		public void run() {
//			try {
//				Thread.sleep(WAIT_DURATION);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			
//			BufferedWriter w = new BufferedWriter(new OutputStreamWriter(streamToWriteTo));
//			try {
//				w.append(text);
//				w.flush();
//				w.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//		
//	}
}
