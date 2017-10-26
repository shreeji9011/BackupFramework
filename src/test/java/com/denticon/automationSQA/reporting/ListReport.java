package com.denticon.automationSQA.reporting;

import java.util.ArrayList; 
import java.util.List; 
import java.util.Set;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.denticon.automationSQA.DriverManager;
import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.IReport;
import com.denticon.automationSQA.utilities.CommonMethods;

		
public class ListReport extends SeleniumSuite{

	String startDate="10"; 
	String endDate="27"; 
	String stepInfo=" "; 
	boolean flag=false;
			
			
			/////////// Patient List ///////////
			
			
@Test  

	public boolean ActivePatientList(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
 			stepInfo="Click on Daily Reporting";
 			flag=CommonMethods.clickIfEnable(IReport.LNK_List);
 			flag=CommonMethods.clickIfEnable(IReport.LNK_PatientList);
 			stepInfo="Select Executive Summary";
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_ActivePatientList);
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

public boolean InactivePatientList(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_List);
			flag=CommonMethods.clickIfEnable(IReport.LNK_PatientList);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_InactivePatientList);
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
public boolean NewPatientList(){ 
	
	try {
		
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_List);
			flag=CommonMethods.clickIfEnable(IReport.LNK_PatientList);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_NewPatientList);
			
			
 			stepInfo="Select Start Date, Click on calender Icon ";
 			flag=CommonMethods.clickIfEnable(IReport.ICON_START_DATE);
 			Thread.sleep(2000); 			
 			List<WebElement> lst_startDate=new ArrayList<WebElement>();
 			lst_startDate=DriverManager.getDriver().findElements(IReport.NewPatientList_START_DATE);
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
 			lst_endDate=DriverManager.getDriver().findElements(IReport.NewPatientList_END_DATE);
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
public boolean NewPatientsByReferral(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_List);
			flag=CommonMethods.clickIfEnable(IReport.LNK_PatientList);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_NewPatientsByReferral);
			
 			stepInfo="Select Start Date, Click on calender Icon ";
 			flag=CommonMethods.clickIfEnable(IReport.ICON_START_DATE);
 			Thread.sleep(2000); 			
 			List<WebElement> lst_startDate=new ArrayList<WebElement>();
 			lst_startDate=DriverManager.getDriver().findElements(IReport.NewPatientList_START_DATE);
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
 			lst_endDate=DriverManager.getDriver().findElements(IReport.NewPatientList_END_DATE);
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
public boolean NewPatientsByReferralType(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_List);
			flag=CommonMethods.clickIfEnable(IReport.LNK_PatientList);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_NewPatientsByReferralType);
			
 			stepInfo="Select Start Date, Click on calender Icon ";
 			flag=CommonMethods.clickIfEnable(IReport.ICON_START_DATE);
 			Thread.sleep(2000); 			
 			List<WebElement> lst_startDate=new ArrayList<WebElement>();
 			lst_startDate=DriverManager.getDriver().findElements(IReport.NewPatientList_START_DATE);
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
 			lst_endDate=DriverManager.getDriver().findElements(IReport.NewPatientList_END_DATE);
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
public boolean NewPatientThruAppointmentL(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_List);
			flag=CommonMethods.clickIfEnable(IReport.LNK_PatientList);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_NewPatientThruAppointmentL);
			
 			stepInfo="Select Start Date, Click on calender Icon ";
 			flag=CommonMethods.clickIfEnable(IReport.ICON_START_DATE);
 			Thread.sleep(2000); 			
 			List<WebElement> lst_startDate=new ArrayList<WebElement>();
 			lst_startDate=DriverManager.getDriver().findElements(IReport.NewPatientList_START_DATE);
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
 			lst_endDate=DriverManager.getDriver().findElements(IReport.NewPatientList_END_DATE);
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
public boolean PatientsonRegularPaymentPlan(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_List);
			flag=CommonMethods.clickIfEnable(IReport.LNK_PatientList);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_PatientsonRegularPaymentPlan);
			
 			stepInfo="Select Start Date, Click on calender Icon ";
 			flag=CommonMethods.clickIfEnable(IReport.ICON_START_DATE);
 			Thread.sleep(2000); 			
 			List<WebElement> lst_startDate=new ArrayList<WebElement>();
 			lst_startDate=DriverManager.getDriver().findElements(IReport.NewPatientList_START_DATE);
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
 			lst_endDate=DriverManager.getDriver().findElements(IReport.NewPatientList_END_DATE);
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
public boolean PatientsonOrthoPaymentPlan(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_List);
			flag=CommonMethods.clickIfEnable(IReport.LNK_PatientList);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_PatientsonOrthoPaymentPlan);
			
 			stepInfo="Select Start Date, Click on calender Icon ";
 			flag=CommonMethods.clickIfEnable(IReport.ICON_START_DATE);
 			Thread.sleep(2000); 			
 			List<WebElement> lst_startDate=new ArrayList<WebElement>();
 			lst_startDate=DriverManager.getDriver().findElements(IReport.NewPatientList_START_DATE);
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
 			lst_endDate=DriverManager.getDriver().findElements(IReport.NewPatientList_END_DATE);
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
public boolean PatientsSeenPerDay(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_List);
			flag=CommonMethods.clickIfEnable(IReport.LNK_PatientList);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_PatientsSeenPerDay);
			
 			stepInfo="Select Start Date, Click on calender Icon ";
 			flag=CommonMethods.clickIfEnable(IReport.ICON_START_DATE);
 			Thread.sleep(2000); 			
 			List<WebElement> lst_startDate=new ArrayList<WebElement>();
 			lst_startDate=DriverManager.getDriver().findElements(IReport.NewPatientList_START_DATE);
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
 			lst_endDate=DriverManager.getDriver().findElements(IReport.NewPatientList_END_DATE);
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
public boolean PatientsSeenPerDayByAge(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_List);
			flag=CommonMethods.clickIfEnable(IReport.LNK_PatientList);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_PatientsSeenPerDayByAge);
			
 			stepInfo="Select Start Date, Click on calender Icon ";
 			flag=CommonMethods.clickIfEnable(IReport.ICON_START_DATE);
 			Thread.sleep(2000); 			
 			List<WebElement> lst_startDate=new ArrayList<WebElement>();
 			lst_startDate=DriverManager.getDriver().findElements(IReport.NewPatientList_START_DATE);
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
 			lst_endDate=DriverManager.getDriver().findElements(IReport.NewPatientList_END_DATE);
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
public boolean PatientsSeenbyMedicalAlerts(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_List);
			flag=CommonMethods.clickIfEnable(IReport.LNK_PatientList);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_PatientsSeenbyMedicalAlerts);
			
 
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
public boolean PatientswithMedicalAlerts(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_List);
			flag=CommonMethods.clickIfEnable(IReport.LNK_PatientList);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_PatientswithMedicalAlerts);
			
	
			
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
public boolean PatientListAddress(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_List);
			flag=CommonMethods.clickIfEnable(IReport.LNK_PatientList);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_PatientListAddress);
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
public boolean UpdatePatientInsuranceConversionListByAppointment(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_List);
			flag=CommonMethods.clickIfEnable(IReport.LNK_PatientList);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_UpdatePatientInsuranceConversionListByAppointment);
			
 			stepInfo="Select Start Date, Click on calender Icon ";
 			flag=CommonMethods.clickIfEnable(IReport.ICON_START_DATE);
 			Thread.sleep(2000); 			
 			List<WebElement> lst_startDate=new ArrayList<WebElement>();
 			lst_startDate=DriverManager.getDriver().findElements(IReport.NewPatientList_START_DATE);
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
 			lst_endDate=DriverManager.getDriver().findElements(IReport.NewPatientList_END_DATE);
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
public boolean PatientsList(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_List);
			flag=CommonMethods.clickIfEnable(IReport.LNK_PatientList);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_PatientsList);
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
public boolean PatientsbyPreferredProvider(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_List);
			flag=CommonMethods.clickIfEnable(IReport.LNK_PatientList);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_PatientsbyPreferredProvider);
			
 
			
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
public boolean PatientsbyLastvisit(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_List);
			flag=CommonMethods.clickIfEnable(IReport.LNK_PatientList);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_PatientsbyLastvisit);
			
 			stepInfo="Select Start Date, Click on calender Icon ";
 			flag=CommonMethods.clickIfEnable(IReport.ICON_START_DATE);
 			Thread.sleep(2000); 			
 			List<WebElement> lst_startDate=new ArrayList<WebElement>();
 			lst_startDate=DriverManager.getDriver().findElements(IReport.NewPatientList_START_DATE);
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
 			lst_endDate=DriverManager.getDriver().findElements(IReport.NewPatientList_END_DATE);
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
public boolean PatientsbyPatientType(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_List);
			flag=CommonMethods.clickIfEnable(IReport.LNK_PatientList);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_PatientsbyPatientType);
			
 			stepInfo="Select Start Date, Click on calender Icon ";
 			flag=CommonMethods.clickIfEnable(IReport.ICON_START_DATE);
 			Thread.sleep(2000); 			
 			List<WebElement> lst_startDate=new ArrayList<WebElement>();
 			lst_startDate=DriverManager.getDriver().findElements(IReport.NewPatientList_START_DATE);
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
 			lst_endDate=DriverManager.getDriver().findElements(IReport.NewPatientList_END_DATE);
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
public boolean PatientsbyZipCode(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_List);
			flag=CommonMethods.clickIfEnable(IReport.LNK_PatientList);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_PatientsbyZipCode);
		
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
public boolean PatientsbyBirthdate(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_List);
			flag=CommonMethods.clickIfEnable(IReport.LNK_PatientList);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_PatientsbyBirthdate);
			
 			stepInfo="Select Start Date, Click on calender Icon ";
 			flag=CommonMethods.clickIfEnable(IReport.ICON_START_DATE);
 			Thread.sleep(2000); 			
 			List<WebElement> lst_startDate=new ArrayList<WebElement>();
 			lst_startDate=DriverManager.getDriver().findElements(IReport.NewPatientList_START_DATE);
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
 			lst_endDate=DriverManager.getDriver().findElements(IReport.NewPatientList_END_DATE);
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
public boolean PatientsListEmail(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_List);
			flag=CommonMethods.clickIfEnable(IReport.LNK_PatientList);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_PatientsListEmail);
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
public boolean PatientsInsuranceList(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_List);
			flag=CommonMethods.clickIfEnable(IReport.LNK_PatientList);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_PatientsInsuranceList);
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
public boolean PatientNotes(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_List);
			flag=CommonMethods.clickIfEnable(IReport.LNK_PatientList);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_PatientNotes);
			stepInfo="Click on Print Preview Icon ";
			
			flag=CommonMethods.sendText(IReport.Txt_SearchPatient,"Chun");
			flag=CommonMethods.clickIfEnable(IReport.Tab_Search);
			flag=CommonMethods.clickIfEnable(IReport.Slc_FirstPatient);
			flag=CommonMethods.clickIfEnable(IReport.Tab_Select);

			
			
			
			
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
public boolean PatientListDetail(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_List);
			flag=CommonMethods.clickIfEnable(IReport.LNK_PatientList);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_PatientListDetail);
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
public boolean PatientsbyFeeSchedule(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_List);
			flag=CommonMethods.clickIfEnable(IReport.LNK_PatientList);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_PatientsbyFeeSchedule);
			
 			stepInfo="Select Start Date, Click on calender Icon ";
 			flag=CommonMethods.clickIfEnable(IReport.ICON_START_DATE);
 			Thread.sleep(2000); 			
 			List<WebElement> lst_startDate=new ArrayList<WebElement>();
 			lst_startDate=DriverManager.getDriver().findElements(IReport.NewPatientList_START_DATE);
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
 			lst_endDate=DriverManager.getDriver().findElements(IReport.NewPatientList_END_DATE);
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
public boolean PatientsSeenbyZipcode(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_List);
			flag=CommonMethods.clickIfEnable(IReport.LNK_PatientList);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_PatientsSeenbyZipcode);
			
 			stepInfo="Select Start Date, Click on calender Icon ";
 			flag=CommonMethods.clickIfEnable(IReport.ICON_START_DATE);
 			Thread.sleep(2000); 			
 			List<WebElement> lst_startDate=new ArrayList<WebElement>();
 			lst_startDate=DriverManager.getDriver().findElements(IReport.NewPatientList_START_DATE);
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
 			lst_endDate=DriverManager.getDriver().findElements(IReport.NewPatientList_END_DATE);
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
public boolean UnInsuredPatientList(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_List);
			flag=CommonMethods.clickIfEnable(IReport.LNK_PatientList);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_UnInsuredPatientList);
			
 			stepInfo="Select Start Date, Click on calender Icon ";
 			flag=CommonMethods.clickIfEnable(IReport.ICON_START_DATE);
 			Thread.sleep(2000); 			
 			List<WebElement> lst_startDate=new ArrayList<WebElement>();
 			lst_startDate=DriverManager.getDriver().findElements(IReport.NewPatientList_START_DATE);
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
 			lst_endDate=DriverManager.getDriver().findElements(IReport.NewPatientList_END_DATE);
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
			 			flag=CommonMethods.isElementPresent(IReport.PDF_AgingDetail);
			 			
			 			DriverManager.getDriver().close();
			 		 			DriverManager.getDriver().switchTo().window(parentWindow);
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}

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


