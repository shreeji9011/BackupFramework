package com.denticon.automationSQA.patient;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.IAddPatient;
import com.denticon.automationSQA.pom.INotes;
import com.denticon.automationSQA.utilities.CommonMethods;

public class ProgressNotes extends SeleniumSuite { 
	
	String stepInfo=""; 
	boolean flag=false; 

 	ExtentReports extent;
	ExtentTest test; 
 	
	
 	public boolean verifyProgressNotesTabModule(Method method) {
 		test=  extent.createTest(this.getClass().getSimpleName()+"::"+method.getName(), method.getName());
		if(verifyProgressNotesPage())
			System.out.println("Patient Progress Notes page verification passed");
		else
			System.out.println("Patient Progress Notes page verification failed");
	return flag;
 	}
 	
 	@Test(description="Verify Progress Notes Module")
 	public boolean verifyProgressNotesPage(){
	
 		try	{ 
 			
 			extent=CommonMethods.getReport(extent,test); 
 			test = extent.createTest("Progress Notes Module");
		
 			stepInfo="Click on Patient tab";
 			flag=CommonMethods.clickIfEnable(INotes.SLC_RecentPatient);
 			flag=CommonMethods.clickIfEnable(INotes.SLC_LastPatient);
			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
			test.log(Status.PASS, "Click on Patient tab"); 
			
			stepInfo="Click on Progress Notes"; 
			flag=CommonMethods.clickIfEnable(INotes.TAB_PNotes);
			test.log(Status.PASS, "Click on Progress Notes");

			
			Thread.sleep(5000);
 			stepInfo="Go to Add Progress Notes";
 			flag=CommonMethods.doubleClickIfEnable(INotes. SLC_AddNewNote);
 			Thread.sleep(3000);
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
