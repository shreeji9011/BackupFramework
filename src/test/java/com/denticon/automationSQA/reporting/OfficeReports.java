package com.denticon.automationSQA.reporting;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.denticon.automationSQA.DriverManager;
import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.IReport;
import com.denticon.automationSQA.utilities.CommonMethods;

import java.util.Set;

		
public class OfficeReports extends SeleniumSuite{

			String stepInfo=" "; 
			boolean flag=false;
	
			
/////////////////////////////////////////////////////// Office Reports - Access Dental Reports ////////////////////////////////////////////////
	
@Test
public boolean ProductionAnalysisReport(){ 
try {
Thread.sleep(5000);
stepInfo="Click on Reporting tab";
flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

flag=CommonMethods.clickIfEnable(IReport.LNK_OfficeReports);

flag=CommonMethods.clickIfEnable(IReport.Lnk_ADR);

flag=CommonMethods.clickIfEnable(IReport.Lnk_ProductionAnalysisReport);
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
public boolean ProviderCompensationReportNew(){ 
try {
Thread.sleep(5000);
stepInfo="Click on Reporting tab";
flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

flag=CommonMethods.clickIfEnable(IReport.LNK_OfficeReports);

flag=CommonMethods.clickIfEnable(IReport.Lnk_ADR);

flag=CommonMethods.clickIfEnable(IReport.Lnk_ProviderCompensationReportNew);
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
public boolean SalesandDiagnosisReport(){ 
try {
Thread.sleep(5000);
stepInfo="Click on Reporting tab";
flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

flag=CommonMethods.clickIfEnable(IReport.LNK_OfficeReports);

flag=CommonMethods.clickIfEnable(IReport.Lnk_ADR);

flag=CommonMethods.clickIfEnable(IReport.Lnk_SalesandDiagnosisReport);
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
public boolean CollectionRateReport(){ 
try {
Thread.sleep(5000);
stepInfo="Click on Reporting tab";
flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

flag=CommonMethods.clickIfEnable(IReport.LNK_OfficeReports);

flag=CommonMethods.clickIfEnable(IReport.Lnk_ADR);

flag=CommonMethods.clickIfEnable(IReport.Lnk_CollectionRateReport);
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
public boolean TreatmentPlanAcceptanceAnalysisByProvider(){ 
try {
Thread.sleep(5000);
stepInfo="Click on Reporting tab";
flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

flag=CommonMethods.clickIfEnable(IReport.LNK_OfficeReports);

flag=CommonMethods.clickIfEnable(IReport.Lnk_ADR);

flag=CommonMethods.clickIfEnable(IReport.Lnk_TreatmentPlanAcceptanceAnalysisByProvider);
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
public boolean ClaimsUnderPaidOverPaidDenied(){ 
try {
Thread.sleep(5000);
stepInfo="Click on Reporting tab";
flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

flag=CommonMethods.clickIfEnable(IReport.LNK_OfficeReports);

flag=CommonMethods.clickIfEnable(IReport.Lnk_ADR);

flag=CommonMethods.clickIfEnable(IReport.Lnk_ClaimsUnderPaidOverPaidDenied);
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

/////////////////////////////////////////////////////// Office Reports - DHA Reports ////////////////////////////////////////////////


@Test
public boolean ProviderCompensationReportDetailExcel(){ 
	try {
		Thread.sleep(5000);
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

			flag=CommonMethods.clickIfEnable(IReport.LNK_OfficeReports);

			flag=CommonMethods.clickIfEnable(IReport.Lnk_DHA);
			
			flag=CommonMethods.clickIfEnable(IReport.Lnk_ProviderCompensationReportDetailExcel);
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
			} 
	
			catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 

			}
			return flag;

			}	


@Test
public boolean ProviderUCRReportDetailExcel(){ 
	try {
		Thread.sleep(5000);
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

			flag=CommonMethods.clickIfEnable(IReport.LNK_OfficeReports);

			flag=CommonMethods.clickIfEnable(IReport.Lnk_DHA);
			
			flag=CommonMethods.clickIfEnable(IReport.Lnk_ProviderUCRReportDetailExcel);
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
			} 
	
			catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 

			}
			return flag;

			}	


@Test
public boolean EligibilityReport(){ 
	try {
		Thread.sleep(5000);
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

			flag=CommonMethods.clickIfEnable(IReport.LNK_OfficeReports);

			flag=CommonMethods.clickIfEnable(IReport.Lnk_DHA);
			
			flag=CommonMethods.clickIfEnable(IReport.Lnk_EligibilityReport);
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
			} 
	
			catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 

			}
			return flag;

			}	

/////////////////////////////////////////////////////// Office Reports - Hawaii Family Dental Reports ////////////////////////////////////////////////

@Test
public boolean ProviderCompensationReport(){ 
	try {
		Thread.sleep(5000);
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

			flag=CommonMethods.clickIfEnable(IReport.LNK_OfficeReports);

			flag=CommonMethods.clickIfEnable(IReport.Lnk_HFD);
			
			flag=CommonMethods.clickIfEnable(IReport.Lnk_ProviderCompensationReport);
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
			} 
	
			catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 

			}
			return flag;

			}	

@Test
public boolean CarrierAnalysis(){ 
	try {
		Thread.sleep(5000);
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

			flag=CommonMethods.clickIfEnable(IReport.LNK_OfficeReports);

			flag=CommonMethods.clickIfEnable(IReport.Lnk_HFD);
			
			flag=CommonMethods.clickIfEnable(IReport.Lnk_CarrierAnalysis);
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
			} 
	
			catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 

			}
			return flag;

			}	

@Test
public boolean UncollectedCopay(){ 
	try {
		Thread.sleep(5000);
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

			flag=CommonMethods.clickIfEnable(IReport.LNK_OfficeReports);

			flag=CommonMethods.clickIfEnable(IReport.Lnk_HFD);
			
			flag=CommonMethods.clickIfEnable(IReport.Lnk_UncollectedCopay);
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
			} 
	
			catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 

			}
			return flag;

			}	

@Test
public boolean OutstandingClaimsHawaii(){ 
	try {
		Thread.sleep(5000);
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

			flag=CommonMethods.clickIfEnable(IReport.LNK_OfficeReports);

			flag=CommonMethods.clickIfEnable(IReport.Lnk_HFD);
			
			flag=CommonMethods.clickIfEnable(IReport.Lnk_OutstandingClaimsHawaii);
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
			} 
	
			catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 

			}
			return flag;

			}	

@Test
public boolean PatientReceivablesAgingReportbyHomeOffice(){ 
	try {
		Thread.sleep(5000);
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

			flag=CommonMethods.clickIfEnable(IReport.LNK_OfficeReports);

			flag=CommonMethods.clickIfEnable(IReport.Lnk_HFD);
			
			flag=CommonMethods.clickIfEnable(IReport.Lnk_PatientReceivablesAgingReportbyHomeOffice);
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
			} 
	
			catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 

			}
			return flag;

			}	

@Test
public boolean PatientListByLastvisit(){ 
	try {
		Thread.sleep(5000);
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

			flag=CommonMethods.clickIfEnable(IReport.LNK_OfficeReports);

			flag=CommonMethods.clickIfEnable(IReport.Lnk_HFD);
			
			flag=CommonMethods.clickIfEnable(IReport.Lnk_PatientListByLastvisit);
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
			} 
	
			catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 

			}
			return flag;

			}	

@Test
public boolean WeeklyProviderProductionExcel(){ 
	try {
		Thread.sleep(5000);
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

			flag=CommonMethods.clickIfEnable(IReport.LNK_OfficeReports);

			flag=CommonMethods.clickIfEnable(IReport.Lnk_HFD);
			
			flag=CommonMethods.clickIfEnable(IReport.Lnk_WeeklyProviderProductionExcel);
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
			} 
	
			catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 

			}
			return flag;

			}	

@Test
public boolean NextAppointmentBookedReportExcel(){ 
	try {
		Thread.sleep(5000);
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

			flag=CommonMethods.clickIfEnable(IReport.LNK_OfficeReports);

			flag=CommonMethods.clickIfEnable(IReport.Lnk_HFD);
			
			flag=CommonMethods.clickIfEnable(IReport.Lnk_NextAppointmentBookedReportExcel);
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
			} 
	
			catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 

			}
			return flag;

			}	

@Test
public boolean TPCIncentiveReport(){ 
	try {
		Thread.sleep(5000);
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

			flag=CommonMethods.clickIfEnable(IReport.LNK_OfficeReports);

			flag=CommonMethods.clickIfEnable(IReport.Lnk_HFD);
			
			flag=CommonMethods.clickIfEnable(IReport.Lnk_TPCIncentiveReport);
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
			} 
	
			catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 

			}
			return flag;

			}	


/////////////////////////////////////////////////////// Office Reports - Lumina Reports ////////////////////////////////////////////////



@Test
public boolean DenticalEOB(){ 
	try {
		Thread.sleep(5000);
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

			flag=CommonMethods.clickIfEnable(IReport.LNK_OfficeReports);

			flag=CommonMethods.clickIfEnable(IReport.Lnk_Lumina);
		
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
			} 
	
			catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 

			}
			return flag;

			}	

