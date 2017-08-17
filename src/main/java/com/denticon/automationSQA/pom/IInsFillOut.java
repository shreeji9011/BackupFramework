package com.denticon.automationSQA.pom;

import org.openqa.selenium.By;

public interface IInsFillOut {

	
	/////////////////////// Dental Information //////////////////
	
	By TAB_ifo = By.xpath("//*[@id='menuPatient']/a[12]/span[1]");
	By TAB_DentalFO = By.xpath("//*[@id='menuFillOut']/a[1]");
	By SLC_ICD3 = By.xpath("//*[@id='cmbICD3']");
	By SLC_Save = By.xpath("//*[@id='btnSave']");
	By SLC_Cancel = By.xpath("//*[@id='btnCancel']");
	
	
	/////////////////////// Medical Information //////////////////
	
	By TAB_MedicalFO = By.xpath("//*[@id='menuFillOut']/a[2]");
	By CLK_AssignBenifitsToStudent = By.xpath("//*[@id='chkAssignBen']");

	
}
