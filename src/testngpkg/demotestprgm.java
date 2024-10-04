package testngpkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demotestprgm {
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
@Test(priority=1,dependsOnMethods= {"test2"})
public void test()
{
	System.out.println("firsttestdetails");
}
@Test(priority=2,enabled=false)
public void test2()
{
	System.out.println("secondtestdetails");
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
