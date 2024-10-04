package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class rediffxmlfile {
ChromeDriver driver;
@BeforeTest
public void beforetest()
{
	driver=new ChromeDriver();
}
@BeforeMethod
public void beforemethod()
{
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
}
@Parameters({"m"})
@Test
public void test1(String male, WebElement m)
{
	driver.findElement(By.xpath("//input[@value='m']"));
	m.isSelected();
	{
		System.out.println("successfull");
	}
	 
	
	
}
}

