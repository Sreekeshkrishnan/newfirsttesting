package firstpkg;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkvalidationprgm {
	
ChromeDriver driver;
@Before
  public void before()
  {
	driver=new ChromeDriver();
	driver.get("https://www.google.com");
	
  }
@ Test
public void test1()
{
	List<WebElement> li= driver.findElements(By.tagName("a"));
	System.out.println("total no of links----"+li);
	for (WebElement ele:li)
	{
		String link=ele.getAttribute("href");
		verify (link);
	}
}
private void verify(String link) {
	
	try {
		URL u=new URL(link);
		HttpURLConnection con=(HttpURLConnection)u.openConnection();
		con.connect();
		if(con.getResponseCode()==200)
		{
			System.out.println("successfull--"+link);
		}
		else if(con.getResponseCode()==404)
		{
			System.out.println("error--"+link);
		}
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	
		
	
	
	
}

}
