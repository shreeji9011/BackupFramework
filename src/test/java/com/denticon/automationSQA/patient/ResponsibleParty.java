package com.denticon.automationSQA.patient;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.IAddPatient;
import com.denticon.automationSQA.pom.ISearchPatient;
import com.denticon.automationSQA.utilities.CommonMethods;

public class ResponsibleParty extends SeleniumSuite {
	String stepInfo=""; 
	boolean flag=false; 
	
 	@Test
	public boolean verifyResponsiblePartyInformation() {
 		
		try{ 
			
			Thread.sleep(1000);
			stepInfo="Go to Search Patient Tab";
			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
			test.log(Status.PASS, "Go to Patient Tab"); 
			
			flag=CommonMethods.clickIfEnable(ISearchPatient.TAB_ResponsibleParty);
			test.log(Status.PASS, "Go to Responsible Party"); 

			flag=CommonMethods.clickIfEnable(ISearchPatient.BTN_Save);
			test.log(Status.PASS, "Select First Patient from Result"); 
			test.log(Status.PASS, "Navigate to Overview Tab");
		

		
		} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
	
 		
	return flag;
 	}

}
