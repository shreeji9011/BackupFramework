package com.denticon.automationSQA.utilities;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.denticon.automationSQA.DriverManager;
import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.IUtilities;
import com.denticon.automationSQA.utilities.CommonMethods;

		
public class launchApp extends SeleniumSuite{

			String stepInfo=" "; 
			boolean flag=false;
	
@Test
	public boolean AppointNow(){ 
		try {
			stepInfo="Click on Utilities tab";
			flag=CommonMethods.clickIfEnable(IUtilities.TAB_UTILITIES);
 			
 			flag=CommonMethods.clickIfEnable(IUtilities.TAB_LAUNCH);
 			
 			flag=CommonMethods.clickIfEnable(IUtilities.Tab_AppointNow);
 

 			Thread.sleep(3000);

			
 			
		} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 
 			
 		}
	return flag;
 	
}

//@Test
public boolean Dantigram (){ 
	try {
		stepInfo="Click on Utilities tab";
		flag=CommonMethods.clickIfEnable(IUtilities.TAB_UTILITIES);
			
			flag=CommonMethods.clickIfEnable(IUtilities.TAB_LAUNCH);
			
			flag=CommonMethods.clickIfEnable(IUtilities.Tab_Dantigram);


			Thread.sleep(6000);

			
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}


//@Test
public boolean DentilyticsBasic(){ 
	try {
		stepInfo="Click on Utilities tab";
		flag=CommonMethods.clickIfEnable(IUtilities.TAB_UTILITIES);
			
			flag=CommonMethods.clickIfEnable(IUtilities.TAB_LAUNCH);
			
			flag=CommonMethods.clickIfEnable(IUtilities.Tab_DentilyticsBasic);


			Thread.sleep(6000);

			
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}


@Test
public boolean DentilyticsEnterprise(){ 
	try {
		stepInfo="Click on Utilities tab";
		flag=CommonMethods.clickIfEnable(IUtilities.TAB_UTILITIES);
			
			flag=CommonMethods.clickIfEnable(IUtilities.TAB_LAUNCH);
			
			flag=CommonMethods.clickIfEnable(IUtilities.Tab_DentilyticsEnterprise);

			
			Thread.sleep(6000);

	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}


//@Test					////////////////// Fail ///////////////////

public boolean DentirayClassic(){ 
	try {
		stepInfo="Click on Utilities tab";
		flag=CommonMethods.clickIfEnable(IUtilities.TAB_UTILITIES);
			
			flag=CommonMethods.clickIfEnable(IUtilities.TAB_LAUNCH);
			
			flag=CommonMethods.clickIfEnable(IUtilities.Tab_DentirayClassic);


			Thread.sleep(6000);

			
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}


//@Test
public boolean ApteryxXVWebImagine(){ 
	try {
		stepInfo="Click on Utilities tab";
		flag=CommonMethods.clickIfEnable(IUtilities.TAB_UTILITIES);
			
			flag=CommonMethods.clickIfEnable(IUtilities.TAB_LAUNCH);
			
			flag=CommonMethods.clickIfEnable(IUtilities.Tab_ApteryxXVWebImagine);


			Thread.sleep(6000);

			
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}


//@Test
public boolean LaunchEvaSoft(){ 
	try {
		stepInfo="Click on Utilities tab";
		flag=CommonMethods.clickIfEnable(IUtilities.TAB_UTILITIES);
			
			flag=CommonMethods.clickIfEnable(IUtilities.TAB_LAUNCH);
			
			flag=CommonMethods.clickIfEnable(IUtilities.Tab_LaunchEvaSoft);


			Thread.sleep(6000);

			
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}

//@Test
public boolean TaskManager(){ 
	try {
		stepInfo="Click on Utilities tab";
		flag=CommonMethods.clickIfEnable(IUtilities.TAB_UTILITIES);
			
			flag=CommonMethods.clickIfEnable(IUtilities.TAB_LAUNCH);
			
			flag=CommonMethods.clickIfEnable(IUtilities.Tab_TaskManager);


			Thread.sleep(6000);

			
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}

}
