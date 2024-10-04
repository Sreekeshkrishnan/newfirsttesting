package firstpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class junitsecond {
ChromeDriver driver;
@Before
public void before()
{
	driver=new ChromeDriver();
	driver.get("https://www.google.com");
	
}
@Test
public void test1()
{
	String stg=driver.getPageSource();
	if(stg.contains("Gmail"))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}



{
	driver.findElement(By.name("q")).sendKeys("technopark",Keys.ENTER);
}
}
}
//@After
//public void close()
//{
	//driver.quit();
//}
//}
