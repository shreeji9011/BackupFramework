package com.denticon.automationSQA.pom;

import org.openqa.selenium.By;

public interface IPrescription {

	By TAB_Prescription = By.linkText("Prescription");
	By SLC_PreAddNew = By.xpath("//*[@id='btnAddNew']");
	By SLC_QuickPrint = By.xpath("//*[@id='btnQuickPrint']");
	By SLC_DrugName = By.xpath("//*[@id='cmbDrugName']");
	By BTW_Save = By.xpath("//*[@id='btnSave']");
	By BTN_Print = By.xpath("//*[@id='btnPrint']");
	By PrintAllPrescriptionToday = By.xpath("//*[@id='chkRptPrintAll']");
	By PrintSize_Wide = By.xpath("//*[@id='rbWide']");
	By BTN_PrintPreview = By.xpath("//*[@id='btnPrintPres']");
	By BTN_CancelAddNew = By.xpath("//*[@id='btnCancelAddNew']");
	By CLK_DeletePre = By.xpath("//*[@id='chkSelect456']");
	By BTW_Delete = By.xpath("//*[@id='btnDelete']");
	
}