/////////////////////////////////////////////////////// Office Reports - DCA Reports ////////////////////////////////////////////////

@Test
public boolean DailyJournalDetailLandscape(){ 
	try {
		Thread.sleep(5000);
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

			flag=CommonMethods.clickIfEnable(IReport.LNK_OfficeReports);

			flag=CommonMethods.clickIfEnable(IReport.Lnk_DCA);
			
			flag=CommonMethods.clickIfEnable(IReport.Lnk_DailyJournalDetailLandscape);
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
			} 
	
			catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 

			}
			return flag;

			}	


@Test
public boolean DailyCollectionbyOffice(){ 
	try {
		Thread.sleep(5000);
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

			flag=CommonMethods.clickIfEnable(IReport.LNK_OfficeReports);

			flag=CommonMethods.clickIfEnable(IReport.Lnk_DCA);
			
			flag=CommonMethods.clickIfEnable(IReport.Lnk_DailyCollectionbyOffice);
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
			} 
	
			catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 

			}
			return flag;

			}	

@Test
public boolean DailyCollectionbyOfficeDetail(){ 
	try {
		Thread.sleep(5000);
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

			flag=CommonMethods.clickIfEnable(IReport.LNK_OfficeReports);

			flag=CommonMethods.clickIfEnable(IReport.Lnk_DCA);
			
			flag=CommonMethods.clickIfEnable(IReport.Lnk_DailyCollectionbyOfficeDetail);
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
			} 
	
			catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 

			}
			return flag;

			}

