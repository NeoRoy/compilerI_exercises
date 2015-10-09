package hauke;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import minijava.CompilationError;

import org.junit.Test;

import beaver.Parser.Exception;
import de.tu.testing.TestEnvironmentFactory;
import de.tu.testing.TestHelper;

public class Minijava {

	
	@Test
	public void arrayTest() throws FileNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IOException, Exception{
		File f = new File("tests/Hauke/ArrayTest.java");
		int errors = TestEnvironmentFactory.getEnvironment().getNumOfError(TestHelper.buildProgram(f));
		assertEquals(0, errors);
	}
	
	@Test
	public void basicTest() throws FileNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IOException, Exception{
		File f = new File("tests/Hauke/BasicTest.java");
		int errors = TestEnvironmentFactory.getEnvironment().getNumOfError(TestHelper.buildProgram(f));
		assertEquals(0, errors);
	}
	
	@Test
	public void binopTest() throws FileNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IOException, Exception{
		File f = new File("tests/Hauke/BinopTest.java");
		int errors = TestEnvironmentFactory.getEnvironment().getNumOfError(TestHelper.buildProgram(f));
		assertEquals(0, errors);
	}
	
	@Test
	public void boolTest() throws FileNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IOException, Exception{
		File f = new File("tests/Hauke/BinopTest.java");
		int errors = TestEnvironmentFactory.getEnvironment().getNumOfError(TestHelper.buildProgram(f));
		assertEquals(0, errors);
	}
	
	@Test
	public void classTest() throws FileNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IOException, Exception{
		File f = new File("tests/Hauke/ClassTest.java");
		int errors = TestEnvironmentFactory.getEnvironment().getNumOfError(TestHelper.buildProgram(f));
		assertEquals(0, errors);
	}
	
	@Test
	public void ifTest() throws FileNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IOException, Exception{
		File f = new File("tests/Hauke/IfTest.java");
		int errors = TestEnvironmentFactory.getEnvironment().getNumOfError(TestHelper.buildProgram(f));
		assertEquals(0, errors);
	}
	
	@Test
	public void intTest() throws FileNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IOException, Exception{
		File f = new File("tests/Hauke/IntTest.java");
		int errors = TestEnvironmentFactory.getEnvironment().getNumOfError(TestHelper.buildProgram(f));
		assertEquals(0, errors);
	}
	
	@Test
	public void mainTest() throws FileNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IOException, Exception{
		File f = new File("tests/Hauke/MainTest.java");
		int errors = TestEnvironmentFactory.getEnvironment().getNumOfError(TestHelper.buildProgram(f));
		assertEquals(2, errors);
	}
	
	@Test
	public void mDeclTest() throws FileNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IOException, Exception{
		File f = new File("tests/Hauke/MDeclTest.java");
		int errors = TestEnvironmentFactory.getEnvironment().getNumOfError(TestHelper.buildProgram(f));
		assertEquals(0, errors);
	}
	
	@Test
	public void methodTest() throws FileNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IOException, Exception{
		File f = new File("tests/Hauke/MethodTest.java");
		int errors = TestEnvironmentFactory.getEnvironment().getNumOfError(TestHelper.buildProgram(f));
		assertEquals(0, errors);
	}
	
	@Test
	public void methodTest2() throws FileNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IOException, Exception{
		File f = new File("tests/Hauke/MethodTest2.java");
		int errors = TestEnvironmentFactory.getEnvironment().getNumOfError(TestHelper.buildProgram(f));
		assertEquals(0, errors);
	}
	
	@Test
	public void methodTest3() throws FileNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IOException, Exception{
		File f = new File("tests/Hauke/MethodTest3.java");
		int errors = TestEnvironmentFactory.getEnvironment().getNumOfError(TestHelper.buildProgram(f));
		assertEquals(0, errors);
	}
	
	@Test
	public void methodTest4() throws FileNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IOException, Exception{
		File f = new File("tests/Hauke/MethodTest4.java");
		int errors = TestEnvironmentFactory.getEnvironment().getNumOfError(TestHelper.buildProgram(f));
		assertEquals(0, errors);
	}
	
