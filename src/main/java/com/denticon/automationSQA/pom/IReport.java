package com.denticon.automationSQA.pom;

import org.openqa.selenium.By;

public interface IReport {
	
	  By TAB_REPORT=By.id("MenuBar_aMenuReports"); 
	  
	  ////Daily Report ///
	  
	  By LNK_DAILY_REPORT=By.xpath("//*[@id='menuReports']/a[1]"); 
	  By RBTN_EXECUTIVE_SUMMARY=By.id("rbExecSumm"); 
	  By ICON_START_DATE=By.id("imgStartDt"); 
	  By ICON_END_DATE=By.id("imgEndDt"); 
	  By BTN_PRINT_PREVIEW=By.id("btnPrint"); 
	  By LST_START_DATE=By.xpath(".//*[contains(@id,'CalendarExtender2')]"); 
	  By LST_END_DATE=By.xpath(".//*[contains(@id,'CalendarExtender3')]"); 
	  
	  By NewPatientList_START_DATE = By.cssSelector("div.ajax__calendar_day"); 
	  By NewPatientList_END_DATE = By.cssSelector("div.ajax__calendar_day"); 
	  
	  
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
	  
	  By LNK_LEDGER_REPORT=By.xpath("//*[@id='menuReports']/a[2]");
	  
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
	  
	  By LNK_MANAGEMENT_REPORT=By.xpath("//*[@id='menuReports']/a[3]");
	  
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
	  
	  
/////////////////////////	  /// Insurance Report /// 
	  
	  By LNK_Insurance_Report = By.xpath("//*[@id='menuReports']/a[4]");
	  
	  By Lnk_OutstandingClaim = By.id("rbCliamsAge");
	  
	  By Lnk_OutstandingClaimProvider = By.id("rbClaimsAgeProv");
	  
	  By Lnk_ClaimList = By.id("rbClaimsList");
	  
	  By Lnk_CapitationUtilizationDetail = By.id("rbCapUtilD");
	  
	  By Lnk_CapitationUtilizationSummary = By.id("rbCapUtilS");
	  
	  By Lnk_CapitationUtilizationProviderDetail = By.id("rbCapUtilPrdrD");
	  
	  By Lnk_CapitationUtilizationProviderDetailMID = By.id("rbCapUtilPrdrDMedID");
	  
	  By Lnk_CapitationUtilizationProviderSummary = By.id("rbCapUtilPrdrS");
	  
	  By Lnk_ProductionSummaryByCarrier = By.id("rbProdSummCarr");
	  
	  By Lnk_VBSEligibilityReport = By.id("rbVBSEligRpt");
	  
	  By Lnk_VBSEligibilityReportHold = By.id("rbVBSELigRptHold");
	  
	  By Lnk_OutstandingPreAuthorization = By.id("rbPAClaimsAge");
	  
	  By Lnk_OutstandingPreAuthorizationProvider = By.id("rbPAClaimsAgeProv");
	  
	  By Lnk_PreAuthorizationList = By.id("rbPAClaimsList");
	  
	  By Lnk_BenefitsUsed_UnusedTreatmentPlan = By.id("rbBenUsedTxPlan");
	  
	  By Lnk_BenefitsUsed_UnusedRecall = By.id("rbBenUsedRec");
	  
	  By Lnk_CapitationPayment = By.id("rbCapPay");
	  
	  By Lnk_CapitationFeeSchedule = By.id("rbCapFeeSche");
	  
	  By Lnk_Claimsnotcreated = By.id("rbClaimNotCreated");
	  
	  By Lnk_ProceduresonHold = By.id("rbProcOnHold");
	  
	  By Lnk_NewPatientsbyCarrier = By.id("rbNewPatCarr");
	  
	  //////////////// Appointment List /////// 
	  
	  By LNK_AppointmentsReports = By.linkText("Appointments Reports");
	  
	  By Lnk_ApptConfirmationCallList = By.id("rbApptConfCall");
	  
	  By Lnk_ApptCancellationList = By.id("rbApptCanc");
	  
	  By Lnk_MissedAppointmentListAL = By.id("rbMissAppt");
	  
	  By Lnk_AppointmentCallList = By.id("rbApptCallList");
	  
