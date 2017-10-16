package com.denticon.automationSQA.reporting;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.denticon.automationSQA.DriverManager;
import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.IReport;
import com.denticon.automationSQA.utilities.CommonMethods;

import java.util.Set;

		
public class LedgerReport extends SeleniumSuite{

			String stepInfo=" "; 
			boolean flag=false;
	
@Test
	public boolean AccountLedger(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
 			stepInfo="Click on Daily Reporting";
 			flag=CommonMethods.clickIfEnable(IReport.LNK_LEDGER_REPORT);
 			stepInfo="Select Executive Summary";
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_AccountLedger);
 			Thread.sleep(2000);

 			stepInfo="Click on Print Preview Icon ";
 			flag=CommonMethods.clickIfEnable(IReport.BTN_PRINT_PREVIEW);
 			
 			
 			String parentWindow=DriverManager.getDriver().getWindowHandle();
 			Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
 			for (String window : windowHandles) {
 				DriverManager.getDriver().switchTo().window(window);
 			}
 			
 			stepInfo="Verify Execution Summary report with Title";
 			 			Thread.sleep(5000);
 			 			flag=CommonMethods.isElementPresent(IReport.PDF_AccountL);
 			 			
 			 			DriverManager.getDriver().close();
 			 		 			DriverManager.getDriver().switchTo().window(parentWindow);
		} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 
 			
 		}
	return flag;
 	
}


@Test
public boolean PatientLedger(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_LEDGER_REPORT);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_PatientLedger);
			Thread.sleep(2000);

			stepInfo="Click on Print Preview Icon ";
			flag=CommonMethods.clickIfEnable(IReport.BTN_PRINT_PREVIEW);
			
			
			String parentWindow=DriverManager.getDriver().getWindowHandle();
			Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
			for (String window : windowHandles) {
				DriverManager.getDriver().switchTo().window(window);
			}
			
			stepInfo="Verify Execution Summary report with Title";
			 			Thread.sleep(5000);
			 			flag=CommonMethods.isElementPresent(IReport.PDF_PatientL);
			 			
			 			DriverManager.getDriver().close();
			 		 			DriverManager.getDriver().switchTo().window(parentWindow);
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}

@Test
public boolean WalkoutReport(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_LEDGER_REPORT);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_WalkutReport);
			Thread.sleep(2000);

			stepInfo="Click on Print Preview Icon ";
			flag=CommonMethods.clickIfEnable(IReport.BTN_PRINT_PREVIEW);
			
			
			String parentWindow=DriverManager.getDriver().getWindowHandle();
			Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
			for (String window : windowHandles) {
				DriverManager.getDriver().switchTo().window(window);
			}
			
			stepInfo="Verify Execution Summary report with Title";
			 			Thread.sleep(5000);
			 			flag=CommonMethods.isElementPresent(IReport.PDF_WalkoutReport);
			 			
			 			DriverManager.getDriver().close();
			 		 			DriverManager.getDriver().switchTo().window(parentWindow);
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}


@Test
public boolean SuperBill(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_LEDGER_REPORT);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_SuperBill);
			Thread.sleep(2000);

			stepInfo="Click on Print Preview Icon ";
			flag=CommonMethods.clickIfEnable(IReport.BTN_PRINT_PREVIEW);
			
			
			String parentWindow=DriverManager.getDriver().getWindowHandle();
			Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
			for (String window : windowHandles) {
				DriverManager.getDriver().switchTo().window(window);
			}
			
			stepInfo="Verify Execution Summary report with Title";
			 			Thread.sleep(5000);
			 			flag=CommonMethods.isElementPresent(IReport.PDF_SuperBill);
			 			
			 			DriverManager.getDriver().close();
			 		 			DriverManager.getDriver().switchTo().window(parentWindow);
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}

@Test
public boolean AccountAllocation(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_LEDGER_REPORT);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_AccountAllocation);
			Thread.sleep(2000);

			stepInfo="Click on Print Preview Icon ";
			flag=CommonMethods.clickIfEnable(IReport.BTN_PRINT_PREVIEW);
			
			
			String parentWindow=DriverManager.getDriver().getWindowHandle();
			Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
			for (String window : windowHandles) {
				DriverManager.getDriver().switchTo().window(window);
			}
			
			stepInfo="Verify Execution Summary report with Title";
			 			Thread.sleep(5000);
			 			flag=CommonMethods.isElementPresent(IReport.PDF_AccountAllocation);
			 			
			 			DriverManager.getDriver().close();
			 		 			DriverManager.getDriver().switchTo().window(parentWindow);
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}


}