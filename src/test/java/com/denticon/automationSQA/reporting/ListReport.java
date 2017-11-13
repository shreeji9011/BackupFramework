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



}
