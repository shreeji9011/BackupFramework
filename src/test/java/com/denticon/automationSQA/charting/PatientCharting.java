package com.denticon.automationSQA.charting;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.ICharting;
import com.denticon.automationSQA.transaction.TransactionEntry;
import com.denticon.automationSQA.utilities.CommonMethods;

public class PatientCharting extends SeleniumSuite{
	String stepInfo=""; 
 	boolean flag=false;
 	
 	
 	
 	public boolean verifyPatientChartPage(){ 
 		try{ 
 			
 			
 			stepInfo="Click on Charting tab"; 
 			flag=CommonMethods.clickIfEnable(ICharting.TAB_CHARTING); 
 			stepInfo="Select Patient Chart"; 
 			flag=CommonMethods.clickIfEnable(ICharting.LNK_PATIENT_CHART); 
 			stepInfo="verify Patient chart page is displayed"; 
 			Thread.sleep(2000); 
 			flag=CommonMethods.isElementPresent(ICharting.PAGE_PATIEN_CHRT); 
 		} 
 		catch (Exception e) { 
 			e.getStackTrace(); 
 		} 
 		return flag; 
 	} 
 	
 	
 	@Test(description="verify marked missing tooth")     
 	public boolean VerifyMarkedMissinTooth(){ 
 		try{ 
 			TransactionEntry te= new TransactionEntry();
	 		te.SearchPatientByPatientID("106");
 			flag=verifyPatientChartPage(); 
 			stepInfo="Click on Pre-existing tab"; 
 			Thread.sleep(5000);
 			CommonMethods.waitUntilLoading(ICharting.TXT_LoadingIndicator);
 			flag=CommonMethods.clickIfEnable(ICharting.TAB_PRE_EXISTING); 
 			stepInfo="Select tooth"; 
 			Thread.sleep(15000); 
 			flag=CommonMethods.clickIfEnable(ICharting.SLC_TOOTH); 
 			
 			stepInfo="Clicking on missing button"; 
 			flag=CommonMethods.clickIfEnable(ICharting.BTN_MISSING,40); 
 			stepInfo="Verify the tooth is marked as missing"; 
 
 			Thread.sleep(4000);
 			CommonMethods.waitUntilLoading(ICharting.TXT_LoadingIndicator);
 			String titleMissing = CommonMethods.getWebElement(ICharting.TITLE_MISSING).getAttribute("innerHTML");
 			
 			flag=CommonMethods.clickIfEnable(ICharting.SLC_TOOTH);
 			flag=CommonMethods.clickIfEnable(ICharting.BTN_BRIDGE);
 			flag =CommonMethods.clickIfEnable(ICharting.TILE_BRIDECERAMIC);
 			Thread.sleep(2000);
 			CommonMethods.waitUntilLoading(ICharting.TXT_LoadingIndicator);
 			String titleBridgeCeramic = CommonMethods.getWebElement(ICharting.TITLE_MISSING).getAttribute("innerHTML");
 			
 			//clear the test case condition by deleting the added test data.
 			
 			flag = CommonMethods.clickIfEnable(ICharting.ROW_lastPreexistingCondition);
 			flag = CommonMethods.clickIfEnable(ICharting.BTN_DeletePreexitingCondition);
 			
 			flag= CommonMethods.isAlertPresent();

 			Thread.sleep(2000);
 			CommonMethods.waitUntilLoading(ICharting.TXT_LoadingIndicator);

 			flag = CommonMethods.clickIfEnable(ICharting.ROW_lastPreexistingCondition);
 			flag = CommonMethods.clickIfEnable(ICharting.BTN_DeletePreexitingCondition);
 			
 			flag= CommonMethods.isAlertPresent();


 			System.out.println("title----------->"+titleMissing);
 			Assert.assertTrue(titleMissing.contains("Missing"));
 			Assert.assertTrue(titleBridgeCeramic.contains("Bridge"));
 			
 		} 
 		catch (Exception e) { 
 			e.printStackTrace(); 
 		} 
 		return flag;		 
 	} 

