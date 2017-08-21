package com.denticon.automationSQA.patient;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.IAddPatient;
import com.denticon.automationSQA.pom.IStatusTracker;
import com.denticon.automationSQA.utilities.CommonMethods;

public class StatusTracker extends SeleniumSuite {
	String stepInfo=""; 
	boolean flag=false; 
 

@Test
public boolean verifyStatusTrackerPage(){
	
	try	{ 
	
			Thread.sleep(1000);
			stepInfo="Go to Search Patient Tab";
			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
			test.log(Status.PASS, "Go to Patient Tab"); 
		
			flag=CommonMethods.clickIfEnable(IStatusTracker.TAB_StatusTracker);
			test.log(Status.PASS, "Go to Search Notes Tab"); 

			flag=CommonMethods.clickIfEnable(IStatusTracker.SLC_AddNewStatus); 
			test.log(Status.PASS, "Select Add New Notes"); 
			
			flag=CommonMethods.sendText(IStatusTracker.Txt_Notestatus,"This is Patient Note"); 
			test.log(Status.PASS, "Enter Note "); 
			
			stepInfo="Save Note";
			flag=CommonMethods.clickIfEnable(IStatusTracker.SLC_Calander);
			flag=CommonMethods.clickIfEnable(IStatusTracker.SLC_NextDayDate);
			Thread.sleep(2000);
			flag=CommonMethods.clickIfEnable(IStatusTracker.SLC_Save);	
			test.log(Status.PASS, "Save Note"); 
			
			flag=CommonMethods.clickIfEnable(IStatusTracker.SLC_EditST);
			flag=CommonMethods.sendText(IStatusTracker.Txt_Notestatus,"Edited Note"); 
			test.log(Status.PASS, "Edit Notes"); 

			stepInfo="Save Note";
			flag=CommonMethods.clickIfEnable(IStatusTracker.SLC_Calander);
			flag=CommonMethods.clickIfEnable(IStatusTracker.SLC_NextDayDate);
			flag=CommonMethods.clickIfEnable(IStatusTracker.SLC_Save);	
			test.log(Status.PASS, "Save Note"); 
			
			flag=CommonMethods.clickIfEnable(IStatusTracker.SLC_DeleteST);
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

}
