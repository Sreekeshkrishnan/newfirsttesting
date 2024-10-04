package firstpkg;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class screenshotprgm {
	ChromeDriver driver;
	@Before
	public void before()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");	
	}
	@Test
	public void test1() throws IOException 
	{
		
		//File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileHandler.copy(src, new File("E://screenshot.png"));
		
		WebElement screenshottech= driver.findElement(By.xpath("//button[@name='login']"));
		File screenshot= screenshottech .getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshot, new File("./screenshot/screenshottech.png"));
		
	}

}