@Test
public boolean DailyCollectionbyProviderAllocation(){ 
	try {
		Thread.sleep(5000);
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

			flag=CommonMethods.clickIfEnable(IReport.LNK_OfficeReports);

			flag=CommonMethods.clickIfEnable(IReport.Lnk_DCA);
			
			flag=CommonMethods.clickIfEnable(IReport.Lnk_DailyCollectionbyProviderAllocation);
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
			} 
	
			catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 

			}
			return flag;

			}

@Test
public boolean MultiStepProcedures(){ 
	try {
		Thread.sleep(5000);
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

			flag=CommonMethods.clickIfEnable(IReport.LNK_OfficeReports);

			flag=CommonMethods.clickIfEnable(IReport.Lnk_DCA);
			
			flag=CommonMethods.clickIfEnable(IReport.Lnk_MultiStepProcedures);
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
			} 
	
			catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 

			}
			return flag;

			}

@Test
public boolean CapitationReport(){ 
	try {
		Thread.sleep(5000);
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

			flag=CommonMethods.clickIfEnable(IReport.LNK_OfficeReports);

			flag=CommonMethods.clickIfEnable(IReport.Lnk_DCA);
			
			flag=CommonMethods.clickIfEnable(IReport.Lnk_CapitationReport);
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
			} 
	
			catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 

			}
			return flag;

			}

@Test
public boolean AllocationAnalysisReport(){ 
	try {
		Thread.sleep(5000);
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

			flag=CommonMethods.clickIfEnable(IReport.LNK_OfficeReports);

			flag=CommonMethods.clickIfEnable(IReport.Lnk_DCA);
			
			flag=CommonMethods.clickIfEnable(IReport.Lnk_AllocationAnalysisReport);
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
			} 
	
			catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 

			}
			return flag;

			}

@Test
public boolean TreatmentPlanStatusNewPatientsDetail(){ 
	try {
		Thread.sleep(5000);
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

			flag=CommonMethods.clickIfEnable(IReport.LNK_OfficeReports);

			flag=CommonMethods.clickIfEnable(IReport.Lnk_DCA);
			
			flag=CommonMethods.clickIfEnable(IReport.Lnk_TreatmentPlanStatusNewPatientsDetail);
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
			} 
	
			catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 

			}
			return flag;

			}

