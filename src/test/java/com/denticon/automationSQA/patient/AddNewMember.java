package com.denticon.automationSQA.patient;

import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.IAddPatient;
import com.denticon.automationSQA.utilities.CommonMethods;

public class AddNewMember extends SeleniumSuite { 
	
	String stepInfo=""; 
	boolean flag=false; 
 	String filePath=System.getProperty("user.dir") + "\\src\\main\\resources\\AddNewPatient.properties"; 
 	Properties prop= new Properties();

 	@Test(description="Verify Add New Member Module")
 	public boolean verifyAddNewMemberPage(){
	
 		try	{ 

 			Thread.sleep(5000);
 			stepInfo="Click on Patient tab";
			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
			test.log(Status.PASS, "Click on Patient tab"); 
			
			stepInfo="Click on add new member"; 
			flag=CommonMethods.clickIfEnable(IAddPatient. TAB_AddNewMember);
			test.log(Status.PASS, "Click on add new member");
			
 			stepInfo="Enter Last name"; 
 			String lastName=CommonMethods.readDatafromProps(filePath,"LastName");
 			flag=CommonMethods.sendText(IAddPatient.TXT_Last_Name, lastName);
 			test.log(Status.PASS, "Enter Last name");
		
 			stepInfo="Enter First name"; 
 			String firstName=CommonMethods.readDatafromProps(filePath,"FirstName");
 			flag=CommonMethods.sendText(IAddPatient.TXT_First_Name, firstName);
 			test.log(Status.PASS, "Enter First name");
 			Thread.sleep(5000);
 		
 			//Handle duplicate patient pop up
 //			flag=CommonMethods.clickIfEnable(IAddPatient.BTN_CloseIdenticalPatientPopup);
 			
 			stepInfo="Enter Birthdate";
 			String birthdate = CommonMethods.readDatafromProps(filePath, "Bdate");
 			flag=CommonMethods.sendText(IAddPatient.TXT_Bdate, birthdate);
 			test.log(Status.PASS, "Enter Birthdate");
 			
 			stepInfo="Enter Sex";	
 			String sex = CommonMethods.readDatafromProps(filePath, "Sex");
 			flag=CommonMethods.selectFromList(IAddPatient.TXT_Sex, sex);
 			test.log(Status.PASS, "Enter Sex");
 			
 			stepInfo="Enter Coverage Type";
 			flag=CommonMethods.clickIfEnable(IAddPatient.CHK_NoCvg);
 			test.log(Status.PASS, "Enter Coverage Type");
 			
 		 	stepInfo="Relationship to Responsible Party";
 			String reltoparty = CommonMethods.readDatafromProps(filePath, "RelToRes");
 			flag=CommonMethods.selectFromList(IAddPatient.DRPDWN_RelToRes, reltoparty);
 			test.log(Status.PASS, "Relationship to Responsible Party");
 			
 			stepInfo="Preferred Provider";
 			String prefProvider = CommonMethods.readDatafromProps(filePath, "PrefProvider");
 			flag=CommonMethods.selectFromList(IAddPatient.TXT_PrefProvider, prefProvider);
 			test.log(Status.PASS, "Preferred Provider");
 			
 			stepInfo="Referal Type";
 			String refType = CommonMethods.readDatafromProps(filePath, "RefType");
 			flag=CommonMethods.selectFromList(IAddPatient.DRPDWN_ReferralType,refType );
 			test.log(Status.PASS, "Referal Type");
 			
 			stepInfo="Add Medical Information";
 			flag=CommonMethods.clickIfEnable(IAddPatient.BTN_AddMedicalInformation);
 			
 			stepInfo="Enter Medical Information";
 			test.log(Status.PASS, "Enter Medical Information");
 			flag=CommonMethods.clickIfEnable(IAddPatient.CHK_29_30_M_A);
 			flag=CommonMethods.clickIfEnable(IAddPatient.CHK_21_22_M_A);
 			

 			stepInfo="Go to Add Recall Information";
 			flag=CommonMethods.clickIfEnable(IAddPatient.BTN_AddRecallInformation);
 			test.log(Status.PASS, "Go to Add Recall Information");
 			
 			flag=CommonMethods.clickIfEnable(IAddPatient.BTN_Finish);					
 			test.log(Status.PASS, "Go to Finish");
 			
 			
	} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 
 			
 		}
	return flag;
 	
}
}


