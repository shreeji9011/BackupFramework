package com.denticon.automationSQA.setup;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.ISetup;
import com.denticon.automationSQA.utilities.CommonMethods;

		
public class SecuritySetup extends SeleniumSuite{

			String stepInfo=" "; 
			boolean flag=false;
	
@Test
	public boolean AddNewUser(){ 
		try {
			
			flag=CommonMethods.clickIfEnable(ISetup.TAB_SETUP);
 		
 			flag=CommonMethods.clickIfEnable(ISetup.Tab_Security);
 			flag=CommonMethods.clickIfEnable(ISetup.Tab_SecUser);
 			flag=CommonMethods.clickIfEnable(ISetup.Btn_AddNewUser);
 			flag=CommonMethods.sendText(ISetup.txt_Username,"NewUserAuto");
 			Thread.sleep(2000);
 			
 			flag=CommonMethods.sendText(ISetup.txt_password,"Automation12#");
 			flag=CommonMethods.sendText(ISetup.txt_Fname,"Rebbaca");
 			flag=CommonMethods.sendText(ISetup.txt_Lname,"Gordan");
 			flag=CommonMethods.sendText(ISetup.txt_Email,"aaa@bbb.com");
 	 		flag=CommonMethods.clickIfEnable(ISetup.Btn_worksAt);

 			flag=CommonMethods.clickIfEnable(ISetup.slc_office);

 			flag=CommonMethods.clickIfEnable(ISetup.Btn_Homeoffice);
 			
 			Thread.sleep(3000);
 			flag=CommonMethods.clickIfEnable(ISetup.Btn_LoginInfo);
 			Thread.sleep(3000);
 			flag=CommonMethods.clickIfEnable(ISetup.Btn_GroupMembership);
 			flag=CommonMethods.clickIfEnable(ISetup.Chk_UserGroup);
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


@Test //(description="edit plan", dependsOnMethods="AddNewUser")
public boolean EditUser(){ 
	
	try {
			Thread.sleep(5000);
			flag=CommonMethods.clickIfEnable(ISetup.TAB_SETUP);
 			flag=CommonMethods.clickIfEnable(ISetup.Tab_Security);
 			flag=CommonMethods.clickIfEnable(ISetup.Tab_SecUser);
			flag=CommonMethods.clickIfEnable(ISetup.Btn_EditOffice);
			flag=CommonMethods.clickIfEnable(ISetup.Btn_Cancel);
			if(CommonMethods.isAlertPresent());

			Thread.sleep(2000);

	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}



@Test
public boolean deleteSecurityUser(){ 
	
	try {
		Thread.sleep(2000);
		flag=CommonMethods.clickIfEnable(ISetup.TAB_SETUP);
		flag=CommonMethods.clickIfEnable(ISetup.Tab_Security);
		flag=CommonMethods.clickIfEnable(ISetup.Tab_SecUser);
		flag=CommonMethods.sendText(ISetup.txt_searchUser,"Gordan");
		flag=CommonMethods.clickIfEnable(ISetup.Slc_NewUser);
		Thread.sleep(3000);
		flag=CommonMethods.clickIfEnable(ISetup.Btn_Delete);
		if(CommonMethods.isAlertPresent());
		Thread.sleep(5000);

	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
	
return flag;
	
}	

@Test 
public boolean UserPerOfficeSettingsSetup(){ 
	
	try {
			Thread.sleep(5000);
			flag=CommonMethods.clickIfEnable(ISetup.TAB_SETUP);
 			flag=CommonMethods.clickIfEnable(ISetup.Tab_Security);
 			flag=CommonMethods.clickIfEnable(ISetup.Tab_UserPerOfficeSettings);
			flag=CommonMethods.clickIfEnable(ISetup.Btn_Edit);
			flag=CommonMethods.clickIfEnable(ISetup.Chk_dayAllowedonLoginSettings);
			
			flag=CommonMethods.clickIfEnable(ISetup.switchTabGroupmembership);
			flag=CommonMethods.clickIfEnable(ISetup.Slc_availableGroup);
			
			
			flag=CommonMethods.clickIfEnable(ISetup.MoveRightArrow);
			flag=CommonMethods.clickIfEnable(ISetup.BTN_Save);
			
			if(CommonMethods.isAlertPresent());

			Thread.sleep(2000);

	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}


@Test 
public boolean GroupSetup(){ 
	
	try {
			Thread.sleep(5000);
			flag=CommonMethods.clickIfEnable(ISetup.TAB_SETUP);
 			flag=CommonMethods.clickIfEnable(ISetup.Tab_Security);
 			flag=CommonMethods.clickIfEnable(ISetup.Tab_Groups);
			flag=CommonMethods.clickIfEnable(ISetup.Btn_AddNewGroups);
			flag=CommonMethods.sendText(ISetup.Txt_GroupName,"AutoGroup");
			
			flag=CommonMethods.clickIfEnable(ISetup.AvailableRights);
			flag=CommonMethods.clickIfEnable(ISetup.MoveRightArrowG);

			flag=CommonMethods.clickIfEnable(ISetup.Btn_SaveG);
			
			if(CommonMethods.isAlertPresent());

			Thread.sleep(2000);

	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}

//@Test
public boolean EditGroupSetup(){ 
	
	try {
		Thread.sleep(2000);
		flag=CommonMethods.clickIfEnable(ISetup.TAB_SETUP);
		flag=CommonMethods.clickIfEnable(ISetup.Tab_Security);
		flag=CommonMethods.clickIfEnable(ISetup.Tab_Groups);

		flag=CommonMethods.clickIfEnable(ISetup.Slc_Office);
		Thread.sleep(3000);
		flag=CommonMethods.clickIfEnable(ISetup.Slc_Group);

		flag=CommonMethods.clickIfEnable(ISetup.Tab_EditG);
		flag=CommonMethods.clickIfEnable(ISetup.Slc_AssihnedRights);
		flag=CommonMethods.clickIfEnable(ISetup.MoveLeftArrowG );

		flag=CommonMethods.clickIfEnable(ISetup.Btn_SaveG);
		
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
	
return flag;
	
}	


@Test
public boolean DeleteGroupSetup(){ 
	
	try {
		Thread.sleep(2000);
		flag=CommonMethods.clickIfEnable(ISetup.TAB_SETUP);
		flag=CommonMethods.clickIfEnable(ISetup.Tab_Security);
		flag=CommonMethods.clickIfEnable(ISetup.Tab_Groups);

		flag=CommonMethods.clickIfEnable(ISetup.Slc_Office);
		Thread.sleep(3000);
		flag=CommonMethods.clickIfEnable(ISetup.Slc_Group);

		flag=CommonMethods.clickIfEnable(ISetup.Btn_Delete);
		if(CommonMethods.isAlertPresent());
		
		
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
	
return flag;
	
}	


@Test 
public boolean ChangeMyPasswordSetup(){ 
	
	try {
			Thread.sleep(5000);
			flag=CommonMethods.clickIfEnable(ISetup.TAB_SETUP);
 			flag=CommonMethods.clickIfEnable(ISetup.Tab_Security);
 			flag=CommonMethods.clickIfEnable(ISetup.Tab_ChangePassword);
			flag=CommonMethods.sendText(ISetup.txt_currentPassword,"123456");
			flag=CommonMethods.sendText(ISetup.txt_newPassword,"Planetdds12@");
			flag=CommonMethods.sendText(ISetup.txt_confirmpwd,"Planetdds12@");

			flag=CommonMethods.clickIfEnable(ISetup.Btn_Cancel);
			
			if(CommonMethods.isAlertPresent());

			Thread.sleep(2000);

	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}




}
