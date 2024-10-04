package firstpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertprgrm {
  ChromeDriver driver;
  @Before
  public void before()
  {
	 driver=new ChromeDriver();
	 
  }
  @Test
  public void test1()
  {
	  driver.get("file:///C:/Users/Asus/OneDrive/Desktop/alert_example.html");
	  driver.findElement(By.xpath("/html/body/input[1]")).click();
	  Alert a=driver.switchTo().alert();
	  String alertmsg= a.getText();
	 // a.accept();// accepting the alert
	  a.dismiss();// dismissing the alert
	  System.out.println(alertmsg);
	  driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("sreekesh");
	  driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("madavoor");
	  driver.findElement(By.xpath("/html/body/input[4]")).click();
	  
}
}
