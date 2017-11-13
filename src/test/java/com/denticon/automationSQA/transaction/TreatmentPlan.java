package com.denticon.automationSQA.transaction;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.denticon.automationSQA.DriverManager;
import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.ITransaction;
import com.denticon.automationSQA.utilities.CommonMethods;



public class TreatmentPlan extends SeleniumSuite{
	String stepInfo=""; 
		boolean flag=false; 
	 	String filePath=System.getProperty("user.dir") + "\\src\\main\\resources\\TreatmentPlan.properties"; 
	 	Properties prop= new Properties();
	
	 	@Test(description="Verify Patient tab functionality")
		public boolean verifyAddTreatmentPlanUsingCode() {
	 		
			try{ 
				TransactionEntry te= new TransactionEntry();
		 		te.SearchPatientByPatientID("916");

				stepInfo="Click on Transactions tab";
	 			flag=CommonMethods.clickIfEnable(ITransaction.TAB_TRANSACTIONS); 
	 			
	 			stepInfo="Click on treatment plan"; 
	 			flag=CommonMethods.clickIfEnable(ITransaction.TAB_TreatmentPlan);
	 			
	 			int noOfRowsInTreatmentTableBefore = noOfTreatments();
	 			
	 			stepInfo="Enter Code"; 
	 			flag=CommonMethods.sendText(ITransaction.TXT_ProcedureCode,"D0120");
	 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_TE_ProcedureFromProcedureTable2);
	 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_DiagnosticsPopup);
	 			if(CommonMethods.isElementPresent(ITransaction.BTN_TE_DiagnosticsPopup)) {
	 				flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_DiagnosticsPopup);
	 			}
	 			Thread.sleep(4000);
	 			String codeFromAddedRowInTreatmentTable = returnDataFromTreamtmentTable("Code",noOfRowsInTreatmentTableBefore+1);
	 			Assert.assertTrue(codeFromAddedRowInTreatmentTable.equals("D0120"));
	 			
	 			checkLastTreatmentRow(noOfRowsInTreatmentTableBefore+1);
	 			stepInfo="Click on Discount button"; 
	 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_Discount);
	 			stepInfo="Apply Discount in percentage"; 
	 			flag=CommonMethods.sendText(ITransaction.TXT_DiscountPercentage,"1");
	 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_ApplyDiscount);
	 			flag=CommonMethods.isAlertPresent();
	 			Thread.sleep(4000);
	 			String valueFromDiscountColunm = returnDataFromTreamtmentTable("discount", noOfRowsInTreatmentTableBefore+1);
	 			Assert.assertEquals(valueFromDiscountColunm,"D");
	 			
	 			stepInfo="Post To Ledger"; 
	 			checkLastTreatmentRow(noOfRowsInTreatmentTableBefore+1);
	 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_PostToLedger);
	 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_DiagnosticsPopup);
	 			if(CommonMethods.isElementPresent(ITransaction.BTN_TE_DiagnosticsPopup)) {
	 				flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_DiagnosticsPopup);
	 			}
	 			
	 			Assert.assertTrue(DriverManager.getDriver().findElement(ITransaction.TITLE_tranactionEntryPage).isDisplayed());
	 			
	 				 									
	 			 
	 		} catch (Exception e) { 
	 			e.printStackTrace(); 
	 			Assert.fail(); 
	 			
	 		}
	 	
		 		
			return flag;
		 	}
		
	 	
	@Test(description="Verify Patient tab functionality")
	public boolean verifyAddTreatmentPlanUsingToothNumber() {
 		
		try{ 
			TransactionEntry te= new TransactionEntry();
	 		te.SearchPatientByPatientID("916");

			stepInfo="Click on Transactions tab";
 			flag=CommonMethods.clickIfEnable(ITransaction.TAB_TRANSACTIONS); 
 			
 			stepInfo="Click on treatment plan"; 
 			flag=CommonMethods.clickIfEnable(ITransaction.TAB_TreatmentPlan);
 			
 			
 			int noOfRowsInTreatmentTableBefore = noOfTreatments();
 			
 			stepInfo="Click on Implanct Service plan"; 
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_implantService);
 			
 			stepInfo="Double Click on procedure code row for first implant service from the list";
 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_ProcedureFromProcedureTable);
 			 			
 			stepInfo = "Enter Tooth No";
 			flag=CommonMethods.sendText(ITransaction.TXT_ToothNumber,"4");
 			 							
 			stepInfo = "Save Tooth/Surface/Quadrant";
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_saveToothNumber);
 			flag=CommonMethods.switchToDefaultContent();
 			Thread.sleep(4000);
 			int noOfRowsInTreatmentTableAfter= noOfTreatments();
 			Assert.assertTrue(noOfRowsInTreatmentTableAfter == ( noOfRowsInTreatmentTableBefore +1));
 									
 			 
 		} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 
 			
 		}
 	
	 		
		return flag;
	 	}
	
	@Test(description="Verify Patient tab functionality")
	public boolean verifyAddTreatmentPlanUsingQuadrant() {
 		
		try{ 
			TransactionEntry te= new TransactionEntry();
	 		te.SearchPatientByPatientID("916");

			stepInfo="Click on Transactions tab";
 			flag=CommonMethods.clickIfEnable(ITransaction.TAB_TRANSACTIONS); 
 			
 			stepInfo="Click on treatment plan"; 
 			flag=CommonMethods.clickIfEnable(ITransaction.TAB_TreatmentPlan);
 			
 			
 			int noOfRowsInTreatmentTableBefore = noOfTreatments();
 			stepInfo="Click on periodontics Service plan"; 
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_periodontics);
 			
 			stepInfo="Double Click on procedure code row for first periodontics service from the list";
 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_ProcedureFromProcedureTable);
 			 			
 			stepInfo = "Select Upper Left Quadrant";
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_SelectQuadrant);
 			flag=CommonMethods.clickIfEnable(ITransaction.LNK_UpperLeftQuadrant);
 			 							
 			stepInfo = "Save Tooth/Surface/Quadrant";
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_saveToothNumber);
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_DiagnosticsPopup);
 			flag=CommonMethods.switchToDefaultContent();
 			Thread.sleep(4000);
 			int noOfRowsInTreatmentTableAfter= noOfTreatments();
 			Assert.assertTrue(noOfRowsInTreatmentTableAfter == ( noOfRowsInTreatmentTableBefore +1));
 												 
 		} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 			
 		} 		
		return flag;
	 	}
	
	@Test(description="Verify Patient tab functionality")
	public boolean verifyAddTreatmentPlanUsingSurfaces() {
 		
		try{ 
			TransactionEntry te= new TransactionEntry();
	 		te.SearchPatientByPatientID("916");

			stepInfo="Click on Transactions tab";
 			flag=CommonMethods.clickIfEnable(ITransaction.TAB_TRANSACTIONS); 
 			
 			stepInfo="Click on treatment plan"; 
 			flag=CommonMethods.clickIfEnable(ITransaction.TAB_TreatmentPlan);
 			
 			
 			int noOfRowsInTreatmentTableBefore = noOfTreatments();
 			stepInfo="Click on Restorative Service plan"; 
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_restorative);
 			
 			stepInfo="Double Click on procedure code row AmalgamOneSurface procedure from Restorative Section";
 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_AmalgamOneSurfacePrimary1);
 			 			
 			stepInfo = "Select Tooth Number";
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_selectToothNumber);
 			flag=CommonMethods.clickIfEnable(ITransaction.LNK_selectTooth7);
 			 	
 			stepInfo = "Select Surface Number";
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_selectSurfact);
 			flag=CommonMethods.clickIfEnable(ITransaction.LNK_selectMesialSurface);
 			
 			stepInfo = "Save Tooth/Surface/Quadrant";
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_saveToothNumber);
 			flag=CommonMethods.switchToDefaultContent();
 			Thread.sleep(4000);
 			int noOfRowsInTreatmentTableAfter= noOfTreatments();
 			Assert.assertTrue(noOfRowsInTreatmentTableAfter == ( noOfRowsInTreatmentTableBefore +1));
 												 
 		} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 			
 		} 		
		return flag;
	 	}
	
	@Test(description="Verify Patient tab functionality")
	public boolean verifyAddTreatmentPlanUsingUserCode() {
 		
		try{ 
			TransactionEntry te= new TransactionEntry();
	 		te.SearchPatientByPatientID("916");

			stepInfo="Click on Transactions tab";
 			flag=CommonMethods.clickIfEnable(ITransaction.TAB_TRANSACTIONS); 
 			
 			stepInfo="Click on treatment plan"; 
 			flag=CommonMethods.clickIfEnable(ITransaction.TAB_TreatmentPlan);
 			
 			int noOfRowsInTreatmentTableBefore = noOfTreatments();
 			
 			stepInfo="Enter Code"; 
 			flag=CommonMethods.sendText(ITransaction.TXT_UserCode,"Exam");
 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_TE_ProcedureFromProcedureTable2);
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_DiagnosticsPopup);
 			if(CommonMethods.isElementPresent(ITransaction.BTN_TE_DiagnosticsPopup)) {
 				flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_DiagnosticsPopup);
 			}
 			Thread.sleep(4000);
 			int noOfRowsInTreatmentTableAfter= noOfTreatments();
 			Assert.assertTrue(noOfRowsInTreatmentTableAfter == ( noOfRowsInTreatmentTableBefore +1));
 				 									
 			 
 		} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 
 			
 		}
 	
	 		
		return flag;
	 	}
