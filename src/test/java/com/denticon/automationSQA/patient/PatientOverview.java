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

public class PatientOverview extends SeleniumSuite { 
	
	String stepInfo=""; 
	boolean flag=false; 
 	
 	ExtentReports extent;
	ExtentTest test; 
 	
	
 	public boolean verifyPatientOverviewTabModule(Method method) {
 		test=  extent.createTest(this.getClass().getSimpleName()+"::"+method.getName(), method.getName());
		if(verifyPatientOverviewPage())
			System.out.println("Patient Overview page verification passed");
		else
			System.out.println("Patient Overview page verification failed");
	return flag;
 	}
 	
 	@Test(description="Verify Patient Overview Module")
 	public boolean verifyPatientOverviewPage(){
	
 		try	{ 
 			
 			extent=CommonMethods.getReport(extent,test); 
 			test = extent.createTest("Patient Overview Module");
		
 			stepInfo="Click on Patient tab";
			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
			test.log(Status.PASS, "Click on Patient tab"); 
			
			stepInfo="Click on Patient Overview"; 
			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PatOverview);
			test.log(Status.PASS, "Click on Patient Overview");
			
			
 			
	} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 
 			
 		}
	return flag;
 	
}
}
