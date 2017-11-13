package com.denticon.automationSQA.utilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.IUtilities;
import com.denticon.automationSQA.utilities.CommonMethods;

		
public class GenerateContractCharges extends SeleniumSuite{

			String stepInfo=" "; 
			boolean flag=false;
	
@Test
	public boolean GenerateContractChargesP(){ 
		try {
			stepInfo="Click on Utilities tab";
			flag=CommonMethods.clickIfEnable(IUtilities.TAB_UTILITIES);
 			
 			flag=CommonMethods.clickIfEnable(IUtilities.Tab_GenerateContractCharges);
 			
 			flag=CommonMethods.clickIfEnable(IUtilities.GenerateOrthoPaymentPlanCharges);
 			flag=CommonMethods.clickIfEnable(IUtilities.Chk_PatientOrthoList);
 			
 			Thread.sleep(2000);

 			stepInfo="Click on Post Icon ";
 			flag=CommonMethods.clickIfEnable(IUtilities.PostPatientOrthoPeriodic);

 			if(CommonMethods.isAlertPresent());
 			
 			 			Thread.sleep(5000);
 			 			flag=CommonMethods.clickIfEnable(IUtilities.Chk_PatInsOrthoList);
 			 			flag=CommonMethods.clickIfEnable(IUtilities.PostInsOrthoCharges);
 			 			if(CommonMethods.isAlertPresent());
 			 			
 			 			Thread.sleep(5000);
 			 			flag=CommonMethods.clickIfEnable(IUtilities.Chk_PatSecInsOrthoList);
 			 			flag=CommonMethods.clickIfEnable(IUtilities.PostOrthoSecodInsCharges);			
 			 			if(CommonMethods.isAlertPresent());
 			 			
 			 			
		} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 
 			
 		}
	return flag;
 	
}

@Test
public boolean GenerateRegularPayment(){ 
	try {
		stepInfo="Click on Utilities tab";
		flag=CommonMethods.clickIfEnable(IUtilities.TAB_UTILITIES);
			
			flag=CommonMethods.clickIfEnable(IUtilities.Tab_GenerateContractCharges);
			
			flag=CommonMethods.clickIfEnable(IUtilities.GenerateRegularPaymentPlan);
			flag=CommonMethods.clickIfEnable(IUtilities.Chk_PatientPaymentPlan);
			
			Thread.sleep(2000);

			stepInfo="Click on Post Icon ";
			flag=CommonMethods.clickIfEnable(IUtilities.PostPeriodicCharges);

			if(CommonMethods.isAlertPresent());
			
	
			 			
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}





}
