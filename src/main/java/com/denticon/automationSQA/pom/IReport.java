package com.denticon.automationSQA.pom;

import org.openqa.selenium.By;

public interface IReport {
	
	  By TAB_REPORT=By.id("MenuBar_aMenuReports"); 
	  
	  ////Daily Report ///
	  
	  By LNK_DAILY_REPORT=By.xpath(".//*[@id='menuReports']/a[1]"); 
	  By RBTN_EXECUTIVE_SUMMARY=By.id("rbExecSumm"); 
	  By ICON_START_DATE=By.id("imgStartDt"); 
	  By ICON_END_DATE=By.id("imgStartDt"); 
	  By BTN_PRINT_PREVIEW=By.id("btnPrint"); 
	  By LST_START_DATE=By.xpath(".//*[contains(@id, 'CalendarExtender2')]"); 
	  By LST_END_DATE=By.xpath(".//*[contains(@id, 'CalendarExtender3')]"); 
	  By PDF_REPORT_EXECUTION_SUMMARY=By.xpath("//*[@id='pageContainer1']/xhtml:div[2]/xhtml:div[2]"); 
	
	  By TAB_PEGBOARDREPORT=By.xpath("//*[@id='rbPegBoard']");
	  By PDF_REPORT_PEG_BOARD=By.xpath("//*[@id='viewer']/xhtml:div/xhtml:div[2]/xhtml:div[18]");
	  
	  By TAB_DailyJournal=By.xpath("//*[@id='rbDlyJourD']");
	  By PDF_DailyJournal=By.xpath("//*[@id='viewer']/xhtml:div/xhtml:div[2]/xhtml:div[5]");
	  
	  By Tab_DailySummary = By.xpath("//*[@id='rbDlyJourS']");
	  By PDF_DailyS = By.xpath("//*[@id='viewer']/xhtml:div/xhtml:div[2]/xhtml:div[5]");
	  
	  By Lnk_DailyJournalByProviderDetail = By.xpath("//*[@id='rbDlyJourProvD']");
	  By PDF_DailyJournalByProviderDetail = By.xpath("//*[@id='viewer']/xhtml:div/xhtml:div[2]/xhtml:div[7]");
	  
	  By Lnk_DailyJournalByProviderSummary = By.xpath("//*[@id='rbDlyJourProvS']");
	  By PDF_DailyJournalByProviderSummary = By.xpath("//*[@id='viewer']/xhtml:div/xhtml:div[2]/xhtml:div[6]");
	  
	  By Lnk_DailyJournalLandscape = By.xpath("//*[@id='rbDlyJourDL']");
	  By PDF_DailyJournalLandscape = By.xpath("//*[@id='viewer']/xhtml:div[1]/xhtml:div[2]/xhtml:div[6]");
	  
	  By Lnk_DepositSlip = By.xpath("//*[@id='rbDepSlip']");
	  By PDF_DepositSlip = By.xpath("//*[@id='viewer']/xhtml:div/xhtml:div[2]/xhtml:div[2]");
	  
	  By Lnk_DepositSlipCC = By.xpath("//*[@id='rbDepSlipCC']");
	  By PDF_DepositSlipCC = By.xpath("//*[@id='viewer']/xhtml:div/xhtml:div[2]/xhtml:div[2]");
	  
	  By Lnk_DepositSlipCareC = By.xpath("//*[@id='rbDlyDepCrC']");
	  By PDF_DepositSlipCareC = By.xpath("//*[@id='viewer']/xhtml:div/xhtml:div[2]/xhtml:div[2]");
	  
	  By Lnk_DepositSlipDD = By.xpath("//*[@id='rbDlyDepDD']");
	  By PDF_DepositSlipDD = By.xpath("//*[@id='viewer']/xhtml:div/xhtml:div[2]/xhtml:div[2]");
	  
	  By Lnk_AppointmentConfirmationCallList = By.xpath("//*[@id='rbApptConfCall']");
	  By PDF_AppointmentConfirmationCallList = By.xpath("//*[@id='viewer']/xhtml:div/xhtml:div[2]/xhtml:div[2]");
	  
	  By Lnk_AppointmentPullChartList = By.xpath("//*[@id='rbAptPullChart']");
	  By PDF_AppointmentPullChartList = By.xpath("//*[@id='viewer']/xhtml:div/xhtml:div[2]/xhtml:div[2]");
	  
	  By Lnk_MissedAppointmentList = By.xpath("//*[@id='rbMissAppt']");
	  By PDF_MissedAppointmentList = By.xpath("//*[@id='viewer']/xhtml:div/xhtml:div[2]/xhtml:div[2]");
	 
