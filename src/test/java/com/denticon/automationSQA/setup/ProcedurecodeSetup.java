package com.denticon.automationSQA.setup;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.ISetup;
import com.denticon.automationSQA.utilities.CommonMethods;

public class ProcedurecodeSetup extends SeleniumSuite{

	String stepInfo=" "; 
	boolean flag=false;

@Test
public boolean AddNewCode(){ 
try {
	
		flag=CommonMethods.clickIfEnable(ISetup.TAB_SETUP);
		flag=CommonMethods.clickIfEnable(ISetup.TAB_PROCEDURE_CODES);
		flag=CommonMethods.clickIfEnable(ISetup.TAB_ProCodes);
		
		flag=CommonMethods.clickIfEnable(ISetup.Btn_addNewPC);
		
		flag=CommonMethods.sendText(ISetup.txt_Descri,"Pnew167CODE");
		flag=CommonMethods.sendText(ISetup.txt_Code,"4563");
		
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
public boolean EditReferrals(){ 
try {

	flag=CommonMethods.clickIfEnable(ISetup.TAB_SETUP);
	flag=CommonMethods.clickIfEnable(ISetup.TAB_PROCEDURE_CODES);
	flag=CommonMethods.clickIfEnable(ISetup.TAB_ProCodes);
	
	flag=CommonMethods.clickIfEnable(ISetup.Btn_EditPlanIno);
	flag=CommonMethods.clickIfEnable(ISetup.Chk_toothNo);
	
	Thread.sleep(5000);
	
	stepInfo="Click on Save Icon ";
	flag=CommonMethods.clickIfEnable(ISetup.BTN_Save);
	if(CommonMethods.isAlertPresent());

//	flag=CommonMethods.clickIfEnable(ISetup.Panel_feeSched);
//	flag=CommonMethods.clickIfEnable(ISetup.Btn_EditPlanIno);
//	flag=CommonMethods.sendText(ISetup.Txt_EditFees,"15");
	
	stepInfo="Click on Save Icon ";
//	flag=CommonMethods.clickIfEnable(ISetup.BTN_Save);
//	if(CommonMethods.isAlertPresent());
	
} catch (Exception e) { 
	e.printStackTrace(); 
	Assert.fail(); 
	
}
return flag;

}

@Test
public boolean DeleteReferrals(){ 
try {

	flag=CommonMethods.clickIfEnable(ISetup.TAB_SETUP);
	flag=CommonMethods.clickIfEnable(ISetup.TAB_PROCEDURE_CODES);
	flag=CommonMethods.clickIfEnable(ISetup.TAB_ProCodes);
	
flag=CommonMethods.isElementPresent(ISetup.Btn_Delete);
	
} catch (Exception e) { 
	e.printStackTrace(); 
	Assert.fail(); 
	
}
return flag;

}

@Test
public boolean AddNewExplosionCode(){ 
try {
	
		flag=CommonMethods.clickIfEnable(ISetup.TAB_SETUP);
		flag=CommonMethods.clickIfEnable(ISetup.TAB_PROCEDURE_CODES);
		flag=CommonMethods.clickIfEnable(ISetup.TAB_ExplosionCodes);
		
		flag=CommonMethods.clickIfEnable(ISetup.Btn_addNewPC);
		
		flag=CommonMethods.sendText(ISetup.txt_Explosiondesc,"Pnew167CODE");
		flag=CommonMethods.sendText(ISetup.txt_ExplosionShortdesc,"4563NewExplo");
		
		
		flag=CommonMethods.clickIfEnable(ISetup.Chk_DefaultToothAll);
		flag=CommonMethods.clickIfEnable(ISetup.Slc_ProcCategory);
		flag=CommonMethods.clickIfEnable(ISetup.Btn_Add);
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
public boolean EditExplosionCode(){ 
try {

	
	flag=CommonMethods.clickIfEnable(ISetup.TAB_SETUP);
	flag=CommonMethods.clickIfEnable(ISetup.TAB_PROCEDURE_CODES);
	flag=CommonMethods.clickIfEnable(ISetup.TAB_ExplosionCodes);
	

	
	flag=CommonMethods.clickIfEnable(ISetup.Btn_EditPlanIno);

	
	Thread.sleep(5000);
	
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
public boolean DeleteExplosionCode(){ 
try {

	
	flag=CommonMethods.clickIfEnable(ISetup.TAB_SETUP);
	flag=CommonMethods.clickIfEnable(ISetup.TAB_PROCEDURE_CODES);
	flag=CommonMethods.clickIfEnable(ISetup.TAB_ExplosionCodes);
		
flag=CommonMethods.isElementPresent(ISetup.Btn_Delete);
	
} catch (Exception e) { 
	e.printStackTrace(); 
	Assert.fail(); 
	
}
return flag;

}



}
