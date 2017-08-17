package com.denticon.automationSQA.pom;

import org.openqa.selenium.By;

public interface IDentalInsPlan {
	
	By TAB_InsInfo = By.xpath("//*[@id='menuPatient']/a[11]/span[1]");
	By TAB_PrimaryDental = By.xpath("//*[@id='menuInsurance']/a[1]");
	By TAB_SecondaryDental = By.xpath("//*[@id='menuInsurance']/a[2]");
	By TAB_PrimaryMedical = By.xpath("//*[@id='menuInsurance']/a[3]");
	By TAB_SecondaryMedical = By.xpath("//*[@id='menuInsurance']/a[4]");
	By TAB_ThirdDental = By.xpath("//*[@id='menuInsurance']/a[5]");
	By TAB_ForthDental = By.xpath("//*[@id='menuInsurance']/a[6]");
	By BTN_GoToPrimaryDentalInsurance = By.xpath("//*[@id='btnNext']");
	By TXT_SearchText = By.xpath("//*[@id='txtSearchText']");
	By TAB_Search = By.xpath("//*[@id='btnSearchPlan']");
	By SLC_250CIGNA = By.xpath("//*[@id='dtOptions']/tbody/tr[5]/td[1]");
	By SLC_BrightSmileIns = By.xpath("//*[@id='dtOptions']/tbody/tr[17]/td[2]");
	By TXT_SSNSubID = By.xpath("//*[@id='txtSubID']");
	By TAB_Save = By.xpath("//*[@id='btnSave']");
	
}
