package testngpkg;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.reporters.SuiteHTMLReporter;

public class extendedreportmain {
      WebDriver driver;
      String baseurl="https://www.facebook.com";
      SuiteHTMLReporter reporter;
      ExtentTest test;
      ExtentReports extent;
      @BeforeTest
      public void beforetest()
      {
    	  reporter=new ExtentHtmlReporter
      }