package HomeWork15TestNG;

import org.testng.annotations.Test;

import core.Massive;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	@Test(dataProvider = "DataPr")
	public void f(Integer a, Integer b, Integer c, int expected) {
		Massive massive = new Massive();
		Assert.assertEquals(massive.mulDiv(a, b, c), expected);

	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@BeforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("@afterMethod");
	}

	@DataProvider
	public Object[][] DataPr() {
		return new Object[][] { new Object[] { 1, 4, 2, 2 }, new Object[] { 10, 300, 2, 1500 }, };
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("@beforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("@afterClass");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("@beforeTest");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("@afterTest");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("@beforeSuite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("@afterSuite");
	}

	@Test
	public void testSummary() {
		Massive massive = new Massive();
		Assert.assertEquals(massive.summary(120, 240, 360), 720);
	}

	@Test
	public void testmultyArray() {
		Massive massive = new Massive();
		int[] mas = { 2, 4, 5 };
		Assert.assertEquals(massive.multyArray(mas), 40);
	}

	@Test
	public void testdivArray() {
		Massive massive = new Massive();
		int[] mas = { 120, 2, 3 };
		Assert.assertEquals(massive.divArray(mas), 0);
	}

	@Test
	public void testisName() {
		Massive massive = new Massive();
		String[] mas = { "Person¹2" };
		Assert.assertEquals(massive.isName(mas), "Person¹2");
	}

	@Test
	public void testsmtArr() {
		Massive massive = new Massive();
		int[] mas = { 10, 100, 1000 };
		Assert.assertEquals(massive.smtArr(mas), 1110);
	}

	@Test
	public void testMinus() {
		Massive massive = new Massive();
		Assert.assertEquals(massive.minus(365, 360), -5);
	}

	@Test
	public void testMinPlus() {
		Massive massive = new Massive();
		Assert.assertEquals(massive.minPlus(200, 400, 650, 50), 400);
	}

	@Test
	public void testMinMul() {
		Massive massive = new Massive();
		Assert.assertEquals(massive.minMul(120, 3, 300), 60);

	}

}
