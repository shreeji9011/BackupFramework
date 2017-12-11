package com.denticon.automationSQA.pom;

import org.openqa.selenium.By;

public interface ISetup {

	By TAB_SETUP = By.xpath("//*[@id='MenuBar_aMenuSetup']");
	
	/////////////////////// Account Info page //////////////
	
	By TAB_AccInfo = By.xpath("//*[@id='menuSetup']/a[1]");
	By Tab_RegwithUpbox = By.id("btnRegisterWithUpdox");
	By Tab_EditCultureSettingd = By.id("cmdCulture");
	By Tab_EditAcc = By.id("btnEdit");
	By BTN_Save = By.id("btnSave");
	By Btn_Cancel = By.xpath("//*[@id='btnCancel']");
	By Btn_Delete = By.id("btnDelete"); 
	By Btn_EditA = By.id("btnEdit");		
			
	///////////////////////// Offices //////////////
	
	By Tab_Offices = By.xpath("//*[@id='menuSetup']/a[2]/span[1]");
	By Tab_OfficeSetup = By.xpath("//*[@id='menuOffice']/a[1]");
	
	By Btn_AddOffice = By.xpath("//*[@id='btnAdd']");
	By Txt_OName = By.xpath("//*[@id='txtOfficeName']");
	By Txt_TAddress = By.xpath("//*[@id='txtAddress']");
	By Txt_City = By.id("txtCity");
	By Txt_zip = By.id("txtZip_ZipCode");
	By Txt_Timezone = By.xpath("//*[@id='ddlTimeZone']");
	By Txt_Phone = By.xpath("//*[@id='txtPhone1_PhoneNumber_text']");
	By Txt_InsBillingProvider =  By.xpath("//*[@id='ddlInsBillPrdr']");
	By Txt_StmtNameAddress = By.xpath("//*[@id='ddlBilling']");
	By Tab_OfficeSetting = By.id("btnNext");
	By Slc_UCRfeeSched = By.id("ddlFeeId");
	By Tab_Integration = By.id("btnNext");
	By Slc_xraysystem = By.xpath("//*[@id='ddlXraySystem']");
	By Tab_Operatories = By.id("btnNext");
	By Tab_OfficeSched = By.id("btnNext");
	By Txt_addOP = By.id("txtNewOperatory");
	By Btn_addOP = By.id("btnAddOperatory");
	By Tab_Holidays = By.id("btnNext");
	By Tab_ProcList = By.id("btnNext");
	By txt_date = By.id("txtDateHoliday");
	By txt_description = By.id("txtDescr");
	By Btn_ExplosionCodes = By.id("btnNext");
	By Btn_LettersSecurityGroups = By.xpath("//*[@id='btnNext']");
	By Btn_DONOTCopyGroupLetter = By.xpath("//*[@id='btnCancel2']");

	By Btn_EditOffice =  By.xpath("//*[@id='btnEdit']");
	
	By Btn_DeleteOffice = By.id("btnDelete");
	
	/////////////////////////////// SECURITY ////////////////////////
	
	By Tab_Security = By.xpath("//*[@id='menuSetup']/a[4]");
	By Tab_SecUser = By.xpath("//*[@id='menuSecurity']/a[1]");
	By Tab_UserPerOfficeSettings = By.xpath("//*[@id='menuSecurity']/a[2]");
	By Tab_Groups = By.xpath("//*[@id='menuSecurity']/a[3]");
	
	///user///
	
	By Btn_AddNewUser = By.xpath("//*[@id='btnAdd']");
	By txt_Username = By.id("txtUsername");
	By txt_password = By.id("txtPassword");
	By txt_Fname = By.id("txtFName");
	By txt_Lname = By.id("txtLName");
	By txt_Email = By.id("txtEmail");
	By Btn_worksAt = By.id("btnNext");
	By slc_office = By.xpath("//*[@id='DataGrid1_ctl14_AssignOffice']");
	By Btn_Homeoffice = By.id("btnNext");
	By Btn_LoginInfo = By.xpath("//*[@id='btnNext']");
	By Chk_AllowedOn = By.xpath("//*[@id='ckFri']");
	By Btn_GroupMembership = By.xpath("//*[@id='btnNext']");
	By Chk_UserGroup = By.xpath("//*[@id='Datagrid2_ctl05_AssignToGroup']");
	
