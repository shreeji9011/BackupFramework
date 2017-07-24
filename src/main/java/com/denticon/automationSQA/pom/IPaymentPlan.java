package com.denticon.automationSQA.pom;

import org.openqa.selenium.By;

public interface IPaymentPlan {
	
	////////////////////////////////////// Regular PaymentPlan//////////////////////////////////////
	
	By TAB_PaymentPlan=By.xpath("//span[contains(text(),'Payment Plan')]");
	By TAB_RegularPaymentPlan=By.linkText("Regular");
		
	By TXT_patientBalanceAmount = By.id("txtPatBalAmt_text");
	By TXT_firstBillingDate = By.id("txtFirstDueDate");
	By TXT_noOfPayments = By.id("txtNoOfPay");
	By TXT_remainingPayments = By.id("txtNoOfRemPay");
	
	By BTN_save = By.id("btnSave");	
	By BTN_delete = By.id("btnDelete");
	
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
	
	
	By INP_responsibleParty_cash = By.id("//input[@id='RespPartyType_RespPartyType_0']");
	By INP_responsibleParty_collections = By.id("//*[@id='RespPartyType_RespPartyType_1']");
	By INP_responsibleParty_discounts = By.id("//*[@id='RespPartyType_RespPartyType_2']");
	By INP_responsibleParty_familyfriends = By.id("//*[@id='RespPartyType_RespPartyType_3']");
	By INP_responsibleParty_insurance = By.id("//*[@id='RespPartyType_RespPartyType_4']");
	By INP_responsibleParty_medicaid = By.id("//*[@id='RespPartyType_RespPartyType_5']");
	By INP_responsibleParty_needsupdate = By.id("//*[@id='RespPartyType_RespPartyType_6']");
	By INP_responsibleParty_ppo = By.id("//*[@id='RespPartyType_RespPartyType_7']");
	By INP_responsibleParty_other = By.id("//*[@id='RespPartyType_RespPartyType_8']");
	By INP_responsibleParty_prepaidOrManagedCare = By.id("//*[@id='RespPartyType_RespPartyType_9']");
	By INP_responsibleParty_union = By.id("//*[@id='RespPartyType_RespPartyType_10']");
	
	
	
	By TABLE_searchResults = By.id("dgSearchctl0");
	
	
	
	
/////////////////////////// OrthoPayment Plan////////////////////////

	By TAB_OrthoPaymentPlan=By.linkText("Ortho");
	
	By SLC_OrthoPaymentBillingCode = By.id("cmbInsBillingCode");
	By TXT_TreatmentEndDate = By.id("txtTreatEndDate");
	By CHK_StartPatientPaymentPlan = By.id("chkStartPatPlan");
	

	
	
}
