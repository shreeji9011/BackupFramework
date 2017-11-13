package com.denticon.automationSQA.pom;

import org.openqa.selenium.By;

public interface IUtilities {

	By TAB_UTILITIES = By.xpath("//*[@id='MenuBar_aMenuUtilities']"); 
	
	By TAB_BatchClaimP = By.linkText("Batch Claims Processing");
	By TransmitClaim = By.id("btnTransmitClaim");
	By PrintU = By.id("btnPreview");
	By UpdateAsSent = By.id("btnPrint");
	

	//////////////////////////////////////////////////
	
	By Tab_GenerateContractCharges = By.xpath("//*[@id='menuUtilities']/a[5]/span[1]");
	By GenerateOrthoPaymentPlanCharges = By.xpath("//*[@id='menuContract']/a[1]");
	By PostPatientOrthoPeriodic = By.id("btnGenPatOrtho");
	By PostInsOrthoCharges = By.id("btnGenInsOrtho");
	By PostOrthoSecodInsCharges = By.id("btnGenSecInsOrtho");
	By Chk_PatientOrthoList = By.id("dgPatOrthoPlan_ctl00_ctl02_ctl00_chkPatAll");
	By Chk_PatInsOrthoList = By.id("dgInsOrthoPlan_ctl00_ctl02_ctl00_chkInsAll");
	By Chk_PatSecInsOrthoList = By.id("dgSecInsOrthoPlan_ctl00_ctl02_ctl00_chkSecInsAll");
	
	
	///////////////////////////////////////////
	
	By GenerateRegularPaymentPlan = By.xpath("//*[@id='menuContract']/a[2]");
	By Chk_PatientPaymentPlan = By.id("dgRegPlan_ctl00_ctl02_ctl00_chkAll");
	By PostPeriodicCharges = By.id("btnGenerate");
	
	
	///////////////////////////////////////
	
	By Tab_InsProc = By.xpath("//*[@id='menuUtilities']/a[6]/span[1]");
	By Tab_ConsolidateDuplicateInsPlans = By.xpath("//*[@id='menuInsProc']/a[1]");
	By Txt_OPID = By.id("oldInsplanid");
	By Txt_NewPID = By.id("newInsplanid");
	By ShowPlanDetails = By.id("btnReplace");
	
	/////////////////////////////
	
	By Tab_ConsolidateDuplicateCarrrier = By.xpath("//*[@id='menuInsProc']/a[2]");
	
	
	
	//////////////////////////////
	
	By Tab_NewPlanAssignment = By.xpath("//*[@id='menuInsProc']/a[3]");
	By ShowPlanDetailsForNewPlanAssignment = By.id("btnOldSearch");
	
	//////////////////////////
	
	By Tab_ReplaceProcCode = By.xpath("//*[@id='menuInsProc']/a[4]");
	By Txt_OProcedureCode = By.id("oldCode");
	By Txt_NewProcedureCode  = By.id("newCode");
	By tab_Compare = By.xpath("//*[@id='btnReplace']");
	
	
	//////////////////////////////////////
	
	By Tab_CoverageCategoryCopy = By.xpath("//*[@id='menuInsProc']/a[5]");
	By Slc_test = By.xpath("//*[@id='ddlFromCategory']");
	By Btn_Copy = By.id("btnCopy");
	
	
	/////////////////////////////////////
	
	By Tab_CopyMoveChangePGIDSetupData = By.xpath("//*[@id='menuUtilities']/a[7]/span[1]");
	By Tab_CopyLetters = By.xpath("//*[@id='menuApptProv']/a[1]");
	By Btn_CopyLettersToAllOffices = By.id("btnCopy");
	
	///////////////////////////////
	
	By Tab_ChangeFutureAppointmentsPatientsTxByProvider = By.xpath("//*[@id='menuApptProv']/a[2]");
	By Clk_scrProvider = By.id("ddlFromProvider");
	
	///////////////////////////////
	
	By Tab_Conversion_Mapping = By.xpath("//*[@id='menuApptProv']/a[3]");
	
	
//////////////////////////////////////
	
	By TAB_FeeScheduleExcelTemplate = By.xpath("//*[@id='menuUtilities']/a[11]");
	By Btn_Download = By.id("btnPrint");
	
	//////////////////////////////
	
	By TAB_Transworld = By.xpath("//*[@id='menuUtilities']/a[13]");
	
	By Tab_TransWorldPortal = By.xpath("//*[@id='menuTransworld']/a[1]");
	
	By Tab_TransworldBatchSelection = By.xpath("//*[@id='menuTransworld']/a[2]");
	
	By Tab_TransworldAcountList = By.xpath("//*[@id='menuTransworld']/a[3]");
	
	
	
	///////////////////////////
	
	By TAB_DENTICONDOWNLOAD = By.xpath("//*[@id='menuUtilities']/a[15]");
	
	
	/////////////////////////
	
	By TAB_LAUNCH = By.xpath("//*[@id='menuUtilities']/a[17]/span[1]");
	
	By Tab_AppointNow = By.xpath("//*[@id='menuLaunch']/a[1]");
	
	By Tab_Dantigram = By.xpath("//*[@id='menuLaunch']/a[2]");
	
	By Tab_DentilyticsBasic = By.xpath("//*[@id='menuLaunch']/a[3]");
	
	By Tab_DentilyticsEnterprise = By.xpath("//*[@id='menuLaunch']/a[4]");
	
	By Tab_DentirayClassic = By.xpath("//*[@id='menuLaunch']/a[5]");
	
	By Tab_ApteryxXVWebImagine = By.xpath("//*[@id='menuLaunch']/a[6]");
			
	By Tab_LaunchEvaSoft = By.xpath("//*[@id='menuLaunch']/a[7]");
	
	By Tab_TaskManager = By.xpath("//*[@id='menuLaunch']/a[9]");
	
	
	
	
	
}