//	@Test(description="Verify Patient tab functionality")
	public boolean verifyAddTreatmentPlanFromCategories() {
 		
		try{ 
			TransactionEntry te= new TransactionEntry();
	 		te.SearchPatientByPatientID("916");

			stepInfo="Click on Transactions tab";
 			flag=CommonMethods.clickIfEnable(ITransaction.TAB_TRANSACTIONS); 
 			
 			stepInfo="Click on treatment plan"; 
 			flag=CommonMethods.clickIfEnable(ITransaction.TAB_TreatmentPlan);
 			
 			
 			int noOfRowsInTreatmentTableBefore = noOfTreatments();
 			
 			stepInfo="Click on Diagnostic plan"; 
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_diagnostic);
 			
 			stepInfo="Double Click on procedure code row for first diagnostic service from the list";
 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_PeriodicOralEvaluationProcedure);
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_DiagnosticsPopup);
 			if(CommonMethods.isElementPresent(ITransaction.BTN_TE_DiagnosticsPopup)) {
 				flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_DiagnosticsPopup);	
 			}
 			Thread.sleep(4000);
 			int noOfRowsInTreatmentTableAfter= noOfTreatments();
 			Assert.assertTrue(noOfRowsInTreatmentTableAfter == ( noOfRowsInTreatmentTableBefore +1));
 			
 			noOfRowsInTreatmentTableBefore = noOfTreatments();
 			
 			stepInfo="Click on Maxillo Prosth plan"; 
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_maxilloProsth);
 			
 			stepInfo="Double Click on procedure code row for first diagnostic service from the list";
 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_ProcedureFromProcedureTable);
 			 			 		 							
 			Thread.sleep(4000);
 			noOfRowsInTreatmentTableAfter= noOfTreatments();
 			Assert.assertTrue(noOfRowsInTreatmentTableAfter == ( noOfRowsInTreatmentTableBefore +1));
 									
 			noOfRowsInTreatmentTableBefore = noOfTreatments();
 			
 			stepInfo="Click on Proths fixed plan"; 
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_prothsFixed);
 			
 			stepInfo="Double Click on procedure code row for first diagnostic service from the list";
 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_ProcedureFromProcedureTable);
 			
 			stepInfo = "Enter Tooth No";
 			flag=CommonMethods.sendText(ITransaction.TXT_ToothNumber,"4");
 			 			
 			stepInfo = "Save Tooth/Surface/Quadrant";
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_saveToothNumber);
 			
 			Thread.sleep(4000);
 			noOfRowsInTreatmentTableAfter= noOfTreatments();
 			Assert.assertTrue(noOfRowsInTreatmentTableAfter == ( noOfRowsInTreatmentTableBefore +1)); 
 			
 			noOfRowsInTreatmentTableBefore = noOfTreatments();
 			
 			stepInfo="Click on Proths fixed plan"; 
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_Orthoddontics);
 			
 			stepInfo="Double Click on procedure code row for first diagnostic service from the list";
 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_ProcedureFromProcedureTable);
 					
 			Thread.sleep(4000);
 			noOfRowsInTreatmentTableAfter= noOfTreatments();
 			Assert.assertTrue(noOfRowsInTreatmentTableAfter == ( noOfRowsInTreatmentTableBefore +1)); 
 			
 			noOfRowsInTreatmentTableBefore = noOfTreatments();
 			
 			stepInfo="Click on Proths fixed plan"; 
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_Other);
 			
 			stepInfo="Double Click on procedure code row for first diagnostic service from the list";
 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_ProcedureFromProcedureTable);
 					
 			Thread.sleep(4000);
 			noOfRowsInTreatmentTableAfter= noOfTreatments();
 			Assert.assertTrue(noOfRowsInTreatmentTableAfter == ( noOfRowsInTreatmentTableBefore +1)); 
 			
 			noOfRowsInTreatmentTableBefore = noOfTreatments();
 			
 			stepInfo="Click on Proths fixed plan"; 
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_Preventive);
 			
 			stepInfo="Double Click on procedure code row for first diagnostic service from the list";
 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_ProcedureFromProcedureTable);
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_DiagnosticsPopup);
 					
 			Thread.sleep(4000);
 			noOfRowsInTreatmentTableAfter= noOfTreatments();
 			Assert.assertTrue(noOfRowsInTreatmentTableAfter == ( noOfRowsInTreatmentTableBefore +1)); 
 			
 			noOfRowsInTreatmentTableBefore = noOfTreatments();
 			
 			stepInfo="Click on Proths fixed plan"; 
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_Endodontics);
 			
 			stepInfo="Double Click on procedure code row for first diagnostic service from the list";
 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_ProcedureFromProcedureTable);
 			
 			stepInfo = "Enter Tooth No";
 			flag=CommonMethods.sendText(ITransaction.TXT_ToothNumber,"4");
 			
 			stepInfo = "Save Tooth/Surface/Quadrant";
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_saveToothNumber); 			 		 							
 			
 			Thread.sleep(4000);
 			noOfRowsInTreatmentTableAfter= noOfTreatments();
 			Assert.assertTrue(noOfRowsInTreatmentTableAfter == ( noOfRowsInTreatmentTableBefore +1)); 
 			
 			noOfRowsInTreatmentTableBefore = noOfTreatments();
 			
 			stepInfo="Click on Proths fixed plan"; 
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_ProthsRemov);
 			
 			stepInfo="Double Click on procedure code row for first diagnostic service from the list";
 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_ProcedureFromProcedureTable);
 					
 			Thread.sleep(4000);
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_DiagnosticsPopup);
 			Thread.sleep(4000);
 			noOfRowsInTreatmentTableAfter= noOfTreatments();
 			Assert.assertTrue(noOfRowsInTreatmentTableAfter == ( noOfRowsInTreatmentTableBefore +1)); 
 			
 			noOfRowsInTreatmentTableBefore = noOfTreatments();
 			
 			stepInfo="Click on Proths fixed plan"; 
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_OralSurgery);
 			
 			stepInfo="Double Click on procedure code row for first diagnostic service from the list";
 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_TE_CoronalRemanantsProcedure1);
 					
 			stepInfo = "Select Tooth Number";
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_selectToothNumber);
 			flag=CommonMethods.clickIfEnable(ITransaction.LNK_selectToothA);
 			
 			stepInfo = "Save Tooth/Surface/Quadrant";
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_saveToothNumber);
 			
 			
 			Thread.sleep(4000);
 			noOfRowsInTreatmentTableAfter= noOfTreatments();
 			Assert.assertTrue(noOfRowsInTreatmentTableAfter == ( noOfRowsInTreatmentTableBefore +1)); 
 			
 			noOfRowsInTreatmentTableBefore = noOfTreatments();
 			
 			stepInfo="Click on Proths fixed plan"; 
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_AdjunctServ);
 			
 			stepInfo="Double Click on procedure code row for first diagnostic service from the list";
 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_ProcedureFromProcedureTable);
 			
 			stepInfo = "Select Tooth Number";
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_selectToothNumber);
 			flag=CommonMethods.clickIfEnable(ITransaction.LNK_selectToothA);
 			
 			stepInfo = "Save Tooth/Surface/Quadrant";
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_saveToothNumber);
 			
 			Thread.sleep(4000);
 			noOfRowsInTreatmentTableAfter= noOfTreatments();
 			Assert.assertTrue(noOfRowsInTreatmentTableAfter == ( noOfRowsInTreatmentTableBefore +1)); 
 			
 			noOfRowsInTreatmentTableBefore = noOfTreatments();
 			
 			stepInfo="Click on Proths fixed plan"; 
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_AllMedical);
 			
 			stepInfo="Double Click on procedure code row for first diagnostic service from the list";
 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_ProcedureFromProcedureTable);
 		if(CommonMethods.isElementPresent(ITransaction.BTN_TE_DiagnosticsPopup)) {
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_DiagnosticsPopup);
 		}
 					
 			Thread.sleep(4000);
 			noOfRowsInTreatmentTableAfter= noOfTreatments();
 			Assert.assertTrue(noOfRowsInTreatmentTableAfter == ( noOfRowsInTreatmentTableBefore +1)); 
 			
 		} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 
 			
 		}
 	
	 		
		return flag;
	 	}
	
