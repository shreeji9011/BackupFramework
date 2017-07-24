package com.denticon.automationSQA.patient;

import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.IAddPatient;
import com.denticon.automationSQA.pom.IPaymentPlan;
import com.denticon.automationSQA.utilities.CommonMethods;


public class RegularPaymentPlan extends SeleniumSuite{
	String stepInfo=""; 
		boolean flag=false; 
	 	String filePath=System.getProperty("user.dir") + "\\src\\main\\resources\\AddNewPatient.properties"; 
	 	Properties prop= new Properties();
	
	@Test(description="Verify Search Patient functionality")
	public boolean verifyRegularPaymentPlanModule() {
 		if(verifyRegularPaymentPlan())
 			System.out.println("Payment Plan page verification passed");
 		else
 			System.out.println("Payment Plan page verification failed");
		return flag;
	}	
	
	@Test(description = "Verify Delete Payment Plan", dependsOnMethods = { "verifyRegularPaymentPlanModule" })
	public void verifyDeletePaymentPlan(){
		
		SearchPatient sp = new SearchPatient();
		sp.SearchPatientByFirstNamePage("Terence");
		
		stepInfo="Select Regular Payment Plan";
		flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
			flag=CommonMethods.mourseHoverIfEnable(IPaymentPlan.TAB_PaymentPlan); 
			flag=CommonMethods.clickIfEnable(IPaymentPlan.TAB_RegularPaymentPlan);
			
			stepInfo="Delete Payment Plan";
			flag=CommonMethods.clickIfEnable(IPaymentPlan.BTN_delete);
			
			stepInfo="Accept Alert";
			flag = CommonMethods.isAlertPresent();
		
	}
	//*[@id="Table1"]/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[1]
	public boolean verifyRegularPaymentPlan(){
		
		try{ 
			
			SearchPatient sp = new SearchPatient();
			sp.SearchPatientByFirstNamePage("Terence");
			
			stepInfo="Select Regular Payment Plan";
			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
 			flag=CommonMethods.mourseHoverIfEnable(IPaymentPlan.TAB_PaymentPlan); 
 			flag=CommonMethods.clickIfEnable(IPaymentPlan.TAB_RegularPaymentPlan);
 			
 			stepInfo="Enter Patient Balance Amount";
 			flag=CommonMethods.sendText(IPaymentPlan.TXT_patientBalanceAmount,"1");
 			
 			stepInfo="Enter First Billing Date";
 			flag=CommonMethods.sendText(IPaymentPlan.TXT_firstBillingDate,"07182017");
 			
 			stepInfo="Enter Number of Payments";
 			flag=CommonMethods.sendText(IPaymentPlan.TXT_noOfPayments,"4");
 			
 			stepInfo="save Regular payment";
 			flag=CommonMethods.clickIfEnable(IPaymentPlan.BTN_save);
 			
 			stepInfo="accept alert box";
 			flag=CommonMethods.isAlertPresent();
 			
 			 			 
 		} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail();  			
 		}
 	
		return flag;
	 	}

}