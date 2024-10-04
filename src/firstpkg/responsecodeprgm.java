package firstpkg;

import java.net.BindException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class responsecodeprgm {
 ChromeDriver driver;
 String baseurl="https://www.google.com";
 @Before
 public void before()
 {
	 driver=new ChromeDriver();
 }
 @Test
 public void test1() throws Exception
 {
	 driver.get(baseurl);
	 URL u= new URL(baseurl);
	 HttpURLConnection con=(HttpURLConnection)u.openConnection();
	 con.connect();
	 if(con.getResponseCode()==200)
	 {
		 System.out.println("successfull------"+baseurl);
	 }
	 else
	 {
		 System.out.println("not success");
	 }
	 
; }
}
