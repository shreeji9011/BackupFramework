package com.denticon.automationSQA.reporting;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.denticon.automationSQA.DriverManager;
import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.IReport;
import com.denticon.automationSQA.utilities.CommonMethods;

public class LResponsibleParty extends SeleniumSuite {

	String startDate="10"; 
	String endDate="27"; 
	String stepInfo=" "; 
	boolean flag=false;
			
//////Responsible Party List  ////////////
@Test
public boolean ResponsiblePartyList(){ 
			try {
					stepInfo="Click on Reporting tab";
					flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
					stepInfo="Click on Daily Reporting";
					flag=CommonMethods.clickIfEnable(IReport.LNK_List);
					flag=CommonMethods.clickIfEnable(IReport.Lnk_ResponsiblePartyList);
					stepInfo="Select Executive Summary";
					flag=CommonMethods.clickIfEnable(IReport.Lnk_RList);
					stepInfo="Click on Print Preview Icon ";
					flag=CommonMethods.clickIfEnable(IReport.BTN_PRINT_PREVIEW);


					String parentWindow=DriverManager.getDriver().getWindowHandle();
					Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
					for (String window : windowHandles) {
						DriverManager.getDriver().switchTo().window(window);
					}
					
					stepInfo="Verify Execution Summary report with Title";
					 			Thread.sleep(5000);
					 			flag=CommonMethods.isElementPresent(IReport.PDF_AgingDetail);
					 			
					 			DriverManager.getDriver().close();
					 		 			DriverManager.getDriver().switchTo().window(parentWindow);
				} catch (Exception e) { 
					e.printStackTrace(); 
					Assert.fail(); 
					
				}
				return flag;
				
				}

@Test
public boolean RListBalance(){ 
			try {
					stepInfo="Click on Reporting tab";
					flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
					stepInfo="Click on Daily Reporting";
					flag=CommonMethods.clickIfEnable(IReport.LNK_List);
					flag=CommonMethods.clickIfEnable(IReport.Lnk_ResponsiblePartyList);
					stepInfo="Select Executive Summary";
					flag=CommonMethods.clickIfEnable(IReport.Lnk_RListBalance);
					stepInfo="Click on Print Preview Icon ";
					flag=CommonMethods.clickIfEnable(IReport.BTN_PRINT_PREVIEW);


					String parentWindow=DriverManager.getDriver().getWindowHandle();
					Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
					for (String window : windowHandles) {
						DriverManager.getDriver().switchTo().window(window);
					}
					
					stepInfo="Verify Execution Summary report with Title";
					 			Thread.sleep(5000);
					 			flag=CommonMethods.isElementPresent(IReport.PDF_AgingDetail);
					 			
					 			DriverManager.getDriver().close();
					 		 			DriverManager.getDriver().switchTo().window(parentWindow);
				} catch (Exception e) { 
					e.printStackTrace(); 
					Assert.fail(); 
					
				}
				return flag;
				
				}


@Test
public boolean RListOver30(){ 
			try {
					stepInfo="Click on Reporting tab";
					flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
					stepInfo="Click on Daily Reporting";
					flag=CommonMethods.clickIfEnable(IReport.LNK_List);
					flag=CommonMethods.clickIfEnable(IReport.Lnk_ResponsiblePartyList);
					stepInfo="Select Executive Summary";
					flag=CommonMethods.clickIfEnable(IReport.Lnk_RListOver30);
					stepInfo="Click on Print Preview Icon ";
					flag=CommonMethods.clickIfEnable(IReport.BTN_PRINT_PREVIEW);


					String parentWindow=DriverManager.getDriver().getWindowHandle();
					Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
					for (String window : windowHandles) {
						DriverManager.getDriver().switchTo().window(window);
					}
					
					stepInfo="Verify Execution Summary report with Title";
					 			Thread.sleep(5000);
					 			flag=CommonMethods.isElementPresent(IReport.PDF_AgingDetail);
					 			
					 			DriverManager.getDriver().close();
					 		 			DriverManager.getDriver().switchTo().window(parentWindow);
				} catch (Exception e) { 
					e.printStackTrace(); 
					Assert.fail(); 
					
				}
				return flag;
				
				}



@Test
public boolean RListByBilling(){ 
			try {
					stepInfo="Click on Reporting tab";
					flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
					stepInfo="Click on Daily Reporting";
					flag=CommonMethods.clickIfEnable(IReport.LNK_List);
					flag=CommonMethods.clickIfEnable(IReport.Lnk_ResponsiblePartyList);
					stepInfo="Select Executive Summary";
					flag=CommonMethods.clickIfEnable(IReport.Lnk_RListByBilling);
					stepInfo="Click on Print Preview Icon ";
					flag=CommonMethods.clickIfEnable(IReport.BTN_PRINT_PREVIEW);


					String parentWindow=DriverManager.getDriver().getWindowHandle();
					Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
					for (String window : windowHandles) {
						DriverManager.getDriver().switchTo().window(window);
					}
					
					stepInfo="Verify Execution Summary report with Title";
					 			Thread.sleep(5000);
					 			flag=CommonMethods.isElementPresent(IReport.PDF_AgingDetail);
					 			
					 			DriverManager.getDriver().close();
					 		 			DriverManager.getDriver().switchTo().window(parentWindow);
				} catch (Exception e) { 
					e.printStackTrace(); 
					Assert.fail(); 
					
				}
				return flag;
				
				}

@Test
public boolean Rpzipcode(){ 
			try {
					stepInfo="Click on Reporting tab";
					flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
					stepInfo="Click on Daily Reporting";
					flag=CommonMethods.clickIfEnable(IReport.LNK_List);
					flag=CommonMethods.clickIfEnable(IReport.Lnk_ResponsiblePartyList);
					stepInfo="Select Executive Summary";
					flag=CommonMethods.clickIfEnable(IReport.Lnk_Rpzipcode);
					stepInfo="Click on Print Preview Icon ";
					flag=CommonMethods.clickIfEnable(IReport.BTN_PRINT_PREVIEW);


					String parentWindow=DriverManager.getDriver().getWindowHandle();
					Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
					for (String window : windowHandles) {
						DriverManager.getDriver().switchTo().window(window);
					}
					
					stepInfo="Verify Execution Summary report with Title";
					 			Thread.sleep(5000);
					 			flag=CommonMethods.isElementPresent(IReport.PDF_AgingDetail);
					 			
					 			DriverManager.getDriver().close();
					 		 			DriverManager.getDriver().switchTo().window(parentWindow);
				} catch (Exception e) { 
					e.printStackTrace(); 
					Assert.fail(); 
					
				}
				return flag;
				
				}


//@Test
public boolean RListEmail(){ 
			try {
					stepInfo="Click on Reporting tab";
					flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
					stepInfo="Click on Daily Reporting";
					flag=CommonMethods.clickIfEnable(IReport.LNK_List);
					flag=CommonMethods.clickIfEnable(IReport.Lnk_ResponsiblePartyList);
					stepInfo="Select Executive Summary";
					flag=CommonMethods.clickIfEnable(IReport.Lnk_RListEmail);
					stepInfo="Click on Print Preview Icon ";
					flag=CommonMethods.clickIfEnable(IReport.BTN_PRINT_PREVIEW);


					String parentWindow=DriverManager.getDriver().getWindowHandle();
					Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
					for (String window : windowHandles) {
						DriverManager.getDriver().switchTo().window(window);
					}
					
					stepInfo="Verify Execution Summary report with Title";
					 			Thread.sleep(5000);
					 			flag=CommonMethods.isElementPresent(IReport.PDF_AgingDetail);
					 			
					 			DriverManager.getDriver().close();
					 		 			DriverManager.getDriver().switchTo().window(parentWindow);
				} catch (Exception e) { 
					e.printStackTrace(); 
					Assert.fail(); 
					
				}
				return flag;
				
				}


@Test
public boolean RPSenttoCollection(){ 
			try {
					Thread.sleep(5000);
					stepInfo="Click on Reporting tab";
					flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
					stepInfo="Click on Daily Reporting";
					flag=CommonMethods.clickIfEnable(IReport.LNK_List);
					flag=CommonMethods.clickIfEnable(IReport.Lnk_ResponsiblePartyList);
					stepInfo="Select Executive Summary";
					flag=CommonMethods.clickIfEnable(IReport.Lnk_RPSenttoCollection);
					stepInfo="Click on Print Preview Icon ";
					flag=CommonMethods.clickIfEnable(IReport.BTN_PRINT_PREVIEW);


					String parentWindow=DriverManager.getDriver().getWindowHandle();
					Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
					for (String window : windowHandles) {
						DriverManager.getDriver().switchTo().window(window);
					}
					
					stepInfo="Verify Execution Summary report with Title";
					 			Thread.sleep(5000);
					 			flag=CommonMethods.isElementPresent(IReport.PDF_AgingDetail);
					 			
					 			DriverManager.getDriver().close();
					 		 			DriverManager.getDriver().switchTo().window(parentWindow);
				} catch (Exception e) { 
					e.printStackTrace(); 
					Assert.fail(); 
					
				}
				return flag;
				
				}


@Test
public boolean RPSendStatementStatus(){ 
			try {
					Thread.sleep(5000);
					stepInfo="Click on Reporting tab";
					flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
					stepInfo="Click on Daily Reporting";
					flag=CommonMethods.clickIfEnable(IReport.LNK_List);
					flag=CommonMethods.clickIfEnable(IReport.Lnk_ResponsiblePartyList);
					stepInfo="Select Executive Summary";
					flag=CommonMethods.clickIfEnable(IReport.Lnk_RPSendStatementStatus);
					stepInfo="Click on Print Preview Icon ";
					flag=CommonMethods.clickIfEnable(IReport.BTN_PRINT_PREVIEW);


					String parentWindow=DriverManager.getDriver().getWindowHandle();
					Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
					for (String window : windowHandles) {
						DriverManager.getDriver().switchTo().window(window);
					}
					
					stepInfo="Verify Execution Summary report with Title";
					 			Thread.sleep(5000);
					 			flag=CommonMethods.isElementPresent(IReport.PDF_AgingDetail);
					 			
								DriverManager.getDriver().close();
					 		 			DriverManager.getDriver().switchTo().window(parentWindow);
				} catch (Exception e) { 
					e.printStackTrace(); 
					Assert.fail(); 
					
				}
				return flag;
				
				}


@Test
public boolean RPStatementSent(){ 
			try {
					Thread.sleep(5000);
					stepInfo="Click on Reporting tab";
					flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
					stepInfo="Click on Daily Reporting";
					flag=CommonMethods.clickIfEnable(IReport.LNK_List);
					flag=CommonMethods.clickIfEnable(IReport.Lnk_ResponsiblePartyList);
					stepInfo="Select Executive Summary";
					flag=CommonMethods.clickIfEnable(IReport.Lnk_RPStatementSent);
					stepInfo="Click on Print Preview Icon ";
					flag=CommonMethods.clickIfEnable(IReport.BTN_PRINT_PREVIEW);


					String parentWindow=DriverManager.getDriver().getWindowHandle();
					Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
					for (String window : windowHandles) {
						DriverManager.getDriver().switchTo().window(window);
					}
					
					stepInfo="Verify Execution Summary report with Title";
					 			Thread.sleep(5000);
					 			flag=CommonMethods.isElementPresent(IReport.PDF_AgingDetail);
					 			
					 			DriverManager.getDriver().close();
					 		 			DriverManager.getDriver().switchTo().window(parentWindow);
				} catch (Exception e) { 
					e.printStackTrace(); 
					Assert.fail(); 
					
				}
				return flag;
				
				}
	
}
