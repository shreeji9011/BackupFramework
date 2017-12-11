package com.denticon.automationSQA.setup;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.ISetup;
import com.denticon.automationSQA.utilities.CommonMethods;

public class FeesScheduleSetup extends SeleniumSuite{

	String stepInfo=" "; 
	boolean flag=false;

@Test
public boolean AddNewSchedule(){ 
try {
	
		flag=CommonMethods.clickIfEnable(ISetup.TAB_SETUP);
		flag=CommonMethods.clickIfEnable(ISetup.TAB_FEE_SCHEDULE);
		flag=CommonMethods.clickIfEnable(ISetup.TAB_FeeSchdSetup);
		
		flag=CommonMethods.clickIfEnable(ISetup.Btn_AddNewSched);
		if(CommonMethods.isAlertPresent());
		flag=CommonMethods.sendText(ISetup.Txt_name,"NewSched2018");

		
		Thread.sleep(3000);
	
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
public boolean EditSchedule(){ 
try {

	flag=CommonMethods.clickIfEnable(ISetup.TAB_SETUP);
	flag=CommonMethods.clickIfEnable(ISetup.TAB_FEE_SCHEDULE);
	flag=CommonMethods.clickIfEnable(ISetup.TAB_FeeSchdSetup);
		
	flag=CommonMethods.clickIfEnable(ISetup.Btn_EditSched);
	
	Thread.sleep(5000);
	
	stepInfo="Click on Save Icon ";
	flag=CommonMethods.clickIfEnable(ISetup.BTN_Save);

	
} catch (Exception e) { 
	e.printStackTrace(); 
	Assert.fail(); 
	
}
return flag;

}

@Test
public boolean DeleteSchedule(){ 
try {


	flag=CommonMethods.clickIfEnable(ISetup.TAB_SETUP);
	flag=CommonMethods.clickIfEnable(ISetup.TAB_FEE_SCHEDULE);
	flag=CommonMethods.clickIfEnable(ISetup.TAB_FeeSchdSetup);
	
	flag=CommonMethods.isElementPresent(ISetup.Btn_DeleteSched);
	
} catch (Exception e) { 
	e.printStackTrace(); 
	Assert.fail(); 
	
}
return flag;

}


@Test
public boolean VerifyPanelViewByCodes(){ 
try {


	flag=CommonMethods.clickIfEnable(ISetup.TAB_SETUP);
	flag=CommonMethods.clickIfEnable(ISetup.TAB_FEE_SCHEDULE);
	flag=CommonMethods.clickIfEnable(ISetup.TAB_FeeSchdSetup);
	flag=CommonMethods.clickIfEnable(ISetup.Panel_ViewByCodes);
	flag=CommonMethods.clickIfEnable(ISetup.Btn_EditFees);
	flag=CommonMethods.sendText(ISetup.txt_addFees,"14");
	Thread.sleep(3000);
	
	stepInfo="Click on Save Icon ";
	flag=CommonMethods.clickIfEnable(ISetup.BTN_Save);
	
	
} catch (Exception e) { 
	e.printStackTrace(); 
	Assert.fail(); 
	
}
return flag;

}

}
