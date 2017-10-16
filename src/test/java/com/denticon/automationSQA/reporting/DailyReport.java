package com.denticon.automationSQA.reporting;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.denticon.automationSQA.DriverManager;
import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.IReport;
import com.denticon.automationSQA.utilities.CommonMethods;

import java.util.ArrayList; 
import java.util.List; 
import java.util.Set;
import org.openqa.selenium.WebElement; 

		
public class DailyReport extends SeleniumSuite{
			String startDate="10"; 
			String endDate="27"; 
			String stepInfo=" "; 
			boolean flag=false;
	
	
	
	
@Test
	public boolean ExecutiveSummary(){ 
		try {
						stepInfo="Click on Reporting tab";
						flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			 			stepInfo="Click on Daily Reporting";
			 			flag=CommonMethods.clickIfEnable(IReport.LNK_DAILY_REPORT);
			 			stepInfo="Select Executive Summary";
			 			flag=CommonMethods.clickIfEnable(IReport.RBTN_EXECUTIVE_SUMMARY);
			 			Thread.sleep(2000);
			 			stepInfo="Select Start Date, Click on calender Icon ";
			 			flag=CommonMethods.clickIfEnable(IReport.ICON_START_DATE);
			 			Thread.sleep(2000);
			 			List<WebElement> lst_startDate=new ArrayList<WebElement>();
			 			lst_startDate=DriverManager.getDriver().findElements(IReport.LST_START_DATE);
			 			for(int i=0;i<lst_startDate.size();i++){
			 				if(lst_startDate.get(i).getText().trim().equalsIgnoreCase(startDate)){
			 					lst_startDate.get(i).click();
			 					break;
			 				}
			 			}
			 			
			 			stepInfo="Select End Date, Click on calender Icon ";
			 			Thread.sleep(2000);
			 			flag=CommonMethods.clickIfEnable(IReport.ICON_END_DATE);
			 			Thread.sleep(2000);
			 			List<WebElement> lst_endDate=new ArrayList<WebElement>();
			 			lst_endDate=DriverManager.getDriver().findElements(IReport.LST_END_DATE);
			 			for(int i=0;i<lst_endDate.size();i++){
			 				if(lst_endDate.get(i).getText().trim().equalsIgnoreCase(endDate)){
			 					lst_endDate.get(i).click();
			 					break;
			 				}
			 			}
			 			
			 			stepInfo="Click on Print Preview Icon ";
			 			flag=CommonMethods.clickIfEnable(IReport.BTN_PRINT_PREVIEW);
			 			
			 			
			 			String parentWindow=DriverManager.getDriver().getWindowHandle();
			 			Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
			 			for (String window : windowHandles) {
			 				DriverManager.getDriver().switchTo().window(window);
			 			}
			 			
			 			stepInfo="Verify Execution Summary report with Title";
			 			 			Thread.sleep(5000);
			 			 			flag=CommonMethods.isElementPresent(IReport.PDF_REPORT_EXECUTION_SUMMARY);
			 			 			
			 			 			DriverManager.getDriver().close();
			 			 		 			DriverManager.getDriver().switchTo().window(parentWindow);
		} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 
 			
 		}
	return flag;
 	
}