 	@Test(description="Verify partial Denture Flow on PreEx")   
 	public boolean VerifypartialDentureFlowomPreEx(){ 
 		try{ 
 			TransactionEntry te= new TransactionEntry();
	 		te.SearchPatientByPatientID("68");
 			flag=verifyPatientChartPage(); 
 			stepInfo="Click on Pre-existing tab"; 
 			Thread.sleep(5000);
 			CommonMethods.waitUntilLoading(ICharting.TXT_LoadingIndicator);
 			flag=CommonMethods.clickIfEnable(ICharting.TAB_PRE_EXISTING); 
 			stepInfo="Select tooth"; 
 			flag=CommonMethods.clickIfEnable(ICharting.Slc_ToothMissingDenture); 
 			Thread.sleep(15000); 
 			flag=CommonMethods.clickIfEnable(ICharting.BTN_DENTURE);
 			flag=CommonMethods.clickIfEnable(ICharting.TILE_TX_DENTURE_partial);
 			Thread.sleep(2000);
 			CommonMethods.waitUntilLoading(ICharting.TXT_LoadingIndicator);

 			//clear the test case condition by deleting the added test data.
 			
 			flag = CommonMethods.clickIfEnable(ICharting.ROW_lastPreexistingCondition);
 			flag = CommonMethods.clickIfEnable(ICharting.BTN_DeletePreexitingCondition);
 			
 			flag= CommonMethods.isAlertPresent();

 			Thread.sleep(2000);

 		} 
 		catch (Exception e) { 
 			e.printStackTrace(); 
 		} 
 		return flag;		 
 	} 

 
 	@Test(description="verify impacted missing tooth")    //f
 	public boolean VerifyImpactedTooth(){ 
 		 
 		try{ 
 			TransactionEntry te= new TransactionEntry();
	 		te.SearchPatientByPatientID("106");
 			flag=verifyPatientChartPage(); 
 			stepInfo="Click on Pre-existing tab"; 
 			Thread.sleep(5000);
 			CommonMethods.waitUntilLoading(ICharting.TXT_LoadingIndicator);
 			flag=CommonMethods.clickIfEnable(ICharting.TAB_PRE_EXISTING); 
 			stepInfo="Select tooth"; 
 			
 			Actions action = new Actions(driver);
 			action.moveToElement(driver.findElement(ICharting.SLC_TOOTH1),1,20).click().perform();
 			  			
 			stepInfo="Clicking on impacted button"; 
 			flag=CommonMethods.clickIfEnable(ICharting.BTN_IMPACTED); 
 		//	flag=CommonMethods.clickIfEnable(ICharting.TILE_ImpactedPermanetn);
 			stepInfo="Verify the tooth is marked as missing"; 
 
 			Thread.sleep(4000);
 			CommonMethods.waitUntilLoading(ICharting.TXT_LoadingIndicator);
 	//		String titleImpacted = CommonMethods.getWebElement(ICharting.TITLE_MISSINT_IMPACTED).getAttribute("innerHTML");
 			
 			stepInfo = "Go to tx plans tab";
 			flag = CommonMethods.clickIfEnable(ICharting.TAB_TX_PLANS);
 			Thread.sleep(2000);
 			action.moveToElement(driver.findElement(ICharting.SLC_TOOTH1_missing),1,20).click().perform();
 			
 			flag = CommonMethods.clickIfEnable(ICharting.BTN_EXTRACTION);
 			flag =CommonMethods.clickIfEnable(ICharting.BTN_ExtractionAddProcedure);
 			CommonMethods.waitUntilLoading(ICharting.TXT_LoadingIndicator);
 	//		String titleExtraction = CommonMethods.getWebElement(ICharting.TITLE_IMPACTED_EXTRACTED).getAttribute("innerHTML");
 			
 			stepInfo ="applying implant on impacted extracted tooth";
 			action.moveToElement(driver.findElement(ICharting.SLC_TOOTH1_missing),1,20).click().perform();
 			flag= CommonMethods.clickIfEnable(ICharting.BTN_TX_IMPLANT);
 	//		flag = CommonMethods.clickIfEnable(ICharting.TILE_TX_IMPLANT_blade);
 			CommonMethods.waitUntilLoading(ICharting.TXT_LoadingIndicator);
 			
 			//clear the test case condition by deleting the added test data.
 			
 			flag = CommonMethods.clickIfEnable(ICharting.ROW_lastPreexistingCondition);
 			flag = CommonMethods.clickIfEnable(ICharting.BTN_DeletePreexitingCondition);
 			flag= CommonMethods.isAlertPresent();
 			flag = CommonMethods.clickIfEnable(ICharting.ROW_lastPreexistingCondition);
 			flag = CommonMethods.clickIfEnable(ICharting.BTN_DeletePreexitingCondition);
 			flag= CommonMethods.isAlertPresent();
 			
 			flag =CommonMethods.clickIfEnable(ICharting.TAB_PRE_EXISTING);
 			CommonMethods.waitUntilLoading(ICharting.TXT_LoadingIndicator);
 			flag = CommonMethods.clickIfEnable(ICharting.ROW_lastPreexistingCondition);
 			flag = CommonMethods.clickIfEnable(ICharting.BTN_DeletePreexitingCondition);
 			flag= CommonMethods.isAlertPresent();
 			
 			
 	//		System.out.println("title----------->"+titleImpacted);
 	//		Assert.assertTrue(titleImpacted.contains("Impacted: &nbsp;Permanent"));
 	//		Assert.assertTrue(titleExtraction.contains("D4560: Denticon Data"));
 		} 
 	catch (Exception e) { 
 		e.printStackTrace(); 
 	} 
 	return flag; 
 } 
 

