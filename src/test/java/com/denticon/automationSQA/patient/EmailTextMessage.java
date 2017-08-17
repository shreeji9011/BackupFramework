package com.denticon.automationSQA.patient;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.IAddPatient;
import com.denticon.automationSQA.pom.IEmailText;
import com.denticon.automationSQA.utilities.CommonMethods;

public class EmailTextMessage extends SeleniumSuite {
	
		String stepInfo=""; 
		boolean flag=false; 
		
	 	@Test
		public boolean verifyEmailInformation() {
	 		
			try{ 
				
				Thread.sleep(1000);
				stepInfo="Go to Search Patient Tab";
				flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
				test.log(Status.PASS, "Go to Patient Tab"); 
				
				flag=CommonMethods.clickIfEnable(IEmailText.TAB_ET);
				test.log(Status.PASS, "Go to EmailTextMessage Tab"); 
				
				
				flag=CommonMethods.sendText(IEmailText.Txt_EmailAdd,"aaa@bbb.com");
				Thread.sleep(1000);
	//			flag=CommonMethods.clickIfEnable(IEmailText.Tab_Send);
				flag=CommonMethods.clickIfEnable(IEmailText.Tab_Cancel);
				test.log(Status.PASS, "Send Email");
			

			
			} catch (Exception e) { 
				e.printStackTrace(); 
				Assert.fail(); 
				
			}
		
	 		
		return flag;
	 	}

	
	@Test
	public boolean verifyTextMessageInformation() {
		
	try{ 
		
		Thread.sleep(1000);
		stepInfo="Go to Search Patient Tab";
		flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
		test.log(Status.PASS, "Go to Patient Tab"); 
		
		flag=CommonMethods.clickIfEnable(IEmailText.TAB_ET);
		flag=CommonMethods.clickIfEnable(IEmailText.RadioButton_TM);
		test.log(Status.PASS, "Go to Responsible Party"); 
		
//		flag=CommonMethods.sendText(IEmailText.Txt_PhoneNumber,"916-872-3837");
		flag=CommonMethods.clickIfEnable(IEmailText.Tab_Send);
		test.log(Status.PASS, "Select First Patient from Result"); 
		test.log(Status.PASS, "Navigate to Overview Tab");
	

	
	} catch (Exception e) { 
		e.printStackTrace(); 
		Assert.fail(); 
		
	}

		
return flag;
	}

 	@Test
	public boolean verifyPatientPortalInformation() {
 		
		try{ 
			
			Thread.sleep(1000);
			stepInfo="Go to Search Patient Tab";
			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
			test.log(Status.PASS, "Go to Patient Tab"); 
			
			flag=CommonMethods.clickIfEnable(IEmailText.TAB_ET);
			flag=CommonMethods.clickIfEnable(IEmailText.Radio_PatientPortal);
			test.log(Status.PASS, "Go to Patient Portal Tab"); 
			
			
//			flag=CommonMethods.sendText(IEmailText.Txt_EmailAdd,"aaa@bbb.com");
			Thread.sleep(1000);
			flag=CommonMethods.clickIfEnable(IEmailText.Tab_Send);
//			flag=CommonMethods.clickIfEnable(IEmailText.Tab_Cancel);
			test.log(Status.PASS, "Send Email");
		

		
		} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
	
 		
	return flag;
 	}
	
	
	
}

