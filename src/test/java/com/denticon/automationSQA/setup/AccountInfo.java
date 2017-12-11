package com.denticon.automationSQA.setup;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.ISetup;
import com.denticon.automationSQA.utilities.CommonMethods;

		
public class AccountInfo extends SeleniumSuite{

			String stepInfo=" "; 
			boolean flag=false;
	
@Test
	public boolean EditAccountInfo(){ 
		try {
			
			flag=CommonMethods.clickIfEnable(ISetup.TAB_SETUP);
 		
 			flag=CommonMethods.clickIfEnable(ISetup.TAB_AccInfo);
 			flag=CommonMethods.isElementPresent(ISetup.Tab_RegwithUpbox);
 			flag=CommonMethods.isElementPresent(ISetup.Tab_EditCultureSettingd);
 			flag=CommonMethods.clickIfEnable(ISetup.Tab_EditAcc);
 			Thread.sleep(2000);

 			stepInfo="Click on Save Icon ";
 			flag=CommonMethods.clickIfEnable(ISetup.BTN_Save);



		} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 
 			
 		}
	return flag;
 	
}
}