@Test
public boolean IncomeAllocationHygienistReportDetail (){ 
	try {
		Thread.sleep(5000);
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

			flag=CommonMethods.clickIfEnable(IReport.LNK_OfficeReports);

			flag=CommonMethods.clickIfEnable(IReport.Lnk_DCA);
			
			flag=CommonMethods.clickIfEnable(IReport.Lnk_IncomeAllocationHygienistReportDetail );
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
			} 
	
			catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 

			}
			return flag;

			}

@Test
public boolean ProviderComparisonReport(){ 
	try {
		Thread.sleep(5000);
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

			flag=CommonMethods.clickIfEnable(IReport.LNK_OfficeReports);

			flag=CommonMethods.clickIfEnable(IReport.Lnk_DCA);
			
			flag=CommonMethods.clickIfEnable(IReport.Lnk_ProviderComparisonReport);
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
			} 
	
			catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 

			}
			return flag;

			}

@Test
public boolean IncomeAllocationHygienistReportSummary(){ 
	try {
		Thread.sleep(5000);
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

			flag=CommonMethods.clickIfEnable(IReport.LNK_OfficeReports);

			flag=CommonMethods.clickIfEnable(IReport.Lnk_DCA);
			
			flag=CommonMethods.clickIfEnable(IReport.Lnk_IncomeAllocationHygienistReportSummary);
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
			} 
	
			catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 

			}
			return flag;

			}

@Test
public boolean ProviderCompensationReportSummary(){ 
	try {
		Thread.sleep(5000);
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

			flag=CommonMethods.clickIfEnable(IReport.LNK_OfficeReports);

			flag=CommonMethods.clickIfEnable(IReport.Lnk_DCA);
			
			flag=CommonMethods.clickIfEnable(IReport.Lnk_ProviderCompensationReportSummary);
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
			} 
	
			catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 

			}
			return flag;

			}

@Test
public boolean BalanceStatusReport(){ 
	try {
		Thread.sleep(5000);
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

			flag=CommonMethods.clickIfEnable(IReport.LNK_OfficeReports);

			flag=CommonMethods.clickIfEnable(IReport.Lnk_DCA);
			
			flag=CommonMethods.clickIfEnable(IReport.Lnk_BalanceStatusReport);
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
			} 
	
			catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 

			}
			return flag;

			}

@Test
public boolean Top25CarrierProduction(){ 
	try {
		Thread.sleep(5000);
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

			flag=CommonMethods.clickIfEnable(IReport.LNK_OfficeReports);

			flag=CommonMethods.clickIfEnable(IReport.Lnk_DCA);
			
			flag=CommonMethods.clickIfEnable(IReport.Lnk_Top25CarrierProduction);
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
			} 
	
			catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 

			}
			return flag;

			}

/////////////////////////////////////////////////////// Office Reports - On Heathcare Reports ////////////////////////////////////////////////


@Test
public boolean OnHealthCareReport(){ 
	try {
		Thread.sleep(5000);
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

			flag=CommonMethods.clickIfEnable(IReport.LNK_OfficeReports);

			flag=CommonMethods.clickIfEnable(IReport.Lnk_OnHealthCareReport);
			
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
			} 
	
			catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 

			}
			return flag;

			}

/////////////////////////////////////////////////////// Office Reports - Ottawa Reports /////////////////////////////////



@Test
public boolean MilesofSmilesReport(){ 
	try {
		Thread.sleep(5000);
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

			flag=CommonMethods.clickIfEnable(IReport.LNK_OfficeReports);

			flag=CommonMethods.clickIfEnable(IReport.Lnk_OttawaReport);
			
			flag=CommonMethods.clickIfEnable(IReport.Lnk_MilesofSmilesReport);
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
			} 
	
			catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 

			}
			return flag;

			}


/////////////////////////////////////////////////////// Office Reports - Tru fAMILY dENTAL Reports ////////////////////////////////////////////////  

@Test
public boolean DailyProductionvsCollectionReport(){ 
	try {
		Thread.sleep(5000);
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

			flag=CommonMethods.clickIfEnable(IReport.LNK_OfficeReports);

			flag=CommonMethods.clickIfEnable(IReport.Lnk_tfdrReport);
			

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
			} 
	
			catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 

			}
			return flag;

			}


@Test
public boolean specialTransactionReport(){ 
	try {
		Thread.sleep(5000);
		stepInfo="Click on Reporting tab";
		flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);

			flag=CommonMethods.clickIfEnable(IReport.LNK_OfficeReports);

			flag=CommonMethods.clickIfEnable(IReport.Lnk_VFDReport);
			

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
			} 
	
			catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 

			}
			return flag;

			}


}
