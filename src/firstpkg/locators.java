package firstpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ChromeDriver driver=new ChromeDriver();
       driver.get("https://www.facebook.com");
       driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
       driver.findElement(By.name("login")).sendKeys("sreekesh");
       driver.findElement(By.id("pass")).sendKeys("ertfg");;
	}

}
