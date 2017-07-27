package com.denticon.automationSQA.pom;

import org.openqa.selenium.By;

public interface ISearchPatient {

	By TAB_SearchPatient=By.linkText("Search Patient"); 
	By Patient_Info_Title=By.id("HelpBar_SpanPageTitle"); 
	
	By RADIOBTN_searchForPatient = By.id("rdoPatient");
	By RADIOBTN_searchForResponsibleParty = By.id("rdoResp");
	
	By RADIOBTN_searchByLastName = By.id("rdoLastName");
	By RADIOBTN_searchByChartNo = By.id("rdoChartNo");
	By RADIOBTN_searchByPhoneNo = By.id("rdoHomePh");
	By RADIOBTN_searchByPatientID = By.id("rdoPatID");
	By RADIOBTN_searchByFirstName = By.id("rdoFirstName");
	By RADIOBTN_searchBySSN = By.id("rdoSSN");
	By RADIOBTN_searchByCellPhone = By.id("rdoCellPh");
	By RADIOBTN_searchByResponsiblePartyID = By.id("rdoRespID");
	By RADIOBTN_searchByPatientType = By.id("rdoPatType");
	By RADIOBTN_searchByResponsiblePatientType = By.id("rdoRespType");
	By RADIOBTN_searchByEmail = By.id("rdoEmail");
	By RADIOBTN_searchByWorkPhone = By.id("rdoWorkPh");
	By RADIOBTN_searchByMedicaid = By.id("rdoMediID");
	By RADIOBTN_searchByBirthDate = By.id("rdoBirthDate");
	
	By RADIOBTN_searchInCurrentOffice = By.id("rdoCurrentOffice");
	By RADIOBTN_searchInAllOffices = By.id("rdoAllOffice");
	
	By RADIOBTN_IncludeInactivePatients = By.id("chkInactivePat");
	
	By TXT_searchText = By.id("txtSearchText");
	By INP_responsibleParty_ID = By.id("rdoRespID");
	By INP_responsibleParty_cash = By.id("RespPartyType_RespPartyType_0");
	By INP_responsibleParty_collections = By.id("RespPartyType_RespPartyType_1");
	By INP_responsibleParty_discounts = By.id("RespPartyType_RespPartyType_2");
	By INP_responsibleParty_familyfriends = By.id("RespPartyType_RespPartyType_3");
	By INP_responsibleParty_insurance = By.id("RespPartyType_RespPartyType_4");
	By INP_responsibleParty_medicaid = By.id("RespPartyType_RespPartyType_5");
	By INP_responsibleParty_needsupdate = By.id("RespPartyType_RespPartyType_6");
	By INP_responsibleParty_ppo = By.id("RespPartyType_RespPartyType_7");
	By INP_responsibleParty_other = By.id("RespPartyType_RespPartyType_8");
	By INP_responsibleParty_prepaidOrManagedCare = By.id("RespPartyType_RespPartyType_9");
	By INP_responsibleParty_union = By.id("RespPartyType_RespPartyType_10");
	
	By INP_patienttype_ABArabicspeaking = By.id("PatientType_PatType_0");
	By INP_patienttype_C1ClassI = By.id("PatientType_PatType_1");
	By INP_patienttype_C2ClassII = By.id("PatientType_PatType_2");
	By INP_patienttype_C3ClassIII = By.id("PatientType_PatType_3");
	By INP_patienttype_COCosmetic = By.id("PatientType_PatType_4");
	By INP_patienttype_CPCollectionProb = By.id("PatientType_PatType_5");
	By INP_patienttype_CQQueuedForCollections = By.id("PatientType_PatType_6");
	By INP_patienttype_DADamonSystem = By.id("PatientType_PatType_7");
	By INP_patienttype_ECCorporateEmployeeFamily = By.id("PatientType_PatType_8");
	By INP_patienttype_EFEmployeeFamily = By.id("PatientType_PatType_9");
	By INP_patienttype_FTEFTFinanced = By.id("PatientType_PatType_10");
	By INP_patienttype_ILInvisalign = By.id("PatientType_PatType_11");
	By INP_patienttype_IMImplantpatient = By.id("PatientType_PatType_12");
	By INP_patienttype_LTLimitedTx = By.id("PatientType_PatType_13");
	By INP_patienttype_MCMedicallyCompromised = By.id("PatientType_PatType_14");
	By INP_patienttype_OROrthoPatient = By.id("PatientType_PatType_15");
	By INP_patienttype_P1Phase1Tx = By.id("PatientType_PatType_16");
	By INP_patienttype_P2Phase2Tx = By.id("PatientType_PatType_17");
	By INP_patienttype_SPSinglePhaseTx = By.id("PatientType_PatType_18");
	By INP_patienttype_SSSpanishSpeaking = By.id("PatientType_PatType_19");
	By INP_patienttype_UAUpdateAddress = By.id("PatientType_PatType_20");
	By INP_patienttype_UIUpdateInsurance = By.id("PatientType_PatType_21");
	By INP_patienttype_UPUpdatePhone = By.id("PatientType_PatType_22");
	By INP_patienttype_WIWhiteningCandidate = By.id("PatientType_PatType_23");
	
	
	By BTN_search = By.id("btnSearch");
	By BTN_Save = By.id("btnSave");
	
	By TABLE_searchResults = By.id("dgSearchctl0");
	
	///////////////////// Responsible Party /////////////
	
	By TAB_ResponsibleParty = By.linkText("Responsible Party");
}