	  By Lnk_DailyRoutingSlip = By.xpath("//*[@id='rbRouteSlip']");
	  By PDF_DailyRoutingSlip = By.xpath("//*[@id='viewer']/xhtml:div/xhtml:div[2]/xhtml:div[227]");
	  
	  By Lnk_RoutingSlipPrinted = By.xpath("//*[@id='rbRouteSerial']");
	  By PDF_RoutingSlipPrinted = By.xpath("//*[@id='viewer']/xhtml:div/xhtml:div[2]/xhtml:div[1]");
	  
	  By Lnk_ESbyProvider = By.xpath("//*[@id='rbExecSummProv']");
	  By PDF_ESbyProvider = By.xpath("//*[@id='viewer']/xhtml:div/xhtml:div[2]/xhtml:div[2]");
	  
	  By Lnk_DailyClaimPrintedByDetail = By.xpath("//*[@id='rbDlyClaimCarrD']");
	  By PDF_DailyClaimPrintedByDetail = By.xpath("//*[@id='viewer']/xhtml:div/xhtml:div[2]/xhtml:div[2]");
	  
	  By Lnk_DailyClaimPrintedBySummary = By.xpath("//*[@id='rbDlyClaimCarrS']");
	  By PDF_DailyClaimPrintedBySummary = By.xpath("//*[@id='viewer']/xhtml:div/xhtml:div[2]/xhtml:div[2]");
	  
	  By Lnk_DailyClaimsPrintedbyCarrierDetail = By.xpath("//*[@id='rbDlyClaimCarrD']");
	  By PDF_DailyClaimsPrintedbyCarrierDetail = By.xpath("//*[@id='pageContainer1']/xhtml:div[2]/xhtml:div[2]");
	  
	  By Lnk_DailyClaimsPrintedbyCarrierSummary = By.xpath("//*[@id='rbDlyClaimCarrS']");
	  By PDF_DailyClaimsPrintedbyCarrierSummary = By.xpath("//*[@id='pageContainer1']/xhtml:div[2]/xhtml:div[2]]");
	  
	  By Lnk_DailyCollectionbyProviderDetail = By.xpath("//*[@id='rbDlyCollProvD']");
	  By PDF_DailyCollectionbyProviderDetail = By.xpath("//*[@id='pageContainer1']/xhtml:div[2]/xhtml:div[5]");
	  
	  By Lnk_DailyCollectionbyProviderSummary = By.xpath("//*[@id='rbDlyCollProvS']");
	  By PDF_DailyCollectionbyProviderSummary = By.xpath("//*[@id='pageContainer1']/xhtml:div[2]/xhtml:div[2]");
	  
	  By Lnk_DailyCollectionbyCarrier = By.xpath("//*[@id='rbDlyCollCarr']");
	  By PDF_DailyCollectionbyCarrier = By.xpath("//*[@id='pageContainer1']/xhtml:div[2]/xhtml:div[2]");
	  
	  By Lnk_DailyProductionbyProviderDetail = By.xpath("//*[@id='rbProdPrdrD']");
	  By PDF_DailyProductionbyProviderDetail = By.xpath("//*[@id='pageContainer1']/xhtml:div[2]/xhtml:div[3]");
	  
	  By Lnk_DailyProductionbyProviderSummary = By.xpath("//*[@id='rbProdPrdrS']");
	  By PDF_DailyProductionbyProviderSummary = By.xpath("//*[@id='pageContainer1']/xhtml:div[2]/xhtml:div[2]");

	  By Lnk_DailyScheduledProduction = By.xpath("//*[@id='rbDlyScheProd']");
	  By PDF_DailyScheduledProduction = By.xpath("//*[@id='pageContainer1']/xhtml:div[2]/xhtml:div[2]");	  
	  
	  By Lnk_ExecutiveDaySheet = By.xpath("//*[@id='rbDlyExecDaySheet']");
	  By PDF_ExecutiveDaySheet = By.xpath("//*[@id='pageContainer1']/xhtml:div[2]/xhtml:div[1]");
	  
	  By Lnk_PatientProgressNotes  = By.xpath("//*[@id='rbPatProgNotes']");
	  By PDF_PatientProgressNotes = By.xpath("//*[@id='pageContainer1']/xhtml:div[2]/xhtml:div[1]");
	  
	  By Lnk_UnsignedProgressNotesReport = By.xpath("//*[@id='rbUnsignPrgNotes']");
	  By PDF_UnsignedProgressNotesReport = By.xpath("//*[@id='pageContainer1']/xhtml:div[2]/xhtml:div[1]");
	  
