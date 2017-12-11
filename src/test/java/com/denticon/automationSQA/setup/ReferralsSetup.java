package com.denticon.automationSQA.setup;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.ISetup;
import com.denticon.automationSQA.utilities.CommonMethods;

public class ReferralsSetup extends SeleniumSuite{

	String stepInfo=" "; 
	boolean flag=false;

@Test
public boolean AddNewReferrals(){ 
try {
	
	flag=CommonMethods.clickIfEnable(ISetup.TAB_SETUP);
	
		flag=CommonMethods.clickIfEnable(ISetup.TAB_REFERRALS);
		flag=CommonMethods.clickIfEnable(ISetup.TAB_ReferralsSetup);
		
		flag=CommonMethods.clickIfEnable(ISetup.Btn_addNewReferrals);
		flag=CommonMethods.selectFromList(ISetup.slc_type,"Doctor");
		Thread.sleep(2000);
		flag=CommonMethods.sendText(ISetup.txt_LnameR,"Gordan");
		flag=CommonMethods.sendText(ISetup.txt_FnameR,"Justin");
		
		flag=CommonMethods.sendText(ISetup.txt_addressR,"1888 Main street");
		flag=CommonMethods.sendText(ISetup.txt_cityR,"San Jose");
		flag=CommonMethods.sendText(ISetup.txt_zipR,"45672");	
		
		Thread.sleep(3000);
	
		flag=CommonMethods.clickIfEnable(ISetup.Btn_Demography);
	
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
	flag=CommonMethods.clickIfEnable(ISetup.TAB_REFERRALS);
	flag=CommonMethods.clickIfEnable(ISetup.TAB_ReferralsSetup);
	flag=CommonMethods.clickIfEnable(ISetup.Btn_EditPlanIno);
	flag=CommonMethods.clickIfEnable(ISetup.panel_Demography);
	Thread.sleep(5000);
	flag=CommonMethods.sendText(ISetup.txt_FvtSports,"TestAuto");
	
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
public boolean DeleteReferrals(){ 
try {

flag=CommonMethods.clickIfEnable(ISetup.TAB_SETUP);
flag=CommonMethods.clickIfEnable(ISetup.TAB_REFERRALS);
flag=CommonMethods.clickIfEnable(ISetup.TAB_ReferralsSetup);

flag=CommonMethods.isElementPresent(ISetup.Btn_DeleteR);
	
} catch (Exception e) { 
	e.printStackTrace(); 
	Assert.fail(); 
	
}
return flag;

}


@Test
public boolean CustomDemographics(){ 
try {

flag=CommonMethods.clickIfEnable(ISetup.TAB_SETUP);
flag=CommonMethods.clickIfEnable(ISetup.TAB_REFERRALS);
flag=CommonMethods.clickIfEnable(ISetup.TAB_CustomDemo);

flag=CommonMethods.isElementPresent(ISetup.Btn_EditPlanIno);
	
} catch (Exception e) { 
	e.printStackTrace(); 
	Assert.fail(); 
	
}
return flag;

}


}
