package com.denticon.automationSQA.pom;

import org.openqa.selenium.By;

public interface ITransaction {
	
	By TAB_TRANSACTIONS=By.id("MenuBar_aMenuTransactions"); 
	By TAB_TreatmentPlan=By.linkText("Treatment Plan"); 
	By TAB_TransactionEntry = By.linkText("Transaction Entry");
	By TAB_PreAuthorizationList = By.linkText("Pre-Authorization List");
	By TAB_InsurancePayment = By.linkText("Insurance Payment");
	By TAB_BatchPatientPayment = By.linkText("Batch Patient Payment");
	By BTN_implantService = By.id("AddProcedure_cmdImplant");
	By BTN_periodontics = By.id("AddProcedure_cmdPeriodontics");
	By BTN_restorative = By.id("AddProcedure_cmdRestorative");
	By BTN_diagnostic = By.id("AddProcedure_cmdDiagnostics");
	By BTN_maxilloProsth = By.id("AddProcedure_cmdMaxilloProsth");
	By BTN_prothsFixed = By.id("AddProcedure_cmdProsthFixed");
	By BTN_Orthoddontics = By.id("AddProcedure_cmdOrthodontics");
	By BTN_Other = By.id("AddProcedure_cmdAllDent");
	By BTN_Preventive = By.id("AddProcedure_cmdPreventive");
	By BTN_Endodontics = By.id("AddProcedure_cmdEndodontics");
	By BTN_ProthsRemov = By.id("AddProcedure_cmdProsth");
	By BTN_OralSurgery = By.id("AddProcedure_cmdOralSurgery");
	By BTN_AdjunctServ = By.id("AddProcedure_cmdAdjunctServ");
	By BTN_AllMedical = By.id("AddProcedure_cmdAllMed");
	
	
	By BTN_Discount = By.id("btnDiscount");
	By TXT_DiscountPercentage = By.id("txtDisPct_text");
	By BTN_ApplyDiscount = By.id("btnApplyDis");
	By BTN_PostToLedger = By.id("btnPstLedger");
	//AddProcedure_cmdAllMed
	
	By TXT_ProcedureCode = By.id("AddProcedure_txtADACode");
	
	By TXT_UserCode = By.id("AddProcedure_txtShortDescr");
	By FRM_ToothSurfacePopup = By.id("ifrThSurf");
	String procedureFromProcedureTableGenericXpath = "//table[@id='AddProcedure_tblProcs']//tr[2]//td";
	By ROW_ProcedureFromProcedureTable= By.xpath(procedureFromProcedureTableGenericXpath);
	By ROW_AmalgamOneSurfacePrimary = By.xpath("//table[@id='AddProcedure_tblProcs']//tr//td[text()='D2140A']");
	By BTN_ToothNumber = By.id("btntno1");
	By LNK_ToothNumberA = By.xpath("//table[@id='tblValidTNos']//td[@ustno='A']");
	By TXT_ToothNumber=By.id("th1");
	By TXT_Quadrant=By.id("quad1");
	By BTN_SelectQuadrant= By.id("btnQuad1");
	By LNK_UpperLeftQuadrant = By.id("quadUL");
	By TXT_Surfaces =By.id("chkMesial");
	By BTN_selectToothNumber=By.id("btntno1");
	By LNK_selectToothA= By.xpath("//table[@id='tblValidTNos']//td[@ustno='A']");
	By BTN_saveToothNumber = By.id("cmdAddThSurf");
	By BTN_selectSurfact= By.id("btnsurf1");
	By LNK_selectMesialSurface= By.id("chkMesial");
	By ROWS_preexistingTreatment = By.xpath("//table[@id='dgTPlanctl0']//tbody/tr");
	
	By TITLE_tranactionEntryPage = By.xpath("//td[@class='pagetitle']//span[text()='Transactions Entry']");
	By BTN_changeCouncelorOption = By.id("btnCounselor");
	By DRD_changeCouncelorDropDown = By.id("cmbUser");
	By BTN_changeCouncelor = By.id("btnChangeCoun");
	
	By BTN_changeProviderOption = By.id("btnProvider");
	By DRD_changeProviderDropDown = By.id("cmbPrdr");
	By BTN_changeProvider = By.id("btnChangePrdr");
	By BTN_deleteTreatment = By.id("btnDelete");
	
	By BTN_showPlanOption = By.id("btnShowPlan");
	By TXT_showPlanId= By.id("txtShowPlanID");
	By BTN_showPlan = By.id("btnShowPlanID");
	
	By BTN_changeStatusOption = By.id("btnChgStatus");
	By RDO_changeStatusHold = By.id("rdoHold");
	By BTN_changeStatus = By.id("btnChangeStatus");
	
	//btnChgPlanID txtChangePlanID txtChangePhaseID txtChangeOrderID btnChangePlanID txtCopyPlanID btnCopyPlan
	
	By BTN_changePlanIdOption = By.id("btnChgPlanID");
	By TXT_changePlanID = By.id("txtChangePlanID");
	By TXT_changePhaseID = By.id("txtChangePhaseID");
	By TXT_changeOrderID = By.id("txtChangeOrderID");
	By TXT_copyPlanID = By.id("txtCopyPlanID");
	By BTN_changePlanId = By.id("btnChangePlanID");
	By BTN_copyPlan = By.id("btnCopyPlan");
	
