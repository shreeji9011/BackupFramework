package com.denticon.automationSQA.pom;

import org.openqa.selenium.By;

public interface INotes {
	
	///////////////////////// Notes ///////////////////////
	
	By TAB_Notes = By.linkText("Notes");
	By SLC_FromList = By.xpath("//*[@id='cmbNoteType']");
	By SLC_nAddNewNote = By.xpath("//*[@id='btnAddNew']");
	By Ins_Date = By.xpath("//*[@id='btnDateStamp']");
	By Txt_Notes = By.xpath("//*[@id='txtNotes']");
	By SLC_Save = By.xpath("//*[@id='btnSave']");
	By SLC_nEdit = By.xpath("//*[@id='dgNotes_ctl00_ctl04_lnkEdit']");
	By SLC_nUpdate = By.xpath("//*[@id='btnUpdate']");
	By SLC_nCancel = By.xpath("//*[@id='btnCancel']");
	By SLC_nDelete = By.xpath("//*[@id='dgNotes_ctl00_ctl04_lnkDelete']");
	

	
	////////////////// Progress Note ///////////////////
	By SLC_RecentPatient = By.xpath("//*[@id='MenuBar_aMenuRecentPat']/img");
	By SLC_LastPatient = By.xpath("//*[@id='MenuBar_menuRecentPat']/a[1]");
	By TAB_PNotes = By.linkText("Progress Notes");
	By SLC_AddNewNote = By.id("cmdAddNewNotes");
	By SLC_PNSelectMacro = By.xpath("//*[@id='lbMacros']/option[1]");
	By SLC_MacroAddNotes = By.xpath("//*[@id='cmdPvwAddMacro']");
	By TXT_PNnotes = By.xpath("//*[@id='textarea0']");
	By FinalAddNotes = By.xpath("//*[@id='cmdAddQues']");
	By Save = By.xpath("//*[@id='cmdSave']");
	By PN_Edit = By.xpath("//*[@id='1277']");
	By BTN_Close = By.xpath("html/body/div[2]/div[1]/button");
	
}
