package com.denticon.automationSQA.reporting;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.denticon.automationSQA.DriverManager;
import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.IReport;
import com.denticon.automationSQA.utilities.CommonMethods;

public class LOffice extends SeleniumSuite {

	String stepInfo=" "; 
	boolean flag=false;
		
//////////////////Office List  //////////////

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



//////////////////Security List  //////////////

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



}