	  By Lnk_AppointmentDetail = By.id("rbApptDet");
	  
	  By Lnk_AppointmentDetailArchived = By.id("rbApptDetArchive");
	  
	  By Lnk_AppointmentDetailwithHomeOffice = By.id("rbApptDetHomeOff");
	  
	  By Lnk_AppointmentPullChartListAL = By.id("rbAptPullChart");
	  
	  By Lnk_AppointmentTimeStamps = By.id("rbApptTimeStampRpt");
	  
	  By Lnk_MissedAppointmentsNotMarkedAsMissed = By.id("rbMissedApptNotMarkedAsMissed");
	  
	  By Lnk_RoutingSlip = By.id("rbRouteSlip");
	  
	  By Lnk_MissingProgressNotesAL = By.id("rbMissProgNotes");
	  
	  By Lnk_NewPatientThruAppointment = By.id("rbNewPatThruAppt");
	  
	  By Lnk_LabRequiredNotSentAppointmentList = By.id("rbLabReqNotSent");
	  
	  By Lnk_LabSentNotReceivedAppointmentList = By.id("rbLabSentNotRecv");
	  
	  By Lnk_AppointmentListLab = By.id("rbApptLab");
	  
	  By Lnk_AppointmentListLabduedate = By.id("rbAptLabDue");
	  
	  By Lnk_LabCostReport = By.id("rbLabCostRpt");
	  
	  By Lnk_AppointmentsConfirmedViaVendors = By.id("rbApptConfVendorsRpt");
	  
	  
	  //////////////////////////// Treatment plan Status Report ///////////////////////////
	  
	  By LNK_TreatmentPlanReports = By.linkText("Treatment Plan Reports");
	  
	  By Lnk_TreatmentPlanProposal = By.id("rbTreatPlan");
	  
	  By Lnk_TreatmentPlanAnalysisR = By.id("rbTreatPlanAnay");
	  
	  By Lnk_TreatmentPlanStatusDetail = By.id("rbTreatStatusD");
	  
	  By Lnk_TreatmentPlanStatusSummary = By.id("rbTreatStatusS");
	  
	  By Lnk_TreatmentPlanStatusbyCodeDetail = By.id("rbTreatStatusCodeD");
	  
	  By Lnk_TreatmentPlanDetail = By.id("rbTxPlnD");
	  
	  //////// Referral Reports ///// 
	  
	  By LNK_ReferralReports = By.linkText("Referral Reports");
	  
	  By Lnk_ReferralProductionList = By.id("rbRefList");
	 
	  By Lnk_ReferralProductionListingbyZipcode = By.id("rbRefListZip");
	  
	  By Lnk_ReferralSummaryReport = By.id("rbRefSumm");
	  
	  By Lnk_ReferredOutList = By.id("rbRefOut");
	  
	  By Lnk_ReferralCountSummary = By.id("rbRefCountSumm");
	  
	  By Lnk_ReferralSourceList = By.id("rbRefSource");
	  
	  //////////// Recall Reports  ///////////////
	  
	  By LNK_RecallReports = By.linkText("Recall Reports");
	  
	  By Lnk_ProceduralRecallReport = By.id("rbProcRec");
	  
	  By Lnk_RecalldueReport = By.id("rbRecDue");
	  
	  By Lnk_ScheduledRecallReport = By.id("rbScheRec");
	  
	  By Lnk_RecallDueOverduebutNotScheduledReport = By.id("rbRecDueNotSche");
	  
	  By Lnk_PostOpReport = By.id("rbPostOp");
	  
	  
	  //////////////// Statements  ///////////////////////
	  
	  By LNK_Statements = By.linkText("Statements");
	  
	  By Lnk_UpdateStDate = By.id("btnUpdtStmtDt");
	  
	  By Lnk_PrintStatReport = By.id("btnStmtRpt");
	  
	  By Lnk_PrintStmt = By.id("btnPrint");
	  
	  By Lnk_EmailStmt = By.id("btnEmailStmt");
	  By Rtb_OnlyEmail = By.id("rbOL");
	  
	  //////////////////////////////  Lists    //////////////////////////////
	  
	  
	  ///////// Patient List ///////
	  
	  By LNK_List = By.xpath("//*[@id='menuReports']/a[10]/span[1]");
	  
