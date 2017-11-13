package com.denticon.automationSQA.utilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.IUtilities;
import com.denticon.automationSQA.utilities.CommonMethods;

		
public class InsProcedures extends SeleniumSuite{

			String stepInfo=" "; 
			boolean flag=false;
	
@Test
	public boolean ConsolidateDuplicatePlan(){ 
		try {
			stepInfo="Click on Utilities tab";
			flag=CommonMethods.clickIfEnable(IUtilities.TAB_UTILITIES);
 			
 			flag=CommonMethods.clickIfEnable(IUtilities.Tab_InsProc);
 			
 			flag=CommonMethods.clickIfEnable(IUtilities.Tab_ConsolidateDuplicateInsPlans);
 			flag=CommonMethods.sendText(IUtilities.Txt_OPID,"6454");
 			flag=CommonMethods.sendText(IUtilities.Txt_NewPID,"4341");
 			flag=CommonMethods.clickIfEnable(IUtilities.ShowPlanDetails);

 			if(CommonMethods.isAlertPresent());
 			
		} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 
 			
 		}
	return flag;
 	
}

@Test
public boolean ConsolidateDuplicateCarriers(){ 
	try {
		stepInfo="Click on Utilities tab";
		flag=CommonMethods.clickIfEnable(IUtilities.TAB_UTILITIES);
			
			flag=CommonMethods.clickIfEnable(IUtilities.Tab_InsProc);
			
			flag=CommonMethods.clickIfEnable(IUtilities.Tab_ConsolidateDuplicateCarrrier);
			flag=CommonMethods.sendText(IUtilities.Txt_OPID,"6454");
			flag=CommonMethods.sendText(IUtilities.Txt_NewPID,"4341");
			flag=CommonMethods.clickIfEnable(IUtilities.ShowPlanDetails);

			if(CommonMethods.isAlertPresent());
			
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}

@Test
public boolean NewPlanAssignment(){ 
	try {
		stepInfo="Click on Utilities tab";
		flag=CommonMethods.clickIfEnable(IUtilities.TAB_UTILITIES);
			
			flag=CommonMethods.clickIfEnable(IUtilities.Tab_InsProc);
			
			flag=CommonMethods.clickIfEnable(IUtilities.Tab_NewPlanAssignment);
			flag=CommonMethods.sendText(IUtilities.Txt_OPID,"6454");
			flag=CommonMethods.sendText(IUtilities.Txt_NewPID,"4341");
			flag=CommonMethods.clickIfEnable(IUtilities.ShowPlanDetailsForNewPlanAssignment);

			if(CommonMethods.isAlertPresent());
			
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}

@Test
public boolean ReplacePC(){ 
	try {
		stepInfo="Click on Utilities tab";
		flag=CommonMethods.clickIfEnable(IUtilities.TAB_UTILITIES);
			
			flag=CommonMethods.clickIfEnable(IUtilities.Tab_InsProc);
			
			flag=CommonMethods.clickIfEnable(IUtilities.Tab_ReplaceProcCode);
			flag=CommonMethods.sendText(IUtilities.Txt_OProcedureCode,"654");
			flag=CommonMethods.sendText(IUtilities.Txt_NewProcedureCode,"341");
			flag=CommonMethods.clickIfEnable(IUtilities.tab_Compare);

			if(CommonMethods.isAlertPresent());
			
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}


@Test
public boolean CoveragecategoryCopy(){ 
	try {
		stepInfo="Click on Utilities tab";
		flag=CommonMethods.clickIfEnable(IUtilities.TAB_UTILITIES);
			
			flag=CommonMethods.clickIfEnable(IUtilities.Tab_InsProc);
			
			flag=CommonMethods.clickIfEnable(IUtilities.Tab_CoverageCategoryCopy);
			flag=CommonMethods.selectFromList(IUtilities.Slc_test,"test");
			flag=CommonMethods.clickIfEnable(IUtilities.Btn_Copy);

			if(CommonMethods.isAlertPresent());
			
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}




}
