package testngpkg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class datepickprgm {
	ChromeDriver driver;
	@BeforeTest
	public void beforetest()
	{
		driver=new ChromeDriver();
		driver.get("https://www.booking.com");
	}
	@Test
	public void test() throws Exception
	{
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[2]/div/div[1]/button[1]/span")).click();
		Thread.sleep(10);
		while(true)
		{
			String monthtext=driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/h3")).getText();
			System.out.println("month="+monthtext);
			if(monthtext.equals("October 2024"))
			{
				System.out.println("month is selected");
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/button")).click();
			}
		}
		List<WebElement>alldates=driver.findElements(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[2]/table/tbody/tr[]/td[]"));
		for(WebElement dateelement:alldates)
		{
			String date=dateelement.getText();
			if(date.equals("23"))
			{
				dateelement.click();
				break;
			}
		}
	}



	}