	  By LNK_PatientList = By.linkText("Patient List");
	  
	  By Lnk_ActivePatientList = By.id("rbActivePat");
	  
	  By Lnk_InactivePatientList = By.id("rbInactivePat");
	  
	  By Lnk_NewPatientList = By.id("rbNewPat");
	  
	  By Lnk_NewPatientsByReferral = By.id("rbNewPatRef");
	  
	  By Lnk_NewPatientsByReferralType = By.id("rbNewPatRefType");
	  
	  By Lnk_NewPatientThruAppointmentL = By.id("rbNewPatAppt");
	  
	  By Lnk_PatientsonRegularPaymentPlan = By.id("rbPatRegPln");
	  
	  By Lnk_PatientsonOrthoPaymentPlan = By.id("rbPatOrtPln");
	  
	  By Lnk_PatientsSeenPerDay = By.id("rbPatPerDay");
	  
	  By Lnk_PatientsSeenPerDayByAge = By.id("rbPatPerDayAge");
	  
	  By Lnk_PatientsSeenbyMedicalAlerts = By.id("rbPatByMedAlert");
	  
	  By Lnk_PatientswithMedicalAlerts = By.id("rbPatWithMedAlert");
	  
	  By Lnk_PatientListAddress = By.id("rbPatAddr");
	  
	  By Lnk_UpdatePatientInsuranceConversionListByAppointment = By.id("rbUpdateInsConv");
	  
	  By Lnk_PatientsList = By.id("rbPatChart");
	  
	  By Lnk_PatientsbyPreferredProvider = By.id("rbPatPrefProv");
	  
	  By Lnk_PatientsbyLastvisit = By.id("rbLstVisit");
	  
	  By Lnk_PatientsbyPatientType = By.id("rbPatPatType");
	  
	  By Lnk_PatientsbyZipCode = By.id("rbPatZip");
	  
	  By Lnk_PatientsbyBirthdate = By.id("rbPatBirthday");
	  
	  By Lnk_PatientsListEmail = By.id("rbPatEmail");
	  
	  By Lnk_PatientsInsuranceList = By.id("rbPatInsLst");
	  
	  By Lnk_PatientNotes = By.id("rbPatNotes");
	  By Txt_SearchPatient = By.id("txtPat");
	  By Tab_Search = By.id("btnSearchPat");
	  By Slc_FirstPatient = By.xpath("//*[@id='dtOptions']/tbody/tr[1]/td[1]/span");
	  By Tab_Select = By.id("btnSelect");
	  
	  
	  
	 
	  
	  By Lnk_PatientListDetail = By.id("rbPatD");
	  
	  By Lnk_PatientsbyFeeSchedule = By.id("rbPatbyFeeSche");
	  
	  By Lnk_PatientsSeenbyZipcode = By.id("rbPatCountZip");
	  
	  By Lnk_UnInsuredPatientList = By.id("rbUninsuredPat");
	  
	  
	  ////////////////////////  ResponsibleParty List  ////////////////
	  
	  By Lnk_ResponsiblePartyList = By.xpath("//*[@id='menuList']/a[2]");
	  
	  By Lnk_RList = By.id("rbRPList");
	  
	  By Lnk_RListBalance = By.id("rbRPListBal");
	  
	  By Lnk_RListOver30 = By.id("rbRPListOvr");
	  
	  By Lnk_RListByBilling = By.id("rbRPListBillType");
	  
	  By Lnk_Rpzipcode = By.id("rbRPListZip");
	  
	  By Lnk_RListEmail = By.id("rbRPEmail");
	  
	  By Lnk_RPSenttoCollection = By.id("rbSentColl");
	  
	  By Lnk_RPSendStatementStatus = By.id("rbSendStmt");
	  
	  By Lnk_RPStatementSent = By.id("rbStmtSent");
	  
	  
	  ////////////////////////  Provider List  ////////////////
	  
	  By Lnk_ProviderListMenu = By.xpath("//*[@id='menuList']/a[3]");
	  
	  By Lnk_ProviderList =  By.id("rbPrdrLst");
	  
	  By Lnk_PatientAttechedtoProvider =  By.id("rbPrdrPat");
	  
