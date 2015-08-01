package spiglet;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.junit.Test;

import beaver.Parser.Exception;

public class SPigletTest {
	@Test
	public void testBaseProgram() throws IOException, Exception, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException {
		File f = new File("tests/MainTestForPiglet.java");
		List<String> result = TestHelper.getOutput(f);
		assertEquals(1, result.size());
		assertEquals("15", result.get(0));
	}
	@Test
	public void testMultipleClassDecls() throws IOException, Exception, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException {
		File f = new File("tests/MainTestForPigletWithMultipleClassDecls.java");
		List<String> result = TestHelper.getOutput(f);
		assertEquals(6, result.size());
		assertEquals("1", result.get(0));
		assertEquals("3", result.get(1));
		assertEquals("2", result.get(2));
		assertEquals("3", result.get(3));
		assertEquals("2", result.get(4));
		assertEquals("3", result.get(5));
	}
	@Test
	public void testArray() throws IOException, Exception, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException {
		File f = new File("tests/MainTestForPigletArray.java");
		List<String> result = TestHelper.getOutput(f);
		assertEquals(2, result.size());
		assertEquals("0", result.get(0));
		assertEquals("1", result.get(1));
	}
}
