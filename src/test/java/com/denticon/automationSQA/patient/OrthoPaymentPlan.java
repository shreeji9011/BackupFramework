package com.denticon.automationSQA.patient;

import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.IAddPatient;
import com.denticon.automationSQA.pom.IPaymentPlan;
import com.denticon.automationSQA.utilities.CommonMethods;



public class OrthoPaymentPlan extends SeleniumSuite{
	String stepInfo=""; 
		boolean flag=false; 
	 	String filePath=System.getProperty("user.dir") + "\\src\\main\\resources\\AddNewPatient.properties"; 
	 	Properties prop= new Properties();
	
	@Test(description="Verify Search Patient functionality")
	public boolean verifyOrthoPaymentPlanModule() {
 		if(verifyOrthoPaymentPlanPage())
 			System.out.println("Ortho Payment Plan page verification passed");
 		else
 			System.out.println("Ortho  Payment Plan page verification failed");
		return flag;
	}	
	
	
	@Test(description = "Verify Delete Payment Plan", dependsOnMethods = { "verifyOrthoPaymentPlanModule" })
	public void verifyDeletePaymentPlan(){
		
//		SearchPatient sp = new SearchPatient();
//		sp.SearchPatientByFirstNamePage("Terence"); 
		
		stepInfo="Select Ortho Payment Plan";
		flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
			flag=CommonMethods.mourseHoverIfEnable(IPaymentPlan.TAB_PaymentPlan); 
			flag=CommonMethods.clickIfEnable(IPaymentPlan.TAB_OrthoPaymentPlan);
			
			stepInfo="Delete Payment Plan";
			flag=CommonMethods.clickIfEnable(IPaymentPlan.BTN_delete);
			
			stepInfo="Accept Alert";
			flag = CommonMethods.isAlertPresent();
		
	}

	public boolean verifyOrthoPaymentPlanPage(){
		
		try{ 
			
//			SearchPatient sp = new SearchPatient();
//			sp.SearchPatientByFirstNamePage("Terence");
			
			stepInfo="Select Regular Payment Plan";
			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
 			flag=CommonMethods.mourseHoverIfEnable(IPaymentPlan.TAB_PaymentPlan); 
 			flag=CommonMethods.clickIfEnable(IPaymentPlan.TAB_OrthoPaymentPlan);
 			
 			stepInfo="Enter Plan Code";
 			flag=CommonMethods.selectFromList(IPaymentPlan.SLC_OrthoPaymentBillingCode,"D8999");

 			
 			stepInfo="Enter Treatment End Date Date";
 			flag=CommonMethods.sendText(IPaymentPlan.TXT_TreatmentEndDate,"12302017");
 			
 			stepInfo="Check Start Patient Payment Plan checkbox";
 			flag=CommonMethods.clickIfEnable(IPaymentPlan.CHK_StartPatientPaymentPlan);
 			
 			
 			stepInfo="Enter Patient Balance Amount";
 			flag=CommonMethods.sendText(IPaymentPlan.TXT_Fee,"1");
 			flag=CommonMethods.sendText(IPaymentPlan.TXT_EstimatePatient,"1");
 					
 			Thread.sleep(3000);
 			stepInfo="save Ortho payment";
 			flag=CommonMethods.clickIfEnable(IPaymentPlan.BTN_save);
 			
 			stepInfo="accept alert box";
 			flag=CommonMethods.isAlertPresent();
 			Thread.sleep(5000);
 			 			 
 		} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail();  			
 		}
 	
		return flag;
	 	}

}