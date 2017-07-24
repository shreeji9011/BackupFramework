package com.denticon.automationSQA.patient;

import java.lang.reflect.Method;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.IAddPatient;
import com.denticon.automationSQA.utilities.CommonMethods;

public class MedicalHistory extends SeleniumSuite { 
	
	String stepInfo=""; 
	boolean flag=false; 
 	String filePath=System.getProperty("user.dir") + "\\src\\main\\resources\\AddNewPatient.properties"; 
 	Properties prop= new Properties();
 	ExtentReports extent;
	ExtentTest test; 
 	
	
 	public boolean verifyPatientMedicalHistoryTabModule(Method method) {
 		test=  extent.createTest(this.getClass().getSimpleName()+"::"+method.getName(), method.getName());
		if(verifyPatientMedicalHistoryPage())
			System.out.println("Patient Medical History page verification passed");
		else
			System.out.println("Patient Medical History page verification failed");
	return flag;
 	}
 	
 	@Test(description="Verify Medical History Module")
 	public boolean verifyPatientMedicalHistoryPage(){
	
 		try	{ 
 			
 			extent=CommonMethods.getReport(extent,test); 
 			test = extent.createTest("Medical History Module");
		
 			stepInfo="Click on Patient tab";
			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
			test.log(Status.PASS, "Click on Patient tab"); 
			
			stepInfo="Click on medical history"; 
			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_MedicalHistory);
			test.log(Status.PASS, "Click on medical history");
 			
 			stepInfo="Go to Add Medical Information";
 			flag=CommonMethods.clickIfEnable(IAddPatient.SLC_AddNewMH);
 			test.log(Status.PASS, "Go to Add Medical Information");
			
 /*			stepInfo="Enter Medical Information";
 			test.log(Status.PASS, "Enter Medical Information");
 			flag=CommonMethods.clickIfEnable(IAddPatient.CHK_Premedicate);
 			flag=CommonMethods.clickIfEnable(IAddPatient.CHK_Asthma);
 			flag=CommonMethods.clickIfEnable(IAddPatient.CHK_Coumadin);					*/


 			
 			flag=CommonMethods.clickIfEnable(IAddPatient.SLC_Cancel);					
 			test.log(Status.PASS, "Go to Finish");
 			
 			
	} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 
 			
 		}
	return flag;
 	
}
}
