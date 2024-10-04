package firstpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
ChromeDriver driver;
@Before
public void before()
{
	driver= new ChromeDriver();
	driver.get("https://www.facebook.com");
}
@Test
public void test1()
{
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sreekeshmdr@gmail.com");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("sreekeshmdr");
	driver.findElement(By.xpath("//button[@name='login']")).click();
}
@After
public void after()
{
	driver.quit();
}
}
