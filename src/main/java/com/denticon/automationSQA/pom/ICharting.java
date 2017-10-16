package com.denticon.automationSQA.pom;

import org.openqa.selenium.By;

public interface ICharting  {
	
	By TAB_CHARTING=By.id("MenuBar_aMenuCharting");  
 	By LNK_PATIENT_CHART=By.linkText("Patient Chart");  
 	By PAGE_PATIEN_CHRT=By.id("HelpBar_SpanPageTitle");  
 	By TAB_PRE_EXISTING=By.xpath(".//*[@id='ui-id-1']/span"); 
 	By TAB_TX_PLANS=By.xpath(".//*[@id='ui-id-3']/span"); 
 	By SLC_TOOTH1=By.xpath("//*[@id='i19rect'][@surf='existtooth']"); 
 	By SLC_TOOTH1_missing=By.xpath("//*[@id='i19rect'][@surf='misstooth']"); 
 	By SLC_TOOTH2=By.xpath("//*[@id='i23rect'][@surf='existtooth']");
 	By SLC_TOOTHDenture = By.xpath("//*[@id='i19rect'][@surf='misstooth']");
 	//By SLC_TOOTH3=By.xpath("//*[@id='i21rect'][@surf='existtooth']");
 	By SLC_TOOTH2_Missing = By.xpath("//*[@id='i23rect'][@surf='misstooth']");
 	By TXT_LoadingIndicator = By.xpath("//div[@id='divst']");
 	By SLC_TOOTH=By.xpath("//*[@id='i21c'][@isimpactedapplied]"); 
 	By SLC_ToothRestorative =By.xpath("//*[@id='i25i'][@issel]");
 	By SLC_TOOTHRestorativeFull=By.xpath("//*[@id='i25rect'][@surf='misstooth']");
 	By BTN_MISSING=By.id("cmdPxMissing");  
 	By BTN_DEYA=By.id("cmdPxDecay");
 	By TILE_MissingPErmanent = By.id("TileSVG3");
 	By TITLE_MISSING=By.xpath("//*[@id='i21c'][@isimpactedapplied]//*[contains(text(),'PRE-EXISTING')]");  
 	By TITLE_MISSINT_IMPACTED =By.xpath("//*[@id='i19c'][@isimpactedapplied]//*[contains(text(),'PRE-EXISTING')]");
 	By TITLE_IMPACTED_EXTRACTED = By.xpath("//*[@id='i19rect']//*[contains(text(),'TXPLAN')]");
 	By TITLE_MISSING_IMPLANT = By.xpath("//*[@id='i23condimplantblade']//*[contains(text(),'PRE-EXISTING')]");
 	By TITLE_Restorative = By.xpath("//*[@id='i24i'][@issel]//*[contains(text(),'PRE-EXISTING')]");
 	By TITLE_Decay = By.xpath("//*[@id='i21c'][@issel]//*[contains(text(),'PRE-EXISTING')]");
 	By TITLE_Denture =By.xpath("//*[@id='i25i'][@issel]//*[contains(text(),'PRE-EXISTING')]");
 	By BTN_IMPACTED=By.id("cmdPxImpacted"); 
 	By TILE_ImpactedPermanetn = By.id("TileSVG1");
 	By BTN_IMPLANT=By.id("cmdPxImplant");  
 	By TILE_ImplantBlade = By.id("TileSVG1");
 	By BTN_RESTORATION=By.id("cmdPxCrown");
 	By TILE_Restoration_amalgam = By.id("TileSVG1");
 	By BTN_DECAY=By.id("cmdPxDecay");
 	By BTN_BRIDGE=By.id("cmdPxBridge");  
 	By TILE_BRIDECERAMIC = By.id("TileSVG1");
 	By BTN_DENTURE=By.id("cmdPxDenture");  
 	By TILE_DENTURE = By.id("TileSVG1");
 	By BTN_EXTRACTION=By.id("cmdTxExtraction");  
 	By BTN_TX_IMPLANT = By.id("cmdTxImplant");
 	By TILE_TX_IMPLANT_blade = By.id("TileSVG1");
 	By BTN_TX_DENTURE = By.id("cmdTxDenture");
 	By TILE_TX_DENTURE_partial = By.id("TileSVG1");
 	By TILE_TX_DENTURE_full = By.id("TileSVG1");
 	By BTN_ExtractionAddProcedure = By.id("addChartProcId");
 	By BTN_DentureAddProcedure = By.id("addChartProcId");
 	
 	
  	By ROW_lastPreexistingCondition = By.xpath("//table[@class='tblMain']//tbody/tr[last()]/td[1]");
 	By BTN_DeletePreexitingCondition = By.id("cmdPxDelete");
 	
 	By BTN_SelectUpperRow = By.xpath("//*[@id='iaq2arrowText'][@isarchsel]");
 	  
}
