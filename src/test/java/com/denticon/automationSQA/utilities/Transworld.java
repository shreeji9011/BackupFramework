package com.denticon.automationSQA.utilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.IUtilities;
import com.denticon.automationSQA.utilities.CommonMethods;

		
public class Transworld extends SeleniumSuite{

			String stepInfo=" "; 
			boolean flag=false;
	
@Test
	public boolean transworldportal(){ 
		try {
			stepInfo="Click on Utilities tab";
			flag=CommonMethods.clickIfEnable(IUtilities.TAB_UTILITIES);
 			
 			flag=CommonMethods.clickIfEnable(IUtilities.TAB_Transworld);
 			
 			flag=CommonMethods.clickIfEnable(IUtilities.Tab_TransWorldPortal);
 

 			Thread.sleep(6000);

 			
		} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 
 			
 		}
	return flag;
 	
}


@Test
public boolean transworldbatchselection(){ 
	try {
		stepInfo="Click on Utilities tab";
		flag=CommonMethods.clickIfEnable(IUtilities.TAB_UTILITIES);
			
			flag=CommonMethods.clickIfEnable(IUtilities.TAB_Transworld);
		

			flag=CommonMethods.clickIfEnable(IUtilities.Tab_TransworldBatchSelection);
			
	
			
			Thread.sleep(6000);

			
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}


@Test
public boolean transworlAccList(){ 
	try {
		stepInfo="Click on Utilities tab";
		flag=CommonMethods.clickIfEnable(IUtilities.TAB_UTILITIES);
			
			flag=CommonMethods.clickIfEnable(IUtilities.TAB_Transworld);

			
			flag=CommonMethods.clickIfEnable(IUtilities.Tab_TransworldAcountList);
			
			Thread.sleep(6000);

			
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}

@Test
public boolean denticonDownload(){ 
	try {
		stepInfo="Click on Utilities tab";
		flag=CommonMethods.clickIfEnable(IUtilities.TAB_UTILITIES);
			
			flag=CommonMethods.clickIfEnable(IUtilities.TAB_DENTICONDOWNLOAD);

			
			Thread.sleep(6000);

			
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}



}