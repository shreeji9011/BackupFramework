package com.denticon.automationSQA;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class OldSelSuite {
	public RemoteWebDriver driver;
	
	ExtentHtmlReporter htmlReporter;
    ExtentReports extent;
    ExtentTest test;    
    
	@BeforeTest

	@Parameters({"browserType","url"})
	public RemoteWebDriver setUpSuite(String browserType, String url) {
		Config config = new Config();
		if (driver == null) {
			driver = com.denticon.automationSQA.DriverManager.getDriver();
			driver = config.setupBrowser(browserType, url);
			com.denticon.automationSQA.DriverManager.setWebDriver(driver);
			
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		return driver;
	}
	
	  

	@AfterTest
	public void afterTest(){
	
		driver.close();
		driver.quit();
	}						
}
