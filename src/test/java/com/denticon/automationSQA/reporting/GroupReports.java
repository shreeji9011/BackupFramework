package com.denticon.automationSQA.reporting;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.denticon.automationSQA.DriverManager;
import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.IReport;
import com.denticon.automationSQA.utilities.CommonMethods;

import java.util.Set;

		
public class GroupReports extends SeleniumSuite{

			String stepInfo=" "; 
			boolean flag=false;
	
			
			////////////////// Appointment Reports /////////////
			
			
//@Test
	public boolean AppointmentReports(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_AppointmentReports);
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

	/////////////////  Batch Reports ///////////////
	
	
	
//	@Test
	public boolean AgingSummaryG(){ 
		try {
			Thread.sleep(5000);
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);

 			flag=CommonMethods.clickIfEnable(IReport.Lnk_BatchReports);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_AgingSummaryG);
 			Thread.sleep(2000);

 			stepInfo="Click on Print Preview Icon ";
 			flag=CommonMethods.clickIfEnable(IReport.Btn_ScheduledReort);

			String parentWindow=DriverManager.getDriver().getWindowHandle();
/*			Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
			for (String window : windowHandles) {
				DriverManager.getDriver().switchTo().window(window);
			}   */

			 		 			DriverManager.getDriver().switchTo().window(parentWindow);


 				} catch (Exception e) { 
 		 			e.printStackTrace(); 
 		 			Assert.fail(); 
 		 			
 		 		}
 			return flag;
 		 	
 		}
	
//	@Test
	public boolean AgingDetailG(){ 
		try {
		//////////////Aging Detail group report ////
		
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

		flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);

		flag=CommonMethods.clickIfEnable(IReport.Lnk_BatchReports);
		
		flag=CommonMethods.clickIfEnable(IReport.Lnk_AgingDetailsG);
		Thread.sleep(2000);

		stepInfo="Click on Print Preview Icon ";
		flag=CommonMethods.clickIfEnable(IReport.Btn_ScheduledReort);
		
			String parentWindow=DriverManager.getDriver().getWindowHandle();
			Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
			for (String window : windowHandles) {
				DriverManager.getDriver().switchTo().window(window);
			}

			 		 			DriverManager.getDriver().switchTo().window(parentWindow);

	} catch (Exception e) { 
		e.printStackTrace(); 
		Assert.fail(); 
		
	}
return flag;

}
	
	////////////// Group Daily reports ///////////////////////////////////
	