	/////user per office settings //////
	
	By Btn_Edit = By.id("btnEdit");
	By Chk_dayAllowedonLoginSettings = By.id("ts1_TabPanel1_ckFri");
	By switchTabGroupmembership = By.id("__tab_ts1_TabPanel2");
	By Slc_availableGroup = By.xpath("//*[@id='ts1_TabPanel2_mlbGroups_lbUnSelectedItems']/option[1]");
	By MoveRightArrow = By.id("ts1_TabPanel2_mlbGroups_imgbtnSelect");
	
	/////// Groups ////////
	
	By Btn_AddNewGroups = By.id("btnAdd");
	By Txt_GroupName = By.id("txtName");
	By AvailableRights = By.xpath("//*[@id='ucMultiSelectListBox_lbUnSelectedItems']/option[14]");
	By MoveRightArrowG = By.xpath("//*[@id='ucMultiSelectListBox_imgbtnSelect']");
	By Btn_SaveG = By.id("Save");
	
	///EDIT//
	
	By Slc_Office = By.xpath("//*[@id='lbOffices']/option[27]");
	By Slc_Group = By.xpath(".//*[@id='lbGroups']/option[2]");
	By Tab_EditG = By.id("btnEdit");
	By Slc_AssihnedRights = By.xpath("//*[@id='ucMultiSelectListBox_lbSelectedItems']/option");
	By MoveLeftArrowG = By.xpath("//*[@id='ucMultiSelectListBox_imgbtnUnSelect']");
	
	////// Delete ////////////
	
	By txt_searchUser = By.xpath("//*[@id='txtSearch']");
	By Slc_NewUser = By.xpath("//*[@id='lbUsers']/option");
	
	/////ChangeMyPassword /////
	
	By Tab_ChangePassword = By.xpath("//*[@id='menuSecurity']/a[4]");
	By txt_currentPassword = By.id("txtCurrPwd");
	By txt_newPassword = By.id("txtNewPwd");
	By txt_confirmpwd = By.id("txtRNewPwd");
	
	//////////////////////////////////////////// PROVIDER //////////////////////////////////////////////////
	
	By TAB_PROVIDER = By.xpath("//*[@id='menuSetup']/a[6]/span[1]");
	By TAB_PROVIDER_SETUP = By.xpath("//*[@id='menuProviders']/a[1]");
	
	By Btn_addNewProvider = By.id("btnAdd");
	By txt_ShortID = By.id("txtShortID");
	By txt_LastName = By.id("txtLname");
	By txt_FirstNmae = By.id("txtFname");
	By txt_Address = By.id("txtAddress");
	By txt_city = By.id("txtCity");
	By txt_zipcode = By.id("txtZip_ZipCode");
	By txt_Phone = By.xpath("//*[@id='txtPhone_PhoneNumber_text']");
	By txt_LicNo = By.id("txtLicenseNum");
	By txt_DEAno = By.id("txtDEAId");
	By txt_TAXID = By.id("txtTaxID");
	By Btn_InsID = By.id("btnNext");
	By Btn_CarrierLogIn = By.id("btnNext");
	By txt_website = By.id("tbWebsite");
	By Btn_worksAtP = By.id("btnNext");
	By Btn_routingSlip = By.id("btnNext");
	
	/// edit ///
	
	///delete ///
		By txt_searchP = By.xpath("//*[@id='txtSearch']");
		By slc_Provider = By.xpath("//*[@id='lbSearchResults']/option");
	
	////// provider per office settings ////
	
