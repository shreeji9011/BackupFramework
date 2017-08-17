package com.denticon.automationSQA.pom;

import org.openqa.selenium.By;

public interface IBasicMeasurement {

	
	By TAB_BM = By.linkText("Basic Measurements");
	By AddNewMeasurement = By.xpath("//*[@id='btnAddNew']");
	By SLC_noITR = By.xpath("//*[@id='ddlChildNoOfITRs']");
	By SLC_rootFragnent = By.id("ddlAdultRootFrags");
	By SLC_Save = By.xpath("//*[@id='cmdSave']");
	By SLC_Cancel = By.xpath("//*[@id='cmdCancel']");
	By SLC_Edit = By.linkText("Edit...");
	By SLC_Delete = By.linkText("Delete...");
	
}