	  By Lnk_MissingProgressNotes = By.xpath("//*[@id='rbMissProgNotes']");
	  By PDF_MissingProgressNotes = By.xpath("//*[@id='pageContainer1']/xhtml:div[2]/xhtml:div[2]");
	  
	  By Lnk_DailyAuditReport = By.xpath("//*[@id='rbDlyAuditRpt']");
	  By PDF_DailyAuditReport  = By.xpath("//*[@id='pageContainer1']/xhtml:div[2]/xhtml:div[2]");
	  
	  
	  /////Ledger Report  ////
	  
	  By LNK_LEDGER_REPORT=By.xpath(".//*[@id='menuReports']/a[2]");
	  
	  By Lnk_AccountLedger = By.xpath("//*[@id='rbRPLedger']");
	  By PDF_AccountL = By.xpath("//*[@id='pageContainer1']/xhtml:div[2]/xhtml:div[55]");
	  
	  By Lnk_PatientLedger = By.xpath("//*[@id='rbPatLedger']");
	  By PDF_PatientL = By.xpath("//*[@id='pageContainer1']/xhtml:div[2]/xhtml:div[2]");
	  
	  By Lnk_WalkutReport = By.xpath("//*[@id='rbWalkout']");
	  By PDF_WalkoutReport = By.xpath("//*[@id='pageContainer1']/xhtml:div[2]/xhtml:div[49]");
	  
	  By Lnk_SuperBill = By.id("rbSuperbill");
	  By PDF_SuperBill = By.xpath("//*[@id='pageContainer1']/xhtml:div[2]/xhtml:div[3]");
	  
	  By Lnk_AccountAllocation = By.id("rbAccAllocRpt");
	  By PDF_AccountAllocation = By.xpath("//*[@id='pageContainer1']/xhtml:div[2]/xhtml:div[1]");
	  
	  
	  ///// Management Report ///////
	  
	  By LNK_MANAGEMENT_REPORT=By.xpath(".//*[@id='menuReports']/a[3]");
	  
	  By Lnk_AgingDetail = By.id("rbAgeD");
	  By PDF_AgingDetail = By.xpath("//*[@id='pageContainer1']/xhtml:div[2]/xhtml:div[2]");
	  
	  By Lnk_AgingSummary = By.id("rbAgeS");
	  By PDF_AgingSummary = By.xpath("//*[@id='pageContainer1']/xhtml:div[2]/xhtml:div[2]");
	  
	  By Lnk_AgingByProviderDetail = By.id("rbAgePrdrD");
	  By PDF_AgingByProviderDetail = By.xpath("//*[@id='pageContainer1']/xhtml:div[2]/xhtml:div[2]");
	
	  By Lnk_AgingByProviderSummary = By.id("rbAgePrdrS");
	  
	  By Lnk_AgingByHomeOffice = By.id("rbARHomeOffice");
	  
	  By Lnk_AgingbyHomeOfficewithBalanceStatus = By.id("rbARHomeOfficeBalStatus");
	  
	  By Lnk_AgingwithRemContractBal = By.id("rbAgeCont");
	  
	  By Lnk_AgingwithRemContractBalbyHomeOffice = By.id("rbARHomeOffCont");
	  
	  By Lnk_TreatmentPlanAnalysis = By.id("rbTxPlanAnay");
	  
	  By Lnk_AuditTrailReport = By.id("rbAudit");
	  
	  By Lnk_RegularPaymentPlanChargesReport = By.id("rbRegPlanChrgRpt");
	  
	  By Lnk_CollectionByCode = By.id("rbCollCds");
	  
	  By Lnk_ProductionByCode = By.id("rbProdCds");
	  
	  By Lnk_ProductionByCodeProvider = By.id("rbProdCdsPrdr");
	  
	  By Lnk_ProductionByCodeCarrier = By.id("rbProdCdsCarrier");
	  
	  By Lnk_ProductionbyProvider = By.id("rbProdPrdr");
	  
	  By Lnk_ProductionbyCategoryDetail = By.id("rbProdCateD");
	  
	  By Lnk_ProductionbyCategorySummary = By.id("rbProdCateS");
	  
	  By Lnk_ProductionAnalysisbyCategory = By.id("rbProdAnay");
	  
	  By Lnk_IncomeAllocationDetail = By.id("rbIncAllocD");
	  
	  By Lnk_IncomeAllocationSummary = By.id("rbIncAllocS");
	  
	  By Lnk_AllocationReport = By.id("rbAllocRpt");
	  
	  By Lnk_UnallocatedPaymentsAdjustmentsReport = By.id("rbUnAllocPymt");
	  
	  By Lnk_UnallocatedCopayReport = By.id("rbUncollectedCopayReport");
	  
	  /// Insurance Report /// 
	  
	  
	  
}
