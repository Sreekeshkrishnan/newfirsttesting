package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class facebookxmlfile {
	ChromeDriver driver;
	@BeforeTest
	public void beforetest()
	{
		driver=new ChromeDriver();
	}
    @BeforeMethod
    public void beforemethod()
    {
	   driver.get("https://www.facebook.com");
    }
    @Parameters({"email","password"})
    @Test
    public void test(String email,String pswd)
    {
    	driver.findElement(By.name("email")).sendKeys(email);;
    	driver.findElement(By.name("pass")).sendKeys(pswd);
    	driver.findElement(By.name("login")).click();
    	
    }
}