	  By Lnk_ProviderHolidays = By.id("rbPrdrHolidays");
	  
	  By Lnk_ProviderOperatory = By.id("rbPrdrOperLst");
	  
	  
	  
	  ////////////////////////  Employer List  ////////////////
	  
	  By Lnk_EmployerListMenu = By.xpath("//*[@id='menuList']/a[4]");
	  
	  By Lnk_EmployerList = By.id("rbEmp");
	  
	  By Lnk_PatByEmployer = By.id("rbPatbyEmp");
	  
	  By Lnk_CarrierList = By.id("rbCarr");
	  
	  By Lnk_PatByCarrier = By.id("rbPatbyCarrier");
	  
	  By Lnk_InsPlanList = By.id("rbInsPlan");
	  
	  By Lnk_PayByInsPlan = By.id("rbPatbyInsPlan");
	  
	  By Lnk_InactivePlanList = By.id("rbInactivePlanList");
	  
	  
	  //////////////////// Drug List////////////////////
	  
	  By Lnk_DrugListMenu = By.xpath("//*[@id='menuList']/a[5]");
	  
	  By Lnk_PrescriptionDetail = By.id("rbPresD");
	  
	  By Lnk_DrugList = By.id("rbDrugList");
	  
	   
	  /////////////////// Proc/ Fees List /////////////
	  
	  By Lnk_FeesListMenu = By.xpath("//*[@id='menuList']/a[6]");
	  
	  By Lnk_ProcedureCodeList = By.id("rbProcCd");
	  
	  By Lnk_FeesSchedList = By.id("rbFeeSche");
	  
	  By Lnk_ProcedureCodesbyFeeSchedule = By.id("rbProcByFeeSche");
	  
	  By Lnk_CreditCodesReport = By.id("rbPymtAdjCodes");
	  
	  By Lnk_ExplosionCodeList = By.id("rbExpCodes");
	  
	  
	  //////////////////////// Office List //////////////////
	  
	  By Lnk_OfficeListMenu = By.xpath("//*[@id='menuList']/a[7]");
	  
	  By Lnk_OfficeInformation = By.id("rbOffInf");  
	  
	  By Lnk_OfficeHoliday = By.id("rbOffHoliday");
	  
	  By Lnk_OperatoryList = By.id("rbOperLst");
	  
	  
	  //////////////////// Security List ///////////////////
	  
	  By Lnk_SecurityListMenu = By.xpath("//*[@id='menuList']/a[8]");
	  
	  By Lnk_SecurityUserList = By.id("rbUserList");  
	  
	  By Lnk_SecurityGroupList = By.id("rbGroupList");
	  
	  By Lnk_SecurityGroupRightsList = By.id("rbGroupRghtList");
	  
	  //////////////////// Setup List  ////////////////////
	  
	  By Lnk_SetupListMenu = By.xpath("//*[@id='menuList']/a[9]");
	  
	  By Lnk_ADACategoriesList = By.id("rbADAcategories");
	  
	  By Lnk_DefaultInsPlanCoverageCategoryList = By.id("rbDefInsPlanCovCategories");
	  
	  By Lnk_DocumentTypesList = By.id("rbDocumentTypes");
	  
	  By Lnk_NotesMacroCategoryList = By.id("rbNotesMacroCate");
	  
	  By Lnk_NotesMacrosList = By.id("rbNotesMacro");
	  
	  By Lnk_PatientTypesList = By.id("rbPatientTypes");
	  
	  By Lnk_InsPlanReportingSubTypeList = By.id("rbInsPlanReportingSubType");
	  
	  By Lnk_InsPlanReportingTypeList = By.id("rbInsPlanReportingType");
	  
	  By Lnk_ProviderSpecialtiesList = By.id("rbProviderSpecialties");
	  
	  By Lnk_ReferralTypesList = By.id("rbReferralTypes");
	  
	  By Lnk_RespPartyTypesList = By.id("rbRespPartyTypes");
	  
	  By Lnk_SchedulerProductionTypesList = By.id("rbSchedulerProdTypes");
	  
	  
	  
	  ///////////////////////////// GROUP REPORTS //////////////////////
	  
	  /////////////////Appointment Reports /////////////
	  
