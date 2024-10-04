package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class multiplewindowhandlerguru {
 ChromeDriver driver;
 @BeforeTest
 public void beforetest()
 {
	 driver=new ChromeDriver();
	 
 }
 @Test
 public void test()
 {
	 driver.get("https://demo.guru99.com/popup.php");
	 String parentwindow=driver.getWindowHandle();//current window
	
	 System.out.println("parent window title" + driver.getTitle());
	 driver.findElement(By.xpath("/html/body/p/a")).click();
	 Set<String> windowhandle= driver.getWindowHandles();//multiple window
	 for (String window : windowhandle)
		 {
		 if(!window.equalsIgnoreCase(parentwindow))
		 {
			 driver.switchTo().window(window);
			 driver.close();
		 }
		 driver.switchTo().window(parentwindow);
		 };
 }
}
