package com.denticon.automationSQA.reporting;

import java.util.Set;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.denticon.automationSQA.DriverManager;
import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.IReport;
import com.denticon.automationSQA.utilities.CommonMethods;

public class LSetup extends SeleniumSuite {

	String startDate="10"; 
	String endDate="27"; 
	String stepInfo=" "; 
	boolean flag=false;

	

//////////////////Setup List  //////////////

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

/*
String parentWindow=DriverManager.getDriver().getWindowHandle();
Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
for (String window : windowHandles) {
if(!window.equals(parentWindow)){
DriverManager.getDriver().switchTo().window(window);

}
}
*/

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
if(!window.equals(parentWindow)){
DriverManager.getDriver().switchTo().window(window);

}
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


//@Test
/*
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


Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
for (String window : windowHandles) {
if(!window.equals(parentWindow)){
DriverManager.getDriver().switchTo().window(window);

}
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


Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
for (String window : windowHandles) {
if(!window.equals(parentWindow)){
DriverManager.getDriver().switchTo().window(window);

}
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
*/

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


//@Test
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


//@Test
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


//@Test
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
if(!window.equals(parentWindow)){
DriverManager.getDriver().switchTo().window(window);

}
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

//@Test
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

}
