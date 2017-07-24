package com.denticon.automationSQA.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import com.denticon.automationSQA.DriverManager;





public class CommonMethods{  
	   	
	static String url = "http://dev.denticon.com/aspx/home/login.aspx";    

		public static ExtentHtmlReporter htmlReporter;
		public static ExtentReports extent;
	    public static ExtentTest test;
	         

	

	public static List<WebElement> getListelements(By lst){  
  
		List<WebElement> lstcommon= com.denticon.automationSQA.DriverManager.getDriver().findElements(lst);  
		if(lstcommon.isEmpty()){  
			return null;  
		}  
		else		  
			return lstcommon;  
	}  
	
	
	public static boolean clickIfEnable(By link){  
		boolean flag=false;  
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),15);
		wait.until(ExpectedConditions.elementToBeClickable(link));
		WebElement element=DriverManager.getDriver().findElement(link);  
		if(element.isEnabled()){  
			element.click();  
			flag=true;	  
		}  
		return flag;  
	}  
	 
	
	public static boolean mourseHoverIfEnable(By link){  
		boolean flag=false;  
		WebDriverWait wait = new WebDriverWait(com.denticon.automationSQA.DriverManager.getDriver(),15);
		wait.until(ExpectedConditions.elementToBeClickable(link));
		WebElement element=com.denticon.automationSQA.DriverManager.getDriver().findElement(link);  
		if(element.isEnabled()){  
			Actions action = new Actions(com.denticon.automationSQA.DriverManager.getDriver());  
			action.moveToElement(element).perform();
			flag=true;	  
		}  
		return flag;  
	}
	
	
	public static boolean sendText(By loc, String text){  
		boolean flag=false;  
		WebElement element=com.denticon.automationSQA.DriverManager.getDriver().findElement(loc);  
		if(element!=null){  
			element.clear();  
			element.sendKeys(text);  
			flag=true;  
		}  
		return flag;  
  
	}  
  
	
	public static boolean selectFromList(By dropdwon, String seletedvalue){  
		boolean flag=false;  
		try{  
			WebElement element=com.denticon.automationSQA.DriverManager.getDriver().findElement(dropdwon);  
			if(element!=null){  
				new Select(element).selectByVisibleText(seletedvalue);  
				flag=true;  
			}  
		}catch(NoSuchElementException e){}  
		return flag;		  
	}  
	
	
	public static ExtentReports getReport(ExtentReports extent,ExtentTest test) {  
		
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/AutomationReport.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
        extent.setSystemInfo("OS", "Windows10");
        extent.setSystemInfo("Host Name", "cbrahmbhatt");
        extent.setSystemInfo("Environment", "SQA");
        extent.setSystemInfo("User Name", "Chaitali Brahmbhatt");
         
        htmlReporter.config().setChartVisibilityOnOpen(true);
        htmlReporter.config().setDocumentTitle("AutomationTesting.in Demo Report");
        htmlReporter.config().setReportName("Regression Testing Report");
        htmlReporter.config().setTestViewChartLocation(ChartLocation.BOTTOM);
        htmlReporter.config().setTheme(Theme.DARK);
        
        return extent;  
	} 	

	 public static void getResult(ITestResult result,ExtentTest test) throws Exception
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
	 
	 public void captureAndDisplayScreenShot(WebDriver ldriver, ExtentTest eTest){
		 String extentReportImage = "../extentReport/screenshots/" + System.currentTimeMillis() + ".png";
		// Take screenshot and store as a file format
		File src=((TakesScreenshot)ldriver).getScreenshotAs(OutputType.FILE);
		try {
			// now copy the screenshot to desired location using copyFile method
		//	FileUtils.copyFile(src, new File(extentReportImage));
			eTest.log(Status.INFO, "Screenshot from : " + extentReportImage, MediaEntityBuilder.createScreenCaptureFromPath(extentReportImage).build());
		} catch (IOException e)
		{
			System.out.println("Error in the captureAndDisplayScreenShot method: " + e.getMessage());
		}
	}
	 
	 
	public static void closeReport(ExtentReports extent, ExtentTest test ){  
//		extent.endTest(test);
		extent.flush();
	  
	}  								

	
	public static String readDatafromProps(String filePath, String key)  
	{  
		File f=new File(filePath);  
		Properties prop= new Properties();  
		FileInputStream fileInput;  
		String value="";  
		try {				  
			fileInput = new FileInputStream(f);  
			prop.load(fileInput);  
			value=prop.getProperty(key);  
		} catch (Exception e) {  
			e.printStackTrace();  
		}  
		return value;  
  
	}  

	
	public static boolean isElementPresent(By by) {
		 		List<WebElement> elements = com.denticon.automationSQA.DriverManager.getDriver().findElements(by);
		 		return !elements.isEmpty();
	}
		 	


	public static boolean listSelect(By lstPracArea, String lstValue) throws Exception {
		
		WebDriverWait wait = new WebDriverWait(com.denticon.automationSQA.DriverManager.getDriver(),15);
			wait.until(ExpectedConditions.presenceOfElementLocated(lstPracArea));
 		boolean result = false;
 		WebElement element = getWebElement(lstPracArea);
 		if (element != null) {
 			new Select(element).selectByVisibleText(lstValue);
 			result = true;
 		}
 		Thread.sleep(3000);
 		return result;
 	}


	 	public static WebElement getWebElement(By by) {
	 		WebElement result = null;
	 		List<WebElement> elements = com.denticon.automationSQA.DriverManager.getDriver().findElements(by);
	 		if (!elements.isEmpty()) {
	 			result = com.denticon.automationSQA.DriverManager.getDriver().findElement(by);
	 		} else {
	 			return null;
	 		}
	 		int attempts = 0;
	 		while (attempts < 3) {
	 			try {
	 				result.isEnabled();
	 				break;
	 			} catch (StaleElementReferenceException e) {
	 				result = com.denticon.automationSQA.DriverManager.getDriver().findElement(by);
	 			}
	 			attempts++;
	 		}
	 
	 		return result;
	 	}
	 	
	 	
	 	public static boolean isAlertPresent(){
	 	    boolean foundAlert = false;
	 	    WebDriverWait wait = new WebDriverWait(com.denticon.automationSQA.DriverManager.getDriver(), 20);
	 	    try {
	 	        wait.until(ExpectedConditions.alertIsPresent());
	 	       com.denticon.automationSQA.DriverManager.getDriver().switchTo().alert().accept();
	 	        foundAlert = true;
	 	    } catch (Exception eTO) {
	 	        foundAlert = false;
	 	    }
	 	    return foundAlert;
	 	}
	 
	 	
	 	public static boolean switchToFrame(By frame){
	 		boolean foundAlert = false;
	 	    WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 20);
	 	    try {
	 	        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));
	 	        foundAlert = true;
	 	    } catch (Exception eTO) {
	 	        foundAlert = false;
	 	    }
	 	    return foundAlert;
	 	}

		public static boolean switchToDefaultContent() {
			boolean foundAlert = false;
	 	    try {
	 	        com.denticon.automationSQA.DriverManager.getDriver().switchTo().defaultContent();
	 	        foundAlert = true;
	 	    } catch (Exception eTO) {
	 	        foundAlert = false;
	 	    }
	 	    return foundAlert;
		}

		public static boolean doubleClickIfEnable(By rowProcedurefromproceduretable) {
			boolean flag=false;  
			try{
				WebDriverWait wait = new WebDriverWait(com.denticon.automationSQA.DriverManager.getDriver(),15);
				Actions action = new Actions(com.denticon.automationSQA.DriverManager.getDriver());
				action.moveToElement(com.denticon.automationSQA.DriverManager.getDriver().findElement(rowProcedurefromproceduretable)).doubleClick().perform();
				return true;
			}catch(Exception e){
				return flag;  
			}
			
			
		}
	 
	 }
	 