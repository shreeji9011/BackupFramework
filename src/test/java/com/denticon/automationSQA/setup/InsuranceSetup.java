package com.denticon.automationSQA.setup;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.ISetup;
import com.denticon.automationSQA.utilities.CommonMethods;

		
public class InsuranceSetup extends SeleniumSuite{

			String stepInfo=" "; 
			boolean flag=false;
	
@Test
	public boolean AddNewInsurancePlan(){ 
		try {
			
			flag=CommonMethods.clickIfEnable(ISetup.TAB_SETUP);
 		
 			flag=CommonMethods.clickIfEnable(ISetup.TAB_INSURANCE);
 			flag=CommonMethods.clickIfEnable(ISetup.TAB_InsPLAN);
 			
 			flag=CommonMethods.clickIfEnable(ISetup.Tab_AddNewIns);
 			flag=CommonMethods.selectFromList(ISetup.Slc_Type,"Dental");
 			Thread.sleep(2000);
 			flag=CommonMethods.clickIfEnable(ISetup.Btn_carrierSearch);
 			flag=CommonMethods.sendText(ISetup.txt_search,"bl");
 			flag=CommonMethods.clickIfEnable(ISetup.slc_carrier);
 			flag=CommonMethods.clickIfEnable(ISetup.slc_ok);
 			
 			flag=CommonMethods.clickIfEnable(ISetup.Btn_EmployerSearch);
 			flag=CommonMethods.sendText(ISetup.txt_searchE,"wa");
 			flag=CommonMethods.clickIfEnable(ISetup.slc_emp);
 			flag=CommonMethods.clickIfEnable(ISetup.slc_okE);	
 			flag=CommonMethods.sendText(ISetup.txt_GroupNo,"c12");
 			flag=CommonMethods.selectFromList(ISetup.slc_feesToprint,"Actual Charges");

 			Thread.sleep(3000);
 			flag=CommonMethods.selectFromList(ISetup.slc_ClaimOption,"Submit Claim");
 			
 			flag=CommonMethods.clickIfEnable(ISetup.Btn_Benefits);
 			flag=CommonMethods.sendText(ISetup.txt_familydeductible,"2");
 			flag=CommonMethods.clickIfEnable(ISetup.Btn_coverage);
 			flag=CommonMethods.clickIfEnable(ISetup.Btn_feeSched);
 			flag=CommonMethods.clickIfEnable(ISetup.Btn_InsLimitation);

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
public boolean EditInsurancePlan(){ 
	try {
		
			flag=CommonMethods.clickIfEnable(ISetup.TAB_SETUP);
		
			flag=CommonMethods.clickIfEnable(ISetup.TAB_INSURANCE);
			flag=CommonMethods.clickIfEnable(ISetup.TAB_InsPLAN);
			
			flag=CommonMethods.sendText(ISetup.txt_searchAll,"%%%");
			Thread.sleep(2000);
			flag=CommonMethods.clickIfEnable(ISetup.Btn_search);
			flag=CommonMethods.clickIfEnable(ISetup.slc_Carrier);
			flag=CommonMethods.clickIfEnable(ISetup.Btn_EditPlanIno);
			
			flag=CommonMethods.selectFromList(ISetup.slc_networkType,"In Network");
			flag=CommonMethods.clickIfEnable(ISetup.panel_benefits);
			Thread.sleep(5000);
			flag=CommonMethods.clickIfEnable(ISetup.chk_lifetimeOrthoBenefits);
			flag=CommonMethods.clickIfEnable(ISetup.panel_cvg);	

			flag=CommonMethods.clickIfEnable(ISetup.panel_limits);
			
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
public boolean DeleteInsurancePlan(){ 
	try {
		
		flag=CommonMethods.clickIfEnable(ISetup.TAB_SETUP);
		
		flag=CommonMethods.clickIfEnable(ISetup.TAB_INSURANCE);
		flag=CommonMethods.clickIfEnable(ISetup.TAB_InsPLAN);
		
		flag=CommonMethods.sendText(ISetup.txt_searchAll,"%%%");
		Thread.sleep(2000);
		flag=CommonMethods.clickIfEnable(ISetup.Btn_search);
		flag=CommonMethods.clickIfEnable(ISetup.slc_Carrier);
		flag=CommonMethods.isElementPresent(ISetup.Btn_DeletePlan);
			
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}

@Test
public boolean PrintInsurancePlan(){ 
	try {
		
		flag=CommonMethods.clickIfEnable(ISetup.TAB_SETUP);
		
		flag=CommonMethods.clickIfEnable(ISetup.TAB_INSURANCE);
		flag=CommonMethods.clickIfEnable(ISetup.TAB_InsPLAN);
		
		flag=CommonMethods.sendText(ISetup.txt_searchAll,"%%%");
		Thread.sleep(2000);
		flag=CommonMethods.clickIfEnable(ISetup.Btn_search);
		flag=CommonMethods.clickIfEnable(ISetup.slc_Carrier);
		flag=CommonMethods.clickIfEnable(ISetup.Btn_printPlan);
			
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}

@Test
public boolean CustomCoverageSetup(){ 
	try {
		
		flag=CommonMethods.clickIfEnable(ISetup.TAB_SETUP);
		
		flag=CommonMethods.clickIfEnable(ISetup.TAB_INSURANCE);
		flag=CommonMethods.clickIfEnable(ISetup.TAB_CustomCvg);

		Thread.sleep(2000);
		flag=CommonMethods.clickIfEnable(ISetup.Btn_EditA);
		flag=CommonMethods.isElementPresent(ISetup.BTN_Save);
	
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}

@Test
	public boolean AddNewDentalcarrierPlan(){ 
		try {
			
			flag=CommonMethods.clickIfEnable(ISetup.TAB_SETUP);
		
			flag=CommonMethods.clickIfEnable(ISetup.TAB_INSURANCE);
			flag=CommonMethods.clickIfEnable(ISetup.TAB_DentalCarrier);
			
			flag=CommonMethods.clickIfEnable(ISetup.Btn_addNewCarrier);
			flag=CommonMethods.sendText(ISetup.txt_name,"Dental");
			flag=CommonMethods.sendText(ISetup.txt_address,"151 kamlus drive");
			Thread.sleep(2000);
			flag=CommonMethods.sendText(ISetup.txt_cityD,"Irvine");

			flag=CommonMethods.sendText(ISetup.txt_zip,"45323");
			
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
public boolean EditDentalcarrierPlan(){ 
		try {
			
			flag=CommonMethods.clickIfEnable(ISetup.TAB_SETUP);
		
			flag=CommonMethods.clickIfEnable(ISetup.TAB_INSURANCE);
			flag=CommonMethods.clickIfEnable(ISetup.TAB_DentalCarrier);
			
			flag=CommonMethods.clickIfEnable(ISetup.slc_DentalCarrier);
			Thread.sleep(3000);
			flag=CommonMethods.clickIfEnable(ISetup.Tab_EditAcc);			
			flag=CommonMethods.sendText(ISetup.txt_phoneD,"555-555-5555");
			
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
public boolean DeleteDentalCarrierPlan(){ 
	try {
		
		flag=CommonMethods.clickIfEnable(ISetup.TAB_SETUP);
		
		flag=CommonMethods.clickIfEnable(ISetup.TAB_INSURANCE);
		flag=CommonMethods.clickIfEnable(ISetup.TAB_DentalCarrier);
		
		flag=CommonMethods.clickIfEnable(ISetup.slc_DentalCarrier);
		flag=CommonMethods.isElementPresent(ISetup.Btn_DeletePlan);
			
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}	
	
@Test
	public boolean AddNewMedcarrierPlan(){ 
		try {
			
			flag=CommonMethods.clickIfEnable(ISetup.TAB_SETUP);
		
			flag=CommonMethods.clickIfEnable(ISetup.TAB_INSURANCE);
			flag=CommonMethods.clickIfEnable(ISetup.TAB_medialcarrier);
			Thread.sleep(2000);
			flag=CommonMethods.clickIfEnable(ISetup.Btn_addNewCarrier);
			flag=CommonMethods.sendText(ISetup.txt_name,"Medical1");
			flag=CommonMethods.sendText(ISetup.txt_address,"151 kamlus drive");
			Thread.sleep(2000);
			flag=CommonMethods.sendText(ISetup.txt_cityD,"Irvine");

			flag=CommonMethods.sendText(ISetup.txt_zip,"75634");
			
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
public boolean EditMedicalcarrierPlan(){ 
		try {
			
			flag=CommonMethods.clickIfEnable(ISetup.TAB_SETUP);
		
			flag=CommonMethods.clickIfEnable(ISetup.TAB_INSURANCE);
			flag=CommonMethods.clickIfEnable(ISetup.TAB_medialcarrier);
			
			flag=CommonMethods.clickIfEnable(ISetup.slc_MedicalCarrier);
			flag=CommonMethods.clickIfEnable(ISetup.Tab_EditG);			
			flag=CommonMethods.sendText(ISetup.txt_phoneD,"555-555-5555");
			
			
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
public boolean DeleteMedicalCarrierPlan(){ 
	try {
		
		flag=CommonMethods.clickIfEnable(ISetup.TAB_SETUP);
		
		flag=CommonMethods.clickIfEnable(ISetup.TAB_INSURANCE);
		flag=CommonMethods.clickIfEnable(ISetup.TAB_medialcarrier);
		
		flag=CommonMethods.clickIfEnable(ISetup.slc_DentalCarrier);
		flag=CommonMethods.isElementPresent(ISetup.Btn_DeletePlan);
			
	} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 
			
		}
return flag;
	
}	
	
@Test
public boolean AddNewEmployerPlan(){ 
	try {
		
		flag=CommonMethods.clickIfEnable(ISetup.TAB_SETUP);
	
		flag=CommonMethods.clickIfEnable(ISetup.TAB_INSURANCE);
		flag=CommonMethods.clickIfEnable(ISetup.TAB_employer);
		Thread.sleep(2000);
		flag=CommonMethods.clickIfEnable(ISetup.Btn_addNewCarrier);
		flag=CommonMethods.sendText(ISetup.txt_name,"Medical1");
		flag=CommonMethods.sendText(ISetup.txt_address,"151 kamlus drive");
		Thread.sleep(2000);
		flag=CommonMethods.sendText(ISetup.txt_cityD,"Irvine");

		flag=CommonMethods.sendText(ISetup.txt_zip,"75634");
		
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
public boolean EditEmployerPlan(){ 
	try {
		
		flag=CommonMethods.clickIfEnable(ISetup.TAB_SETUP);
	
		flag=CommonMethods.clickIfEnable(ISetup.TAB_INSURANCE);
		flag=CommonMethods.clickIfEnable(ISetup.TAB_employer);
		
		flag=CommonMethods.clickIfEnable(ISetup.slc_Employer);
		flag=CommonMethods.clickIfEnable(ISetup.Tab_EditG);			
		flag=CommonMethods.sendText(ISetup.txt_phoneD,"555-555-5555");
		
		
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
public boolean DeleteEmpPlan(){ 
try {
	
	flag=CommonMethods.clickIfEnable(ISetup.TAB_SETUP);
	
	flag=CommonMethods.clickIfEnable(ISetup.TAB_INSURANCE);
	flag=CommonMethods.clickIfEnable(ISetup.TAB_employer);
	
	flag=CommonMethods.clickIfEnable(ISetup.slc_Employer);
	flag=CommonMethods.isElementPresent(ISetup.Btn_DeletePlan);
		
} catch (Exception e) { 
		e.printStackTrace(); 
		Assert.fail(); 
		
	}
return flag;

}	



}
