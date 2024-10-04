package testngpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrower {
    WebDriver driver;
    @BeforeTest
    @Parameters("browser")
    public void beforetest(String browser)
    {
    	if(browser.equalsIgnoreCase("Chrome"))
    	{
    		driver=new ChromeDriver();
    	}
    	else if(browser.equalsIgnoreCase("Edge"))
    	{
    		driver=new EdgeDriver();
    	}
    }
    @Test
    public void test()
    {
    	driver.get("https://www.google.com");
    }
}
