package com.denticon.automationSQA.utilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.IUtilities;
import com.denticon.automationSQA.utilities.CommonMethods;

		
public class BatchClaimProcessing extends SeleniumSuite{

			String stepInfo=" "; 
			boolean flag=false;
	
@Test
	public boolean BatchClaimProcssing(){ 
		try {
			stepInfo="Click on Utilities tab";
			flag=CommonMethods.clickIfEnable(IUtilities.TAB_UTILITIES);
 			
 			flag=CommonMethods.clickIfEnable(IUtilities.TAB_BatchClaimP);
 			
 			flag=CommonMethods.clickIfEnable(IUtilities.TransmitClaim);
 			Thread.sleep(2000);

 			stepInfo="Click on Print Preview Icon ";
 			flag=CommonMethods.clickIfEnable(IUtilities.PrintU);

 			 			Thread.sleep(5000);
 			 			flag=CommonMethods.isElementPresent(IUtilities.UpdateAsSent);

		} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 
 			
 		}
	return flag;
 	
}

}