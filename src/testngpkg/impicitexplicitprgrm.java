package testngpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class impicitexplicitprgrm {
	ChromeDriver driver;
	@BeforeTest
	public void beforetest()
	{
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com");
	}
	@Test
	public void test()
	{
		//WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));//explicit
		Actions act=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit
		WebElement electronics= driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]/a"));
		act.moveToElement(electronics);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]/div[2]/div[1]/nav[1]/ul/li[1]/a")));
		driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]/div[2]/div[1]/nav[1]/ul/li[1]/a"));
		act.perform();
		//act.dragAndDrop(electronics,phone);//dragand drop prgm
	}

}
