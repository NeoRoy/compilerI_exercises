package hauke;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.junit.Test;

import beaver.Parser.Exception;
import de.tu.testing.TestHelper;

public class Piglet {
	
	@Test(timeout=1000)
	public void allocTest() throws FileNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IOException, Exception{
		File f = new File("tests/Hauke/AllocTest.java");
		List<String> result = TestHelper.getOutput(f);
		assertEquals(1, result.size());
		assertEquals("2", result.get(0));
	}
	
	@Test(timeout=1000)
	public void andTest() throws FileNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IOException, Exception{
		File f = new File("tests/Hauke/AndTest.java");
		List<String> result = TestHelper.getOutput(f);
		assertEquals(6, result.size());
		assertEquals("0", result.get(0));
		assertEquals("0", result.get(1));
		assertEquals("0", result.get(2));
		assertEquals("1", result.get(3));
		assertEquals("0", result.get(4));
		assertEquals("1", result.get(5));
	}
	
	@Test(timeout=1000)
	public void binaryTreeTest() throws FileNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IOException, Exception{
		File f = new File("tests/Hauke/BinaryTree.java");
		List<String> result = TestHelper.getOutput(f);
		assertEquals(26, result.size());
		assertEquals("16", result.get(0));
		assertEquals("100000000", result.get(1));
		assertEquals("8", result.get(2)); assertEquals("16", result.get(3));
		assertEquals("4", result.get(4)); assertEquals("8", result.get(5)); assertEquals("12", result.get(6)); assertEquals("14", result.get(7)); assertEquals("16", result.get(8)); assertEquals("20", result.get(9)); assertEquals("24", result.get(10)); assertEquals("28", result.get(11));

		assertEquals("1", result.get(12));
		assertEquals("1", result.get(13));
		assertEquals("1", result.get(14));
		assertEquals("0", result.get(15));
		assertEquals("1", result.get(16));
		assertEquals("4", result.get(17)); assertEquals("8", result.get(18)); assertEquals("14", result.get(19)); assertEquals("16", result.get(20)); assertEquals("20", result.get(21)); assertEquals("24", result.get(22)); assertEquals("28", result.get(23));

		assertEquals("0", result.get(24));
		assertEquals("0", result.get(25));
	}
	
	@Test(timeout=1000)
	public void bubbleSortTest() throws FileNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IOException, Exception{
		File f = new File("tests/Hauke/BubbleSort.java");
		List<String> result = TestHelper.getOutput(f);
		assertEquals(22, result.size());
		
		assertEquals("20", result.get(0));
		assertEquals("7", result.get(1));
		assertEquals("12", result.get(2));
		assertEquals("18", result.get(3));
		assertEquals("2", result.get(4));
		assertEquals("11", result.get(5));
		assertEquals("6", result.get(6));
		assertEquals("9", result.get(7));
		assertEquals("19", result.get(8));
		assertEquals("5", result.get(9));
		assertEquals("99999", result.get(10));
		assertEquals("2", result.get(11));
		assertEquals("5", result.get(12));
		assertEquals("6", result.get(13));
		assertEquals("7", result.get(14));
		assertEquals("9", result.get(15));
		assertEquals("11", result.get(16));
		assertEquals("12", result.get(17));
		assertEquals("18", result.get(18));
		assertEquals("19", result.get(19));
		assertEquals("20", result.get(20));
		assertEquals("0", result.get(21));
	}
	
	@Test(timeout=1000)
	public void extendsTest() throws FileNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IOException, Exception{
		File f = new File("tests/Hauke/ExtendsTest.java");
		List<String> result = TestHelper.getOutput(f);
		assertEquals(2, result.size());
		assertEquals("23", result.get(0));
		assertEquals("23", result.get(1));
	}
	
	@Test(timeout=1000)
	public void factorialTest() throws FileNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IOException, Exception{
		File f = new File("tests/Hauke/Factorial.java");
		List<String> result = TestHelper.getOutput(f);
		assertEquals(1, result.size());
		assertEquals("3628800", result.get(0));
	}
	
	@Test(timeout=1000)
	public void linearSearchTest() throws FileNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IOException, Exception{
		File f = new File("tests/Hauke/LinearSearch.java");
		List<String> result = TestHelper.getOutput(f);
		assertEquals(15, result.size());
		assertEquals("10", result.get(0));
		assertEquals("11", result.get(1));
		assertEquals("12", result.get(2));
		assertEquals("13", result.get(3));
		assertEquals("14", result.get(4));
		assertEquals("15", result.get(5));
		assertEquals("16", result.get(6));
		assertEquals("17", result.get(7));
		assertEquals("18", result.get(8));
		assertEquals("9999", result.get(9));
		assertEquals("0", result.get(10));
		assertEquals("1", result.get(11));
		assertEquals("1", result.get(12));
		assertEquals("0", result.get(13));
		assertEquals("55", result.get(14));
	}
	