@Test
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


///////////////// 	Drug List //////////////// 


@Test
public boolean DrugList(){ 

	try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_List);
			flag=CommonMethods.clickIfEnable(IReport.Lnk_DrugListMenu);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_DrugList);
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
public boolean PrescriptionDetail(){ 

	try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_List);
			flag=CommonMethods.clickIfEnable(IReport.Lnk_DrugListMenu);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_PrescriptionDetail);
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
			
///////////////// 	Drug List //////////////// 


@Test
public boolean ProcedureCodeList(){ 

try {
stepInfo="Click on Reporting tab";
flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
stepInfo="Click on Daily Reporting";
flag=CommonMethods.clickIfEnable(IReport.LNK_List);
flag=CommonMethods.clickIfEnable(IReport.Lnk_FeesListMenu);
stepInfo="Select Executive Summary";
flag=CommonMethods.clickIfEnable(IReport.Lnk_ProcedureCodeList );
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
public boolean FeesSchedList(){ 

try {
stepInfo="Click on Reporting tab";
flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
stepInfo="Click on Daily Reporting";
flag=CommonMethods.clickIfEnable(IReport.LNK_List);
flag=CommonMethods.clickIfEnable(IReport.Lnk_FeesListMenu);
stepInfo="Select Executive Summary";
flag=CommonMethods.clickIfEnable(IReport.Lnk_FeesSchedList);
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
public boolean ProcedureCodesbyFeeSchedule(){ 

try {
stepInfo="Click on Reporting tab";
flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
stepInfo="Click on Daily Reporting";
flag=CommonMethods.clickIfEnable(IReport.LNK_List);
flag=CommonMethods.clickIfEnable(IReport.Lnk_FeesListMenu);
stepInfo="Select Executive Summary";
flag=CommonMethods.clickIfEnable(IReport.Lnk_ProcedureCodesbyFeeSchedule);
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
public boolean CreditCodesReport(){ 

try {
stepInfo="Click on Reporting tab";
flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
stepInfo="Click on Daily Reporting";
flag=CommonMethods.clickIfEnable(IReport.LNK_List);
flag=CommonMethods.clickIfEnable(IReport.Lnk_FeesListMenu);
stepInfo="Select Executive Summary";
flag=CommonMethods.clickIfEnable(IReport.Lnk_CreditCodesReport);
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
public boolean ExplosionCodeList(){ 

try {
stepInfo="Click on Reporting tab";
flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
stepInfo="Click on Daily Reporting";
flag=CommonMethods.clickIfEnable(IReport.LNK_List);
flag=CommonMethods.clickIfEnable(IReport.Lnk_FeesListMenu);
stepInfo="Select Executive Summary";
flag=CommonMethods.clickIfEnable(IReport.Lnk_ExplosionCodeList);
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



////////////////// Office List  //////////////

@Test
public boolean OfficeInformation(){ 

try {
stepInfo="Click on Reporting tab";
flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
stepInfo="Click on Daily Reporting";
flag=CommonMethods.clickIfEnable(IReport.LNK_List);
flag=CommonMethods.clickIfEnable(IReport.Lnk_OfficeListMenu);
stepInfo="Select Executive Summary";
flag=CommonMethods.clickIfEnable(IReport.Lnk_OfficeInformation);
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
public boolean OfficeHoliday(){ 

try {
stepInfo="Click on Reporting tab";
flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
stepInfo="Click on Daily Reporting";
flag=CommonMethods.clickIfEnable(IReport.LNK_List);
flag=CommonMethods.clickIfEnable(IReport.Lnk_OfficeListMenu);
stepInfo="Select Executive Summary";
flag=CommonMethods.clickIfEnable(IReport.Lnk_OfficeHoliday);
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
public boolean OperatoryList (){ 

try {
stepInfo="Click on Reporting tab";
flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
stepInfo="Click on Daily Reporting";
flag=CommonMethods.clickIfEnable(IReport.LNK_List);
flag=CommonMethods.clickIfEnable(IReport.Lnk_OfficeListMenu);
stepInfo="Select Executive Summary";
flag=CommonMethods.clickIfEnable(IReport.Lnk_OperatoryList);
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


////////////////// Security List  //////////////

@Test
public boolean SecurityUserList(){ 

try {
stepInfo="Click on Reporting tab";
flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
stepInfo="Click on Daily Reporting";
flag=CommonMethods.clickIfEnable(IReport.LNK_List);
flag=CommonMethods.clickIfEnable(IReport.Lnk_SecurityListMenu);
stepInfo="Select Executive Summary";
flag=CommonMethods.clickIfEnable(IReport.Lnk_SecurityUserList);
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
public boolean SecurityGroupList(){ 

try {
stepInfo="Click on Reporting tab";
flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
stepInfo="Click on Daily Reporting";
flag=CommonMethods.clickIfEnable(IReport.LNK_List);
flag=CommonMethods.clickIfEnable(IReport.Lnk_SecurityListMenu);
stepInfo="Select Executive Summary";
flag=CommonMethods.clickIfEnable(IReport.Lnk_SecurityGroupList);
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
public boolean SecurityGroupRightsList (){ 

try {
stepInfo="Click on Reporting tab";
flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
stepInfo="Click on Daily Reporting";
flag=CommonMethods.clickIfEnable(IReport.LNK_List);
flag=CommonMethods.clickIfEnable(IReport.Lnk_SecurityListMenu);
stepInfo="Select Executive Summary";
flag=CommonMethods.clickIfEnable(IReport.Lnk_SecurityGroupRightsList);
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


////////////////// Setup List  //////////////

@Test
public boolean ADACategoriesList(){ 

try {
stepInfo="Click on Reporting tab";
flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
stepInfo="Click on Daily Reporting";
flag=CommonMethods.clickIfEnable(IReport.LNK_List);
flag=CommonMethods.clickIfEnable(IReport.Lnk_SetupListMenu);
stepInfo="Select Executive Summary";
flag=CommonMethods.clickIfEnable(IReport.Lnk_ADACategoriesList);
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
public boolean DefaultInsPlanCoverageCategoryList(){ 

try {
stepInfo="Click on Reporting tab";
flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
stepInfo="Click on Daily Reporting";
flag=CommonMethods.clickIfEnable(IReport.LNK_List);
flag=CommonMethods.clickIfEnable(IReport.Lnk_SetupListMenu);
stepInfo="Select Executive Summary";
flag=CommonMethods.clickIfEnable(IReport.Lnk_DefaultInsPlanCoverageCategoryList);
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
public boolean DocumentTypesList (){ 

try {
stepInfo="Click on Reporting tab";
flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
stepInfo="Click on Daily Reporting";
flag=CommonMethods.clickIfEnable(IReport.LNK_List);
flag=CommonMethods.clickIfEnable(IReport.Lnk_SetupListMenu);
stepInfo="Select Executive Summary";
flag=CommonMethods.clickIfEnable(IReport.Lnk_DocumentTypesList);
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
public boolean NotesMacroCategoryList(){ 

try {
stepInfo="Click on Reporting tab";
flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
stepInfo="Click on Daily Reporting";
flag=CommonMethods.clickIfEnable(IReport.LNK_List);
flag=CommonMethods.clickIfEnable(IReport.Lnk_SetupListMenu);
stepInfo="Select Executive Summary";
flag=CommonMethods.clickIfEnable(IReport.Lnk_NotesMacroCategoryList);
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
public boolean NotesMacrosList(){ 

try {
stepInfo="Click on Reporting tab";
flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
stepInfo="Click on Daily Reporting";
flag=CommonMethods.clickIfEnable(IReport.LNK_List);
flag=CommonMethods.clickIfEnable(IReport.Lnk_SetupListMenu);
stepInfo="Select Executive Summary";
flag=CommonMethods.clickIfEnable(IReport.Lnk_NotesMacrosList);
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
public boolean PatientTypesList(){ 

try {
stepInfo="Click on Reporting tab";
flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
stepInfo="Click on Daily Reporting";
flag=CommonMethods.clickIfEnable(IReport.LNK_List);
flag=CommonMethods.clickIfEnable(IReport.Lnk_SetupListMenu);
stepInfo="Select Executive Summary";
flag=CommonMethods.clickIfEnable(IReport.Lnk_PatientTypesList);
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
public boolean InsPlanReportingSubTypeList(){ 

try {
stepInfo="Click on Reporting tab";
flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
stepInfo="Click on Daily Reporting";
flag=CommonMethods.clickIfEnable(IReport.LNK_List);
flag=CommonMethods.clickIfEnable(IReport.Lnk_SetupListMenu);
stepInfo="Select Executive Summary";
flag=CommonMethods.clickIfEnable(IReport.Lnk_InsPlanReportingSubTypeList);
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
public boolean InsPlanReportingTypeList(){ 

try {
stepInfo="Click on Reporting tab";
flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
stepInfo="Click on Daily Reporting";
flag=CommonMethods.clickIfEnable(IReport.LNK_List);
flag=CommonMethods.clickIfEnable(IReport.Lnk_SetupListMenu);
stepInfo="Select Executive Summary";
flag=CommonMethods.clickIfEnable(IReport.Lnk_InsPlanReportingTypeList);
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
public boolean ProviderSpecialtiesList(){ 

try {
stepInfo="Click on Reporting tab";
flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
stepInfo="Click on Daily Reporting";
flag=CommonMethods.clickIfEnable(IReport.LNK_List);
flag=CommonMethods.clickIfEnable(IReport.Lnk_SetupListMenu);
stepInfo="Select Executive Summary";
flag=CommonMethods.clickIfEnable(IReport.Lnk_ProviderSpecialtiesList);
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
public boolean ReferralTypesList(){ 

try {
stepInfo="Click on Reporting tab";
flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
stepInfo="Click on Daily Reporting";
flag=CommonMethods.clickIfEnable(IReport.LNK_List);
flag=CommonMethods.clickIfEnable(IReport.Lnk_SetupListMenu);
stepInfo="Select Executive Summary";
flag=CommonMethods.clickIfEnable(IReport.Lnk_ReferralTypesList);
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
public boolean RespPartyTypesList(){ 

try {
stepInfo="Click on Reporting tab";
flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
stepInfo="Click on Daily Reporting";
flag=CommonMethods.clickIfEnable(IReport.LNK_List);
flag=CommonMethods.clickIfEnable(IReport.Lnk_SetupListMenu);
stepInfo="Select Executive Summary";
flag=CommonMethods.clickIfEnable(IReport.Lnk_RespPartyTypesList);
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
public boolean SchedulerProductionTypesList(){ 

try {
stepInfo="Click on Reporting tab";
flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
stepInfo="Click on Daily Reporting";
flag=CommonMethods.clickIfEnable(IReport.LNK_List);
flag=CommonMethods.clickIfEnable(IReport.Lnk_SetupListMenu);
stepInfo="Select Executive Summary";
flag=CommonMethods.clickIfEnable(IReport.Lnk_SchedulerProductionTypesList);
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

//////  Responsible Party List  ////////////
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


@Test
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

				///////////////// 	Provider List //////////////// 


@Test
public boolean ProviderList(){ 

try {
stepInfo="Click on Reporting tab";
flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
stepInfo="Click on Daily Reporting";
flag=CommonMethods.clickIfEnable(IReport.LNK_List);
flag=CommonMethods.clickIfEnable(IReport.Lnk_ProviderListMenu);
stepInfo="Select Executive Summary";
flag=CommonMethods.clickIfEnable(IReport.Lnk_ProviderList);
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
public boolean PatientAttechedtoProvider (){ 

try {
stepInfo="Click on Reporting tab";
flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
stepInfo="Click on Daily Reporting";
flag=CommonMethods.clickIfEnable(IReport.LNK_List);
flag=CommonMethods.clickIfEnable(IReport.Lnk_ProviderListMenu);
stepInfo="Select Executive Summary";
flag=CommonMethods.clickIfEnable(IReport.Lnk_PatientAttechedtoProvider);
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
public boolean ProviderHolidays(){ 

try {
stepInfo="Click on Reporting tab";
flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
stepInfo="Click on Daily Reporting";
flag=CommonMethods.clickIfEnable(IReport.LNK_List);
flag=CommonMethods.clickIfEnable(IReport.Lnk_ProviderListMenu);
stepInfo="Select Executive Summary";
flag=CommonMethods.clickIfEnable(IReport.Lnk_ProviderHolidays);
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
public boolean ProviderOperatory(){ 

try {
stepInfo="Click on Reporting tab";
flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
stepInfo="Click on Daily Reporting";
flag=CommonMethods.clickIfEnable(IReport.LNK_List);
flag=CommonMethods.clickIfEnable(IReport.Lnk_ProviderListMenu);
stepInfo="Select Executive Summary";
flag=CommonMethods.clickIfEnable(IReport.Lnk_ProviderOperatory);
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