	By TAB_PROVIDER_perOFFICE_Settings = By.xpath("//*[@id='menuProviders']/a[2]");
	By txt_productionByGoalsTueseday = By.id("ts1_TabPanel1_txtFebGoal_text");
	By panel_Holiday = By.id("__tab_ts1_TabPanel3");
	By txt_dateHoliday = By.xpath("//*[@id='ts1_TabPanel3_txtFromDateHoliday']");
	By txt_descriptionP = By.id("ts1_TabPanel3_txtDescr");
	
	
	
	
	//////////////////////////////////////////// INSURANCE ///////////////////////////////////////////////////////
	
	By TAB_INSURANCE = By.xpath("//*[@id='menuSetup']/a[7]/span[1]");
	By TAB_InsPLAN = By.xpath("//*[@id='menuSetupInsurance']/a[1]");
	
	/////// INS PLan ////
	
	By Tab_AddNewIns = By.id("btnAdd");
	By Slc_Type = By.id("ddlPlanType");
	By Btn_carrierSearch = By.xpath("//*[@id='Table5']/tbody/tr[6]/td[2]/table/tbody/tr[1]/td/input[2]");
	By txt_search = By.id("txtSearchCarr");
	By slc_carrier = By.xpath("//*[@id='lstCarrier']/option");
	By slc_ok = By.xpath("//*[@id='btnModalC']");
	
	By Btn_EmployerSearch = By.xpath("//*[@id='Table5']/tbody/tr[7]/td[2]/table/tbody/tr[1]/td/input[1]");
	By txt_searchE = By.id("txtSearchCarr");
	By slc_emp = By.xpath("//*[@id='lstCarrier']/option");
	By slc_okE = By.xpath("//*[@id='btnModalC']");
	
	By txt_GroupNo = By.id("txtGroupNum");
	By slc_feesToprint = By.id("ddlFeeScheduleToPrint");
	By slc_ClaimOption = By.id("ddlPrintOptions");
	By Btn_Benefits = By.id("btnNext");
	By txt_familydeductible = By.id("txtFamilyDeductible_text");
	By Btn_coverage = By.id("btnNext");
	By Btn_feeSched = By.id("btnNext");
	By Btn_InsLimitation = By.id("btnNext");
	
	By txt_searchAll = By.id("txtSearch");
	By Btn_search = By.id("btnSearch");
	By slc_Carrier = By.xpath("//*[@id='dgSearch_ctl04_hlnkGroupNum']");
	By Btn_EditPlanIno = By.xpath("//*[@id='btnEdit']");
	By slc_networkType = By.id("ts1_TabPanel1_ddlNetworkType");
	By panel_benefits = By.id("__tab_ts1_TabPanel2");
	By chk_lifetimeOrthoBenefits = By.id("ts1_TabPanel2_chkLifetime");
	By panel_cvg = By.id("__tab_ts1_TabPanel3");
	By panel_limits = By.id("__tab_ts1_TabPanel4");
	
	By Btn_printPlan = By.id("btnPrintPlan");
	By Btn_DeletePlan = By.id("btnDelete");
	
	
	//////////// custom coverage /////////

	By TAB_CustomCvg= By.xpath("//*[@id='menuSetupInsurance']/a[2]");
	
	
	
	///////////// dental/medical carrier ////////////////
	
	By TAB_DentalCarrier= By.xpath("//*[@id='menuSetupInsurance']/a[3]");
	By TAB_medialcarrier= By.xpath("//*[@id='menuSetupInsurance']/a[4]");
	By TAB_employer= By.xpath("//*[@id='menuSetupInsurance']/a[5]");
	By Btn_addNewCarrier = By.id("btnAdd");
	By txt_name = By.id("txtName");
	By txt_address = By.id("txtAddress");
	By txt_cityD = By.id("txtCity");
	By txt_zip = By.id("txtZip_ZipCode");
	
	///edit///
	By slc_DentalCarrier = By.xpath("//*[@id='lbCarriers']/option[16]");
	By slc_MedicalCarrier = By.xpath("//*[@id='lbCarriers']/option[6]");
	By slc_Employer = By.xpath("//*[@id='lbEmployers']/option[5]");
	//*[@id='lbCarriers']/option[2]
	By txt_phoneD = By.xpath("//*[@id='txtPhone_PhoneNumber_text']");
	
	
	///delete ///

	
//////////////////////////////////////////// REFERRALS /////////////////////////////////////////////////////////
	
