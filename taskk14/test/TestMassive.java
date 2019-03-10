package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import core.Massive;

public class TestMassive {

	@Before
	public void Before() {
		System.out.println("@Before");
	}
	@After
	public void After() {
		System.out.println("@After");
	}
	@BeforeClass
	public static void BeforeClass() {
		System.out.println("@BeforeClass");
	}
	@AfterClass
	public static void AfterClass() {
		System.out.println("@AfterClass");
	}
	@Test
	public void test() {
		System.out.println("@Test");
	}
	@Test
	public void testName() {
		Massive massive = new Massive();
		String expectedResult = "MyMassive";
		String actualResult = massive.getName();
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testException() {
		Massive massive = new Massive();
		massive.division();
		}
	@Ignore
	@Test(expected = ArithmeticException.class)
	public void testExceptionIgnored() {
		Massive massive = new Massive();
		massive.division();
		}
	
	@Test
	public void testNull() {
		Massive massive = null;
		Assert.assertNull(massive);
	}
	@Test
	public void testNotNull() {
		Massive massive = new Massive();
		Assert.assertNotNull(massive);
	}
}
