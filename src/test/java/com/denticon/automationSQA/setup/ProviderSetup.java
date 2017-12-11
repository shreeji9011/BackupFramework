package com.denticon.automationSQA.setup;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.ISetup;
import com.denticon.automationSQA.utilities.CommonMethods;

		
public class ProviderSetup extends SeleniumSuite{

			String stepInfo=" "; 
			boolean flag=false;
	
@Test
	public boolean AddNewProvider(){ 
		try {
			
			flag=CommonMethods.clickIfEnable(ISetup.TAB_SETUP);
 		
 			flag=CommonMethods.clickIfEnable(ISetup.TAB_PROVIDER);
 			flag=CommonMethods.clickIfEnable(ISetup.TAB_PROVIDER_SETUP);
 			
 			flag=CommonMethods.clickIfEnable(ISetup.Btn_addNewProvider);
 			flag=CommonMethods.sendText(ISetup.txt_ShortID,"automation");
 			Thread.sleep(2000);
 			flag=CommonMethods.sendText(ISetup.txt_LastName,"auto");
 			flag=CommonMethods.sendText(ISetup.txt_FirstNmae,"mation");
 			flag=CommonMethods.sendText(ISetup.txt_Address,"automation  address");
 			flag=CommonMethods.sendText(ISetup.Txt_City,"aisan");
 			flag=CommonMethods.sendText(ISetup.Txt_zip,"78757");
 			flag=CommonMethods.sendText(ISetup.txt_Phone,"5555555555");
 			flag=CommonMethods.sendText(ISetup.txt_LicNo,"3334");
 			flag=CommonMethods.sendText(ISetup.txt_DEAno,"as23");
 			flag=CommonMethods.sendText(ISetup.txt_TAXID,"555e");
 			
 			flag=CommonMethods.clickIfEnable(ISetup.Btn_InsID);
 			flag=CommonMethods.clickIfEnable(ISetup.Btn_CarrierLogIn);
 			
 			flag=CommonMethods.sendText(ISetup.txt_website,"cvdc");
 			flag=CommonMethods.clickIfEnable(ISetup.Btn_worksAtP);

 			Thread.sleep(3000);
 			flag=CommonMethods.clickIfEnable(ISetup.Btn_routingSlip);
 			
 			if(CommonMethods.isAlertPresent());
 			stepInfo="Click on Save Icon ";
 			flag=CommonMethods.clickIfEnable(ISetup.BTN_Save);
 			if(CommonMethods.isAlertPresent());


		} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 
 			
 		}
	return flag;
 	
}

	
@Test
public boolean EditProvider(){ 
	
	try {
		
			flag=CommonMethods.clickIfEnable(ISetup.TAB_SETUP);
			flag=CommonMethods.clickIfEnable(ISetup.TAB_PROVIDER);
			flag=CommonMethods.clickIfEnable(ISetup.TAB_PROVIDER_SETUP);
			flag=CommonMethods.clickIfEnable(ISetup.Btn_EditOffice);
			flag=CommonMethods.clickIfEnable(ISetup.Btn_Cancel);
			if(CommonMethods.isAlertPresent());

			Thread.sleep(2000);

	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}


@Test (description="delete previously added provider - auto", dependsOnMethods="AddNewProvider")
public boolean deleteProvider(){ 
	
	try {
		Thread.sleep(2000);
		flag=CommonMethods.clickIfEnable(ISetup.TAB_SETUP);
		flag=CommonMethods.clickIfEnable(ISetup.TAB_PROVIDER);
		flag=CommonMethods.clickIfEnable(ISetup.TAB_PROVIDER_SETUP);
		flag=CommonMethods.sendText(ISetup.txt_searchP,"auto");
		flag=CommonMethods.clickIfEnable(ISetup.slc_Provider);
		flag=CommonMethods.clickIfEnable(ISetup.Btn_DeleteOffice);
		if(CommonMethods.isAlertPresent());
		Thread.sleep(5000);

	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
	
return flag;
	
}	

@Test
public boolean ProviderPerOfficeSettup(){ 
	
	try {
		flag=CommonMethods.clickIfEnable(ISetup.TAB_SETUP);
		flag=CommonMethods.clickIfEnable(ISetup.TAB_PROVIDER);
		flag=CommonMethods.clickIfEnable(ISetup.TAB_PROVIDER_perOFFICE_Settings);
		
		flag=CommonMethods.clickIfEnable(ISetup.Btn_EditOffice);
		
			flag=CommonMethods.sendText(ISetup.txt_productionByGoalsTueseday ,"7");
			flag=CommonMethods.clickIfEnable(ISetup.panel_Holiday);
			flag=CommonMethods.sendText(ISetup.txt_dateHoliday,"12/30/2017");
			flag=CommonMethods.sendText(ISetup.txt_descriptionP,"as23");
			
 			
 			if(CommonMethods.isAlertPresent());
 			stepInfo="Click on Save Icon ";
 			flag=CommonMethods.clickIfEnable(ISetup.BTN_Save);
 			if(CommonMethods.isAlertPresent());
 			
 			
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
	
return flag;
	
}	
}
