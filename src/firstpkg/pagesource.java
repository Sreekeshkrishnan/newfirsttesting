package firstpkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class pagesource {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String stg=driver.getPageSource();
		if(stg.contains("Gmail"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		

	}

}
