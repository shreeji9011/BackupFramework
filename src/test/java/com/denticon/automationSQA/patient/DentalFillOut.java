package com.denticon.automationSQA.patient;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.IAddPatient;
import com.denticon.automationSQA.pom.IInsFillOut;
import com.denticon.automationSQA.utilities.CommonMethods;

public class DentalFillOut extends SeleniumSuite {
	
		String stepInfo=""; 
		boolean flag=false; 
		
	 	@Test
		public boolean verifyDentalFillOutInformation() {
	 		
			try{ 
				
				Thread.sleep(1000);
				stepInfo="Go to Search Patient Tab";
				flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
				test.log(Status.PASS, "Go to Patient Tab"); 
				
				flag=CommonMethods.clickIfEnable(IInsFillOut.TAB_ifo);
				flag=CommonMethods.clickIfEnable(IInsFillOut.TAB_DentalFO);
				test.log(Status.PASS, "Go to DentalFillOut Tab"); 
				
				
				flag=CommonMethods.selectFromList(IInsFillOut.SLC_ICD3,"109.8 - facial pain");
				Thread.sleep(1000);
	//			flag=CommonMethods.clickIfEnable(IInsFillOut.SLC_Save);
				flag=CommonMethods.clickIfEnable(IInsFillOut.SLC_Cancel);
				test.log(Status.PASS, "save it");
			

			
			} catch (Exception e) { 
				e.printStackTrace(); 
				Assert.fail(); 
				
			}
		
	 		
		return flag;
	 	}

	
	@Test
	public boolean verifyMedicalInformation() {
		
	try{ 
		
		Thread.sleep(1000);
		stepInfo="Go to Search Patient Tab";
		flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
		test.log(Status.PASS, "Go to Patient Tab"); 
		
		flag=CommonMethods.clickIfEnable(IInsFillOut.TAB_ifo);
		flag=CommonMethods.clickIfEnable(IInsFillOut.TAB_MedicalFO);
		test.log(Status.PASS, "Go to MedicalFillOut Tab"); 
		
		flag=CommonMethods.clickIfEnable(IInsFillOut.CLK_AssignBenifitsToStudent);
		test.log(Status.PASS, "Click to Assign benefits to patient"); 
		
		Thread.sleep(1000);
		flag=CommonMethods.clickIfEnable(IInsFillOut.SLC_Save);
	//	flag=CommonMethods.clickIfEnable(IInsFillOut.SLC_Cancel);
		test.log(Status.PASS, "save it");
		test.log(Status.PASS, "Navigate to Overview Tab");
	

	
	} catch (Exception e) { 
		e.printStackTrace(); 
		Assert.fail(); 
		
	}

		
return flag;
	}

}

