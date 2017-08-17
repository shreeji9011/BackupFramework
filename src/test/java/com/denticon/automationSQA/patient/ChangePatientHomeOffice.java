package com.denticon.automationSQA.patient;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.IAddPatient;
import com.denticon.automationSQA.pom.Ipatient;
import com.denticon.automationSQA.utilities.CommonMethods;

public class ChangePatientHomeOffice extends SeleniumSuite {
	
		String stepInfo=""; 
		boolean flag=false; 
	 

	@Test
	public boolean verifyChangeHomeOfficePage(){
		
		try	{ 
		
				Thread.sleep(3000);
				stepInfo="Go to Search Patient Tab";
				flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
				test.log(Status.PASS, "Go to Patient Tab"); 
			
				flag=CommonMethods.clickIfEnable(Ipatient.TAB_Office);
				test.log(Status.PASS, "Go to Change Home office Tab"); 

				flag=CommonMethods.selectFromList(Ipatient.List_Office,"AA") ; 
				test.log(Status.PASS, "Select Patient Office"); 

				flag=CommonMethods.selectFromList(Ipatient.list_RPoffice,"AA") ; 
				test.log(Status.PASS, "Select RP Office"); 
				
				flag=CommonMethods.clickIfEnable(Ipatient.BTW_Save); 
				test.log(Status.PASS, "Save "); 

	
				
			} catch (Exception e) { 
				e.printStackTrace(); 
				Assert.fail(); 			
			} 		
		return flag;
	 	}

@Test
public boolean verifyAssignToRestricatedUserPage(){
	
	try	{ 
	
			Thread.sleep(3000);
			stepInfo="Go to Search Patient Tab";
			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
			test.log(Status.PASS, "Go to Patient Tab"); 
		
			flag=CommonMethods.clickIfEnable(Ipatient.TAB_ARU);
			test.log(Status.PASS, "Go to Assign to resticated user Tab"); 

			flag=CommonMethods.clickIfEnable(Ipatient.SLC_AvailableUser) ; 
			test.log(Status.PASS, "Select available user"); 

			flag=CommonMethods.clickIfEnable(Ipatient.SLC_AssignedUsers) ; ; 
			test.log(Status.PASS, "Select assign user"); 
		
		} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 			
		} 		
	return flag;
 	}

@Test
public boolean verifyAddressesPage(){
	
	try	{ 
	
			Thread.sleep(3000);
			stepInfo="Go to Search Patient Tab";
			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
			test.log(Status.PASS, "Go to Patient Tab"); 
		
			flag=CommonMethods.clickIfEnable(Ipatient.TAB_Addresses);
			test.log(Status.PASS, "Go to Addresses Tab"); 
		
		} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 			
		} 		
	return flag;
 	}

@Test
public boolean verifyUncloseAccountStatementPage(){
	
	try	{ 
	
			Thread.sleep(3000);
			stepInfo="Go to Search Patient Tab";
			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
			test.log(Status.PASS, "Go to Patient Tab"); 
		
			flag=CommonMethods.clickIfEnable(Ipatient.TAB_ULS);
			test.log(Status.PASS, "Go to Unclose Account Statement Tab"); 
		
			flag=CommonMethods.clickIfEnable(Ipatient.Btw_Cancel);
			test.log(Status.PASS, "Click Cancel");
			
		} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 			
		} 		
	return flag;
 	}

@Test
public boolean verifyReallocateAccountPage(){
	
	try	{ 
	
			Thread.sleep(3000);
			stepInfo="Go to Search Patient Tab";
			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
			test.log(Status.PASS, "Go to Patient Tab"); 
		
			flag=CommonMethods.clickIfEnable(Ipatient.TAB_RA);
			test.log(Status.PASS, "Go to ReallocateAccount Tab"); 
		
			flag=CommonMethods.clickIfEnable(Ipatient.Btw_Cancel);
			test.log(Status.PASS, "Click Cancel");
			
		} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 			
		} 		
	return flag;
 	}