//	@Test(description="Verify Patient tab functionality")
	public boolean verifyChangeAddedTreatmentPlanDetails() {
 		
		try{ 
			TransactionEntry te= new TransactionEntry();
	 		te.SearchPatientByPatientID("916");

			stepInfo="Click on Transactions tab";
 			flag=CommonMethods.clickIfEnable(ITransaction.TAB_TRANSACTIONS); 
 			
 			stepInfo="Click on treatment plan"; 
 			flag=CommonMethods.clickIfEnable(ITransaction.TAB_TreatmentPlan);
 			
 			int noOfRowsInTreatmentTableBefore = noOfTreatments();
 			
 			stepInfo="Enter Code"; 
 			flag=CommonMethods.sendText(ITransaction.TXT_ProcedureCode,"D0120");
 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_TE_ProcedureFromProcedureTable2);
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_DiagnosticsPopup);
 			if(CommonMethods.isElementPresent(ITransaction.BTN_TE_DiagnosticsPopup)) {
 				flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_DiagnosticsPopup);
 	 				
 			}
 			Thread.sleep(4000);
 			String codeFromAddedRowInTreatmentTable = returnDataFromTreamtmentTable("Code",noOfRowsInTreatmentTableBefore+1);
 			Assert.assertTrue(codeFromAddedRowInTreatmentTable.equals("D0120"));
 			
 			checkLastTreatmentRow(noOfRowsInTreatmentTableBefore+1);
 			stepInfo="change Tx Councelor"; 
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_changeCouncelorOption);
 			flag=CommonMethods.selectFromList(ITransaction.DRD_changeCouncelorDropDown,"Amy Chun");
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_changeCouncelor);
 			flag=CommonMethods.isAlertPresent();
 			Thread.sleep(4000);
 			String DataFromCouncelorInTreatmentTable = returnDataFromTreamtmentTable("Councelor",noOfRowsInTreatmentTableBefore+1);
 			Assert.assertTrue(DataFromCouncelorInTreatmentTable.equals("AMYCHUN1"));
 			
 			checkLastTreatmentRow(noOfRowsInTreatmentTableBefore+1);
 			stepInfo="change Provider"; 
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_changeProviderOption);
 			flag=CommonMethods.selectFromList(ITransaction.DRD_changeProviderDropDown,"01MS : Smith, Mary DMD");
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_changeProvider);
 			flag=CommonMethods.isAlertPresent();
 			Thread.sleep(4000);
 			String ProviderInTreatmentTable = returnDataFromTreamtmentTable("Provider",noOfRowsInTreatmentTableBefore+1);
 			Assert.assertTrue(ProviderInTreatmentTable.equals("2526"));
 			
 			
 			
 			checkLastTreatmentRow(noOfRowsInTreatmentTableBefore+1);
 			stepInfo="change Status"; 
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_changeStatusOption);
 			flag=CommonMethods.clickIfEnable(ITransaction.RDO_changeStatusHold);
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_changeStatus);
 			flag=CommonMethods.isAlertPresent();
 			Thread.sleep(4000);
 			String StatusInTreatmentTable = returnDataFromTreamtmentTable("Status",noOfRowsInTreatmentTableBefore+1);
 			Assert.assertTrue(StatusInTreatmentTable.equals("H"));
 			
 			checkLastTreatmentRow(noOfRowsInTreatmentTableBefore+1);
 			stepInfo="change ID"; 
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_changePlanIdOption);
 			flag=CommonMethods.sendText(ITransaction.TXT_changePlanID,"2");
 			flag=CommonMethods.sendText(ITransaction.TXT_changePhaseID,"2");
 			flag=CommonMethods.sendText(ITransaction.TXT_changeOrderID,"2");
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_changePlanId);
 			flag=CommonMethods.isAlertPresent();
 			Thread.sleep(4000);
 			String TIDInTreatmentTable = returnDataFromTreamtmentTable("TID",noOfRowsInTreatmentTableBefore+1);
 			String PIDInTreatmentTable = returnDataFromTreamtmentTable("PID",noOfRowsInTreatmentTableBefore+1);
 			String OrderDInTreatmentTable = returnDataFromTreamtmentTable("OrderID",noOfRowsInTreatmentTableBefore+1);
 			Assert.assertTrue(TIDInTreatmentTable.equals("2"));
 			Assert.assertTrue(PIDInTreatmentTable.equals("2"));
 			Assert.assertTrue(OrderDInTreatmentTable.equals("2"));
 			
 			//flag=CommonMethods.clickIfEnable(ITransaction.RDO_changeStatusHold);
 			//flag=CommonMethods.clickIfEnable(ITransaction.BTN_changeStatus);
 			flag=CommonMethods.selectFromList(ITransaction.DRPDWN_PlanFilter, "--Tx Plan Filter--");
 			noOfRowsInTreatmentTableBefore = noOfTreatments();
 			stepInfo="Show Plan"; 
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_showPlanOption);
 			flag=CommonMethods.sendText(ITransaction.TXT_showPlanId,"2");
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_showPlan);
 			
 			Thread.sleep(4000);
 			int noOfRowsInTreamtmentTableAfterFilter = noOfTreatments();
 			Assert.assertTrue(noOfRowsInTreatmentTableBefore+1 >= noOfRowsInTreamtmentTableAfterFilter);
 			
 			//Pre-AUth TEst cases gives error "one of the selected treatment has no billing order"
 			flag=CommonMethods.selectFromList(ITransaction.DRPDWN_PlanFilter, "--Tx Plan Filter--");
 			noOfRowsInTreamtmentTableAfterFilter = noOfTreatments();
 			if(noOfRowsInTreamtmentTableAfterFilter!=0) {
 				checkLastTreatmentRow(noOfRowsInTreatmentTableBefore+1);
 				stepInfo="Delete Treatment"; 
 	 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_deleteTreatment);
 	 			flag=CommonMethods.isAlertPresent();	 									
 	 			
 			}
 			
 			 
 		} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 
 			
 		}
 	
	 		
		return flag;
	 	}
	public static int noOfTreatments(){
		
		int noOfRows = DriverManager.getDriver().findElements(ITransaction.ROWS_preexistingTreatment).size();
		if(noOfRows == 1){
			try{
				if(DriverManager.getDriver().findElement(By.xpath("//div[contains(text(),'No records')]")).isDisplayed()){
					return 0;
					}		
				}catch(NoSuchElementException e){
				return 1;
			}			
		}
		return noOfRows;	
	}
	
	public String returnDataFromTreamtmentTable(String field,int rowNo){
		String specificCodeLocator = null;
		String genericCodeLocatorInTreamtmentTable = null;
		switch (field) {
		case "Code":
			genericCodeLocatorInTreamtmentTable = "//table[@id='dgTPlanctl0']//tbody/tr[rowNo]/td[12]";
			specificCodeLocator = DriverManager.getDriver().findElement(By.xpath(genericCodeLocatorInTreamtmentTable.replaceAll("rowNo", Integer.toString(rowNo)))).getText();
			break;
		case "discount":
			genericCodeLocatorInTreamtmentTable = "//table[@id='dgTPlanctl0']//tbody/tr[rowNo]/td[23]/span";
			specificCodeLocator = DriverManager.getDriver().findElement(By.xpath(genericCodeLocatorInTreamtmentTable.replaceAll("rowNo", Integer.toString(rowNo)))).getText();
			break;
		case "Councelor":
			genericCodeLocatorInTreamtmentTable = "//table[@id='dgTPlanctl0']//tbody/tr[rowNo]/td[24]";
			specificCodeLocator = DriverManager.getDriver().findElement(By.xpath(genericCodeLocatorInTreamtmentTable.replaceAll("rowNo", Integer.toString(rowNo)))).getText();
			break;
		case "Provider":
			genericCodeLocatorInTreamtmentTable = "//table[@id='dgTPlanctl0']//tbody/tr[rowNo]/td[19]";
			specificCodeLocator = DriverManager.getDriver().findElement(By.xpath(genericCodeLocatorInTreamtmentTable.replaceAll("rowNo", Integer.toString(rowNo)))).getText();
			break;//Status
		case "Status":
			genericCodeLocatorInTreamtmentTable = "//table[@id='dgTPlanctl0']//tbody/tr[rowNo]/td[6]/span";
			specificCodeLocator = DriverManager.getDriver().findElement(By.xpath(genericCodeLocatorInTreamtmentTable.replaceAll("rowNo", Integer.toString(rowNo)))).getText();
			break;
		case "TID":
			genericCodeLocatorInTreamtmentTable = "//table[@id='dgTPlanctl0']//tbody/tr[rowNo]/td[3]";
			specificCodeLocator = DriverManager.getDriver().findElement(By.xpath(genericCodeLocatorInTreamtmentTable.replaceAll("rowNo", Integer.toString(rowNo)))).getText();
			break;
		case "PID":
			genericCodeLocatorInTreamtmentTable = "//table[@id='dgTPlanctl0']//tbody/tr[rowNo]/td[4]";
			specificCodeLocator = DriverManager.getDriver().findElement(By.xpath(genericCodeLocatorInTreamtmentTable.replaceAll("rowNo", Integer.toString(rowNo)))).getText();
			break;
		case "OrderID":
			genericCodeLocatorInTreamtmentTable = "//table[@id='dgTPlanctl0']//tbody/tr[rowNo]/td[5]";
			specificCodeLocator = DriverManager.getDriver().findElement(By.xpath(genericCodeLocatorInTreamtmentTable.replaceAll("rowNo", Integer.toString(rowNo)))).getText();
			break;
		default:
			break;//
		}
					
		return specificCodeLocator;
	}
	
	public static void checkFirstTreatmentRow(){
		try{
			DriverManager.getDriver().findElement(By.xpath("//table[@id='dgTPlanctl0']//tbody/tr[1]/td[1]/span/input")).click();
		}catch(Exception e){
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	public static void checkLastTreatmentRow(int rowNo){
		try{
			//CommonMethods.clickIfEnable(By.xpath("//table[@id='dgTPlanctl0']//tbody/tr[\"+rowNo+\"]/td[1]/span/input"));
			CommonMethods.clickIfEnable(By.xpath("//table[@id='dgTPlanctl0']//tbody/tr["+rowNo+"]/td[1]/span/input"));
			}catch(Exception e){
			e.printStackTrace();
			Assert.fail();
		}
	}
}