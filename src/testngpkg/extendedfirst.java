package testngpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class extendedfirst {
ChromeDriver driver;
@BeforeTest
public void beforetest()
{
	driver=new ChromeDriver();
}
@Test
public void test()
{
	driver.get("https://www.facebook.com");
	String extendedtitle=driver.getTitle();
	String expected="facebook";
	Assert.assertEquals(extendedtitle,expected,"comparison failed");
	System.out.println("title verified");;
}
}