@Test
public boolean PegBoardReport(){ 
	try {
					stepInfo="Click on Reporting tab";
					flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
		 			stepInfo="Click on Daily Reporting";
		 			flag=CommonMethods.clickIfEnable(IReport.LNK_DAILY_REPORT);
		 			stepInfo="Select Executive Summary";
		 			flag=CommonMethods.clickIfEnable(IReport.TAB_PEGBOARDREPORT);
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
		 			 			flag=CommonMethods.isElementPresent(IReport.PDF_REPORT_EXECUTION_SUMMARY);
		 			 			
		 			 			DriverManager.getDriver().close();
		 			 		 			DriverManager.getDriver().switchTo().window(parentWindow);
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}

@Test
public boolean DailyJournal(){ 
	try {
					stepInfo="Click on Reporting tab";
					flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
		 			stepInfo="Click on Daily Reporting";
		 			flag=CommonMethods.clickIfEnable(IReport.LNK_DAILY_REPORT);
		 			stepInfo="Select Executive Summary";
		 			flag=CommonMethods.clickIfEnable(IReport.TAB_DailyJournal);
		 			Thread.sleep(2000);
		 			stepInfo="Select Start Date, Click on calender Icon ";
		 			flag=CommonMethods.clickIfEnable(IReport.ICON_START_DATE);
		 			Thread.sleep(2000);
		 			List<WebElement> lst_startDate=new ArrayList<WebElement>();
		 			lst_startDate=DriverManager.getDriver().findElements(IReport.LST_START_DATE);
		 			for(int i=0;i<lst_startDate.size();i++){
		 				if(lst_startDate.get(i).getText().trim().equalsIgnoreCase(startDate)){
		 					lst_startDate.get(i).click();
		 					break;
		 				}
		 			}
		 			
		 			stepInfo="Select End Date, Click on calender Icon ";
		 			Thread.sleep(2000);
		 			flag=CommonMethods.clickIfEnable(IReport.ICON_END_DATE);
		 			Thread.sleep(2000);
		 			List<WebElement> lst_endDate=new ArrayList<WebElement>();
		 			lst_endDate=DriverManager.getDriver().findElements(IReport.LST_END_DATE);
		 			for(int i=0;i<lst_endDate.size();i++){
		 				if(lst_endDate.get(i).getText().trim().equalsIgnoreCase(endDate)){
		 					lst_endDate.get(i).click();
		 					break;
		 				}
		 			}
		 			
		 			stepInfo="Click on Print Preview Icon ";
		 			flag=CommonMethods.clickIfEnable(IReport.BTN_PRINT_PREVIEW);
		 			
		 			
		 			String parentWindow=DriverManager.getDriver().getWindowHandle();
		 			Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
		 			for (String window : windowHandles) {
		 				DriverManager.getDriver().switchTo().window(window);
		 			}
		 			
		 			stepInfo="Verify Execution Summary report with Title";
		 			 			Thread.sleep(5000);
		 			 			flag=CommonMethods.isElementPresent(IReport.PDF_DailyJournal);
		 			 			
		 			 			DriverManager.getDriver().close();
		 			 		 			DriverManager.getDriver().switchTo().window(parentWindow);
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}


@Test
public boolean DailyJournalSummary(){ 
	try {
					stepInfo="Click on Reporting tab";
					flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
		 			stepInfo="Click on Daily Reporting";
		 			flag=CommonMethods.clickIfEnable(IReport.LNK_DAILY_REPORT);
		 			stepInfo="Select Executive Summary";
		 			flag=CommonMethods.clickIfEnable(IReport.Tab_DailySummary);
		 			Thread.sleep(2000);
		 			stepInfo="Select Start Date, Click on calender Icon ";
		 			flag=CommonMethods.clickIfEnable(IReport.ICON_START_DATE);
		 			Thread.sleep(2000);
		 			List<WebElement> lst_startDate=new ArrayList<WebElement>();
		 			lst_startDate=DriverManager.getDriver().findElements(IReport.LST_START_DATE);
		 			for(int i=0;i<lst_startDate.size();i++){
		 				if(lst_startDate.get(i).getText().trim().equalsIgnoreCase(startDate)){
		 					lst_startDate.get(i).click();
		 					break;
		 				}
		 			}
		 			
		 			stepInfo="Select End Date, Click on calender Icon ";
		 			Thread.sleep(2000);
		 			flag=CommonMethods.clickIfEnable(IReport.ICON_END_DATE);
		 			Thread.sleep(2000);
		 			List<WebElement> lst_endDate=new ArrayList<WebElement>();
		 			lst_endDate=DriverManager.getDriver().findElements(IReport.LST_END_DATE);
		 			for(int i=0;i<lst_endDate.size();i++){
		 				if(lst_endDate.get(i).getText().trim().equalsIgnoreCase(endDate)){
		 					lst_endDate.get(i).click();
		 					break;
		 				}
		 			}
		 			
		 			stepInfo="Click on Print Preview Icon ";
		 			flag=CommonMethods.clickIfEnable(IReport.BTN_PRINT_PREVIEW);
		 			
		 			
		 			String parentWindow=DriverManager.getDriver().getWindowHandle();
		 			Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
		 			for (String window : windowHandles) {
		 				DriverManager.getDriver().switchTo().window(window);
		 			}
		 			
		 			stepInfo="Verify Execution Summary report with Title";
		 			 			Thread.sleep(5000);
		 			 			flag=CommonMethods.isElementPresent(IReport.PDF_DailyS);
		 			 			
		 			 			DriverManager.getDriver().close();
		 			 		 			DriverManager.getDriver().switchTo().window(parentWindow);
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}

@Test
public boolean DailyJournalByProviderDetail(){ 
	try {
					stepInfo="Click on Reporting tab";
					flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
		 			stepInfo="Click on Daily Reporting";
		 			flag=CommonMethods.clickIfEnable(IReport.LNK_DAILY_REPORT);
		 			stepInfo="Select Executive Summary";
		 			flag=CommonMethods.clickIfEnable(IReport.Lnk_DailyJournalByProviderDetail);
		 			Thread.sleep(2000);
		 			stepInfo="Select Start Date, Click on calender Icon ";
		 			flag=CommonMethods.clickIfEnable(IReport.ICON_START_DATE);
		 			Thread.sleep(2000);
		 			List<WebElement> lst_startDate=new ArrayList<WebElement>();
		 			lst_startDate=DriverManager.getDriver().findElements(IReport.LST_START_DATE);
		 			for(int i=0;i<lst_startDate.size();i++){
		 				if(lst_startDate.get(i).getText().trim().equalsIgnoreCase(startDate)){
		 					lst_startDate.get(i).click();
		 					break;
		 				}
		 			}
		 			
		 			stepInfo="Select End Date, Click on calender Icon ";
		 			Thread.sleep(2000);
		 			flag=CommonMethods.clickIfEnable(IReport.ICON_END_DATE);
		 			Thread.sleep(2000);
		 			List<WebElement> lst_endDate=new ArrayList<WebElement>();
		 			lst_endDate=DriverManager.getDriver().findElements(IReport.LST_END_DATE);
		 			for(int i=0;i<lst_endDate.size();i++){
		 				if(lst_endDate.get(i).getText().trim().equalsIgnoreCase(endDate)){
		 					lst_endDate.get(i).click();
		 					break;
		 				}
		 			}
		 			
		 			stepInfo="Click on Print Preview Icon ";
		 			flag=CommonMethods.clickIfEnable(IReport.BTN_PRINT_PREVIEW);
		 			
		 			
		 			String parentWindow=DriverManager.getDriver().getWindowHandle();
		 			Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
		 			for (String window : windowHandles) {
		 				DriverManager.getDriver().switchTo().window(window);
		 			}
		 			
		 			stepInfo="Verify Execution Summary report with Title";
		 			 			Thread.sleep(5000);
		 			 			flag=CommonMethods.isElementPresent(IReport.PDF_DailyJournalByProviderDetail);
		 			 			
		 			 			DriverManager.getDriver().close();
		 			 		 			DriverManager.getDriver().switchTo().window(parentWindow);
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}

@Test
public boolean DailyJournalByProviderSummary(){ 
	try {
					stepInfo="Click on Reporting tab";
					flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
		 			stepInfo="Click on Daily Reporting";
		 			flag=CommonMethods.clickIfEnable(IReport.LNK_DAILY_REPORT);
		 			stepInfo="Select Executive Summary";
		 			flag=CommonMethods.clickIfEnable(IReport.Lnk_DailyJournalByProviderSummary);
		 			Thread.sleep(2000);
		 			stepInfo="Select Start Date, Click on calender Icon ";
		 			flag=CommonMethods.clickIfEnable(IReport.ICON_START_DATE);
		 			Thread.sleep(2000);
		 			List<WebElement> lst_startDate=new ArrayList<WebElement>();
		 			lst_startDate=DriverManager.getDriver().findElements(IReport.LST_START_DATE);
		 			for(int i=0;i<lst_startDate.size();i++){
		 				if(lst_startDate.get(i).getText().trim().equalsIgnoreCase(startDate)){
		 					lst_startDate.get(i).click();
		 					break;
		 				}
		 			}
		 			
		 			stepInfo="Select End Date, Click on calender Icon ";
		 			Thread.sleep(2000);
		 			flag=CommonMethods.clickIfEnable(IReport.ICON_END_DATE);
		 			Thread.sleep(2000);
		 			List<WebElement> lst_endDate=new ArrayList<WebElement>();
		 			lst_endDate=DriverManager.getDriver().findElements(IReport.LST_END_DATE);
		 			for(int i=0;i<lst_endDate.size();i++){
		 				if(lst_endDate.get(i).getText().trim().equalsIgnoreCase(endDate)){
		 					lst_endDate.get(i).click();
		 					break;
		 				}
		 			}
		 			
		 			stepInfo="Click on Print Preview Icon ";
		 			flag=CommonMethods.clickIfEnable(IReport.BTN_PRINT_PREVIEW);
		 			
		 			
		 			String parentWindow=DriverManager.getDriver().getWindowHandle();
		 			Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
		 			for (String window : windowHandles) {
		 				DriverManager.getDriver().switchTo().window(window);
		 			}
		 			
		 			stepInfo="Verify Execution Summary report with Title";
		 			 			Thread.sleep(5000);
		 			 			flag=CommonMethods.isElementPresent(IReport.PDF_DailyJournalByProviderSummary);
		 			 			
		 			 			DriverManager.getDriver().close();
		 			 		 			DriverManager.getDriver().switchTo().window(parentWindow);
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}

@Test
public boolean DailyJournalLandscape(){ 
	try {
					stepInfo="Click on Reporting tab";
					flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
		 			stepInfo="Click on Daily Reporting";
		 			flag=CommonMethods.clickIfEnable(IReport.LNK_DAILY_REPORT);
		 			stepInfo="Select Executive Summary";
		 			flag=CommonMethods.clickIfEnable(IReport.Lnk_DailyJournalLandscape);
		 			Thread.sleep(2000);
		 			stepInfo="Select Start Date, Click on calender Icon ";
		 			flag=CommonMethods.clickIfEnable(IReport.ICON_START_DATE);
		 			Thread.sleep(2000);
		 			List<WebElement> lst_startDate=new ArrayList<WebElement>();
		 			lst_startDate=DriverManager.getDriver().findElements(IReport.LST_START_DATE);
		 			for(int i=0;i<lst_startDate.size();i++){
		 				if(lst_startDate.get(i).getText().trim().equalsIgnoreCase(startDate)){
		 					lst_startDate.get(i).click();
		 					break;
		 				}
		 			}
		 			
		 			stepInfo="Select End Date, Click on calender Icon ";
		 			Thread.sleep(2000);
		 			flag=CommonMethods.clickIfEnable(IReport.ICON_END_DATE);
		 			Thread.sleep(2000);
		 			List<WebElement> lst_endDate=new ArrayList<WebElement>();
		 			lst_endDate=DriverManager.getDriver().findElements(IReport.LST_END_DATE);
		 			for(int i=0;i<lst_endDate.size();i++){
		 				if(lst_endDate.get(i).getText().trim().equalsIgnoreCase(endDate)){
		 					lst_endDate.get(i).click();
		 					break;
		 				}
		 			}
		 			
		 			stepInfo="Click on Print Preview Icon ";
		 			flag=CommonMethods.clickIfEnable(IReport.BTN_PRINT_PREVIEW);
		 			
		 			
		 			String parentWindow=DriverManager.getDriver().getWindowHandle();
		 			Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
		 			for (String window : windowHandles) {
		 				DriverManager.getDriver().switchTo().window(window);
		 			}
		 			
		 			stepInfo="Verify Execution Summary report with Title";
		 			 			Thread.sleep(5000);
		 			 			flag=CommonMethods.isElementPresent(IReport.PDF_DailyJournalLandscape);
		 			 			
		 			 			DriverManager.getDriver().close();
		 			 		 			DriverManager.getDriver().switchTo().window(parentWindow);
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}

@Test
public boolean DepositSlip(){ 
	try {
					stepInfo="Click on Reporting tab";
					flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
		 			stepInfo="Click on Daily Reporting";
		 			flag=CommonMethods.clickIfEnable(IReport.LNK_DAILY_REPORT);
		 			stepInfo="Select Executive Summary";
		 			flag=CommonMethods.clickIfEnable(IReport.Lnk_DepositSlip);
		 			Thread.sleep(2000);
		 			stepInfo="Select Start Date, Click on calender Icon ";
		 			flag=CommonMethods.clickIfEnable(IReport.ICON_START_DATE);
		 			Thread.sleep(2000);
		 			List<WebElement> lst_startDate=new ArrayList<WebElement>();
		 			lst_startDate=DriverManager.getDriver().findElements(IReport.LST_START_DATE);
		 			for(int i=0;i<lst_startDate.size();i++){
		 				if(lst_startDate.get(i).getText().trim().equalsIgnoreCase(startDate)){
		 					lst_startDate.get(i).click();
		 					break;
		 				}
		 			}
		 			
		 			stepInfo="Select End Date, Click on calender Icon ";
		 			Thread.sleep(2000);
		 			flag=CommonMethods.clickIfEnable(IReport.ICON_END_DATE);
		 			Thread.sleep(2000);
		 			List<WebElement> lst_endDate=new ArrayList<WebElement>();
		 			lst_endDate=DriverManager.getDriver().findElements(IReport.LST_END_DATE);
		 			for(int i=0;i<lst_endDate.size();i++){
		 				if(lst_endDate.get(i).getText().trim().equalsIgnoreCase(endDate)){
		 					lst_endDate.get(i).click();
		 					break;
		 				}
		 			}
		 			
		 			stepInfo="Click on Print Preview Icon ";
		 			flag=CommonMethods.clickIfEnable(IReport.BTN_PRINT_PREVIEW);
		 			
		 			
		 			String parentWindow=DriverManager.getDriver().getWindowHandle();
		 			Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
		 			for (String window : windowHandles) {
		 				DriverManager.getDriver().switchTo().window(window);
		 			}
		 			
		 			stepInfo="Verify Execution Summary report with Title";
		 			 			Thread.sleep(5000);
		 			 			flag=CommonMethods.isElementPresent(IReport.PDF_DepositSlip);
		 			 			
		 			 			DriverManager.getDriver().close();
		 			 		 			DriverManager.getDriver().switchTo().window(parentWindow);
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}

@Test
public boolean DepositSlipCC(){ 
	try {
					stepInfo="Click on Reporting tab";
					flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
		 			stepInfo="Click on Daily Reporting";
		 			flag=CommonMethods.clickIfEnable(IReport.LNK_DAILY_REPORT);
		 			stepInfo="Select Executive Summary";
		 			flag=CommonMethods.clickIfEnable(IReport.Lnk_DepositSlipCC);
		 			Thread.sleep(2000);
		 			stepInfo="Select Start Date, Click on calender Icon ";
		 			flag=CommonMethods.clickIfEnable(IReport.ICON_START_DATE);
		 			Thread.sleep(2000);
		 			List<WebElement> lst_startDate=new ArrayList<WebElement>();
		 			lst_startDate=DriverManager.getDriver().findElements(IReport.LST_START_DATE);
		 			for(int i=0;i<lst_startDate.size();i++){
		 				if(lst_startDate.get(i).getText().trim().equalsIgnoreCase(startDate)){
		 					lst_startDate.get(i).click();
		 					break;
		 				}
		 			}
		 			
		 			stepInfo="Select End Date, Click on calender Icon ";
		 			Thread.sleep(2000);
		 			flag=CommonMethods.clickIfEnable(IReport.ICON_END_DATE);
		 			Thread.sleep(2000);
		 			List<WebElement> lst_endDate=new ArrayList<WebElement>();
		 			lst_endDate=DriverManager.getDriver().findElements(IReport.LST_END_DATE);
		 			for(int i=0;i<lst_endDate.size();i++){
		 				if(lst_endDate.get(i).getText().trim().equalsIgnoreCase(endDate)){
		 					lst_endDate.get(i).click();
		 					break;
		 				}
		 			}
		 			
		 			stepInfo="Click on Print Preview Icon ";
		 			flag=CommonMethods.clickIfEnable(IReport.BTN_PRINT_PREVIEW);
		 			
		 			
		 			String parentWindow=DriverManager.getDriver().getWindowHandle();
		 			Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
		 			for (String window : windowHandles) {
		 				DriverManager.getDriver().switchTo().window(window);
		 			}
		 			
		 			stepInfo="Verify Execution Summary report with Title";
		 			 			Thread.sleep(5000);
		 			 			flag=CommonMethods.isElementPresent(IReport.PDF_DepositSlipCC);
		 			 			
		 			 			DriverManager.getDriver().close();
		 			 		 			DriverManager.getDriver().switchTo().window(parentWindow);
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}


@Test
public boolean DepositSlipCareC(){ 
	try {
					stepInfo="Click on Reporting tab";
					flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
		 			stepInfo="Click on Daily Reporting";
		 			flag=CommonMethods.clickIfEnable(IReport.LNK_DAILY_REPORT);
		 			stepInfo="Select Executive Summary";
		 			flag=CommonMethods.clickIfEnable(IReport.Lnk_DepositSlipCareC);
		 			Thread.sleep(2000);
		 			stepInfo="Select Start Date, Click on calender Icon ";
		 			flag=CommonMethods.clickIfEnable(IReport.ICON_START_DATE);
		 			Thread.sleep(2000);
		 			List<WebElement> lst_startDate=new ArrayList<WebElement>();
		 			lst_startDate=DriverManager.getDriver().findElements(IReport.LST_START_DATE);
		 			for(int i=0;i<lst_startDate.size();i++){
		 				if(lst_startDate.get(i).getText().trim().equalsIgnoreCase(startDate)){
		 					lst_startDate.get(i).click();
		 					break;
		 				}
		 			}
		 			
		 			stepInfo="Select End Date, Click on calender Icon ";
		 			Thread.sleep(2000);
		 			flag=CommonMethods.clickIfEnable(IReport.ICON_END_DATE);
		 			Thread.sleep(2000);
		 			List<WebElement> lst_endDate=new ArrayList<WebElement>();
		 			lst_endDate=DriverManager.getDriver().findElements(IReport.LST_END_DATE);
		 			for(int i=0;i<lst_endDate.size();i++){
		 				if(lst_endDate.get(i).getText().trim().equalsIgnoreCase(endDate)){
		 					lst_endDate.get(i).click();
		 					break;
		 				}
		 			}
		 			
		 			stepInfo="Click on Print Preview Icon ";
		 			flag=CommonMethods.clickIfEnable(IReport.BTN_PRINT_PREVIEW);
		 			
		 			
		 			String parentWindow=DriverManager.getDriver().getWindowHandle();
		 			Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
		 			for (String window : windowHandles) {
		 				DriverManager.getDriver().switchTo().window(window);
		 			}
		 			
		 			stepInfo="Verify Execution Summary report with Title";
		 			 			Thread.sleep(5000);
		 			 			flag=CommonMethods.isElementPresent(IReport.PDF_DepositSlipCareC);
		 			 			
		 			 			DriverManager.getDriver().close();
		 			 		 			DriverManager.getDriver().switchTo().window(parentWindow);
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}


@Test
public boolean DepositSlipDD(){ 
	try {
					stepInfo="Click on Reporting tab";
					flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
		 			stepInfo="Click on Daily Reporting";
		 			flag=CommonMethods.clickIfEnable(IReport.LNK_DAILY_REPORT);
		 			stepInfo="Select Executive Summary";
		 			flag=CommonMethods.clickIfEnable(IReport.Lnk_DepositSlipDD);
		 			Thread.sleep(2000);
		 			stepInfo="Select Start Date, Click on calender Icon ";
		 			flag=CommonMethods.clickIfEnable(IReport.ICON_START_DATE);
		 			Thread.sleep(2000);
		 			List<WebElement> lst_startDate=new ArrayList<WebElement>();
		 			lst_startDate=DriverManager.getDriver().findElements(IReport.LST_START_DATE);
		 			for(int i=0;i<lst_startDate.size();i++){
		 				if(lst_startDate.get(i).getText().trim().equalsIgnoreCase(startDate)){
		 					lst_startDate.get(i).click();
		 					break;
		 				}
		 			}
		 			
		 			stepInfo="Select End Date, Click on calender Icon ";
		 			Thread.sleep(2000);
		 			flag=CommonMethods.clickIfEnable(IReport.ICON_END_DATE);
		 			Thread.sleep(2000);
		 			List<WebElement> lst_endDate=new ArrayList<WebElement>();
		 			lst_endDate=DriverManager.getDriver().findElements(IReport.LST_END_DATE);
		 			for(int i=0;i<lst_endDate.size();i++){
		 				if(lst_endDate.get(i).getText().trim().equalsIgnoreCase(endDate)){
		 					lst_endDate.get(i).click();
		 					break;
		 				}
		 			}
		 			
		 			stepInfo="Click on Print Preview Icon ";
		 			flag=CommonMethods.clickIfEnable(IReport.BTN_PRINT_PREVIEW);
		 			
		 			
		 			String parentWindow=DriverManager.getDriver().getWindowHandle();
		 			Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
		 			for (String window : windowHandles) {
		 				DriverManager.getDriver().switchTo().window(window);
		 			}
		 			
		 			stepInfo="Verify Execution Summary report with Title";
		 			 			Thread.sleep(5000);
		 			 			flag=CommonMethods.isElementPresent(IReport.PDF_DepositSlipDD);
		 			 			
		 			 			DriverManager.getDriver().close();
		 			 		 			DriverManager.getDriver().switchTo().window(parentWindow);
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}


@Test
public boolean AppointmentPullChartList(){ 
	try {
					stepInfo="Click on Reporting tab";
					flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
		 			stepInfo="Click on Daily Reporting";
		 			flag=CommonMethods.clickIfEnable(IReport.LNK_DAILY_REPORT);
		 			stepInfo="Select Executive Summary";
		 			flag=CommonMethods.clickIfEnable(IReport.Lnk_AppointmentPullChartList);
		 			Thread.sleep(2000);
		 			stepInfo="Select Start Date, Click on calender Icon ";
		 			flag=CommonMethods.clickIfEnable(IReport.ICON_START_DATE);
		 			Thread.sleep(2000);
		 			List<WebElement> lst_startDate=new ArrayList<WebElement>();
		 			lst_startDate=DriverManager.getDriver().findElements(IReport.LST_START_DATE);
		 			for(int i=0;i<lst_startDate.size();i++){
		 				if(lst_startDate.get(i).getText().trim().equalsIgnoreCase(startDate)){
		 					lst_startDate.get(i).click();
		 					break;
		 				}
		 			}
		 			
		 			stepInfo="Select End Date, Click on calender Icon ";
		 			Thread.sleep(2000);
		 			flag=CommonMethods.clickIfEnable(IReport.ICON_END_DATE);
		 			Thread.sleep(2000);
		 			List<WebElement> lst_endDate=new ArrayList<WebElement>();
		 			lst_endDate=DriverManager.getDriver().findElements(IReport.LST_END_DATE);
		 			for(int i=0;i<lst_endDate.size();i++){
		 				if(lst_endDate.get(i).getText().trim().equalsIgnoreCase(endDate)){
		 					lst_endDate.get(i).click();
		 					break;
		 				}
		 			}
		 			
		 			stepInfo="Click on Print Preview Icon ";
		 			flag=CommonMethods.clickIfEnable(IReport.BTN_PRINT_PREVIEW);
		 			
		 			
		 			String parentWindow=DriverManager.getDriver().getWindowHandle();
		 			Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
		 			for (String window : windowHandles) {
		 				DriverManager.getDriver().switchTo().window(window);
		 			}
		 			
		 			stepInfo="Verify Execution Summary report with Title";
		 			 			Thread.sleep(5000);
		 			 			flag=CommonMethods.isElementPresent(IReport.PDF_AppointmentConfirmationCallList);
		 			 			
		 			 			DriverManager.getDriver().close();
		 			 		 			DriverManager.getDriver().switchTo().window(parentWindow);
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}

@Test
public boolean AppointmentConfirmationCallList(){ 
	try {
					stepInfo="Click on Reporting tab";
					flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
		 			stepInfo="Click on Daily Reporting";
		 			flag=CommonMethods.clickIfEnable(IReport.LNK_DAILY_REPORT);
		 			stepInfo="Select Executive Summary";
		 			flag=CommonMethods.clickIfEnable(IReport.Lnk_AppointmentConfirmationCallList);

		 			stepInfo="Click on Print Preview Icon ";
		 			flag=CommonMethods.clickIfEnable(IReport.BTN_PRINT_PREVIEW);
		 			
		 			
		 			String parentWindow=DriverManager.getDriver().getWindowHandle();
		 			Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
		 			for (String window : windowHandles) {
		 				DriverManager.getDriver().switchTo().window(window);
		 			}
		 			
		 			stepInfo="Verify Execution Summary report with Title";
		 			 			Thread.sleep(9000);
		 			 			flag=CommonMethods.isElementPresent(IReport.PDF_AppointmentConfirmationCallList);
		 			 			
		 			 			DriverManager.getDriver().close();
		 			 		 			DriverManager.getDriver().switchTo().window(parentWindow);
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}


@Test
public boolean MissedAppointmentList(){ 
	try {
					stepInfo="Click on Reporting tab";
					flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
		 			stepInfo="Click on Daily Reporting";
		 			flag=CommonMethods.clickIfEnable(IReport.LNK_DAILY_REPORT);
		 			stepInfo="Select Executive Summary";
		 			flag=CommonMethods.clickIfEnable(IReport. Lnk_MissedAppointmentList);
		 			Thread.sleep(2000);
		 			stepInfo="Select Start Date, Click on calender Icon ";
		 			flag=CommonMethods.clickIfEnable(IReport.ICON_START_DATE);
		 			Thread.sleep(2000);
		 			List<WebElement> lst_startDate=new ArrayList<WebElement>();
		 			lst_startDate=DriverManager.getDriver().findElements(IReport.LST_START_DATE);
		 			for(int i=0;i<lst_startDate.size();i++){
		 				if(lst_startDate.get(i).getText().trim().equalsIgnoreCase(startDate)){
		 					lst_startDate.get(i).click();
		 					break;
		 				}
		 			}
		 			
		 			stepInfo="Select End Date, Click on calender Icon ";
		 			Thread.sleep(2000);
		 			flag=CommonMethods.clickIfEnable(IReport.ICON_END_DATE);
		 			Thread.sleep(2000);
		 			List<WebElement> lst_endDate=new ArrayList<WebElement>();
		 			lst_endDate=DriverManager.getDriver().findElements(IReport.LST_END_DATE);
		 			for(int i=0;i<lst_endDate.size();i++){
		 				if(lst_endDate.get(i).getText().trim().equalsIgnoreCase(endDate)){
		 					lst_endDate.get(i).click();
		 					break;
		 				}
		 			}
		 			
		 			stepInfo="Click on Print Preview Icon ";
		 			flag=CommonMethods.clickIfEnable(IReport.BTN_PRINT_PREVIEW);
		 			
		 			
		 			String parentWindow=DriverManager.getDriver().getWindowHandle();
		 			Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
		 			for (String window : windowHandles) {
		 				DriverManager.getDriver().switchTo().window(window);
		 			}
		 			
		 			stepInfo="Verify Execution Summary report with Title";
		 			 			Thread.sleep(5000);
		 			 			flag=CommonMethods.isElementPresent(IReport.PDF_MissedAppointmentList);
		 			 			
		 			 			DriverManager.getDriver().close();
		 			 		 			DriverManager.getDriver().switchTo().window(parentWindow);
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}

@Test
	public boolean DailyRoutingSlip(){ 
	try {
					stepInfo="Click on Reporting tab";
					flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
		 			stepInfo="Click on Daily Reporting";
		 			flag=CommonMethods.clickIfEnable(IReport.LNK_DAILY_REPORT);
		 			stepInfo="Select Executive Summary";
		 			flag=CommonMethods.clickIfEnable(IReport.Lnk_DailyRoutingSlip);
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
		 			 			flag=CommonMethods.isElementPresent(IReport.PDF_DailyRoutingSlip);
		 			 			
		 			 			DriverManager.getDriver().close();
		 			 		 			DriverManager.getDriver().switchTo().window(parentWindow);
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}


@Test
public boolean RoutingSlipPrinted(){ 
	try {
					stepInfo="Click on Reporting tab";
					flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
		 			stepInfo="Click on Daily Reporting";
		 			flag=CommonMethods.clickIfEnable(IReport.LNK_DAILY_REPORT);
		 			stepInfo="Select Executive Summary";
		 			flag=CommonMethods.clickIfEnable(IReport. Lnk_RoutingSlipPrinted);
		 			Thread.sleep(2000);
		 			stepInfo="Select Start Date, Click on calender Icon ";
		 			flag=CommonMethods.clickIfEnable(IReport.ICON_START_DATE);
		 			Thread.sleep(2000);
		 			List<WebElement> lst_startDate=new ArrayList<WebElement>();
		 			lst_startDate=DriverManager.getDriver().findElements(IReport.LST_START_DATE);
		 			for(int i=0;i<lst_startDate.size();i++){
		 				if(lst_startDate.get(i).getText().trim().equalsIgnoreCase(startDate)){
		 					lst_startDate.get(i).click();
		 					break;
		 				}
		 			}
		 			
		 			stepInfo="Select End Date, Click on calender Icon ";
		 			Thread.sleep(2000);
		 			flag=CommonMethods.clickIfEnable(IReport.ICON_END_DATE);
		 			Thread.sleep(2000);
		 			List<WebElement> lst_endDate=new ArrayList<WebElement>();
		 			lst_endDate=DriverManager.getDriver().findElements(IReport.LST_END_DATE);
		 			for(int i=0;i<lst_endDate.size();i++){
		 				if(lst_endDate.get(i).getText().trim().equalsIgnoreCase(endDate)){
		 					lst_endDate.get(i).click();
		 					break;
		 				}
		 			}
		 			
		 			stepInfo="Click on Print Preview Icon ";
		 			flag=CommonMethods.clickIfEnable(IReport.BTN_PRINT_PREVIEW);
		 			
		 			
		 			String parentWindow=DriverManager.getDriver().getWindowHandle();
		 			Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
		 			for (String window : windowHandles) {
		 				DriverManager.getDriver().switchTo().window(window);
		 			}
		 			
		 			stepInfo="Verify Execution Summary report with Title";
		 			 			Thread.sleep(5000);
		 			 			flag=CommonMethods.isElementPresent(IReport.PDF_RoutingSlipPrinted);
		 			 			
		 			 			DriverManager.getDriver().close();
		 			 		 			DriverManager.getDriver().switchTo().window(parentWindow);
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}

@Test
public boolean ExecutiveSummaryByProvider(){ 
	try {
					stepInfo="Click on Reporting tab";
					flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
		 			stepInfo="Click on Daily Reporting";
		 			flag=CommonMethods.clickIfEnable(IReport.LNK_DAILY_REPORT);
		 			stepInfo="Select Executive Summary";
		 			flag=CommonMethods.clickIfEnable(IReport.Lnk_ESbyProvider);
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
		 			 			flag=CommonMethods.isElementPresent(IReport.PDF_ESbyProvider);
		 			 			
		 			 			DriverManager.getDriver().close();
		 			 		 			DriverManager.getDriver().switchTo().window(parentWindow);
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}

@Test
public boolean DailyClaimPrintedByDetail(){ 
	try {
					stepInfo="Click on Reporting tab";
					flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
		 			stepInfo="Click on Daily Reporting";
		 			flag=CommonMethods.clickIfEnable(IReport.LNK_DAILY_REPORT);
		 			stepInfo="Select Executive Summary";
		 			flag=CommonMethods.clickIfEnable(IReport.Lnk_DailyClaimPrintedByDetail);
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
		 			 			flag=CommonMethods.isElementPresent(IReport.PDF_DailyClaimPrintedByDetail);
		 			 			
		 			 			DriverManager.getDriver().close();
		 			 		 			DriverManager.getDriver().switchTo().window(parentWindow);
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}


@Test
public boolean DailyClaimPrintedBySummary(){ 
	try {
					stepInfo="Click on Reporting tab";
					flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
		 			stepInfo="Click on Daily Reporting";
		 			flag=CommonMethods.clickIfEnable(IReport.LNK_DAILY_REPORT);
		 			stepInfo="Select Executive Summary";
		 			flag=CommonMethods.clickIfEnable(IReport.Lnk_DailyClaimPrintedBySummary);
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
		 			 			flag=CommonMethods.isElementPresent(IReport.PDF_DailyClaimPrintedBySummary);
		 			 			
		 			 			DriverManager.getDriver().close();
		 			 		 			DriverManager.getDriver().switchTo().window(parentWindow);
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}

@Test
public boolean DailyClaimsPrintedbyCarrierDetail(){ 
	try {
					stepInfo="Click on Reporting tab";
					flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
		 			stepInfo="Click on Daily Reporting";
		 			flag=CommonMethods.clickIfEnable(IReport.LNK_DAILY_REPORT);
		 			stepInfo="Select Executive Summary";
		 			flag=CommonMethods.clickIfEnable(IReport.Lnk_DailyClaimsPrintedbyCarrierDetail);
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
		 			 			flag=CommonMethods.isElementPresent(IReport.PDF_DailyClaimsPrintedbyCarrierDetail);
		 			 			
		 			 			DriverManager.getDriver().close();
		 			 		 			DriverManager.getDriver().switchTo().window(parentWindow);
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}


@Test
public boolean DailyClaimsPrintedbyCarrierSummary(){ 
	try {
					stepInfo="Click on Reporting tab";
					flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
		 			stepInfo="Click on Daily Reporting";
		 			flag=CommonMethods.clickIfEnable(IReport.LNK_DAILY_REPORT);
		 			stepInfo="Select Executive Summary";
		 			flag=CommonMethods.clickIfEnable(IReport.Lnk_DailyClaimsPrintedbyCarrierSummary);
		 			Thread.sleep(2000);

		 			stepInfo="Click on Print Preview Icon ";
		 			flag=CommonMethods.clickIfEnable(IReport.BTN_PRINT_PREVIEW);
		 			
		 			
		 			String parentWindow=DriverManager.getDriver().getWindowHandle();
		 			Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
		 			for (String window : windowHandles) {
		 				DriverManager.getDriver().switchTo().window(window);
		 			}
		 			
	/*	 			stepInfo="Verify Execution Summary report with Title";
		 			 			Thread.sleep(5000);
		 			 			flag=CommonMethods.isElementPresent(IReport.PDF_DailyClaimsPrintedbyCarrierSummary);				*/
		 			 			
		 			 			DriverManager.getDriver().close();
		 			 		 			DriverManager.getDriver().switchTo().window(parentWindow);     
		 			
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}

@Test
public boolean DailyCollectionbyProviderDetail(){ 
	try {
					stepInfo="Click on Reporting tab";
					flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
		 			stepInfo="Click on Daily Reporting";
		 			flag=CommonMethods.clickIfEnable(IReport.LNK_DAILY_REPORT);
		 			stepInfo="Select Executive Summary";
		 			flag=CommonMethods.clickIfEnable(IReport.Lnk_DailyCollectionbyProviderDetail);
		 			Thread.sleep(2000);

		 			stepInfo="Click on Print Preview Icon ";
		 			flag=CommonMethods.clickIfEnable(IReport.BTN_PRINT_PREVIEW);
		 			
		 			
		 			String parentWindow=DriverManager.getDriver().getWindowHandle();
		 			Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
		 			for (String window : windowHandles) {
		 				DriverManager.getDriver().switchTo().window(window);
		 			}
		 			
	/*	 			stepInfo="Verify Execution Summary report with Title";
		 			 			Thread.sleep(5000);
		 			 			flag=CommonMethods.isElementPresent(IReport.PDF_DailyCollectionbyProviderDetail);			*/
		 			 			
		 			 			DriverManager.getDriver().close();
		 			 		 			DriverManager.getDriver().switchTo().window(parentWindow);				
		 			
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}

@Test
public boolean DailyCollectionbyProviderSummary(){ 
	try {
					stepInfo="Click on Reporting tab";
					flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
		 			stepInfo="Click on Daily Reporting";
		 			flag=CommonMethods.clickIfEnable(IReport.LNK_DAILY_REPORT);
		 			stepInfo="Select Executive Summary";
		 			flag=CommonMethods.clickIfEnable(IReport.Lnk_DailyCollectionbyProviderSummary);
		 			Thread.sleep(2000);

		 			stepInfo="Click on Print Preview Icon ";
		 			flag=CommonMethods.clickIfEnable(IReport.BTN_PRINT_PREVIEW);
		 			
		 			
		 			String parentWindow=DriverManager.getDriver().getWindowHandle();
		 			Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
		 			for (String window : windowHandles) {
		 				DriverManager.getDriver().switchTo().window(window);
		 			}
		 			
/*		 			stepInfo="Verify Execution Summary report with Title";
		 			 			Thread.sleep(5000);
		 			 			flag=CommonMethods.isElementPresent(IReport.PDF_DailyCollectionbyProviderSummary);			*/
		 			 			
		 			 			DriverManager.getDriver().close();
		 			 		 			DriverManager.getDriver().switchTo().window(parentWindow);				
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}

@Test
public boolean DailyCollectionbyCarrier(){ 
	try {
					stepInfo="Click on Reporting tab";
					flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
		 			stepInfo="Click on Daily Reporting";
		 			flag=CommonMethods.clickIfEnable(IReport.LNK_DAILY_REPORT);
		 			stepInfo="Select Executive Summary";
		 			flag=CommonMethods.clickIfEnable(IReport.Lnk_DailyCollectionbyCarrier);
		 			Thread.sleep(2000);

		 			stepInfo="Click on Print Preview Icon ";
		 			flag=CommonMethods.clickIfEnable(IReport.BTN_PRINT_PREVIEW);
		 			
		 			
		 			String parentWindow=DriverManager.getDriver().getWindowHandle();
		 			Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
		 			for (String window : windowHandles) {
		 				DriverManager.getDriver().switchTo().window(window);
		 			}
		 			
/*		 			stepInfo="Verify Execution Summary report with Title";
		 			 			Thread.sleep(5000);
		 			 			flag=CommonMethods.isElementPresent(IReport.PDF_DailyCollectionbyCarrier);				*/
		 			 			
		 			 			DriverManager.getDriver().close();
		 			 		 			DriverManager.getDriver().switchTo().window(parentWindow);						
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}

@Test
public boolean DailyProductionbyProviderDetai(){ 
	try {
					stepInfo="Click on Reporting tab";
					flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
		 			stepInfo="Click on Daily Reporting";
		 			flag=CommonMethods.clickIfEnable(IReport.LNK_DAILY_REPORT);
		 			stepInfo="Select Executive Summary";
		 			flag=CommonMethods.clickIfEnable(IReport.Lnk_DailyProductionbyProviderDetail);
		 			Thread.sleep(2000);

		 			stepInfo="Click on Print Preview Icon ";
		 			flag=CommonMethods.clickIfEnable(IReport.BTN_PRINT_PREVIEW);
		 			
		 			
		 			String parentWindow=DriverManager.getDriver().getWindowHandle();
		 			Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
		 			for (String window : windowHandles) {
		 				DriverManager.getDriver().switchTo().window(window);
		 			}
		 			
	/*	 			stepInfo="Verify Execution Summary report with Title";
		 			 			Thread.sleep(5000);
		 			 			flag=CommonMethods.isElementPresent(IReport.PDF_DailyProductionbyProviderDetail);				*/
		 			 			
		 			 			DriverManager.getDriver().close();
		 			 		 			DriverManager.getDriver().switchTo().window(parentWindow);				
		 			
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}


@Test
public boolean DailyProductionbyProviderSummary(){ 
	try {
					stepInfo="Click on Reporting tab";
					flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
		 			stepInfo="Click on Daily Reporting";
		 			flag=CommonMethods.clickIfEnable(IReport.LNK_DAILY_REPORT);
		 			stepInfo="Select Executive Summary";
		 			flag=CommonMethods.clickIfEnable(IReport.Lnk_DailyProductionbyProviderSummary);
		 			Thread.sleep(2000);

		 			stepInfo="Click on Print Preview Icon ";
		 			flag=CommonMethods.clickIfEnable(IReport.BTN_PRINT_PREVIEW);
		 			
		 			
		 			String parentWindow=DriverManager.getDriver().getWindowHandle();
		 			Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
		 			for (String window : windowHandles) {
		 				DriverManager.getDriver().switchTo().window(window);
		 			}
		 			
/*		 			stepInfo="Verify Execution Summary report with Title";
		 			 			Thread.sleep(5000);
		 			 			flag=CommonMethods.isElementPresent(IReport.PDF_DailyProductionbyProviderSummary);				*/
		 			 			
		 			 			DriverManager.getDriver().close();
		 			 		 			DriverManager.getDriver().switchTo().window(parentWindow);				
		 			
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}


@Test
public boolean DailyScheduledProduction (){ 
	try {
					stepInfo="Click on Reporting tab";
					flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
		 			stepInfo="Click on Daily Reporting";
		 			flag=CommonMethods.clickIfEnable(IReport.LNK_DAILY_REPORT);
		 			stepInfo="Select Executive Summary";
		 			flag=CommonMethods.clickIfEnable(IReport.Lnk_DailyScheduledProduction );
		 			Thread.sleep(2000);

		 			stepInfo="Click on Print Preview Icon ";
		 			flag=CommonMethods.clickIfEnable(IReport.BTN_PRINT_PREVIEW);
		 			
		 			
		 			String parentWindow=DriverManager.getDriver().getWindowHandle();
		 			Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
		 			for (String window : windowHandles) {
		 				DriverManager.getDriver().switchTo().window(window);
		 			}
		 			
	/*	 			stepInfo="Verify Execution Summary report with Title";
		 			 			Thread.sleep(5000);
		 			 			flag=CommonMethods.isElementPresent(IReport.PDF_DailyScheduledProduction );				*/
		 			 			
		 			 			DriverManager.getDriver().close();
		 			 		 			DriverManager.getDriver().switchTo().window(parentWindow);						
		 			
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}


@Test
public boolean  ExecutiveDaySheet (){ 
	try {
					stepInfo="Click on Reporting tab";
					flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
		 			stepInfo="Click on Daily Reporting";
		 			flag=CommonMethods.clickIfEnable(IReport.LNK_DAILY_REPORT);
		 			stepInfo="Select Executive Summary";
		 			flag=CommonMethods.clickIfEnable(IReport. Lnk_ExecutiveDaySheet);
		 			Thread.sleep(2000);

		 			stepInfo="Click on Print Preview Icon ";
		 			flag=CommonMethods.clickIfEnable(IReport.BTN_PRINT_PREVIEW);
		 			
		 			
		 			String parentWindow=DriverManager.getDriver().getWindowHandle();
		 			Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
		 			for (String window : windowHandles) {
		 				DriverManager.getDriver().switchTo().window(window);
		 			}
		 			
/*		 			stepInfo="Verify Execution Summary report with Title";
		 			 			Thread.sleep(5000);
		 			 			flag=CommonMethods.isElementPresent(IReport.PDF_ExecutiveDaySheet);					*/
		 			 			
		 			 			DriverManager.getDriver().close();
		 			 		 			DriverManager.getDriver().switchTo().window(parentWindow);					
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}

@Test
public boolean  PatientProgressNotes(){ 
	try {
					stepInfo="Click on Reporting tab";
					flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
		 			stepInfo="Click on Daily Reporting";
		 			flag=CommonMethods.clickIfEnable(IReport.LNK_DAILY_REPORT);
		 			stepInfo="Select Executive Summary";
		 			flag=CommonMethods.clickIfEnable(IReport.Lnk_PatientProgressNotes);
		 			Thread.sleep(2000);

		 			stepInfo="Click on Print Preview Icon ";
		 			flag=CommonMethods.clickIfEnable(IReport.BTN_PRINT_PREVIEW);
		 			
		 			
		 			String parentWindow=DriverManager.getDriver().getWindowHandle();
		 			Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
		 			for (String window : windowHandles) {
		 				DriverManager.getDriver().switchTo().window(window);
		 			}
		 			
	/*	 			stepInfo="Verify Execution Summary report with Title";
		 			 			Thread.sleep(5000);
		 			 			flag=CommonMethods.isElementPresent(IReport.PDF_PatientProgressNotes);				*/
		 			 			
		 			 			DriverManager.getDriver().close();
		 			 		 			DriverManager.getDriver().switchTo().window(parentWindow);					
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}

@Test
public boolean UnsignedProgressNotesReport(){ 
	try {
					stepInfo="Click on Reporting tab";
					flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
		 			stepInfo="Click on Daily Reporting";
		 			flag=CommonMethods.clickIfEnable(IReport.LNK_DAILY_REPORT);
		 			stepInfo="Select Executive Summary";
		 			flag=CommonMethods.clickIfEnable(IReport.Lnk_UnsignedProgressNotesReport);
		 			Thread.sleep(2000);

		 			stepInfo="Click on Print Preview Icon ";
		 			flag=CommonMethods.clickIfEnable(IReport.BTN_PRINT_PREVIEW);
		 			
		 			
		 			String parentWindow=DriverManager.getDriver().getWindowHandle();
		 			Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
		 			for (String window : windowHandles) {
		 				DriverManager.getDriver().switchTo().window(window);
		 			}
		 			
	/*	 			stepInfo="Verify Execution Summary report with Title";
		 			 			Thread.sleep(5000);
		 			 			flag=CommonMethods.isElementPresent(IReport.PDF_UnsignedProgressNotesReport);			*/
		 			 			
		 			 			DriverManager.getDriver().close();
		 			 		 			DriverManager.getDriver().switchTo().window(parentWindow);				
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}

@Test
public boolean MissingProgressNotes(){ 
	try {
					stepInfo="Click on Reporting tab";
					flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
		 			stepInfo="Click on Daily Reporting";
		 			flag=CommonMethods.clickIfEnable(IReport.LNK_DAILY_REPORT);
		 			stepInfo="Select Executive Summary";
		 			flag=CommonMethods.clickIfEnable(IReport.Lnk_MissingProgressNotes);
		 			Thread.sleep(2000);

		 			stepInfo="Click on Print Preview Icon ";
		 			flag=CommonMethods.clickIfEnable(IReport.BTN_PRINT_PREVIEW);
		 			
		 			
		 			String parentWindow=DriverManager.getDriver().getWindowHandle();
		 			Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
		 			for (String window : windowHandles) {
		 				DriverManager.getDriver().switchTo().window(window);
		 			}
		 			
	/*	 			stepInfo="Verify Execution Summary report with Title";
		 			 			Thread.sleep(5000);
		 			 			flag=CommonMethods.isElementPresent(IReport.PDF_MissingProgressNotes);				*/
		 			 			
		 			 			DriverManager.getDriver().close();
		 			 		 			DriverManager.getDriver().switchTo().window(parentWindow);				
		 			
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}

@Test
public boolean DailyAuditReport(){ 
	try {
					stepInfo="Click on Reporting tab";
					flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
		 			stepInfo="Click on Daily Reporting";
		 			flag=CommonMethods.clickIfEnable(IReport.LNK_DAILY_REPORT);
		 			stepInfo="Select Executive Summary";
		 			flag=CommonMethods.clickIfEnable(IReport.Lnk_DailyAuditReport);
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
		 			 			flag=CommonMethods.isElementPresent(IReport.PDF_DailyAuditReport);
		 			 			
		 			 			DriverManager.getDriver().close();
		 			 		 			DriverManager.getDriver().switchTo().window(parentWindow);					
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}

}


