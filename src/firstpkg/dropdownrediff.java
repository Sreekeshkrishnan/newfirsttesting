package firstpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownrediff {
ChromeDriver driver;
@Before
public void before()
{
	driver=new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
}
@Test
 public void test() {
	WebElement dayele=driver.findElement(By.xpath("//select[@name='countryef868c6e']"));
	Select day= new Select(dayele);
	day.selectByVisibleText("India");
}



}