@Test
public boolean verifyOnlineRegPatientCancelPage(){
	
	try	{ 
	
			Thread.sleep(3000);
			stepInfo="Go to Search Patient Tab";
			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
			test.log(Status.PASS, "Go to Patient Tab"); 
		
			flag=CommonMethods.clickIfEnable(Ipatient.TAB_ORP);
			test.log(Status.PASS, "Go to Online Reg Patient Tab"); 
		
			flag=CommonMethods.clickIfEnable(Ipatient.Btw_Cancel);
			test.log(Status.PASS, "Click Cancel");
			Alert alert =com.denticon.automationSQA.DriverManager.getDriver().switchTo().alert(); 
 			alert.accept(); 
 			Thread.sleep(1000);
 			
		} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 			
		} 		
	return flag;
 	}

@Test
public boolean verifyOnlineRegPatientPage(){
	
	try	{ 
	
			Thread.sleep(3000);
			stepInfo="Go to Search Patient Tab";
			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
			test.log(Status.PASS, "Go to Patient Tab"); 
		
			flag=CommonMethods.clickIfEnable(Ipatient.TAB_ORP);
			test.log(Status.PASS, "Go to Online Reg Patient Tab"); 
		
			flag=CommonMethods.clickIfEnable(Ipatient.SLC_PrintReg);
			test.log(Status.PASS, "Click print registration");
			
		} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 			
		} 		
	return flag;
 	}

@Test
public boolean verifyOnlineRegPatientDeletePage(){
	
	try	{ 
	
			Thread.sleep(3000);
			stepInfo="Go to Search Patient Tab";
			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
			test.log(Status.PASS, "Go to Patient Tab"); 
		
			flag=CommonMethods.clickIfEnable(Ipatient.TAB_ORP);
			test.log(Status.PASS, "Go to Online Reg Patient Tab"); 
		
			flag=CommonMethods.clickIfEnable(Ipatient.SLC_DeleteP);
			test.log(Status.PASS, "Click on delete");
			Alert alert =com.denticon.automationSQA.DriverManager.getDriver().switchTo().alert(); 
 			alert.accept(); 
 			Thread.sleep(1000);
 			
		} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 			
		} 		
	return flag;
 	}

@Test
public boolean verifyCorrectOnlineRegisteredPatientExistingPage(){
	
	try	{ 
	
			Thread.sleep(3000);
			stepInfo="Go to Search Patient Tab";
			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
			test.log(Status.PASS, "Go to Patient Tab"); 
		
			flag=CommonMethods.clickIfEnable(Ipatient.TAB_CORPE);
			test.log(Status.PASS, "Go to Online Reg Patient Tab"); 
		
			flag=CommonMethods.clickIfEnable(Ipatient.SLC_NonImportedPatientList);
			test.log(Status.PASS, "Click on Non imported patient");
			
			flag=CommonMethods.clickIfEnable(Ipatient.SLC_PrintRegE);
			test.log(Status.PASS, "Click on Print registration on exisiting patient");
			
			Thread.sleep(5000);
			flag=CommonMethods.sendText(Ipatient.TXT_Lastname,"Bill123");
			flag=CommonMethods.clickIfEnable(Ipatient.SLC_ChangeSelectedPatient);
			test.log(Status.PASS, "Click on Change Selected Patienton exisiting patient");
			
 			Thread.sleep(1000);
 			
		} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 			
		} 		
	return flag;
 	}

		
@Test
public boolean verifyPatientPortalSignUpPage(){
	
	try	{ 
	
			Thread.sleep(3000);
			stepInfo="Go to Search Patient Tab";
			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
			test.log(Status.PASS, "Go to Patient Tab"); 
		
			flag=CommonMethods.clickIfEnable(Ipatient.TAB_PPS);
			test.log(Status.PASS, "Go to Patient Portal SignUp Tab"); 
		
			flag=CommonMethods.clickIfEnable(Ipatient.TAB_DisplayPatient);
			test.log(Status.PASS, "Click on display patient");
	
 			Thread.sleep(1000);
 			
		} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 			
		} 		
	return flag;
 	}
}