	  By LNK_GROUP_REPORTS = By.xpath("//*[@id='menuReports']/a[11]/span[1]");
	  
	  By Lnk_AppointmentReports = By.xpath("//*[@id='menuGroupReports']/a[1]");

	  
	  ////////////////////// Batch Reports //////////////
	  
	  
	  By Lnk_BatchReports = By.xpath("//*[@id='menuGroupReports']/a[2]");
	  
	  By Lnk_AgingSummaryG = By.id("rbARSumm");
	  
	  By Lnk_AgingDetailsG = By.id("rbAgeD");
	  
	  By Btn_ScheduledReort = By.id("btnSchedule");
	  
	  
	  ///////////// Group reports-daily reports ////////////////

	  By Lnk_DailyReportsG = By.xpath("//*[@id='menuGroupReports']/a[3]");
	  
	  By Lnk_DailyJournalbyUserDetail = By.id("rbDlyJourUserD");
	  
	  By Lnk_DailyJournalbyUserDetailCreatedDate = By.id("rbDlyJourUserDCreated");
	  
	  By Lnk_DailyJournalG=By.xpath("//*[@id='rbDlyJourD']");
	  
	  By Lnk_DailySummaryG = By.xpath("//*[@id='rbDlyJourS']");

	  By Lnk_DailyJournalByProviderDetailG = By.id("rbDlyJourPrdrD");

	  By Lnk_DailyScheduledProductionG = By.id("rbDlyScheProd");
	  
	  By Lnk_SpecialTransactionReport = By.id("rbSpecTranRpt");
	  
	  By Lnk_ExsummaryG = By.id("rbExecSumm");
	  
	  By Lnk_DailyCollection = By.id("rbDlyColl");
	  
	  By Lnk_DailyCollectionbyProviderG = By.id("rbDlyCollPrdr");
	  
	  By Lnk_PatientProgressNotesG = By.id("rbPatProgNotes");
	  
	  By Lnk_UnsignedProgressNotesReportG = By.id("rbUnsighProg");
	  
	  By Lnk_MissingProgressNotesG = By.id("rbMissProgNotes");
	  
	  By Lnk_DailyAuditReportG = By.id("rbDlyAuditRpt");
	  
	  ///////////// Group Report - Insurance report /////////////////
	  
	  By Lnk_InsReportsG = By.xpath("//*[@id='menuGroupReports']/a[4]");
	  
	  By Lnk_OutstandingClaims = By.id("rbClaimsAge");
	  
	  By Lnk_OutstandingClaimsExcel = By.id("rbClaimsAgePrdr");
	  
	  By Lnk_ClaimsList = By.id("rbClaimsLst");
	  
	  By Lnk_ClaimsNotCreated = By.id("rbClmsNotCreated");
	  
	  By Lnk_ClaimsCreatedNotSent = By.id("rbClmsCreatedNotSent");
	  
	  By Lnk_OutstandingPreAuthorizationG = By.id("rbPAOutCliams");
	  
	  By Lnk_PreAuthorizationListG = By.id("rbPAOutCliamsLst");
	  
	  By Lnk_UnbilledReportDuetoNoInsurance = By.id("rbUnbilledRptDueIns");
	  
	  By Lnk_CapitationUtilizationDetailG = By.id("rbCapUtilD");
	  
	  By Lnk_CapitationUtilizationSummaryG = By.id("rbCapUtilS");
	  
	  By Lnk_CapitationUtilizationProviderDetailG = By.id("rbCapUtilPrdrD");
	  
	  By Lnk_CapitationUtilizationProviderSummaryG = By.id("rbCapUtilPrdrS");
	  
	  By Lnk_PlansCreatedByUser = By.id("rbPlanCreatedUser");
	  
	  By Lnk_NewPatientsbyCarrierG = By.id("rbNewPatsCarr");
	  
	  By Lnk_ProceduresonHoldG = By.id("rbProcOnHold");
	  
	 
	  ///////////////////////////  Group Reports - Management Reports ////////////////////
	  
	  By Lnk_ManagementReportsG = By.xpath("//*[@id='menuGroupReports']/a[5]");
	  
	  By Lnk_AgingDetailG = By.id("rbAgeD");
	  
