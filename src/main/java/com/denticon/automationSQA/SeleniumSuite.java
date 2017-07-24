package com.denticon.automationSQA;

import java.io.File;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.denticon.automationSQA.pom.ILogin;
import com.denticon.automationSQA.utilities.CommonMethods;

public class SeleniumSuite {
	public RemoteWebDriver driver;
	
	//static HTMLReporter htmlReporter;
 	ExtentReports extent; 
 	ExtentTest test;   
    static String filePath=System.getProperty("user.dir") + "\\src\\main\\resources\\login.properties"; 
    static String username=""; 
    static String password=""; 
//    static ExtentReports repo; 
//    static ExtentTest logger; 
    static Properties prop= new Properties(); 
 	boolean flag=false; 
                   
	@BeforeSuite
	@BeforeTest
	@Parameters({"browserType","url"})
	public RemoteWebDriver setUpSuite(String browserType, String url) {
		DateFormat dateFormat = new SimpleDateFormat("yyMMddHHmmss");
		Date date = new Date();
		String currentDate = dateFormat.format(date); 
//		extent = new ExtentReports(System.getProperty("user.dir")+"\\target\\report"+currentDate+".html",true);
//        extent.loadConfig(new File(System.getProperty("user.dir")+"\\src\\main\\resources\\extent-config.xml"));
                
/*        extent.addSystemInfo("OS", "Windows 10");
        extent.addSystemInfo("Host Name", "Chaitali");
        extent.addSystemInfo("Environment", "SQA");
        extent.addSystemInfo("User Name", "Chaitali Brahmbhatt");
         
        //htmlReporter.config().setChartVisibilityOnOpen(true);
        //htmlReporter.config().setDocumentTitle("AutomationTesting.in Demo Report");
        //htmlReporter.config().setReportName("My Own Report");
        //htmlReporter.config().setTestViewChartLocation(ChartLocation.BOTTOM);
        //htmlReporter.config().setTheme(Theme.DARK);					*/
		
		Config config = new Config();
		if (driver == null) {
			driver = com.denticon.automationSQA.DriverManager.getDriver();
			driver = config.setupBrowser(browserType, url);
			
			com.denticon.automationSQA.DriverManager.setWebDriver(driver);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		return driver;
	}
	
	  
	@BeforeMethod
	public void beforeTest(Method method){
		login();
		test=  extent.createTest(this.getClass().getSimpleName()+"::"+method.getName(), method.getName());
	}
	
	public void login() { 
 		String stepInfo=""; 
 		try{ 
			Thread.sleep(1000); 
 			extent=CommonMethods.getReport(extent,test); 
 			test=extent.createTest("Denticon Login"); 
 			username=CommonMethods.readDatafromProps(filePath,"user"); 
 			password=CommonMethods.readDatafromProps(filePath,"password"); 
 			flag=CommonMethods.sendText(ILogin.TXT_USERNAME, username); 
 			 
 			if(flag) 
 				test.log(Status.PASS, "Entered Username::"+username); 
 			else 
 				test.log(Status.FAIL, "Entered Username::"+username); 
 
 
 			flag=CommonMethods.sendText(ILogin.TXT_PASSWORD, password); 
 			if(flag) 
 				test.log(Status.PASS, "Entered password::"+password); 
 			else 
 				test.log(Status.FAIL, "Entered password::"+password); 
 
 
 			flag = CommonMethods.clickIfEnable(ILogin.BTN_GO);	 
 			if(flag) 
 				test.log(Status.PASS, "Clicked on Go button"); 
 			else 
 				test.log(Status.FAIL, "Clicked on Go button"); 
 			Thread.sleep(3000); 
 
 
 			CommonMethods.isElementPresent(ILogin.LNK_SIGNOFF); 
 			test.log(Status.PASS, "Successfully logged into Denticon"); 
 			CommonMethods.closeReport(extent,test); 
 			Thread.sleep(3000); 
 
 
 		} 
 		catch(Exception e){	   
 		} 
 
 
 	} 
 
	@AfterMethod
	public void getResult(ITestResult result) throws Exception{	
		{
	        if(result.getStatus() == ITestResult.FAILURE)
	        {
	            test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" Test case FAILED due to below issues:", ExtentColor.RED));
	            test.fail(result.getThrowable());
	        }
	        else if(result.getStatus() == ITestResult.SUCCESS)
	        {
	            test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test Case PASSED", ExtentColor.GREEN));
	        }
	        else
	        {
	            test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" Test Case SKIPPED", ExtentColor.ORANGE));
	            test.skip(result.getThrowable());
	        }
	    }
		 logout();
//		 extent.endTest(test);
	        
	        
	}
	
	
 	public void logout() { 
 		try { 
 			Thread.sleep(2000);
 			CommonMethods.clickIfEnable(ILogin.LNK_SIGNOFF); 
 			Alert alert = com.denticon.automationSQA.DriverManager.getDriver().switchTo().alert(); 
 			alert.accept(); 
 			Thread.sleep(2000); 
 		} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail();
			
} 
 	}
 	
 	@AfterTest
 	public void afterTest() {
 		extent.flush();
 	}
	
 	@AfterSuite
	public void afterSuite(){
		 
		extent.flush(); 
		driver.close();
		driver.quit();
	}						
}