package com.denticon.automationSQA.utilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.IUtilities;
import com.denticon.automationSQA.utilities.CommonMethods;

		
public class copyMoveChangedPGIDdata extends SeleniumSuite{

			String stepInfo=" "; 
			boolean flag=false;
	
@Test
	public boolean CopyLetters(){ 
		try {
			stepInfo="Click on Utilities tab";
			flag=CommonMethods.clickIfEnable(IUtilities.TAB_UTILITIES);
 			
 			flag=CommonMethods.clickIfEnable(IUtilities.Tab_CopyMoveChangePGIDSetupData);
 			
 			flag=CommonMethods.clickIfEnable(IUtilities.Tab_CopyLetters);
 			flag=CommonMethods.clickIfEnable(IUtilities.Btn_CopyLettersToAllOffices);

 			
		} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 
 			
 		}
	return flag;
 	
}

@Test
public boolean ChangeFutureAppointmentsTxProvider(){ 
	try {
		stepInfo="Click on Utilities tab";
		flag=CommonMethods.clickIfEnable(IUtilities.TAB_UTILITIES);
			
			flag=CommonMethods.clickIfEnable(IUtilities.Tab_CopyMoveChangePGIDSetupData);
			
			flag=CommonMethods.clickIfEnable(IUtilities.Tab_ChangeFutureAppointmentsPatientsTxByProvider);
			flag=CommonMethods.selectFromList(IUtilities.Clk_scrProvider,"2526: Dass,Daars");

			
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}
}