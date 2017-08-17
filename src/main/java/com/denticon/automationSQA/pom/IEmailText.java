package com.denticon.automationSQA.pom;

import org.openqa.selenium.By;

public interface IEmailText {

	
	//////////////////// Email /////////////////////
	
	By TAB_ET = By.linkText("Email Or Text Message");
	By Txt_EmailAdd = By.xpath("//*[@id='txtEmail']");
	By Tab_Send = By.xpath("//*[@id='btnSend']");
	By Tab_Cancel = By.xpath("//*[@id='btnCancel']");
	By Tab_AddMacros = By.xpath("//*[@id='btnNotesMacro']");
	
	////////////////////////  Text Message //////////
	
	By RadioButton_TM = By.xpath("//*[@id='rdoSMS']");
	By Txt_PhoneNumber = By.xpath("//*[@id='txtPhone_PhoneNumber_text']");
		
	
	///////////////////  Patient Portal /////////
	
	By Radio_PatientPortal = By.xpath("//*[@id='rdoPortal']");
	
	
}
