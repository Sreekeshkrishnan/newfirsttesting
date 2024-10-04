package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class lovepdfconvfileuploadautoil3 {
  ChromeDriver driver;
  @BeforeTest
  public void beforetest()
  {
	  driver=new ChromeDriver();
	
  }
  @Test
  public void test() throws Exception
  {
	  driver.get("https://www.ilovepdf.com/pdf_to_word");
    driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();  
    Thread.sleep(2000);
    Runtime.getRuntime().exec("\"E:\\autoit\\autoiisele.exe\"");
    Thread.sleep(2000);
  }
}
