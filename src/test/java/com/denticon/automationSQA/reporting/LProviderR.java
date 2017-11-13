package com.denticon.automationSQA.reporting;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.denticon.automationSQA.DriverManager;
import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.IReport;
import com.denticon.automationSQA.utilities.CommonMethods;

public class LProviderR extends SeleniumSuite {

	String startDate="10"; 
	String endDate="27"; 
	String stepInfo=" "; 
	boolean flag=false;
		
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