//	@Test
		public boolean DailyJournalbyUserDetail(){ 
			try {
				stepInfo="Click on Reporting tab";
				flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

	 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
	 
	 			flag=CommonMethods.clickIfEnable(IReport.Lnk_DailyReportsG);
	 			
	 			flag=CommonMethods.clickIfEnable(IReport.Lnk_DailyJournalbyUserDetail);
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

//	@Test
	public boolean DailyJournalbyUserDetailCreatedDate (){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_DailyReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_DailyJournalbyUserDetailCreatedDate);
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
	
//	@Test
	public boolean DailyJournalG(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_DailyReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_DailyJournalG);
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
	
	
//	@Test
	public boolean DailySummaryG(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_DailyReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_DailySummaryG);
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
	
//	@Test
	public boolean DailyJournalByProviderDetailG (){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_DailyReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_DailyJournalByProviderDetailG);
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
	
//	@Test
	public boolean DailyScheduledProductionG(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_DailyReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_DailyScheduledProductionG);
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
	
//	@Test
	public boolean SpecialTransactionReport(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_DailyReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_SpecialTransactionReport);
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
	
//	@Test
	public boolean ExsummaryG(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_DailyReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_ExsummaryG);
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
	
//	@Test
	public boolean DailyCollection(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_DailyReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_DailyCollection);
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
	
//	@Test
	public boolean DailyCollectionbyProviderG(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_DailyReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_DailyCollectionbyProviderG);
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
	
//	@Test
	public boolean PatientProgressNotesG(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_DailyReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_PatientProgressNotesG);
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
	
//	@Test
	public boolean UnsignedProgressNotesReportG(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_DailyReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_UnsignedProgressNotesReportG);
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
	
//	@Test
	public boolean MissingProgressNotesG (){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_DailyReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_MissingProgressNotesG);
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
	
//	@Test
	public boolean DailyAuditReportG(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_DailyReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_DailyAuditReportG);
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
	
	/////////////////////////////// Group report- Insurance report //////////////////////
	
//	@Test
	public boolean OutstandingClaims(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_InsReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_OutstandingClaims);
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
	

//	@Test
	public boolean OutstandingClaimsExcel(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_InsReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_OutstandingClaimsExcel);
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
	
//	@Test
	public boolean ClaimsList(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_InsReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_ClaimsList);
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
	
//	@Test
	public boolean ClaimsNotCreated(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_InsReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_ClaimsNotCreated);
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
	
//	@Test
	public boolean ClaimsCreatedNotSent(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_InsReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_ClaimsCreatedNotSent);
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
	
//	@Test
	public boolean OutstandingPreAuthorizationG(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_InsReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_OutstandingPreAuthorizationG);
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
	
//	@Test
	public boolean PreAuthorizationListG(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_InsReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_PreAuthorizationListG);
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
	
//	@Test
	public boolean UnbilledReportDuetoNoInsurance(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_InsReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_UnbilledReportDuetoNoInsurance);
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
	
//	@Test
	public boolean CapitationUtilizationDetailG(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_InsReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_CapitationUtilizationDetailG);
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
	
//	@Test
	public boolean CapitationUtilizationSummaryG(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_InsReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_CapitationUtilizationSummaryG);
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
	
//	@Test
	public boolean CapitationUtilizationProviderDetailG(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_InsReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_CapitationUtilizationProviderDetailG);
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
	
//	@Test
	public boolean CapitationUtilizationProviderSummaryG(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_InsReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_CapitationUtilizationProviderSummaryG);
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
	
//	@Test
	public boolean PlansCreatedByUser(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_InsReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_PlansCreatedByUser);
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
	
//	@Test
	public boolean NewPatientsbyCarrierG(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_InsReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_NewPatientsbyCarrierG);
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
	
//	@Test
	public boolean ProceduresonHoldG(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_InsReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_ProceduresonHoldG);
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
	
	
	///////////////////////////// Group reports- Management report /////////////// 
	
	
//	@Test
	public boolean AgingDetailGR(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_ManagementReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_AgingDetailG);
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
	
//	@Test
	public boolean AgingSummaryGR (){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_ManagementReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_AgingSummaryGR);
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
	
//	@Test
	public boolean AgingByHomeOfficeG(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_ManagementReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_AgingByHomeOfficeG);
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
	
//	@Test
	public boolean AgingSummaryByHomeOffice(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_ManagementReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_AgingSummaryByHomeOffice);
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
	
//	@Test
	public boolean AgingbyHomeOfficewithBalanceStatusG(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_ManagementReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_AgingbyHomeOfficewithBalanceStatusG);
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
	
//	@Test
	public boolean AgingwithRemContractBalG(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_ManagementReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_AgingwithRemContractBalG);
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
	
//	@Test
	public boolean AgingwithRemContractBalbyHomeOfficeG(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_ManagementReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_AgingwithRemContractBalbyHomeOfficeG);
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
	
//	@Test
	public boolean AgingbyProviderbyHomeOfficeDetail (){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_ManagementReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_AgingbyProviderbyHomeOfficeDetail);
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
	
//	@Test
	public boolean ProductionbyCategory(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_ManagementReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_ProductionbyCategory);
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
	
//	@Test
	public boolean ProductionbyCodes(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_ManagementReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_ProductionbyCodes);
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
	
//	@Test
	public boolean ProductionbyCodesProvider(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_ManagementReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_ProductionbyCodesProvider);
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
	
//	@Test
	public boolean ProductionbyProviderG(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_ManagementReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_ProductionbyProviderG);
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
	
//	@Test
	public boolean RecallDue(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_ManagementReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_RecallDue);
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
	
//	@Test
	public boolean AppointmentDetailByUser(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_ManagementReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_AppointmentDetailByUser);
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
	
//	@Test
	public boolean TimeClockReport(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_ManagementReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_TimeClockReport);
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

	
//	@Test
	public boolean UnallocationPaymentsAdjustmentsReport(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_ManagementReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_UnallocationPaymentsAdjustmentsReport);
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

	
	//////////////////////////////////////////////////////// Group Reports - Other Reports ////////////////////////////////////////////////
	
//	@Test
	public boolean NewPatientsList(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_OtherReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_NewPatientsList);
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
	
//	@Test
	public boolean TxPlanStatusReport(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_OtherReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_TxPlanStatusReport);
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
	
//	@Test
	public boolean UserActivityReport(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_OtherReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_UserActivityReport);
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

//	@Test
	public boolean Tickler(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_OtherReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_Tickler);
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
	
//	@Test
	public boolean PatientMedicaidIDReport(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_OtherReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_PatientMedicaidIDReport);
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

	
//	@Test
	public boolean AppointmentsbyProvider(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_OtherReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_AppointmentsbyProvider);
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
	
/////////////////////////////////////////////////////// Group Reports - Referral Reports ////////////////////////////////////////////////
	
//	@Test
	public boolean ReferralProductionListG(){ 
		try {
			Thread.sleep(5000);
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_ReferralReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_ReferralProductionListG);
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
	
//	@Test
	public boolean ReferralSummaryReportG(){ 
		try {
			Thread.sleep(5000);
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_ReferralReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_ReferralSummaryReportG);
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
	
//	@Test
	public boolean ReferralCountSummaryG(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

 			flag=CommonMethods.clickIfEnable(IReport.LNK_GROUP_REPORTS);
 
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_ReferralReportsG);
 			
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_ReferralCountSummaryG);
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