	By BTN_preAuthOption = By.id("btnPreAuth");
	
	//////////Transaction Entry///////////////////
	By ROWS_preexistingTreatmentTransactionEntry = By.xpath("//table[@id='dgTran_ctl00']//tbody/tr");
	By TXT_TE_ProcedureCode = By.id("ts_tbPnlAddProc_AddProcedure_txtADACode");
	By BTN_TE_ImplantService = By.id("ts_tbPnlAddProc_AddProcedure_cmdImplant");
	By BTN_TE_Diagnostics = By.id("ts_tbPnlAddProc_AddProcedure_cmdDiagnostics");
	By BTN_TE_DiagnosticsPopup = By.id("btnSave");
	By BTN_TE_Preventive = By.id("ts_tbPnlAddProc_AddProcedure_cmdPreventive");
	By BTN_TE_PreventiveSave = By.id("btnSave");
	By BTN_TE_Restorative = By.id("ts_tbPnlAddProc_AddProcedure_cmdRestorative");
	By BTN_TE_Endodontics = By.id("ts_tbPnlAddProc_AddProcedure_cmdEndodontics");
	By BTN_TE_Periodontics = By.id("ts_tbPnlAddProc_AddProcedure_cmdPeriodontics");
	By BTN_TE_ProsthRemove = By.id("ts_tbPnlAddProc_AddProcedure_cmdProsth");
	By BTN_TE_MaxilloProsth = By.id("ts_tbPnlAddProc_AddProcedure_cmdMaxilloProsth");
	By BTN_TE_ProsthFixed = By.id("ts_tbPnlAddProc_AddProcedure_cmdProsthFixed");
	By BTN_TE_OralSurgery = By.id("ts_tbPnlAddProc_AddProcedure_cmdOralSurgery");
	By BTN_TE_Orthodontics = By.id("ts_tbPnlAddProc_AddProcedure_cmdOrthodontics");
	By BTN_TE_AdjuntServ = By.id("ts_tbPnlAddProc_AddProcedure_cmdAdjunctServ");
	By BTN_TE_Other = By.id("ts_tbPnlAddProc_AddProcedure_cmdAllDent");
	By BTN_TE_AllMed = By.id("ts_tbPnlAddProc_AddProcedure_cmdAllMed");
	By BTN_TE_AllMedSave = By.id("btnSave");
	String TE_procedureFromProcedureTable = "//table[@id='ts_tbPnlAddProc_AddProcedure_tblProcs']//tr[2]//td";
	By ROW_TE_ProcedureFromProcedureTable= By.xpath(TE_procedureFromProcedureTable);
	By ROW_TE_AmalgamOneSurfacePrimary = By.xpath("//table[@id='ts_tbPnlAddProc_AddProcedure_tblProcs']//tr//td[text()='D2140A']");
	By TXT_TE_UserCode = By.id("ts_tbPnlAddProc_AddProcedure_txtShortDescr");
	By TXT_TE_Description = By.id("ts_tbPnlAddProc_AddProcedure_txtDescr");
	String TE_LastRow = "//table[@id='dgTran_ctl00']/tbody/tr[lastRow]";
	
	By TITL_EditTreatment = By.xpath("//span[contains(text(),'Edit Treatment')]");
	By TITL_TE_LedgerPage = By.xpath("//span[contains(text(),'Account Ledger')]");
	By BTN_TE_DeleteTreament = By.id("btnDel");
	By BTN_TE_Ledger = By.id("btnLedger");
	By BTN_TE_CreateClaim = By.id("btnPrintClaims");
	By BTN_TE_DirectPRint = By.id("btnDirectPrint");
	By BTN_TE_DeleteClaim =By.id("btnDelete");
	By TITL_TE_ClaimPage= By.xpath("//span[contains(text(),'Primary Dental Insurance Claim')]");
	
	
	//Pre-Authorization
	By LNK_PreAuthDate = By.xpath("//table[@id='dgPreAuth']/tbody/tr/td/a");
	By TITL_PreAuthPage = By.xpath("//span[contains(text(),'Primary Dental Pre-Authorization Detail')]");
	
	//Insurance Payment
	By LNK_InsurancePaymentDate = By.xpath("//table[@id='dgPatClaims']/tbody/tr/td/a");
	By CHK_TreamentForClaims = By.id("dgPatClaimDetails__ctl1_chkCheckAll");
	By BTN_InsuranceApply = By.id("btnApply");
	
	//Batch Payment
	By RDO_Batch_FirstName = By.id("rdoFirstName");
	By TXT_search =By.id("txtSearchPat1");
	By BTN_searchPatient = By.id("btnSearchPat");
	By LST_firstPatient = By.xpath("//table[@id='dgSearchPat']/tbody/tr[1]/td[1]");
	By LST_payment = By.xpath("//td[contains(text(),'PP005')]");
	By SEL_procedureToPost = By.xpath("//table[@id='PaymentPROC_tblProcedures']/tbody/tr/td/input[1]");
	By BTN_BatchPaymentApply = By.id("PaymentPROC_btnApply");
	
	//Batch Insurance
	
	By SEL_Carrier = By.id("CarriersDental");
	By LNK_Date = By.xpath("//table[@id='dgPatClaims']/tbody/tr[2]/td[1]");
	//?check treatment for above selected claims ???
	

}
