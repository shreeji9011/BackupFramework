package com.denticon.automationSQA.patient;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.IAddPatient;
import com.denticon.automationSQA.pom.INotes;
import com.denticon.automationSQA.utilities.CommonMethods;

public class Notes extends SeleniumSuite{
	String stepInfo=""; 
	boolean flag=false; 
 

@Test(description="Verify Search Patient functionality")
public boolean verifyPatientNotesPage(){
	
	try	{ 
		
			Thread.sleep(3000);
			stepInfo="Go to Search Patient Tab";
			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
			test.log(Status.PASS, "Go to Patient Tab"); 
			Thread.sleep(5000);
			flag=CommonMethods.clickIfEnable(INotes.TAB_Notes);
			test.log(Status.PASS, "Go to Search Notes Tab"); 

			flag=CommonMethods.clickIfEnable(INotes.SLC_nAddNewNote); 
			test.log(Status.PASS, "Select Add New Notes"); 
			
			flag=CommonMethods.clickIfEnable(INotes.Ins_Date );
			flag=CommonMethods.sendText(INotes.Txt_Notes,"This is Patient Note"); 
			test.log(Status.PASS, "Enter Note "); 
			
			stepInfo="Save Note";
			flag=CommonMethods.clickIfEnable(INotes.SLC_Save);	
			test.log(Status.PASS, "Save Note"); 
			
			flag=CommonMethods.clickIfEnable(INotes.SLC_nEdit);
			flag=CommonMethods.sendText(INotes.Txt_Notes,"Edited Note"); 
			test.log(Status.PASS, "Edit Notes"); 
			
			flag=CommonMethods.clickIfEnable(INotes.SLC_nUpdate);
//			flag=CommonMethods.clickIfEnable(INotes.SLC_nCancel);
			test.log(Status.PASS, "Update Note"); 
			
			flag=CommonMethods.clickIfEnable(INotes.SLC_nDelete);
			Alert alert =com.denticon.automationSQA.DriverManager.getDriver().switchTo().alert(); 
 			alert.accept(); 
 			Thread.sleep(1000);
			test.log(Status.PASS, "Delete Note"); 
			
		} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 			
		} 		
	return flag;
 	}

@Test(description="Verify Search Patient functionality")
public boolean verifyResponsiblePartyNotesPage(){
	
	try	{ 
		
			Thread.sleep(5000);
			stepInfo="Go to Search Patient Tab";
			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
			test.log(Status.PASS, "Go to Patient Tab"); 
			Thread.sleep(5000);
			flag=CommonMethods.clickIfEnable(INotes.TAB_Notes);
			test.log(Status.PASS, "Go to Search Notes Tab"); 

			flag=CommonMethods.clickIfEnable(INotes.SLC_nAddNewNote); 
			test.log(Status.PASS, "Select Add New Notes"); 
			
			flag=CommonMethods.selectFromList(INotes.SLC_FromList,"Responsible Party Notes"); 
			flag=CommonMethods.clickIfEnable(INotes.Ins_Date );
			flag=CommonMethods.sendText(INotes.Txt_Notes,"This is Patient Note"); 
			test.log(Status.PASS, "Enter Note "); 
			
			stepInfo="Save Note";
			flag=CommonMethods.clickIfEnable(INotes.SLC_Save);	
			test.log(Status.PASS, "Save Note"); 
			
			flag=CommonMethods.clickIfEnable(INotes.SLC_nEdit);
			flag=CommonMethods.sendText(INotes.Txt_Notes,"Edited Note"); 
			test.log(Status.PASS, "Edit Notes"); 
			
//			flag=CommonMethods.clickIfEnable(INotes.SLC_nUpdate);
			flag=CommonMethods.clickIfEnable(INotes.SLC_nCancel);
			Alert alert =com.denticon.automationSQA.DriverManager.getDriver().switchTo().alert(); 
 			alert.accept(); 
 			Thread.sleep(1000);
			test.log(Status.PASS, "Update Note"); 
			
			flag=CommonMethods.clickIfEnable(INotes.SLC_nDelete);
			Alert alert1 =com.denticon.automationSQA.DriverManager.getDriver().switchTo().alert(); 
 			alert1.accept(); 
 			Thread.sleep(1000);
			test.log(Status.PASS, "Delete Note"); 
			
		} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 			
		} 		
	return flag;
 	}

