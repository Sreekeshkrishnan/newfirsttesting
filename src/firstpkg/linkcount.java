package firstpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkcount {
ChromeDriver driver;
@Before
public void before()
{
	driver=new ChromeDriver();
	driver.get("https://www.google.com");;
}
@Test
public void test1()
{
  List<WebElement> links=driver.findElements(By.tagName("a"));
  System.out.println("total no.of links are:"+links.size());
  for (WebElement ele:links)
  {
	  String linkdetails= ele.getAttribute("href");
	  String linktext=ele.getText();
	  System.out.println(linkdetails+"-------"+linktext);
  }
}
}
