package firstpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ebayprogrm {
ChromeDriver driver;
@Before
public void before()
{
	driver=new ChromeDriver();
	driver.get("https:/www.ebay.com");

}
@Test
public void test()
{
	driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("mobiles");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	//driver.findElement(By.xpath("//a[@alt='Your shopping cart is empty']"));
	//driver.findElement(By.xpath("//a[@class='fake-btn action start-shop fake-btn--secondary fake-btn--fluid']"));
}
}