@Test(description="Verify Search Patient functionality")
public boolean verifyFinancialNotesPage(){
	
	try	{ 
		
			Thread.sleep(5000);
			stepInfo="Go to Search Patient Tab";
			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
			test.log(Status.PASS, "Go to Patient Tab"); 
			Thread.sleep(5000);
			flag=CommonMethods.clickIfEnable(INotes.TAB_Notes);
			test.log(Status.PASS, "Go to Search Notes Tab"); 

			flag=CommonMethods.clickIfEnable(INotes.SLC_nAddNewNote); 
			test.log(Status.PASS, "Select Add New Notes"); 
			
			flag=CommonMethods.selectFromList(INotes.SLC_FromList,"Financial Notes"); 
			flag=CommonMethods.clickIfEnable(INotes.Ins_Date );
			flag=CommonMethods.sendText(INotes.Txt_Notes,"This is Financial Notes"); 
			test.log(Status.PASS, "Enter Note "); 
			
			stepInfo="Save Note";
			flag=CommonMethods.clickIfEnable(INotes.SLC_Save);	
			test.log(Status.PASS, "Save Note"); 
			
			flag=CommonMethods.clickIfEnable(INotes.SLC_nEdit);
			flag=CommonMethods.sendText(INotes.Txt_Notes,"Edited Note"); 
			test.log(Status.PASS, "Edit Notes"); 
			
			flag=CommonMethods.clickIfEnable(INotes.SLC_nUpdate);
//			flag=CommonMethods.clickIfEnable(INotes.SLC_nCancel);
			test.log(Status.PASS, "Update Note"); 
			
			flag=CommonMethods.clickIfEnable(INotes.SLC_nDelete);
			Alert alert =com.denticon.automationSQA.DriverManager.getDriver().switchTo().alert(); 
 			alert.accept(); 
 			Thread.sleep(1000);
			test.log(Status.PASS, "Delete Note"); 
			
		} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 			
		} 		
	return flag;
 	}

@Test(description="Verify Search Patient functionality")
public boolean verifyAppointmentNotesPage(){
	
	try	{ 
		
			Thread.sleep(5000);
			stepInfo="Go to Search Patient Tab";
			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
			test.log(Status.PASS, "Go to Patient Tab"); 
			Thread.sleep(5000);
			flag=CommonMethods.clickIfEnable(INotes.TAB_Notes);
			test.log(Status.PASS, "Go to Search Notes Tab"); 

			flag=CommonMethods.clickIfEnable(INotes.SLC_nAddNewNote); 
			test.log(Status.PASS, "Select Add New Notes"); 
			
			flag=CommonMethods.selectFromList(INotes.SLC_FromList,"Appointment Notes"); 
			flag=CommonMethods.clickIfEnable(INotes.Ins_Date );
			flag=CommonMethods.sendText(INotes.Txt_Notes,"This is Appointment Notes"); 
			test.log(Status.PASS, "Enter Note "); 
			
			stepInfo="Save Note";
			flag=CommonMethods.clickIfEnable(INotes.SLC_Save);	
			test.log(Status.PASS, "Save Note"); 
			
			flag=CommonMethods.clickIfEnable(INotes.SLC_nEdit);
			flag=CommonMethods.sendText(INotes.Txt_Notes,"Edited Note"); 
			test.log(Status.PASS, "Edit Notes"); 
			
			flag=CommonMethods.clickIfEnable(INotes.SLC_nUpdate);
//			flag=CommonMethods.clickIfEnable(INotes.SLC_nCancel);
			test.log(Status.PASS, "Update Note"); 
			
			flag=CommonMethods.clickIfEnable(INotes.SLC_nDelete);
			Alert alert =com.denticon.automationSQA.DriverManager.getDriver().switchTo().alert(); 
 			alert.accept(); 
 			Thread.sleep(1000);
			test.log(Status.PASS, "Delete Note"); 
			
		} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 			
		} 		
	return flag;
 	}

@Test(description="Verify Search Patient functionality")
public boolean verifySystemNotesPage(){
	
	try	{ 
		
			Thread.sleep(5000);
			stepInfo="Go to Search Patient Tab";
			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
			test.log(Status.PASS, "Go to Patient Tab"); 
			Thread.sleep(5000);
			flag=CommonMethods.clickIfEnable(INotes.TAB_Notes);
			test.log(Status.PASS, "Go to Search Notes Tab"); 

			flag=CommonMethods.clickIfEnable(INotes.SLC_nAddNewNote); 
			test.log(Status.PASS, "Select Add New Notes"); 
			
			flag=CommonMethods.selectFromList(INotes.SLC_FromList,"System Notes"); 
			flag=CommonMethods.clickIfEnable(INotes.Ins_Date );
			flag=CommonMethods.sendText(INotes.Txt_Notes,"This is System Notes"); 
			test.log(Status.PASS, "Enter Note "); 
			
			stepInfo="Save Note";
			flag=CommonMethods.clickIfEnable(INotes.SLC_Save);	
			test.log(Status.PASS, "Save Note"); 
			
			flag=CommonMethods.clickIfEnable(INotes.SLC_nEdit);
			flag=CommonMethods.sendText(INotes.Txt_Notes,"Edited Note"); 
			test.log(Status.PASS, "Edit Notes"); 
			
			flag=CommonMethods.clickIfEnable(INotes.SLC_nUpdate);
//			flag=CommonMethods.clickIfEnable(INotes.SLC_nCancel);
			test.log(Status.PASS, "Update Note"); 
			
			flag=CommonMethods.clickIfEnable(INotes.SLC_nDelete);
			Alert alert =com.denticon.automationSQA.DriverManager.getDriver().switchTo().alert(); 
 			alert.accept(); 
 			Thread.sleep(1000);
			test.log(Status.PASS, "Delete Note"); 
			
		} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 			
		} 		
	return flag;
 	}

