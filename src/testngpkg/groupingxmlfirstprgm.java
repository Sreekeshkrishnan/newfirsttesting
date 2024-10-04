package testngpkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class groupingxmlfirstprgm {
	@BeforeTest
	public void  before()
	{
		System.out.println("browser open");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("urldetails");
	}
	@Test(groups= {"monkey","machine"})
	public void test()
	{
		System.out.println("firsttestdetails");
	}
	@Test(groups= {"regression"})
	public void test2()
	{
		System.out.println("secondtestdetails");
	}
	@Test(groups= {"sanity","smoke"})
	public void test3()
	{
		System.out.println("Thirdtestdetails");
	}
	@Test(groups= {"unity","smoke"})
	public void test4()
	{
		System.out.println("fourthtestdetails");
	}
	@Test(groups= {"sanity","unity"})
	public void test5()
	{
		System.out.println("fifthtestdetails");
	}
	@Test(groups= {"monkey"})
	public void test6()
	{
		System.out.println("sixthtestdetails");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("aftermethod");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("browser close");
	}
}
