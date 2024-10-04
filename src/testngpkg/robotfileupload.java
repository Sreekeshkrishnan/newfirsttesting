package testngpkg;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class robotfileupload {
	 ChromeDriver driver;
	 @BeforeTest
	 public void beforetest() throws Exception 
	 {
		 driver=new ChromeDriver();
	 }
		
	
	 @Test
	 
	 public void fileUpload (String p) throws AWTException {
		 fileUpload("E:\\SREEKESH K.pdf\"");
		 driver.get("https://www.ilovepdf.com/pdf_to_word");
		 driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
		 StringSelection strselect= new StringSelection(p);
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strselect, null);
		 Robot robot=new Robot();
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_V);
		 robot.keyRelease(KeyEvent.VK_V);
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
	 }
	 

}
