package com.denticon.automationSQA.pom;

import org.openqa.selenium.By;

public interface IFlashAlert {

	By TAB_FlashAlert = By.linkText("Flash Alerts");
	By TAB_AddNew = By.xpath("//*[@id='btnAdd']");
	By SLC_Date = By.xpath("//*[@id='btnDateStamp']");
	By TXT_FlashNote = By.xpath("//*[@id='txtMessage']");
	By SLC_Save = By.xpath("//*[@id='btnSave']");
	By SLC_Deactivate = By.xpath("//*[@id='dgFlash__ctl3_btnDeAct']");
	By SLC_Edit = By.xpath("//*[@id='dgFlash__ctl3_btnEdit']");
	By SLC_Update = By.xpath("//*[@id='btnEditSave']");
	
}
