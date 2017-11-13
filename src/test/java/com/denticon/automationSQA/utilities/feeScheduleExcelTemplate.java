package com.denticon.automationSQA.utilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.IUtilities;
import com.denticon.automationSQA.utilities.CommonMethods;

		
public class feeScheduleExcelTemplate extends SeleniumSuite{

			String stepInfo=" "; 
			boolean flag=false;
	
@Test
	public boolean feeScheduleExcel(){ 
		try {
			stepInfo="Click on Utilities tab";
			flag=CommonMethods.clickIfEnable(IUtilities.TAB_UTILITIES);
 			
 			flag=CommonMethods.clickIfEnable(IUtilities.TAB_FeeScheduleExcelTemplate);
 			
 			flag=CommonMethods.clickIfEnable(IUtilities.Btn_Download);
 
 			Thread.sleep(6000);

 			
		} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 
 			
 		}
	return flag;
 	
}
}