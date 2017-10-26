package com.denticon.automationSQA.reporting;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.IReport;
import com.denticon.automationSQA.utilities.CommonMethods;


		
public class Statements extends SeleniumSuite{

			String stepInfo=" "; 
			boolean flag=false;
	
@Test
	public boolean UpdateStDate(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
 			stepInfo="Click on Daily Reporting";
 			flag=CommonMethods.clickIfEnable(IReport.LNK_Statements);
 			stepInfo="Select Executive Summary";
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_UpdateStDate);
 			Alert alert =com.denticon.automationSQA.DriverManager.getDriver().switchTo().alert(); 
 			alert.accept(); 
 	
 			Thread.sleep(2000);


		} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 
 			
 		}
	return flag;
 	
}
	
	@Test
	public boolean PrintStatReport(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
 			stepInfo="Click on Daily Reporting";
 			flag=CommonMethods.clickIfEnable(IReport.LNK_Statements);
 			stepInfo="Select Executive Summary";
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_PrintStatReport);
 			Thread.sleep(2000);


		} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 
 			
 		}
	return flag;
 	
}
	
	@Test
	public boolean PrintStmt(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
 			stepInfo="Click on Daily Reporting";
 			flag=CommonMethods.clickIfEnable(IReport.LNK_Statements);
 			stepInfo="Select Executive Summary";
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_PrintStmt);
 			Thread.sleep(2000);


		} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 
 			
 		}
	return flag;
 	
}
		

	@Test
	public boolean EmailStmt(){ 
		try {
			stepInfo="Click on Reporting tab";
			flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
 			stepInfo="Click on Daily Reporting";
 			flag=CommonMethods.clickIfEnable(IReport.LNK_Statements);
 			stepInfo="Select Executive Summary";
 			flag=CommonMethods.clickIfEnable(IReport.Rtb_OnlyEmail);
 			flag=CommonMethods.clickIfEnable(IReport.Lnk_EmailStmt);
 			Thread.sleep(2000);


		} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 
 			
 		}
	return flag;
 	
}
}
