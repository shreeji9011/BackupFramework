package com.denticon.automationSQA.reporting;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.denticon.automationSQA.DriverManager;
import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.IReport;
import com.denticon.automationSQA.utilities.CommonMethods;

import java.util.Set;

		
public class TreatmentPlanStatusReport extends SeleniumSuite{

			String stepInfo=" "; 
			boolean flag=false;
	
@Test
	public boolean TreatmentPlanProposal(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
 			stepInfo="Click on Daily Reporting";
 			flag=CommonMethods.clickIfEnable(IReport.LNK_TreatmentPlanReports );
 			stepInfo="Select Executive Summary";
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_TreatmentPlanProposal);
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
public boolean TreatmentPlanAnalysisR(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_TreatmentPlanReports );
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_TreatmentPlanAnalysisR);
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
public boolean TreatmentPlanStatusDetail(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_TreatmentPlanReports );
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_TreatmentPlanStatusDetail);
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
public boolean TreatmentPlanStatusSummary(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_TreatmentPlanReports );
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_TreatmentPlanStatusSummary);
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
public boolean TreatmentPlanStatusbyCodeDetail (){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_TreatmentPlanReports );
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_TreatmentPlanStatusbyCodeDetail );
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
public boolean TreatmentPlanDetail(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_TreatmentPlanReports );
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_TreatmentPlanDetail);
			Thread.sleep(2000);
			flag=CommonMethods.clickIfEnable(IReport.slc_procedureCode);
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