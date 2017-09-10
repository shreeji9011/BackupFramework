package com.denticon.automationSQA.pom;

import org.openqa.selenium.By;

public interface IStatusTracker {

	By TAB_StatusTracker = By.linkText("Status Tracker");
	By SLC_AddNewStatus = By.xpath("//*[@id='btnAddNew']");
	By Txt_Notestatus = By.xpath("//*[@id='txtNotes']");
	By SLC_Calander = By.xpath("//*[@id='imgNextStatusDate']");
	By SLC_NextDayDate = By.xpath("//*[@id='calNextStatusDate_day_4_4']");
	By SLC_Save = By.xpath("//*[@id='cmdSave']");
	By SLC_EditST = By.linkText("Edit...");
	By SLC_DeleteST = By.linkText("Delete...");
	
}