 	@Test(description="VerifyPartialDentureOnExtractedTooth")  //F 
 	public boolean VerifyPartialDentureOnExtractedTooth(){ 
 		 
 		try{ 
 			TransactionEntry te= new TransactionEntry();
	 		te.SearchPatientByPatientID("68");
 			flag=verifyPatientChartPage(); 
 			stepInfo="Click on Pre-existing tab"; 
 			Thread.sleep(5000);
 			CommonMethods.waitUntilLoading(ICharting.TXT_LoadingIndicator);
 			flag=CommonMethods.clickIfEnable(ICharting.TAB_PRE_EXISTING); 
 			stepInfo="Select tooth"; 
 			
 			Actions action = new Actions(driver);
 			action.moveToElement(driver.findElement(ICharting.SLC_TOOTH1),1,20).click().perform();
 			  			
 			stepInfo="Clicking on impacted button"; 
 			flag=CommonMethods.clickIfEnable(ICharting.BTN_IMPACTED); 
 			flag=CommonMethods.clickIfEnable(ICharting.TILE_ImpactedPermanetn);
 			stepInfo="Verify the tooth is marked as missing"; 
 
 			Thread.sleep(4000);
 			CommonMethods.waitUntilLoading(ICharting.TXT_LoadingIndicator);
 	//		String titleImpacted = CommonMethods.getWebElement(ICharting.TITLE_MISSINT_IMPACTED).getAttribute("innerHTML");
 			
 			stepInfo = "Go to tx plans tab";
 			flag = CommonMethods.clickIfEnable(ICharting.TAB_TX_PLANS);
 			Thread.sleep(2000);
 			action.moveToElement(driver.findElement(ICharting.SLC_TOOTH1_missing),1,20).click().perform();
 			
 			flag = CommonMethods.clickIfEnable(ICharting.BTN_EXTRACTION);
 			flag =CommonMethods.clickIfEnable(ICharting.BTN_ExtractionAddProcedure);
 			CommonMethods.waitUntilLoading(ICharting.TXT_LoadingIndicator);
 	//		String titleExtraction = CommonMethods.getWebElement(ICharting.TITLE_IMPACTED_EXTRACTED).getAttribute("innerHTML");
 			
 			stepInfo ="applying implant on impacted extracted tooth";
 			action.moveToElement(driver.findElement(ICharting.SLC_TOOTH1_missing),1,20).click().perform();
 			flag= CommonMethods.clickIfEnable(ICharting.BTN_TX_DENTURE);
 			flag = CommonMethods.clickIfEnable(ICharting.TILE_TX_DENTURE_partial);
 			flag =CommonMethods.clickIfEnable(ICharting.BTN_ExtractionAddProcedure);
 			CommonMethods.waitUntilLoading(ICharting.TXT_LoadingIndicator);
 			
 			//clear the test case condition by deleting the added test data.
 			
 			flag = CommonMethods.clickIfEnable(ICharting.ROW_lastPreexistingCondition);
 			flag = CommonMethods.clickIfEnable(ICharting.BTN_DeletePreexitingCondition);
 			flag= CommonMethods.isAlertPresent();
 			flag = CommonMethods.clickIfEnable(ICharting.ROW_lastPreexistingCondition);
 			flag = CommonMethods.clickIfEnable(ICharting.BTN_DeletePreexitingCondition);
 			flag= CommonMethods.isAlertPresent();
 			
 			flag =CommonMethods.clickIfEnable(ICharting.TAB_PRE_EXISTING);
 			CommonMethods.waitUntilLoading(ICharting.TXT_LoadingIndicator);
 			flag = CommonMethods.clickIfEnable(ICharting.ROW_lastPreexistingCondition);
 			flag = CommonMethods.clickIfEnable(ICharting.BTN_DeletePreexitingCondition);
 			flag= CommonMethods.isAlertPresent();
 			
 			
 //			System.out.println("title----------->"+titleImpacted);
 //			Assert.assertTrue(titleImpacted.contains("Impacted: &nbsp;Permanent"));
 //			Assert.assertTrue(titleExtraction.contains("D4560: Denticon Data"));
 		} 
 	catch (Exception e) { 
 		e.printStackTrace(); 
 	} 
 	return flag; 
 }	
 	
