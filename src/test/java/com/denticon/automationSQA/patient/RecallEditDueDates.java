package com.denticon.automationSQA.patient;

import java.lang.reflect.Method;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.IAddPatient;
import com.denticon.automationSQA.utilities.CommonMethods;

public class RecallEditDueDates extends SeleniumSuite { 
	
	String stepInfo=""; 
	boolean flag=false; 

 	ExtentReports extent;
	ExtentTest test; 
 	
	
 	public boolean verifyRecallEditDueDatesModule(Method method) {
 		test=  extent.createTest(this.getClass().getSimpleName()+"::"+method.getName(), method.getName());
		if(verifyRecallEditDueDatesPage())
			System.out.println("Patient Recall Edit Due Dates page verification passed");
		else
			System.out.println("Patient Recall Edit Due Dates page verification failed");
	return flag;
 	}
 	
 	@Test(description="Verify Recall Edit Due Dates Module")
 	public boolean verifyRecallEditDueDatesPage(){
	
 		try	{ 
 			
 			extent=CommonMethods.getReport(extent,test); 
 			test = extent.createTest("Add New Member Module");
		
 			stepInfo="Click on Patient tab";
			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
			test.log(Status.PASS, "Click on Patient tab"); 
			
			stepInfo="Click on Recall Edit Due Dates"; 
			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_RecallDueDate);
			test.log(Status.PASS, "Click on Recall Edit Due Dates");
			

 			stepInfo="Go to Add Recall Information";
 			flag=CommonMethods.selectFromList(IAddPatient.SLC_RecallIntType,"Day");
 			test.log(Status.PASS, "Go to Add Recall Information");
 			
 			flag=CommonMethods.clickIfEnable(IAddPatient.BTN_Save);					
 			test.log(Status.PASS, "Go to Finish");
 			
 			
	} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 
 			
 		}
	return flag;
 	
}
}