	  By Lnk_AgingSummaryGR = By.id("rbAR");
	  
	  By Lnk_AgingByHomeOfficeG = By.id("rbAgeHomeOff");
	  
	  By Lnk_AgingSummaryByHomeOffice = By.id("rbAgeSHomeOff");
	  
	  By Lnk_AgingbyHomeOfficewithBalanceStatusG = By.id("rbAgeHomeOffBalStatus");
	  
	  By Lnk_AgingwithRemContractBalG = By.id("rbAgeCont");
	  
	  By Lnk_AgingwithRemContractBalbyHomeOfficeG = By.id("rbAgeContHomeOff");
	  
	  By Lnk_AgingbyProviderbyHomeOfficeDetail = By.id("rbGrpAgePrdrD");
	  
	  By Lnk_ProductionbyCategory = By.id("rbProdCate");
	  
	  By Lnk_ProductionbyCodes = By.id("rbProdCodes");
	  
	  By Lnk_ProductionbyCodesProvider = By.id("rbProdPrdrCode");
	  
	  By Lnk_ProductionbyProviderG = By.id("rbProdPrdr");
	  
	  By Lnk_RecallDue = By.id("rbRecallDue");
	  
	  By Lnk_AppointmentDetailByUser = By.id("rbGrpApptDetail");
	  
	  By Lnk_TimeClockReport = By.id("rbTimeclockRpt");
	  
	  By Lnk_UnallocationPaymentsAdjustmentsReport = By.id("rbUnallocPymt");
	  
	  
	  
	  /////////////////////////////////////////////////////// Group Reports - Other Reports ////////////////////////////////////////////////
	  
	  By Lnk_OtherReportsG = By.xpath("//*[@id='menuGroupReports']/a[6]");
	  
	  By Lnk_NewPatientsList = By.id("rbGrpNewPat"); 
	  
	  By Lnk_TxPlanStatusReport = By.id("rbGrpTxPlanStatusD");
	  
	  By Lnk_UserActivityReport = By.id("rbUserLogHist");
	  
	  By Lnk_Tickler = By.id("rbTickler");
	  
	  By Lnk_PatientMedicaidIDReport = By.id("rbPatMedRpt");
	  
	  By Lnk_AppointmentsbyProvider = By.id("rbApptPrdr");
	  
	  
	  /////////////////////////////////////////////////////// Group Reports - Referral Reports ////////////////////////////////////////////////
	  
	  By Lnk_ReferralReportsG = By.xpath("//*[@id='menuGroupReports']/a[7]");
	  
	  By Lnk_ReferralProductionListG = By.id("rbRefProd"); 
	  
	  By Lnk_ReferralSummaryReportG = By.id("rbRefSumm");
	  
	  By Lnk_ReferralCountSummaryG = By.id("rbRefCountSumm");
	  
	  
/////////////////////////////////////////////////////// Office Reports - Access Dental Reports ////////////////////////////////////////////////
		
	  By LNK_OfficeReports = By.xpath("//*[@id='menuReports']/a[12]/span[1]");
	  
	  By Lnk_ADR = By.xpath("//*[@id='menuOfficeRpts']/a[2]");
	  
	  By Lnk_ProductionAnalysisReport = By.id("rbProdAnayD");
	  
	  By Lnk_ProviderCompensationReportNew = By.id("rbPrdrCompNew");
	  
	  By Lnk_SalesandDiagnosisReport = By.id("rbSalesDiagRpt");
	  
	  By Lnk_CollectionRateReport = By.id("rbCollRateRpt");
	  
	  By Lnk_TreatmentPlanAcceptanceAnalysisByProvider = By.id("rbTxAcceptP");
	  
	  By Lnk_ClaimsUnderPaidOverPaidDenied = By.id("rbClmOverUnderDenied");

	 
/////////////////////////////////////////////////////// Office Reports - DHA Reports ////////////////////////////////////////////////
	  
	  By Lnk_DHA = By.xpath("//*[@id='menuOfficeRpts']/a[7]");
	  
	  By Lnk_ProviderCompensationReportDetailExcel = By.id("rbPrdrCompDXls");
	  
	  By Lnk_ProviderUCRReportDetailExcel = By.id("rbPrdrUCRRptD");
	  
