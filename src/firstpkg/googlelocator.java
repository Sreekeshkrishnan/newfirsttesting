package firstpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlelocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChromeDriver driver=new ChromeDriver();
        driver.findElement(By.name("q")).sendKeys("technopark",Keys.ENTER);
        driver.findElement(By.name("btnk")).click();
	}

}
