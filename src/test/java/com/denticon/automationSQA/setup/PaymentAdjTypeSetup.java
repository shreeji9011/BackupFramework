package com.denticon.automationSQA.setup;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.ISetup;
import com.denticon.automationSQA.utilities.CommonMethods;

public class PaymentAdjTypeSetup extends SeleniumSuite{

	String stepInfo=" "; 
	boolean flag=false;

@Test
public boolean AddNewType(){ 
try {
	
		flag=CommonMethods.clickIfEnable(ISetup.TAB_SETUP);
		flag=CommonMethods.clickIfEnable(ISetup.TAB_PAY_ADJTYPE);
		flag=CommonMethods.clickIfEnable(ISetup.Btn_addNewType);

		flag=CommonMethods.sendText(ISetup.txt_code,"type2018");
		flag=CommonMethods.sendText(ISetup.txt_des,"adjustmenttypedescription");
		
		Thread.sleep(3000);
	
		stepInfo="Click on Save Icon ";
		flag=CommonMethods.clickIfEnable(ISetup.BTN_Save);


} catch (Exception e) { 
		e.printStackTrace(); 
		Assert.fail(); 
		
	}
return flag;

}

@Test
public boolean EditType(){ 
try {

	flag=CommonMethods.clickIfEnable(ISetup.TAB_SETUP);
	flag=CommonMethods.clickIfEnable(ISetup.TAB_PAY_ADJTYPE);
	flag=CommonMethods.clickIfEnable(ISetup.Btn_addNewPC);
	
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
	flag=CommonMethods.clickIfEnable(ISetup.TAB_PAY_ADJTYPE);
	
	flag=CommonMethods.isElementPresent(ISetup.Btn_Delete);
	
} catch (Exception e) { 
	e.printStackTrace(); 
	Assert.fail(); 
	
}
return flag;

}



}
