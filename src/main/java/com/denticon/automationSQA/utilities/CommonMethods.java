package com.denticon.automationSQA.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.Transferable;
import java.awt.image.BufferedImage;
import java.io.File;  
import java.io.FileInputStream;  
import java.io.FileNotFoundException;  
import java.util.List;  
import java.util.Properties;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.Transferable;
import java.awt.image.BufferedImage;
import java.io.File;  
import java.io.FileInputStream;  
import java.io.FileNotFoundException;  
import java.util.List;  
import java.util.Properties;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import org.testng.ITestResult;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
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
	
	public static boolean clickIfEnable(By link, int time){  
		boolean flag=false;  
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),time);
		wait.until(ExpectedConditions.elementToBeClickable(link));
		WebElement element=DriverManager.getDriver().findElement(link);  
		if(element.isEnabled()){  
			element.click();  
			flag=true;	  
		}  
		return flag;  
	}  
	
	public static boolean clickIfEnable(By link){  
	return clickIfEnable(link,15);
	}  
	 
	public static void waitUntilLoading(By by) {
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),60);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
	}
	
	
/*	public static boolean clickIfEnable(By link){  
		boolean flag=false;  
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),15);
		wait.until(ExpectedConditions.elementToBeClickable(link));
		WebElement element=DriverManager.getDriver().findElement(link);  
		if(element.isEnabled()){  
			element.click();  
			flag=true;	  
		}  
		return flag;  
	}     */
	 
	
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
	
	
	public synchronized static ExtentReports getReport(ExtentReports extent,ExtentTest test) {  

		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/AutomationReport.html");
		
		if (extent == null) {
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
        
		 }
        return extent;  
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
			public static void getscreenshot() throws Exception 
		      {
		              File scrFile = ((TakesScreenshot)DriverManager.getDriver()).getScreenshotAs(OutputType.FILE);
		           //The below method will save the screen shot in d drive with name "screenshot.png"
		              FileUtils.copyFile(scrFile, new File("D:\\screenshot.png"));
		      }
			
			public static void captureScreen(String fileName) throws Exception {
				   Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
				   Rectangle screenRectangle = new Rectangle(screenSize);
				   Robot robot = new Robot();
				   BufferedImage image = robot.createScreenCapture(screenRectangle);
				   ImageIO.write(image, "png", new File(fileName));
				   //Toolkit.getDefaultToolkit().getSystemClipboard().setContents( image, null);
				}
			
			public static boolean pasteScreen(By loc) {
				boolean foundAlert = false;
		 	    try {
		 	    	
		 	    	
		 	        WebElement webelement = getWebElement(loc);
		 	        webelement.sendKeys(Keys.CONTROL+"v");
		 	        foundAlert = true;
		 	    } catch (Exception eTO) {
		 	        foundAlert = false;
		 	    }
		 	    return foundAlert;
			}  
	
			public static boolean rightClickIfEnable(By element) {
				boolean flag=false;  
				try{
					WebDriverWait wait = new WebDriverWait(com.denticon.automationSQA.DriverManager.getDriver(),15);
					Actions action = new Actions(com.denticon.automationSQA.DriverManager.getDriver());
					action.contextClick(com.denticon.automationSQA.DriverManager.getDriver().findElement(element)).build().perform();
					return true;
				}catch(Exception e){
					return flag;  
				}
				
			}
			
		 }

