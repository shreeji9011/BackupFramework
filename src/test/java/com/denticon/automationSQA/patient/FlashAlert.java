package com.denticon.automationSQA.patient;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.IAddPatient;
import com.denticon.automationSQA.pom.IFlashAlert;
import com.denticon.automationSQA.utilities.CommonMethods;

public class FlashAlert extends SeleniumSuite { 
	
	String stepInfo=""; 
	boolean flag=false; 


 	
 	@Test(description="Verify Flash Alert Module")
 	public boolean verifyFlashAlertPage(){
	
 		try	{ 
 			Thread.sleep(5000);
 			stepInfo="Click on Patient tab";
			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
			test.log(Status.PASS, "Click on Patient tab"); 
			
			stepInfo="Click on Flash Alert"; 
			flag=CommonMethods.clickIfEnable(IFlashAlert. TAB_FlashAlert);
			test.log(Status.PASS, "Click on Flash Alert");
			
			stepInfo="Click on Add New"; 
			flag=CommonMethods.clickIfEnable(IFlashAlert.TAB_AddNew);
			test.log(Status.PASS, "Click on Add New");
			
			stepInfo="Enter data "; 
			flag=CommonMethods.clickIfEnable(IFlashAlert.SLC_Date);
			test.log(Status.PASS, "Enter data");
			
			stepInfo="Enter note"; 
			flag=CommonMethods.clickIfEnable(IFlashAlert.TXT_FlashNote);
			flag=CommonMethods.sendText(IFlashAlert.TXT_FlashNote,"Hello,This is Flash Alert");
			test.log(Status.PASS, "Enter Note");
			
			stepInfo="Click on Save"; 
			flag=CommonMethods.clickIfEnable(IFlashAlert.SLC_Save);
			test.log(Status.PASS, "Click on Save");
			Thread.sleep(2000);
			stepInfo="Click on Deactivate Flash Alert"; 
			flag=CommonMethods.clickIfEnable(IFlashAlert.SLC_Deactivate);
			test.log(Status.PASS, "Click on  Deactivate Flash Alert");
			
			Thread.sleep(2000);
			stepInfo="Click on edit Flash Alert"; 
			flag=CommonMethods.clickIfEnable(IFlashAlert.SLC_Edit);
			flag=CommonMethods.clickIfEnable(IFlashAlert.TXT_FlashNote);
			flag=CommonMethods.sendText(IFlashAlert.TXT_FlashNote,"Hello,This is Edited");
			test.log(Status.PASS, "Click on edit Flash Alert");
			

			
			stepInfo="Click on save edited Flash Alert"; 
			flag=CommonMethods.clickIfEnable(IFlashAlert.SLC_Update);
			test.log(Status.PASS, "Click on save Edited Flash Alert");
			

 		} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 
 			
 		}
	return flag;
 	
}
}