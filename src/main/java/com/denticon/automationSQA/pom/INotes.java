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
	By SLC_PNSelectMacro = By.xpath("//*[@id='lbMacros']/option[11]");
	By SLC_MacroAddNotes = By.xpath("//*[@id='cmdPvwAddMacro']");
	By SLC_AddNote = By.xpath("//*[@id='cmdAddQues']");
	
	By BTN_SelectToothNo = By.id("cmdTNosDesignator");
	By LNK_SelectFirstTooth =By.xpath("//table[@id='tblPNTeethDesignator']//tr[1]/td[1]");
	By BTN_SaveTooth = By.id("cmdThDesignatorClose");
	
	By TXT_DateOfService = By.id("txtDOS");
	
	By BTN_SelectToothQuardantSurface= By.id("cmdTNos");
	By LNK_SelectFirstSurface = By.xpath("//table[@id='tblPNSurfs']//tr[1]/td[1]");
	By LNK_SelectFirstQuadrant = By.xpath("//table[@id='tblPNQuads']//tr[1]/td[1]");
	By BTN_SaveToothQuadrantSurface = By.id("cmdThSurfAdd");
	
	By SLC_SelectMacro = By.id("lbMacros");
	By BTN_AddMacroToNotes = By.id("cmdPvwAddMacro");
	
	By BTN_NoteColorSelector = By.xpath("//*[@class='mce-open']");
	By CLR_Red = By.xpath("//*[@title='Red']");
	By TXT_ProgresNote = By.xpath("//body[@data-id='noteEditor']");
	
	By TXT_PNnotes = By.xpath("//*[@id='textarea0']");
	By Save = By.xpath("//*[@id='cmdSave']");
	By PN_Edit = By.xpath("//*[@id='1277']");
	By BTN_Close = By.xpath("html/body/div[2]/div[1]/button");
	
	By SLC_ProgressNoteFilter = By.id("searchByPNFilter");
	By TXT_ProgressNotesFilterInput = By.id("txtSearchInput");
	By BTN_ProgressNotesFilterSearch = By.id("cmdSearchNote");
	By LNK_EditFirstFilterSearchResult = By.xpath("//div[@id='divPNList']//div//tbody/tr[1]/td[1]/a");
	By LBL_DOSOfFirstFilterSearchResult = By.xpath("//div[@id='divPNList']//tr[1]//td[2]");
	By LBL_CreatedOnOfFirstFilterSearchResult = By.xpath("//div[@id='divPNList']//tr[1]//td[7]");
	By BTN_StrikeOffProgressNotes = By.id("cmdSave");
	By BTN_RestoreProgressNotes = By.id("cmdSave");
	
	
	By BTN_ChoseFile = By.id("uploadedFile");
	By TXT_ScreenShotName = By.id("txtScreenshotName");
	By BTN_UploadScreenShot = By.id("cmdScreenshotAssign");
}



