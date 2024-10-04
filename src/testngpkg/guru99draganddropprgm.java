package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class guru99draganddropprgm {
	ChromeDriver driver;
	@BeforeTest
	public void beforetest()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
	}
	@Test
	public void test()
	{
		Actions act=new Actions(driver);
		WebElement blankacct=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		WebElement blankamount=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		WebElement bank= driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement money= driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		act.dragAndDrop(bank, blankacct);
		act.dragAndDrop(money, blankamount);
		act.perform();
		
	}

}
