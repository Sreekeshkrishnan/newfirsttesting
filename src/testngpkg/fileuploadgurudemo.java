package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fileuploadgurudemo {
       ChromeDriver driver;
     @BeforeTest
     public void testbefore()
     {
    	 driver=new ChromeDriver();
    	 driver.get("https://demo.guru99.com/test/upload/");;
     }
     @Test
     public void test()
     {
        driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("\"E:\\SREEKESH K.pdf\"");
     }
}
