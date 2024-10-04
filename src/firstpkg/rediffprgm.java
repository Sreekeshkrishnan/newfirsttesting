package firstpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediffprgm {
ChromeDriver driver;
@Before 
public void before()
{
	driver=new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	
}
@Test
public void test()
{
    boolean logo =driver.findElement(By.xpath("//img[@title='Rediff.com']")).isDisplayed();
    if(logo)
    {
    	System.out.println("logo is present");
    }
    else
    {
    	System.out.println("logo is not presented");
    }
    
	
}
}
