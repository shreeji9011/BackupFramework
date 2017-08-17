package com.denticon.automationSQA.pom;

import org.openqa.selenium.By;

public interface Ipatient {

	///// Change patient Home Office ///////
	
	By TAB_Office = By.linkText("Change Patient Home Office");
	By List_Office = By.xpath("//*[@id='cmbOffices']");
	By list_RPoffice = By.xpath("//*[@id='cmbRPOffices']");
	By BTW_Save = By.id("btnSave");
	
	////////////// aSSIGN to restricted user page ///////
	
	By TAB_ARU = By.linkText("Assign To Restricted User");
	By SLC_AvailableUser = By.xpath("//*[@id='lbAvailUsers']/option[1]");
	By SLC_AssignedUsers = By.id("btnAssign");
	
	//////// Addresses ////////
	
	By TAB_Addresses = By.linkText("Addresses");
	
	///// Unclose last statement //////
	
	By TAB_ULS = By.linkText("Unclose Last Statement");
	By Btw_Cancel = By.id("btnCancel");
	
	////// Reallocate account /////
	
	By TAB_RA = By.linkText("Reallocate Account");
	
	////// Online registered patient //// 
	
	By TAB_ORP = By.linkText("Online Registered Patients");
	By SLC_AddPatient = By.xpath("//*[@id='btnAddPatient']");
	By SLC_DeleteP = By.id("btnDeletePatient");
	By SLC_PrintReg = By.xpath("//*[@id='Table1']/tbody/tr[12]/td/input[1]");
	
	/////// correct online registered patient - exciting ///// 
	
	By TAB_CORPE = By.linkText("Correct Online Registered Patients - Existing");
	By SLC_NonImportedPatientList = By.xpath("//*[@id='cmbPatList']/option[1]");
	By SLC_PrintRegE = By.xpath("//*[@id='btnPrintReg']");
	By SLC_ChangeSelectedPatient = By.id("btnChangePat");
	By TXT_Lastname = By.xpath("//*[@id='txtLName']");
	

	///// Patient portal Signup /////
	
	By TAB_PPS = By.linkText("Patient Portal Signups");
	By TAB_DisplayPatient = By.xpath("//*[@id='btnDisplayPat']");
	
	
	
}	