package firstpkg;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class junitfirst {
	ChromeDriver driver;
	@Before
	public void initial()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void test1()
	{
		driver.get("https://www.google.com");
	}
	@After
	public void after1()
	{
		driver.close();
	}
	

}
