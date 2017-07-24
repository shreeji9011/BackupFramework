package com.denticon.automationSQA.patient;

import java.lang.reflect.Method;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.IAddPatient;
import com.denticon.automationSQA.utilities.CommonMethods;

public class PatientEditInformation extends SeleniumSuite { 
	
	String stepInfo=""; 
	boolean flag=false; 
 	
 	ExtentReports extent;
	ExtentTest test; 
 	
	
 	public boolean verifyPatientEditInformationTabModule(Method method) {
 		test=  extent.createTest(this.getClass().getSimpleName()+"::"+method.getName(), method.getName());
		if(verifyPatientEditInformationPage())
			System.out.println("Patient Edit Information verification passed");
		else
			System.out.println("Patient Edit Information verification failed");
	return flag;
 	}
 	
 	@Test(description="Verify Patient Edit Information Module")
 	public boolean verifyPatientEditInformationPage(){
	
 		try	{ 
 			
 			extent=CommonMethods.getReport(extent,test); 
 			test = extent.createTest("Patient Overview Module");
		
 			stepInfo="Click on Patient tab";
			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
			test.log(Status.PASS, "Click on Patient tab"); 
			
			stepInfo="Click on Patient Edit Information"; 
			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PatEditInfo);
			test.log(Status.PASS, "Click on Patient Edit Information");
			
			stepInfo="Click on Patient Edit Information SAVE"; 
			flag=CommonMethods.clickIfEnable(IAddPatient.SLC_PatientSave);
			test.log(Status.PASS, "Click on Patient Edit Information SAVE");
			test.log(Status.PASS, "Navigate to Patient Overview Page");

			
 			//////////////////// pATIENT EDIT iNFO Cancel ////////////////////
			
 			stepInfo="Click on Patient tab";
			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
			test.log(Status.PASS, "Click on Patient tab"); 
			
			stepInfo="Click on Patient Edit Information"; 
			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PatEditInfo);
			test.log(Status.PASS, "Click on Patient Edit Information");
			
			stepInfo="Click on Patient Edit Information CANCEL"; 
			flag=CommonMethods.clickIfEnable(IAddPatient.SLC_PatCancel);
			Alert alert1 =com.denticon.automationSQA.DriverManager.getDriver().switchTo().alert(); 
 			alert1.accept(); 
 			Thread.sleep(2000); 
			test.log(Status.PASS, "Click on Patient Edit Information CANCEL");
			test.log(Status.PASS, "Navigate to Patient Overview Page");
			
			
			/////////////////////// Move Patient /////////////////////
			
 			stepInfo="Click on Patient tab";
			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
			test.log(Status.PASS, "Click on Patient tab"); 
			
			stepInfo="Click on Patient Edit Information"; 
			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PatEditInfo);
			test.log(Status.PASS, "Click on Patient Edit Information");
			
			stepInfo="Click on Patient Edit Information MOVE PATIENT"; 
			flag=CommonMethods.clickIfEnable(IAddPatient.SLC_MovePatient);
			flag=CommonMethods.clickIfEnable(IAddPatient.RadiobuttonMoveP);
			flag=CommonMethods.clickIfEnable(IAddPatient.SLC_MoveContinue);
			flag=CommonMethods.clickIfEnable(IAddPatient.SLC_MoveConfirm);
			Alert alert2 =com.denticon.automationSQA.DriverManager.getDriver().switchTo().alert(); 
 			alert2.accept(); 
 			Thread.sleep(2000); 
			test.log(Status.PASS, "Click on Patient Edit Information MOVE PATIENT");
			test.log(Status.PASS, "Navigate to Patient Overview Page");
			
			//////////////Delete Patient /////////////////////
			
 			stepInfo="Click on Patient tab";
			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
			test.log(Status.PASS, "Click on Patient tab"); 
			
			stepInfo="Click on Patient Edit Information"; 
			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PatEditInfo);
			test.log(Status.PASS, "Click on Patient Edit Information");
			
			stepInfo="Click on Patient Edit Information DELETE"; 
			flag=CommonMethods.clickIfEnable(IAddPatient.SLC_DeletePatient);
			Alert alert =com.denticon.automationSQA.DriverManager.getDriver().switchTo().alert(); 
 			alert.accept(); 
 			Thread.sleep(2000); 
			test.log(Status.PASS, "Click on Patient Edit Information DELETE");
			test.log(Status.PASS, "Navigate to Patient Overview Page");
			
	} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 
 			
 		}
	return flag;
 	
}
}
