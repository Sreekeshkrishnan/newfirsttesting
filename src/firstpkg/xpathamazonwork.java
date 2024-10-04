package firstpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathamazonwork {
	ChromeDriver driver;
	@Before
	public void before()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles");
		driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[2]")).click();
	}

}