 		@Test(description="VerifyFullDentureOnExtractedTooth")   
 		public boolean VerifyFullDentureOnExtractedTooth(){ 
 		 
 		try{ 
 			TransactionEntry te= new TransactionEntry();
	 		te.SearchPatientByPatientID("882");
 			flag=verifyPatientChartPage(); 
 			stepInfo="Click on Pre-existing tab"; 
 			Thread.sleep(5000);
 			CommonMethods.waitUntilLoading(ICharting.TXT_LoadingIndicator);
 			flag=CommonMethods.clickIfEnable(ICharting.TAB_PRE_EXISTING); 
 			
 			stepInfo = "select upper row";
 			flag = CommonMethods.clickIfEnable(ICharting.BTN_SelectUpperRow);
 			flag = CommonMethods.isAlertPresent();
 			
 			
 			stepInfo="Clicking on impacted button"; 
 			flag=CommonMethods.clickIfEnable(ICharting.BTN_IMPACTED); 
 			flag=CommonMethods.clickIfEnable(ICharting.TILE_ImpactedPermanetn);
 			stepInfo="Verify the tooth is marked as missing"; 
 
 			Thread.sleep(4000);
 			CommonMethods.waitUntilLoading(ICharting.TXT_LoadingIndicator);
 			 			
 			stepInfo = "Go to tx plans tab";
 			flag = CommonMethods.clickIfEnable(ICharting.TAB_TX_PLANS);
 			Thread.sleep(2000);
 			flag = CommonMethods.clickIfEnable(ICharting.BTN_SelectUpperRow);
 			flag = CommonMethods.isAlertPresent();
 			
 			flag = CommonMethods.clickIfEnable(ICharting.BTN_TX_DENTURE);
 			flag =CommonMethods.clickIfEnable(ICharting.TILE_TX_DENTURE_full);
 			Thread.sleep(2000);
 			flag =CommonMethods.clickIfEnable(ICharting.BTN_DentureAddProcedure);
 			//flag =CommonMethods.clickIfEnable(ICharting.BTN_DentureAddProcedure);
 			Thread.sleep(2000);
 			CommonMethods.waitUntilLoading(ICharting.TXT_LoadingIndicator);
 			 			
 			
 			//clear the test case condition by deleting the added test data.
 			
 			flag = CommonMethods.clickIfEnable(ICharting.ROW_lastPreexistingCondition);
 			flag = CommonMethods.clickIfEnable(ICharting.BTN_DeletePreexitingCondition);
 			flag= CommonMethods.isAlertPresent();
 			Thread.sleep(3000);
 			flag =CommonMethods.clickIfEnable(ICharting.TAB_PRE_EXISTING);
 			Thread.sleep(12000);
 			CommonMethods.waitUntilLoading(ICharting.TXT_LoadingIndicator);
				
	 			
 			for(int i=0;i<16;i++) {
 				Thread.sleep(1000);
 				flag = CommonMethods.clickIfEnable(By.xpath("//table[@class='tblMain']//tbody/tr[last()-"+i+"]/td[1]"));
 	 				
 			}
 			flag = CommonMethods.clickIfEnable(ICharting.BTN_DeletePreexitingCondition);
	 			flag= CommonMethods.isAlertPresent();
	 			
 		} 
 		
 	catch (Exception e) { 
 		e.printStackTrace(); 
 	} 
 	return flag; 
 }	

 	
 	
 	
 		@Test(description="verify implanted missing tooth")    //PASS
 		public boolean VerifyImplantedTooth(){ 
 		 
 		try{ 
 			TransactionEntry te= new TransactionEntry();
	 		te.SearchPatientByPatientID("106");
 			flag=verifyPatientChartPage(); 
 			stepInfo="Click on Pre-existing tab"; 
 			Thread.sleep(5000);
 			CommonMethods.waitUntilLoading(ICharting.TXT_LoadingIndicator);
 			flag=CommonMethods.clickIfEnable(ICharting.TAB_PRE_EXISTING); 
 			stepInfo="Select tooth"; 
 			
 			Actions action = new Actions(driver);
 			action.moveToElement(driver.findElement(ICharting.SLC_TOOTH2),1,20).click().perform();
 			
 			stepInfo="Clicking on missing button"; 
 			flag=CommonMethods.clickIfEnable(ICharting.BTN_MISSING,40); 
 			flag=CommonMethods.clickIfEnable(ICharting.TILE_MissingPErmanent);
 			
 			action.moveToElement(driver.findElement(ICharting.SLC_TOOTH2_Missing),1,20).click().perform();
 			stepInfo="Clicking on missing button"; 
 			flag=CommonMethods.clickIfEnable(ICharting.BTN_IMPLANT); 
 			flag=CommonMethods.clickIfEnable(ICharting.TILE_ImplantBlade);
 			stepInfo="Verify the tooth is marked as missing"; 
 
 			Thread.sleep(4000);
 			CommonMethods.waitUntilLoading(ICharting.TXT_LoadingIndicator);
 			String title = CommonMethods.getWebElement(ICharting.TITLE_MISSING_IMPLANT).getAttribute("innerHTML");
 			
 			//clear the test case condition by deleting the added test data.
 			
 			flag = CommonMethods.clickIfEnable(ICharting.ROW_lastPreexistingCondition);
 			flag = CommonMethods.clickIfEnable(ICharting.BTN_DeletePreexitingCondition);
 			
 			flag= CommonMethods.isAlertPresent();
 			Thread.sleep(2000);
 			CommonMethods.waitUntilLoading(ICharting.TXT_LoadingIndicator);
 			
 			flag = CommonMethods.clickIfEnable(ICharting.ROW_lastPreexistingCondition);
 			flag = CommonMethods.clickIfEnable(ICharting.BTN_DeletePreexitingCondition);
 			
 			flag= CommonMethods.isAlertPresent();
 			System.out.println("title----------->"+title);
 			Assert.assertTrue(title.contains("Implant: &nbsp;Implant Blade"));
  			
 
 		} 
 	catch (Exception e) { 
 		e.printStackTrace(); 
 	} 
 	return flag; 
 } 
 		
 
	@Test(description="verify decay in pre-existing tooth tooth")			
 	public boolean VerifyDecayExistingTooth(){ 
 		 
 		try{ 
 			TransactionEntry te= new TransactionEntry();
	 		te.SearchPatientByPatientID("68");
 			flag=verifyPatientChartPage(); 
 			stepInfo="Click on Pre-existing tab"; 
 			Thread.sleep(5000);
 			CommonMethods.waitUntilLoading(ICharting.TXT_LoadingIndicator);
 			flag=CommonMethods.clickIfEnable(ICharting.TAB_PRE_EXISTING); 
 			stepInfo="Select tooth"; 
 			
 			Actions action = new Actions(driver);
 			action.moveToElement(driver.findElement(ICharting.SLC_TOOTH)).click().perform();
 			
 			stepInfo="Verify the tooth is marked as decay";
 			flag = CommonMethods.clickIfEnable(ICharting.BTN_DECAY);
 
 			Thread.sleep(4000);
 			CommonMethods.waitUntilLoading(ICharting.TXT_LoadingIndicator);
 	//		String title = CommonMethods.getWebElement(ICharting.TITLE_MISSING_IMPLANT).getAttribute("innerHTML");
 			
 			//clear the test case condition by deleting the added test data.
 			
 			flag = CommonMethods.clickIfEnable(ICharting.ROW_lastPreexistingCondition);
 			flag = CommonMethods.clickIfEnable(ICharting.BTN_DeletePreexitingCondition);
 			
 			flag= CommonMethods.isAlertPresent();
 			Thread.sleep(2000);
 			CommonMethods.waitUntilLoading(ICharting.TXT_LoadingIndicator);
 			
 	//		System.out.println("title----------->"+title);
 	//		Assert.assertTrue(title.contains("Decay"));
  			
 
 		} 
 	catch (Exception e) { 
 		e.printStackTrace(); 
 	} 
 	return flag; 
 }
 	
 	
		@Test(description="verify restorative missing tooth")   
 		public boolean VerifySurfaceRestorationTooth(){ 
 		 
 		try{ 
 			TransactionEntry te= new TransactionEntry();
	 		te.SearchPatientByPatientID("106");
 			flag=verifyPatientChartPage(); 
 			stepInfo="Click on Pre-existing tab"; 
 			Thread.sleep(5000);
 			CommonMethods.waitUntilLoading(ICharting.TXT_LoadingIndicator);
 			flag=CommonMethods.clickIfEnable(ICharting.TAB_PRE_EXISTING); 
 			stepInfo="Select tooth"; 
 			Thread.sleep(15000); 
 			flag=CommonMethods.clickIfEnable(ICharting.SLC_ToothRestorative); 
 			
 			
 			stepInfo="Clicking on missing button"; 
 			flag=CommonMethods.clickIfEnable(ICharting.BTN_RESTORATION); 
 			flag=CommonMethods.clickIfEnable(ICharting.TILE_Restoration_amalgam);

 			Thread.sleep(4000);
 			CommonMethods.waitUntilLoading(ICharting.TXT_LoadingIndicator);
 	//		String title = CommonMethods.getWebElement(ICharting.TITLE_Restorative).getAttribute("innerHTML");
 			
//clear the test case condition by deleting the added test data.
 			
 			flag = CommonMethods.clickIfEnable(ICharting.ROW_lastPreexistingCondition);
 			flag = CommonMethods.clickIfEnable(ICharting.BTN_DeletePreexitingCondition);
 			
 			flag= CommonMethods.isAlertPresent();
 			
 	//		System.out.println("title----------->"+title);
 	//		Assert.assertTrue(title.contains("Restoration"));
 		} 
 	catch (Exception e) { 
 		e.printStackTrace(); 
 	} 
 	return flag; 
 } 
 	
}
