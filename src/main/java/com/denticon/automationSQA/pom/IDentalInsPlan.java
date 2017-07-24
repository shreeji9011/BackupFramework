package com.denticon.automationSQA.pom;

import org.openqa.selenium.By;

public interface IDentalInsPlan {
	
	By TAB_InsInfo = By.xpath("//*[@id='menuPatient']/a[11]/span[1]");
	By TAB_PrimaryDental = By.xpath("//*[@id='menuInsurance']/a[1]");
	By TAB_SecondaryDental = By.xpath("//*[@id='menuInsurance']/a[2]");
	By BTN_GoToPrimaryDentalInsurance = By.xpath("//*[@id='btnNext']");
	By TXT_SearchText = By.xpath("//*[@id='txtSearchText']");
	By TAB_Search = By.xpath("//*[@id='btnSearchPlan']");
	By SLC_250CIGNA = By.xpath("//*[@id='dtOptions']/tbody/tr[5]/td[1]");
	By TXT_SSNSubID = By.xpath("//*[@id='txtSubID']");
	By TAB_Save = By.xpath("//*[@id='btnSave']");
}
