package com.denticon.automationSQA.patient;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.IAddPatient;
import com.denticon.automationSQA.utilities.CommonMethods;

public class MedicalHistory extends SeleniumSuite { 
	
	String stepInfo=""; 
	boolean flag=false; 

 	@Test(description="Verify Medical History Module")
 	public boolean verifyPatientMedicalHistoryPage(){
	
 		try	{ 
 			Thread.sleep(5000);
 			stepInfo="Click on Patient tab";
			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
			test.log(Status.PASS, "Click on Patient tab"); 
			
			stepInfo="Click on medical history"; 
			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_MedicalHistory);
			test.log(Status.PASS, "Click on medical history");
 			
/* 			stepInfo="Enter Medical Information";
 			test.log(Status.PASS, "Enter Medical Information");
 			flag=CommonMethods.clickIfEnable(IAddPatient.CHK_29_30_M_A);
 			flag=CommonMethods.clickIfEnable(IAddPatient.CHK_21_22_M_A);      */
	
 			flag=CommonMethods.clickIfEnable(IAddPatient.SLC_Cancel);					
 			test.log(Status.PASS, "Go to Finish");
 			Thread.sleep(1000);
 			
	} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 
 			
 		}
	return flag;
 	
}
 	

}