	By TAB_REFERRALS = By.xpath("//*[@id='menuSetup']/a[8]/span[1]");
	By TAB_ReferralsSetup = By.xpath("//*[@id='menuReferrals']/a[1]");
	By Btn_addNewReferrals = By.id("btnAdd");
	By slc_type = By.xpath("//*[@id='ddlType2']");
	By txt_FnameR = By.xpath("//*[@id='txtLName']");
	By txt_LnameR = By.xpath("//*[@id='txtFname']");

	By txt_addressR = By.id("txtAddress");
	By txt_cityR = By.id("txtCity");
	By txt_zipR = By.id("txtZip_ZipCode");
	
	By Btn_Demography = By.id("btnNext");
	
	// edit //
	
	By panel_Demography = By.xpath("//*[@id='__tab_ts1_TabPanel2']");
	By txt_FvtSports = By.xpath("//*[@id='ts1_TabPanel2_datagrid1_ctl05_txtData']");
	
	By Btn_DeleteR = By.id("btnDelete2");
	
	By TAB_CustomDemo = By.xpath("//*[@id='menuReferrals']/a[2]");
	
	///////////////////////////// PROCEDURE CODES ////////////////////////////
	
	By TAB_PROCEDURE_CODES = By.xpath("//*[@id='menuSetup']/a[9]/span[1]");
	By TAB_ProCodes = By.xpath("//*[@id='menuProcCodes']/a[1]");
	
	By Btn_addNewPC = By.id("btnAdd");
	By txt_Descri = By.id("txtDescr");
	By txt_Code = By.id("txtCode");
	
	/// edit //
	
	By Chk_toothNo = By.xpath("//*[@id='chkThNo']");
	By Panel_feeSched = By.xpath("//*[@id='__tab_ts1_TabPanel1']");
	By Txt_EditFees = By.xpath("//*[@id='Datagrid2__ctl2_txtPatAmt']");
	
	//// Explosion Code ////
	
	By TAB_ExplosionCodes = By.xpath("//*[@id='menuProcCodes']/a[2]");
	By Btn_addNewC = By.id("btnAdd");
	By txt_Explosiondesc = By.id("txtDesc");
	By txt_ExplosionShortdesc = By.id("txtCode");
	By Chk_DefaultToothAll = By.xpath("//*[@id='chkSameTooth']");
	By Slc_ProcCategory = By.xpath("//*[@id='lbAllProcs']/option[4]");
	By Btn_Add = By.id("btnAdd");
	
	//////////////////////////////////////////////// Fee Schedule ////////////////////////////////////////////////////////
	
	By TAB_FEE_SCHEDULE = By.xpath("//*[@id='menuSetup']/a[10]/span[1]");
	By TAB_FeeSchdSetup = By.xpath("//*[@id='menuSetupFeeSchedules']/a[1]");
	
	By Btn_AddNewSched = By.xpath("//*[@id='ts1_Panel1_btnAddSchedule']");
	By Txt_name = By.id("txtDesc");
	By Btn_EditSched = By.xpath("//*[@id='ts1_Panel1_btnEditCodeFees']");
	By Btn_DeleteSched = By.xpath("//*[@id='ts1_Panel1_btnDeleteSchedule']");
	By Panel_ViewByCodes = By.xpath("//*[@id='__tab_ts1_Panel2']");
	By Btn_EditFees = By.xpath("//*[@id='ts1_Panel2_btnEditScheduleFees']");
	By txt_addFees = By.id("Datagrid2__ctl10_txtPatAmt");
	
	/////////////////////////////////////////////////// payment/adjustment type //////////////////////////////////////////
	
	By TAB_PAY_ADJTYPE = By.xpath("//*[@id='menuSetup']/a[18]");
	
	By Btn_addNewType = By.id("btnAdd");
	By txt_code = By.id("txtUserCode");
	By txt_des = By.id("txtDescr");
	
	
	
}
