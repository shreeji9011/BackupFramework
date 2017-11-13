package com.denticon.automationSQA.reporting;

import java.util.Set;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.denticon.automationSQA.DriverManager;
import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.IReport;
import com.denticon.automationSQA.utilities.CommonMethods;

		
public class Letters extends SeleniumSuite{

	String stepInfo=" "; 
	boolean flag=false;
		
			
@Test  

	public boolean MarketingLetters(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
 			stepInfo="Click on Daily Reporting";
 			flag=CommonMethods.clickIfEnable(IReport.LNK_LETTERS);
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_MarketingLetters);

 			stepInfo="Click on Print Preview Icon ";
 			flag=CommonMethods.clickIfEnable(IReport.BTN_PRINT_PREVIEW);
 			
			String parentWindow=DriverManager.getDriver().getWindowHandle();
			Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
			for (String window : windowHandles) {
			if(!window.equals(parentWindow)){
			DriverManager.getDriver().switchTo().window(window);

			}
			}
			
		} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 
 			
 		}
	return flag;
 	
}

@Test  

public boolean FinancialCommuniques(){ 
	try {
			Thread.sleep(3000);
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_LETTERS);
			flag=CommonMethods.clickIfEnable(IReport.Lnk_FinancialCommuniques);

			stepInfo="Click on Print Preview Icon ";
			flag=CommonMethods.clickIfEnable(IReport.BTN_PRINT_PREVIEW);
			
			if(CommonMethods.isAlertPresent());
			
			String parentWindow=DriverManager.getDriver().getWindowHandle();
			Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
			for (String window : windowHandles) {
			if(!window.equals(parentWindow)){
			DriverManager.getDriver().switchTo().window(window);

			}
			}
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}


@Test  

public boolean DentistCommuniques(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_LETTERS);
			flag=CommonMethods.clickIfEnable(IReport.Lnk_DentistCommuniques);

			stepInfo="Click on Print Preview Icon ";
			flag=CommonMethods.clickIfEnable(IReport.BTN_PRINT_PREVIEW);
			
			if(CommonMethods.isAlertPresent());
			
			String parentWindow=DriverManager.getDriver().getWindowHandle();
			Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
			for (String window : windowHandles) {
			if(!window.equals(parentWindow)){
			DriverManager.getDriver().switchTo().window(window);

			}
			}
			DriverManager.getDriver().close();
			DriverManager.getDriver().switchTo().window(parentWindow);
			
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}


@Test  

public boolean AppointmentLetters(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_LETTERS);
			flag=CommonMethods.clickIfEnable(IReport.Lnk_AppointmentLetters);

			stepInfo="Click on Print Preview Icon ";
			flag=CommonMethods.clickIfEnable(IReport.BTN_PRINT_PREVIEW);
			
			if(CommonMethods.isAlertPresent());
			String parentWindow=DriverManager.getDriver().getWindowHandle();
			Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
			for (String window : windowHandles) {
			if(!window.equals(parentWindow)){
			DriverManager.getDriver().switchTo().window(window);

			}
			}
			
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}


@Test  

public boolean InsuranceLetters(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_LETTERS);
			flag=CommonMethods.clickIfEnable(IReport.Lnk_InsuranceLetters);

			stepInfo="Click on Print Preview Icon ";
			flag=CommonMethods.clickIfEnable(IReport.BTN_PRINT_PREVIEW);
			
			if(CommonMethods.isAlertPresent());
			
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

public boolean PatientConsent(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_LETTERS);
			flag=CommonMethods.clickIfEnable(IReport.Lnk_PatientConsent);

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

public boolean PatientEducationLetters(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_LETTERS);
			flag=CommonMethods.clickIfEnable(IReport.Lnk_PatientEducationLetters);

			stepInfo="Click on Print Preview Icon ";
			flag=CommonMethods.clickIfEnable(IReport.BTN_PRINT_PREVIEW);
			
			if(CommonMethods.isAlertPresent());
			String parentWindow=DriverManager.getDriver().getWindowHandle();
			Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
			for (String window : windowHandles) {
			if(!window.equals(parentWindow)){
			DriverManager.getDriver().switchTo().window(window);

			}
			}
			
			
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}


}
