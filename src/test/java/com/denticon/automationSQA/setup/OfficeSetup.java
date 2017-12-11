package com.denticon.automationSQA.setup;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.ISetup;
import com.denticon.automationSQA.utilities.CommonMethods;

		
public class OfficeSetup extends SeleniumSuite{

			String stepInfo=" "; 
			boolean flag=false;
	
//@Test
	public boolean AddNewOffice(){ 
		try {
			
			flag=CommonMethods.clickIfEnable(ISetup.TAB_SETUP);
 		
 			flag=CommonMethods.clickIfEnable(ISetup.Tab_Offices);
 			flag=CommonMethods.clickIfEnable(ISetup.Tab_OfficeSetup);
 			flag=CommonMethods.clickIfEnable(ISetup.Btn_AddOffice);
 			flag=CommonMethods.sendText(ISetup.Txt_OName,"automation");
 			Thread.sleep(2000);
 			
 			flag=CommonMethods.sendText(ISetup.Txt_TAddress,"automation  address");
 			flag=CommonMethods.sendText(ISetup.Txt_City,"aisan");
 			flag=CommonMethods.sendText(ISetup.Txt_zip,"78757");
 			flag=CommonMethods.sendText(ISetup.Txt_Phone,"555-555-5555");
 			flag=CommonMethods.selectFromList(ISetup.Txt_InsBillingProvider,"33, 34 (3334P )");
 			flag=CommonMethods.clickIfEnable(ISetup.Tab_OfficeSetting);
 			
 			flag=CommonMethods.selectFromList(ISetup.Slc_UCRfeeSched,"asd");
 			flag=CommonMethods.clickIfEnable(ISetup.Tab_Integration);
 			
 			flag=CommonMethods.selectFromList(ISetup.Slc_xraysystem,"Apyteryx XrayVision DSV");
 			Thread.sleep(3000);
 			flag=CommonMethods.clickIfEnable(ISetup.Tab_Operatories);
 			
 			flag=CommonMethods.sendText(ISetup.Txt_addOP,"OP5");
 			flag=CommonMethods.clickIfEnable(ISetup.Btn_addOP);
 			flag=CommonMethods.clickIfEnable(ISetup.Tab_Holidays);
 			
 			flag=CommonMethods.clickIfEnable(ISetup.Tab_ProcList);
 			flag=CommonMethods.sendText(ISetup.txt_date,"12/12/2017");
 			flag=CommonMethods.sendText(ISetup.txt_description,"pROC");
 			flag=CommonMethods.clickIfEnable(ISetup.Btn_ExplosionCodes);
 			Thread.sleep(3000);
 			flag=CommonMethods.clickIfEnable(ISetup.Btn_LettersSecurityGroups);
 			Thread.sleep(2000);
 			flag=CommonMethods.clickIfEnable(ISetup.Btn_DONOTCopyGroupLetter);

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
public boolean EditOffice(){ 
	
	try {
		
			flag=CommonMethods.clickIfEnable(ISetup.TAB_SETUP);
			flag=CommonMethods.clickIfEnable(ISetup.Tab_Offices);
			flag=CommonMethods.clickIfEnable(ISetup.Tab_OfficeSetup);
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


@Test
public boolean deleteOffice(){ 
	
	try {
			flag=CommonMethods.clickIfEnable(ISetup.TAB_SETUP);
			flag=CommonMethods.clickIfEnable(ISetup.Tab_Offices);
			flag=CommonMethods.clickIfEnable(ISetup.Tab_OfficeSetup);
			flag=CommonMethods.clickIfEnable(ISetup.Btn_DeleteOffice);

			if(CommonMethods.isAlertPresent());

			Thread.sleep(2000);
		
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
	
return flag;
	
}	
}
