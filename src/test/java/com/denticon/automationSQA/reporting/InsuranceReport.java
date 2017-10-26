package com.denticon.automationSQA.reporting;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.denticon.automationSQA.DriverManager;
import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.IReport;
import com.denticon.automationSQA.utilities.CommonMethods;

import java.util.Set;

		
public class InsuranceReport extends SeleniumSuite{

			String stepInfo=" "; 
			boolean flag=false;
	
@Test
	public boolean OutstandingClaim(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
 			stepInfo="Click on Daily Reporting";
 			flag=CommonMethods.clickIfEnable(IReport.LNK_Insurance_Report);
 			stepInfo="Select Executive Summary";
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_OutstandingClaim);
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
public boolean OutstandingClaimProvider(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_Insurance_Report);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_OutstandingClaimProvider);
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
public boolean ClaimList(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_Insurance_Report);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_ClaimList);
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
public boolean CapitationUtilizationDetail(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_Insurance_Report);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_CapitationUtilizationDetail);
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
public boolean CapitationUtilizationSummary(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_Insurance_Report);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_CapitationUtilizationSummary);
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
public boolean CapitationUtilizationProviderDetail(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_Insurance_Report);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_CapitationUtilizationProviderDetail);
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
public boolean CapitationUtilizationProviderDetailMID(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_Insurance_Report);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_CapitationUtilizationProviderDetailMID);
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
public boolean CapitationUtilizationProviderSummary(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_Insurance_Report);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_CapitationUtilizationProviderSummary);
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
public boolean ProductionSummaryByCarrier(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_Insurance_Report);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_ProductionSummaryByCarrier);
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
public boolean VBSEligibilityReport(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_Insurance_Report);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_VBSEligibilityReport);
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
public boolean VBSEligibilityReportHold(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_Insurance_Report);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_VBSEligibilityReportHold);
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
public boolean OutstandingPreAuthorization(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_Insurance_Report);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_OutstandingPreAuthorization);
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
public boolean OutstandingPreAuthorizationProvider(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_Insurance_Report);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_OutstandingPreAuthorizationProvider);
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
public boolean PreAuthorizationList(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_Insurance_Report);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_PreAuthorizationList);
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
public boolean BenefitsUsed_UnusedTreatmentPlan(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_Insurance_Report);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_BenefitsUsed_UnusedTreatmentPlan);
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
public boolean BenefitsUsed_UnusedRecall(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_Insurance_Report);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_BenefitsUsed_UnusedRecall);
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
public boolean CapitationPayment(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_Insurance_Report);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_CapitationPayment);
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
public boolean CapitationFeeSchedule(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_Insurance_Report);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_CapitationFeeSchedule);
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
public boolean Claimsnotcreated(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_Insurance_Report);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_Claimsnotcreated);
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
public boolean ProceduresonHold(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_Insurance_Report);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_ProceduresonHold);
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
public boolean NewPatientsbyCarrier(){ 
	try {
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
			stepInfo="Click on Daily Reporting";
			flag=CommonMethods.clickIfEnable(IReport.LNK_Insurance_Report);
			stepInfo="Select Executive Summary";
			flag=CommonMethods.clickIfEnable(IReport.Lnk_NewPatientsbyCarrier);
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



}