	@Test
	public void methodTest5() throws FileNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IOException, Exception{
		File f = new File("tests/Hauke/MethodTest5.java");
		int errors = TestEnvironmentFactory.getEnvironment().getNumOfError(TestHelper.buildProgram(f));
		assertEquals(0, errors);
	}
	
	@Test
	public void negTest() throws FileNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IOException, Exception{
		File f = new File("tests/Hauke/NegTest.java");
		int errors = TestEnvironmentFactory.getEnvironment().getNumOfError(TestHelper.buildProgram(f));
		assertEquals(0, errors);
	}
	
	@Test
	public void newTest() throws FileNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IOException, Exception{
		File f = new File("tests/Hauke/NewTest.java");
		int errors = TestEnvironmentFactory.getEnvironment().getNumOfError(TestHelper.buildProgram(f));
		assertEquals(0, errors);
	}
	
	@Test
	public void newTest2() throws FileNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IOException, Exception{
		File f = new File("tests/Hauke/NewTest2.java");
		int errors = TestEnvironmentFactory.getEnvironment().getNumOfError(TestHelper.buildProgram(f));
		assertEquals(0, errors);
	}
	
	@Test
	public void overrideTest() throws FileNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IOException, Exception{
		File f = new File("tests/Hauke/OverrideTest.java");
		int errors = TestEnvironmentFactory.getEnvironment().getNumOfError(TestHelper.buildProgram(f));
		assertEquals(0, errors);
	}
	
	@Test
	public void overrideTest2() throws FileNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IOException, Exception{
		File f = new File("tests/Hauke/OverrideTest2.java");
		int errors = TestEnvironmentFactory.getEnvironment().getNumOfError(TestHelper.buildProgram(f));
		assertEquals(0, errors);
	}
	
	@Test
	public void paramTest() throws FileNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IOException, Exception{
		File f = new File("tests/Hauke/ParamTest.java");
		int errors = TestEnvironmentFactory.getEnvironment().getNumOfError(TestHelper.buildProgram(f));
		assertEquals(0, errors);
	}
	
	@Test
	public void paramTest2() throws FileNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IOException, Exception{
		File f = new File("tests/Hauke/ParamTest2.java");
		int errors = TestEnvironmentFactory.getEnvironment().getNumOfError(TestHelper.buildProgram(f));
		assertEquals(0, errors);
	}
	
	@Test
	public void paramTest3() throws FileNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IOException, Exception{
		File f = new File("tests/Hauke/ParamTest3.java");
		int errors = TestEnvironmentFactory.getEnvironment().getNumOfError(TestHelper.buildProgram(f));
		assertEquals(0, errors);
	}
	
	@Test
	public void thisTest() throws FileNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IOException, Exception{
		File f = new File("tests/Hauke/ThisTest.java");
		int errors = TestEnvironmentFactory.getEnvironment().getNumOfError(TestHelper.buildProgram(f));
		assertEquals(0, errors);
	}
	
	@Test
	public void unopTest() throws FileNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IOException, Exception{
		File f = new File("tests/Hauke/UnopTest.java");
		int errors = TestEnvironmentFactory.getEnvironment().getNumOfError(TestHelper.buildProgram(f));
		assertEquals(0, errors);
	}
	
	@Test
	public void varTest() throws FileNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IOException, Exception{
		File f = new File("tests/Hauke/VarTest.java");
		int errors = TestEnvironmentFactory.getEnvironment().getNumOfError(TestHelper.buildProgram(f));
		assertEquals(0, errors);
	}
	
	@Test
	public void varTest2() throws FileNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IOException, Exception{
		File f = new File("tests/Hauke/VarTest2.java");
		int errors = TestEnvironmentFactory.getEnvironment().getNumOfError(TestHelper.buildProgram(f));
		assertEquals(0, errors);
	}
	
	@Test
	public void whileTest() throws FileNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IOException, Exception{
		File f = new File("tests/Hauke/WhileTest.java");
		int errors = TestEnvironmentFactory.getEnvironment().getNumOfError(TestHelper.buildProgram(f));
		assertEquals(0, errors);
	}
}
