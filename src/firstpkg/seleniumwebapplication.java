package firstpkg;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumwebapplication {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();// driver launch
		driver.get("https://www.facebook.com");// applicATION LAUNCH
		driver.close();
		String actualtitle=driver.getTitle();
		String exptitle="facebook";
		if(actualtitle.equals(exptitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}

	}

}
