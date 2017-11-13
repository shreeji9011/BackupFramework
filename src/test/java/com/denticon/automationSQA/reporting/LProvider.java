package com.denticon.automationSQA.reporting;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.denticon.automationSQA.DriverManager;
import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.IReport;
import com.denticon.automationSQA.utilities.CommonMethods;

public class LProvider extends SeleniumSuite {

	String startDate="10"; 
	String endDate="27"; 
	String stepInfo=" "; 
	boolean flag=false;
		
	
///////////////// 	Provider List //////////////// 



@Test
public boolean EmployerList(){ 

		try {
				stepInfo="Click on Reporting tab";
				flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
				stepInfo="Click on Daily Reporting";
				flag=CommonMethods.clickIfEnable(IReport.LNK_List);
				flag=CommonMethods.clickIfEnable(IReport.Lnk_EmployerListMenu );
				stepInfo="Select Executive Summary";
				flag=CommonMethods.clickIfEnable(IReport.Lnk_EmployerList);
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
public boolean PatByEmployer(){ 

		try {
				stepInfo="Click on Reporting tab";
				flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
				stepInfo="Click on Daily Reporting";
				flag=CommonMethods.clickIfEnable(IReport.LNK_List);
				flag=CommonMethods.clickIfEnable(IReport.Lnk_EmployerListMenu );
				stepInfo="Select Executive Summary";
				flag=CommonMethods.clickIfEnable(IReport.Lnk_PatByEmployer);
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
public boolean CarrierList(){ 

		try {
				stepInfo="Click on Reporting tab";
				flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
				stepInfo="Click on Daily Reporting";
				flag=CommonMethods.clickIfEnable(IReport.LNK_List);
				flag=CommonMethods.clickIfEnable(IReport.Lnk_EmployerListMenu );
				stepInfo="Select Executive Summary";
				flag=CommonMethods.clickIfEnable(IReport.Lnk_CarrierList);
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
public boolean PatByCarrier(){ 

		try {
				stepInfo="Click on Reporting tab";
				flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
				stepInfo="Click on Daily Reporting";
				flag=CommonMethods.clickIfEnable(IReport.LNK_List);
				flag=CommonMethods.clickIfEnable(IReport.Lnk_EmployerListMenu );
				stepInfo="Select Executive Summary";
				flag=CommonMethods.clickIfEnable(IReport.Lnk_PatByCarrier);
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
public boolean InsPlanList(){ 

		try {
				stepInfo="Click on Reporting tab";
				flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
				stepInfo="Click on Daily Reporting";
				flag=CommonMethods.clickIfEnable(IReport.LNK_List);
				flag=CommonMethods.clickIfEnable(IReport.Lnk_EmployerListMenu );
				stepInfo="Select Executive Summary";
				flag=CommonMethods.clickIfEnable(IReport.Lnk_InsPlanList);
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
public boolean PayByInsPlan(){ 

		try {
				stepInfo="Click on Reporting tab";
				flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
				stepInfo="Click on Daily Reporting";
				flag=CommonMethods.clickIfEnable(IReport.LNK_List);
				flag=CommonMethods.clickIfEnable(IReport.Lnk_EmployerListMenu );
				stepInfo="Select Executive Summary";
				flag=CommonMethods.clickIfEnable(IReport.Lnk_PayByInsPlan);
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
public boolean InactivePlanList(){ 

		try {
				stepInfo="Click on Reporting tab";
				flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
				stepInfo="Click on Daily Reporting";
				flag=CommonMethods.clickIfEnable(IReport.LNK_List);
				flag=CommonMethods.clickIfEnable(IReport.Lnk_EmployerListMenu );
				stepInfo="Select Executive Summary";
				flag=CommonMethods.clickIfEnable(IReport.Lnk_InactivePlanList);
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