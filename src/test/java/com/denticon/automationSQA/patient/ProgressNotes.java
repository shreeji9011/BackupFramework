package com.denticon.automationSQA.patient;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.IAddPatient;
import com.denticon.automationSQA.pom.INotes;
import com.denticon.automationSQA.utilities.CommonMethods;

public class ProgressNotes extends SeleniumSuite { 
	
	String stepInfo=""; 
	boolean flag=false; 

 	
 	@Test(description="Verify Progress Notes Module")
 	public boolean verifyProgressNotesPage(){
	
 		try	{ 

 			stepInfo="Click on Patient tab";
 			flag=CommonMethods.clickIfEnable(INotes.SLC_RecentPatient);
 			flag=CommonMethods.clickIfEnable(INotes.SLC_LastPatient);
			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
			test.log(Status.PASS, "Click on Patient tab"); 
			
			stepInfo="Click on Progress Notes"; 
			flag=CommonMethods.clickIfEnable(INotes.TAB_PNotes);
			test.log(Status.PASS, "Click on Progress Notes");
			stepInfo="Go to Add Progress Notes";
 			flag=CommonMethods.clickIfEnable(INotes. SLC_AddNewNote);
 			flag=CommonMethods.selectFromList(INotes.SLC_PNSelectMacro,"2% Lidocaine 1/100K");
 			flag=CommonMethods.clickIfEnable(INotes.SLC_PNSelectMacro);
 			flag=CommonMethods.clickIfEnable(INotes.SLC_MacroAddNotes);
 			flag=CommonMethods.sendText(INotes.TXT_PNnotes,"Add my Progress Note" );
 			flag=CommonMethods.clickIfEnable(INotes.FinalAddNotes);
 			flag=CommonMethods.clickIfEnable(INotes.Save);
 			test.log(Status.PASS, "Go to Add Progress Notes");

			
	} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 
 			
 		}
	return flag;
 	
}
}
