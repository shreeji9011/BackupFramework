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
import com.denticon.automationSQA.pom.IPrescription;
import com.denticon.automationSQA.utilities.CommonMethods;

public class Prescription extends SeleniumSuite { 
	
	String stepInfo=""; 
	boolean flag=false; 

 	ExtentReports extent;
	ExtentTest test; 
 	
	
 	public boolean verifyPrescriptionTabModule(Method method) {
 		test=  extent.createTest(this.getClass().getSimpleName()+"::"+method.getName(), method.getName());
		if(verifyPrescriptionPage())
			System.out.println("Patient Prescription page verification passed");
		else
			System.out.println("Patient Prescription page verification failed");
	return flag;
 	}
 	
 	@Test(description="Verify Prescription Module")
 	public boolean verifyPrescriptionPage(){
	
 		try	{ 
 			
 			extent=CommonMethods.getReport(extent,test); 
 			test = extent.createTest("Prescription Module");
		
 			stepInfo="Click on Patient tab";
			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
			test.log(Status.PASS, "Click on Patient tab"); 
			
			stepInfo="Click on Prescription"; 
			flag=CommonMethods.clickIfEnable(IPrescription.TAB_Prescription);
			test.log(Status.PASS, "Click on Prescription");
 			
			///////// Add New Prescription ///////////////
			
 			stepInfo="Go to Add Medical Information";
 			flag=CommonMethods.clickIfEnable(IAddPatient.SLC_AddNewMH);
 			test.log(Status.PASS, "Go to Add Medical Information");
			
 			flag=CommonMethods.clickIfEnable(IPrescription.SLC_DrugName);
 			flag=CommonMethods.selectFromList(IPrescription.SLC_DrugName,"Acyclovir 5%");
 			test.log(Status.PASS, "Enter Drug Name");

 			flag=CommonMethods.clickIfEnable(IPrescription.BTW_Save);
 			Thread.sleep(1000);
			Alert alert =com.denticon.automationSQA.DriverManager.getDriver().switchTo().alert(); 
 			alert.accept(); 
 			Thread.sleep(1000);
 			test.log(Status.PASS, "Click on Save");
 			
 			
 			//////////////////Print Prescription ///////////////////// 
 			
 			flag=CommonMethods.clickIfEnable(IPrescription.BTN_Print);	
 			flag=CommonMethods.clickIfEnable(IPrescription.PrintAllPrescriptionToday);
 			test.log(Status.PASS, "Print all today's Prescription");
 			flag=CommonMethods.clickIfEnable(IPrescription.PrintSize_Wide);
 			test.log(Status.PASS, "Print WIDE size Prescription");
 			
 			flag=CommonMethods.clickIfEnable(IPrescription. BTN_PrintPreview);					
 			test.log(Status.PASS, "Print Prescription");
 			
 			flag=CommonMethods.clickIfEnable(IPrescription.SLC_QuickPrint);
 			test.log(Status.PASS, "Quick Print All Today's Prescription");
 			
	} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 
 			
 		}
	return flag;
 	
}
}