	@Test(timeout=1000)
	public void linkedListTest() throws FileNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IOException, Exception{
		File f = new File("tests/Hauke/LinkedList.java");
		List<String> result = TestHelper.getOutput(f);
		assertEquals(26, result.size());
		assertEquals("25", result.get(0));
		assertEquals("10000000", result.get(1));
		assertEquals("39", result.get(2));
		assertEquals("25", result.get(3));
		assertEquals("10000000", result.get(4));
		assertEquals("22", result.get(5));
		assertEquals("39", result.get(6));
		assertEquals("25", result.get(7));
		assertEquals("1", result.get(8));
		assertEquals("0", result.get(9));
		assertEquals("10000000", result.get(10));
		assertEquals("28", result.get(11));
		assertEquals("22", result.get(12));
		assertEquals("39", result.get(13));
		assertEquals("25", result.get(14));
		assertEquals("2220000", result.get(15));
		assertEquals("-555", result.get(16));
		assertEquals("-555", result.get(17));
		assertEquals("28", result.get(18));
		assertEquals("22", result.get(19));
		assertEquals("25", result.get(20));
		assertEquals("33300000", result.get(21));
		assertEquals("22", result.get(22));
		assertEquals("25", result.get(23));
		assertEquals("44440000", result.get(24));
		assertEquals("0", result.get(25));
	}
	
	@Test(timeout=1000)
	public void moreThan4Test() throws FileNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IOException, Exception{
		File f = new File("tests/Hauke/MoreThan4.java");
		List<String> result = TestHelper.getOutput(f);
		assertEquals(13, result.size());
		assertEquals("1", result.get(0));
		assertEquals("2", result.get(1));
		assertEquals("3", result.get(2));
		assertEquals("4", result.get(3));
		assertEquals("5", result.get(4));
		assertEquals("6", result.get(5));
		assertEquals("6", result.get(6));
		assertEquals("5", result.get(7));
		assertEquals("4", result.get(8));
		assertEquals("3", result.get(9));
		assertEquals("2", result.get(10));
		assertEquals("1", result.get(11));
		assertEquals("0", result.get(12));
	}
	
	@Test(timeout=1000)
	public void precedenceTest() throws FileNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IOException, Exception{
		File f = new File("tests/Hauke/PrecedenceTest.java");
		List<String> result = TestHelper.getOutput(f);
		assertEquals(1, result.size());
		assertEquals("14", result.get(0));
	}
	
	@Test(timeout=1000)
	public void printTest() throws FileNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IOException, Exception{
		File f = new File("tests/Hauke/PrintTest.java");
		List<String> result = TestHelper.getOutput(f);
		assertEquals(1, result.size());
		assertEquals("4", result.get(0));
	}
	
	@Test(timeout=1000)
	public void quickSortTest() throws FileNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IOException, Exception{
		File f = new File("tests/Hauke/QuickSort.java");
		List<String> result = TestHelper.getOutput(f);
		assertEquals(22, result.size());
		assertEquals("20", result.get(0));
		assertEquals("7", result.get(1));
		assertEquals("12", result.get(2));
		assertEquals("18", result.get(3));
		assertEquals("2", result.get(4));
		assertEquals("11", result.get(5));
		assertEquals("6", result.get(6));
		assertEquals("9", result.get(7));
		assertEquals("19", result.get(8));
		assertEquals("5", result.get(9));
		assertEquals("9999", result.get(10));
		assertEquals("2", result.get(11));
		assertEquals("5", result.get(12));
		assertEquals("6", result.get(13));
		assertEquals("7", result.get(14));
		assertEquals("9", result.get(15));
		assertEquals("11", result.get(16));
		assertEquals("12", result.get(17));
		assertEquals("18", result.get(18));
		assertEquals("19", result.get(19));
		assertEquals("20", result.get(20));
		assertEquals("0", result.get(21));
	}
	
	@Test(timeout=1000)
	public void treeVisitorTest() throws FileNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IOException, Exception{
		File f = new File("tests/Hauke/TreeVisitor.java");
		List<String> result = TestHelper.getOutput(f);
		assertEquals(43, result.size());
		assertEquals("16", result.get(0));
		assertEquals("100000000", result.get(1));
		assertEquals("4", result.get(2));
		assertEquals("8", result.get(3));
		assertEquals("12", result.get(4));
		assertEquals("14", result.get(5));
		assertEquals("16", result.get(6));
		assertEquals("20", result.get(7));
		assertEquals("24", result.get(8));
		assertEquals("28", result.get(9));
		assertEquals("100000000", result.get(10));
		assertEquals("50000000", result.get(11));
		assertEquals("333", result.get(12));
		assertEquals("333", result.get(13));
		assertEquals("333", result.get(14));
		assertEquals("28", result.get(15));
		assertEquals("24", result.get(16));
		assertEquals("333", result.get(17));
		assertEquals("20", result.get(18));
		assertEquals("16", result.get(19));
		assertEquals("333", result.get(20));
		assertEquals("333", result.get(21));
		assertEquals("333", result.get(22));
		assertEquals("14", result.get(23));
		assertEquals("12", result.get(24));
		assertEquals("8", result.get(25));
		assertEquals("333", result.get(26));
		assertEquals("4", result.get(27));
		assertEquals("100000000", result.get(28));
		assertEquals("1", result.get(29));
		assertEquals("1", result.get(30));
		assertEquals("1", result.get(31));
		assertEquals("0", result.get(32));
		assertEquals("1", result.get(33));
		assertEquals("4", result.get(34));
		assertEquals("8", result.get(35));
		assertEquals("14", result.get(36));
		assertEquals("16", result.get(37));
		assertEquals("20", result.get(38));
		assertEquals("24", result.get(39));
		assertEquals("28", result.get(40));
		assertEquals("0", result.get(41));
		assertEquals("0", result.get(42));
	}	
}
