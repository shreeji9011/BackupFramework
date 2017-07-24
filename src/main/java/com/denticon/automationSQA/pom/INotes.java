package com.denticon.automationSQA.pom;

import org.openqa.selenium.By;

public interface INotes {
	
	By SLC_RecentPatient = By.xpath("//*[@id='MenuBar_aMenuRecentPat']/img");
	By SLC_LastPatient = By.xpath("//*[@id='MenuBar_menuRecentPat']/a[1]");
	By TAB_PNotes = By.linkText("Progress Notes");
	By SLC_AddNewNote = By.xpath("//*[@id='cmdAddNewNotes']");
	By SLC_PNSelectMacro = By.xpath("//*[@id='lbMacros']/option[1]");
	By SLC_MacroAddNotes = By.xpath("//*[@id='cmdPvwAddMacro']");
	By TXT_PNnotes = By.xpath("//*[@id='textarea0']");
	By FinalAddNotes = By.xpath("//*[@id='cmdAddQues']");
	By Save = By.xpath("//*[@id='cmdSave']");
	By PN_Edit = By.xpath("//*[@id='1277']");
	By BTN_Close = By.xpath("html/body/div[2]/div[1]/button");
	
}