/*
@Test(description="Verify Search Patient functionality")
public boolean verifyDocumentUploadPage(){
	
	try	{ 
		
			Thread.sleep(1000);
			stepInfo="Go to Search Patient Tab";
			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
			test.log(Status.PASS, "Go to Patient Tab"); 
		
			flag=CommonMethods.clickIfEnable(INotes.TAB_Notes);
			test.log(Status.PASS, "Go to Search Notes Tab"); 

			flag=CommonMethods.clickIfEnable(INotes.SLC_nAddNewNote); 
			test.log(Status.PASS, "Select Add New Notes"); 
			
			flag=CommonMethods.selectFromList(INotes.SLC_FromList,"Documents (Upload)"); 
			flag=CommonMethods.clickIfEnable(INotes.Ins_Date );
			flag=CommonMethods.sendText(INotes.Txt_Notes,"This is Document Upload page"); 
			test.log(Status.PASS, "Enter Note "); 
			
			stepInfo="Save Note";
			flag=CommonMethods.clickIfEnable(INotes.SLC_Save);	
			test.log(Status.PASS, "Save Note"); 
			
			flag=CommonMethods.clickIfEnable(INotes.SLC_nEdit);
			flag=CommonMethods.sendText(INotes.Txt_Notes,"Edited Note"); 
			test.log(Status.PASS, "Edit Notes"); 
			
			flag=CommonMethods.clickIfEnable(INotes.SLC_nUpdate);
//			flag=CommonMethods.clickIfEnable(INotes.SLC_nCancel);
			test.log(Status.PASS, "Update Note"); 
			
			flag=CommonMethods.clickIfEnable(INotes.SLC_nDelete);
			Alert alert =com.denticon.automationSQA.DriverManager.getDriver().switchTo().alert(); 
 			alert.accept(); 
 			Thread.sleep(1000);
			test.log(Status.PASS, "Delete Note"); 
			
		} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 			
		} 		
	return flag;
 	}

/*
@Test(description="Verify Search Patient functionality")
public boolean verifyDocumentScanPage(){
	
	try	{ 
		
			Thread.sleep(1000);
			stepInfo="Go to Search Patient Tab";
			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
			test.log(Status.PASS, "Go to Patient Tab"); 
		
			flag=CommonMethods.clickIfEnable(INotes.TAB_Notes);
			test.log(Status.PASS, "Go to Search Notes Tab"); 

			flag=CommonMethods.clickIfEnable(INotes.SLC_nAddNewNote); 
			test.log(Status.PASS, "Select Add New Notes"); 
			
			flag=CommonMethods.selectFromList(INotes.SLC_FromList,"Documents (Scan)"); 
			flag=CommonMethods.clickIfEnable(INotes.Ins_Date );
			flag=CommonMethods.sendText(INotes.Txt_Notes,"This is Document Scan page"); 
			test.log(Status.PASS, "Enter Note "); 
			
			stepInfo="Save Note";
			flag=CommonMethods.clickIfEnable(INotes.SLC_Save);	
			test.log(Status.PASS, "Save Note"); 
			
			flag=CommonMethods.clickIfEnable(INotes.SLC_nEdit);
			flag=CommonMethods.sendText(INotes.Txt_Notes,"Edited Note"); 
			test.log(Status.PASS, "Edit Notes"); 
			
//			flag=CommonMethods.clickIfEnable(INotes.SLC_nUpdate);
			flag=CommonMethods.clickIfEnable(INotes.SLC_nCancel);
			test.log(Status.PASS, "Update Note"); 
			
			flag=CommonMethods.clickIfEnable(INotes.SLC_nDelete);
			Alert alert =com.denticon.automationSQA.DriverManager.getDriver().switchTo().alert(); 
 			alert.accept(); 
 			Thread.sleep(1000);
			test.log(Status.PASS, "Delete Note"); 
			
		} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 			
		} 		
	return flag;
 	}

*/

}