	  By Lnk_EligibilityReport = By.id("rbEligRpt");
	  
	  
/////////////////////////////////////////////////////// Office Reports - Hawaii Family Dental Reports ////////////////////////////////////////////////
	  
	  By Lnk_HFD = By.xpath("//*[@id='menuOfficeRpts']/a[9]");
	  
	  By Lnk_ProviderCompensationReport = By.id("rbPrdrCompRpt"); 
	  
	  By Lnk_CarrierAnalysis = By.id("rbCarrAnay");
	  
	  By Lnk_UncollectedCopay = By.id("rbUncolCopay");
	  
	  By Lnk_OutstandingClaimsHawaii = By.id("rbClaimsAge");
	  
	  By Lnk_PatientReceivablesAgingReportbyHomeOffice = By.id("rbARPatBalHome");
	  
	  By Lnk_PatientListByLastvisit = By.id("rbPatLstLastVisit");
	  
	  By Lnk_WeeklyProviderProductionExcel = By.id("rbWeekPrdrProd");
	  
	  By Lnk_NextAppointmentBookedReportExcel = By.id("rbNxtApptBook");
	  
	  By Lnk_TPCIncentiveReport = By.id("rbTxIncRpt");
	  
/////////////////////////////////////////////////////// Office Reports - Lumina Reports //////////////////////////////////////////////// 
	  
	  By Lnk_Lumina = By.xpath("//*[@id='menuOfficeRpts']/a[11]");
	  
/////////////////////////////////////////////////////// Office Reports - DCA Reports ////////////////////////////////////////////////

	  By Lnk_DCA = By.xpath("//*[@id='menuOfficeRpts']/a[5]");
	  
	  By Lnk_DailyJournalDetailLandscape = By.id("rbDlyJourDL");
	  
	  By Lnk_DailyCollectionbyOffice = By.id("rbDlyCollOffice");
	  
	  By Lnk_DailyCollectionbyOfficeDetail = By.id("rbDlyCollOfficeD");
	  
	  By Lnk_DailyCollectionbyProviderAllocation = By.id("rbDlyCollPrdr");
	  
	  By Lnk_MultiStepProcedures = By.id("rbMultiStep");
	  
	  By Lnk_CapitationReport = By.id("rbCapRpt");
	  
	  By Lnk_AllocationAnalysisReport = By.id("rbAllocAnayRpt");
	  
	  By Lnk_TreatmentPlanStatusNewPatientsDetail = By.id("rbTxPlanStaNewPats");
	  
	  By Lnk_IncomeAllocationHygienistReportDetail = By.id("rbIncAllocHygD");
	  
	  By Lnk_ProviderComparisonReport = By.id("rbPrdrComparison");
	  
	  By Lnk_IncomeAllocationHygienistReportSummary = By.id("rbIncAllocHygS");
	  
	  By Lnk_ProviderCompensationReportSummary = By.id("rbPrdrCompS");
	  
	  By Lnk_BalanceStatusReport = By.id("rbBalStatusRpt");
	  
	  By Lnk_Top25CarrierProduction = By.id("rbTop25Carrier");
	  
/////////////////////////////////////////////////////// Office Reports - OnHealthCare Reports ////////////////////////////////////////////////

	  By Lnk_OnHealthCareReport = By.xpath("//*[@id='menuOfficeRpts']/a[14]");
	  
	  
/////////////////////////////////////////////////////// Office Reports - Ottawa Reports ////////////////////////////////////////////////
  
	  By Lnk_OttawaReport = By.xpath("//*[@id='menuOfficeRpts']/a[15]");
	  
	  By Lnk_MilesofSmilesReport = By.id("rbMPR");
	  
/////////////////////////////////////////////////////// Office Reports - Tru fAMILY dENTAL Reports ////////////////////////////////////////////////  
	  
	  
	  By Lnk_tfdrReport = By.xpath("//*[@id='menuOfficeRpts']/a[19]");
	  
 
/////////////////////////////////////////////////////// Office Reports - Village Family Dental Reports ////////////////////////////////////////////////  
	  
	  By Lnk_VFDReport = By.xpath("//*[@id='menuOfficeRpts']/a[21]");
	  
	  
	  
	  
	  
}
