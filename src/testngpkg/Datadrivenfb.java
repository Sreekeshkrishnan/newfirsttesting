package testngpkg;

import java.io.FileInputStream;
import java.io.IOException;
//import java.io.FileNotFoundException
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadrivenfb { 
	ChromeDriver driver;
	@BeforeTest
	public void beforetest()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void test() throws IOException
	{
		FileInputStream fo=new FileInputStream("C:\\datadrivendemo\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fo);//workbook
		XSSFSheet sh= wb.getSheet("sheet1");//sheet
		int row= sh.getLastRowNum();//to obtain all row
		for(int i=1;i<row;i++)
		{
			String email= sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("email is" +email);
			String password= sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("password is" +password);					
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		
		}
	}

}
