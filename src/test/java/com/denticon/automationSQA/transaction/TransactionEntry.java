package com.denticon.automationSQA.transaction;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.denticon.automationSQA.DriverManager;
import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.IAddPatient;
import com.denticon.automationSQA.pom.ISearchPatient;
import com.denticon.automationSQA.pom.ITransaction;
import com.denticon.automationSQA.utilities.CommonMethods;



public class TransactionEntry extends SeleniumSuite{  
	String stepInfo=""; 
		boolean flag=false; 
	 	String filePath=System.getProperty("user.dir") + "\\src\\main\\resources\\TreatmentPlan.properties"; 
	 	Properties prop= new Properties();
	
		@Test(description="previously added treatment should be displayed in transaction entry")
	 	public boolean verifyPreviousTreatmentPlanInTransactionEntry() {
	 		
	 	try{ 
	 		SearchPatientByPatientID("916");

	 		stepInfo="Click on Transactions tab";
 			flag=CommonMethods.clickIfEnable(ITransaction.TAB_TRANSACTIONS); 
 			
	 		stepInfo="Click on treatment plan"; 
 			flag=CommonMethods.clickIfEnable(ITransaction.TAB_TreatmentPlan);
 			
 			stepInfo="Enter Code"; 
 			int noOfRows = TreatmentPlan.noOfTreatments();
 			flag=CommonMethods.sendText(ITransaction.TXT_ProcedureCode,"D0140");
 			stepInfo="Double click on the first row from procedure table"; 
 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_TE_ProcedureFromProcedureTable2);
 			Thread.sleep(2000);
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_DiagnosticsPopup);
 			
 			
 			TreatmentPlan.checkLastTreatmentRow(noOfRows+1);
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_PostToLedger);
 			
 			stepInfo="Click on Transactions tab";
 			flag=CommonMethods.clickIfEnable(ITransaction.TAB_TRANSACTIONS); 
 			
 			stepInfo="Click on treatment plan"; 
 			flag=CommonMethods.clickIfEnable(ITransaction.TAB_TransactionEntry);
 			noOfRows = noOfTreatmentsInTransactionEntry();
 			Thread.sleep(4000);
 			Assert.assertTrue(returnDataFromTreamtmentTable("Code", noOfRows).equals("D0140"));
	 	
	 	} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 
 			
 		} 		
		return flag; 		
	 	}
	 	
		@Test(description="Verify Patient tab functionality")
		public boolean verifyAddTreatmentPlanUsingDifferentCodes() {
	 		
			try{ 
		 		SearchPatientByPatientID("916");

				stepInfo="Click on Transactions tab";
	 			flag=CommonMethods.clickIfEnable(ITransaction.TAB_TRANSACTIONS); 
	 			
	 			stepInfo="Click on Transactions Entry"; 
	 			flag=CommonMethods.clickIfEnable(ITransaction.TAB_TransactionEntry);
	 			
	 			stepInfo="Enter Code"; 
	 			flag=CommonMethods.sendText(ITransaction.TXT_TE_ProcedureCode,"D0150");
	 			Thread.sleep(4000);	
	 			
	 			int noOfRows = noOfTreatmentsInTransactionEntry();
	 			Thread.sleep(4000);
	 			Assert.assertTrue(returnDataFromTreamtmentTable("Code", noOfRows).equals("D0150"));
	 				
	 			int noOfRowsInTreatmentTableBefore = noOfTreatmentsInTransactionEntry();
	 			stepInfo="Enter Code with Tooth number"; 
	 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_ImplantService);
	 			
	 			stepInfo="Double Click on procedure code row for first implant service from the list";
	 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_TE_ProcedureFromProcedureTable1);
	 			Thread.sleep(3000);
	 			stepInfo = "Enter Tooth No";
	 			flag=CommonMethods.sendText(ITransaction.TXT_ToothNumber,"4");
	 			stepInfo = "Save Tooth/Surface/Quadrant";
	 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_saveToothNumber);
	 			
	 			int noOfRowsInTreatmentTableAfter= noOfTreatmentsInTransactionEntry();
	 			Assert.assertTrue(noOfRowsInTreatmentTableAfter == ( noOfRowsInTreatmentTableBefore +1));
	 			
	 			
	 			noOfRowsInTreatmentTableBefore = noOfTreatmentsInTransactionEntry();
	 			stepInfo="Click on periodontics Service plan"; 
	 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_Periodontics);
	 			
	 			stepInfo="Double Click on procedure code row for first periodontics service from the list";
	 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_TE_ProcedureFromProcedureTable1);
	 			 			
	 			stepInfo = "Select Upper Left Quadrant";
	 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_SelectQuadrant);
	 			flag=CommonMethods.clickIfEnable(ITransaction.LNK_UpperLeftQuadrant);
	 			 							
	 			stepInfo = "Save Tooth/Surface/Quadrant";
	 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_saveToothNumber);
	 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_DiagnosticsPopup);
	 			flag=CommonMethods.switchToDefaultContent();
	 			
	 			noOfRowsInTreatmentTableAfter= noOfTreatmentsInTransactionEntry();
	 			Assert.assertTrue(noOfRowsInTreatmentTableAfter == ( noOfRowsInTreatmentTableBefore +1));
	 			
	 			noOfRowsInTreatmentTableBefore = noOfTreatmentsInTransactionEntry();
	 			stepInfo="Click on Restorative Service plan"; 
	 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_Restorative);
	 			
	 			stepInfo="Double Click on procedure code row AmalgamOneSurface procedure from Restorative Section";
	 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_TE_AmalgamOneSurfacePrimary);
	 			 			
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
	 			noOfRowsInTreatmentTableAfter= noOfTreatmentsInTransactionEntry();
	 			Assert.assertTrue(noOfRowsInTreatmentTableAfter == ( noOfRowsInTreatmentTableBefore +1));
	 			
	 			noOfRowsInTreatmentTableBefore = noOfTreatmentsInTransactionEntry();
	 			
	 			stepInfo="Enter User Code"; 
	 			flag=CommonMethods.sendText(ITransaction.TXT_TE_UserCode,"DV1");
	 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_TE_ProcedureFromProcedureTable2);
	 			//flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_DiagnosticsPopup);
	 			Thread.sleep(4000);
	 			noOfRowsInTreatmentTableAfter= noOfTreatmentsInTransactionEntry();
	 			Assert.assertTrue(noOfRowsInTreatmentTableAfter == ( noOfRowsInTreatmentTableBefore +1));

	 			noOfRowsInTreatmentTableBefore = noOfTreatmentsInTransactionEntry();
	 			
	 			stepInfo="Enter Description"; 
	 			flag=CommonMethods.sendText(ITransaction.TXT_TE_Description,"Compsve Oral");
	 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_TE_ProcedureFromProcedureTable1);
	 			Thread.sleep(4000);
	 			noOfRowsInTreatmentTableAfter= noOfTreatmentsInTransactionEntry();
	 			Assert.assertTrue(noOfRowsInTreatmentTableAfter == ( noOfRowsInTreatmentTableBefore +1));
	 			
	 			noOfRowsInTreatmentTableBefore = noOfTreatmentsInTransactionEntry();
	 			
	 			
	 			stepInfo="Click on Diagnostic plan"; 
	 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_Diagnostics);
	 			
	 			stepInfo="Double Click on procedure code row for first diagnostic service from the list";
	 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_TE_PeriodicOralEvaluationProcedure);
	 			
	 			stepInfo="Click on Diagnostic plan"; 
	 			//flag=CommonMethods.isAlertPresent();
	 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_DiagnosticsPopup);
	 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_DiagnosticsPopup);	 		 							
	 			Thread.sleep(4000);
	 			flag = CommonMethods.clickIfEnable(ITransaction.BTN_TE_DiagnosticsPopup);
	 			noOfRowsInTreatmentTableAfter= noOfTreatmentsInTransactionEntry();
	 			Assert.assertTrue(noOfRowsInTreatmentTableAfter == ( noOfRowsInTreatmentTableBefore +1));
	 			
	 			noOfRowsInTreatmentTableBefore = noOfTreatmentsInTransactionEntry();
	 			stepInfo="Click on Maxillo Prosth plan"; 
	 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_MaxilloProsth);
	 			
	 			stepInfo="Double Click on procedure code row for first diagnostic service from the list";
	 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_TE_ProcedureFromProcedureTable1);
	 			 			 		 							
	 			Thread.sleep(4000);
	 			noOfRowsInTreatmentTableAfter= noOfTreatmentsInTransactionEntry();
	 			Assert.assertTrue(noOfRowsInTreatmentTableAfter == ( noOfRowsInTreatmentTableBefore +1));
	 			
	 			noOfRowsInTreatmentTableBefore = noOfTreatmentsInTransactionEntry();
	 			
	 			stepInfo="Click on Proths fixed plan"; 
	 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_ProsthFixed);
	 			
	 			stepInfo="Double Click on procedure code row for first diagnostic service from the list";
	 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_TE_ProcedureFromProcedureTable1);
	 			
	 			stepInfo = "Enter Tooth No";
	 			flag=CommonMethods.sendText(ITransaction.TXT_ToothNumber,"4");
	 			 			
	 			stepInfo = "Save Tooth/Surface/Quadrant";
	 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_saveToothNumber);
	 			Thread.sleep(4000);
	 			noOfRowsInTreatmentTableAfter= noOfTreatmentsInTransactionEntry();
	 			Assert.assertTrue(noOfRowsInTreatmentTableAfter == ( noOfRowsInTreatmentTableBefore +1)); 
	 			
	 			noOfRowsInTreatmentTableBefore = noOfTreatmentsInTransactionEntry();
	 			
	 			stepInfo="Click on Proths fixed plan"; 
	 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_Orthodontics);
	 			
	 			stepInfo="Double Click on procedure code row for first diagnostic service from the list";
	 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_TE_ProcedureFromProcedureTable1);
	 					
	 			Thread.sleep(4000);
	 			noOfRowsInTreatmentTableAfter= noOfTreatmentsInTransactionEntry();
	 			Assert.assertTrue(noOfRowsInTreatmentTableAfter == ( noOfRowsInTreatmentTableBefore +1)); 
	 			
	 			noOfRowsInTreatmentTableBefore = noOfTreatmentsInTransactionEntry();
	 			
	 			stepInfo="Click on Proths fixed plan"; 
	 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_Other);
	 			
	 			stepInfo="Double Click on procedure code row for first diagnostic service from the list";
	 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_TE_ProcedureFromProcedureTable1);
	 					
	 			Thread.sleep(4000);
	 			noOfRowsInTreatmentTableAfter= noOfTreatmentsInTransactionEntry();
	 			Assert.assertTrue(noOfRowsInTreatmentTableAfter == ( noOfRowsInTreatmentTableBefore +1)); 
	 			
	 			noOfRowsInTreatmentTableBefore = noOfTreatmentsInTransactionEntry();
	 			
	 			stepInfo="Click on Proths fixed plan"; 
	 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_Preventive);
	 			
	 			stepInfo="Double Click on procedure code row for first diagnostic service from the list";
	 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_TE_ProcedureFromProcedureTable1);
	 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_PreventiveSave);	
	 			Thread.sleep(4000);
	 			noOfRowsInTreatmentTableAfter= noOfTreatmentsInTransactionEntry();
	 			Assert.assertTrue(noOfRowsInTreatmentTableAfter == ( noOfRowsInTreatmentTableBefore +1)); 
	 			
	 			noOfRowsInTreatmentTableBefore = noOfTreatmentsInTransactionEntry();
	 			
	 			stepInfo="Click on Proths fixed plan"; 
	 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_Endodontics);
	 			
	 			stepInfo="Double Click on procedure code row for first diagnostic service from the list";
	 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_TE_ProcedureFromProcedureTable1);
	 			
	 			stepInfo = "Enter Tooth No";
	 			flag=CommonMethods.sendText(ITransaction.TXT_ToothNumber,"4");
	 			
	 			stepInfo = "Save Tooth/Surface/Quadrant";
	 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_saveToothNumber); 			 		 							
	 			
	 			Thread.sleep(4000);
	 			noOfRowsInTreatmentTableAfter= noOfTreatmentsInTransactionEntry();
	 			Assert.assertTrue(noOfRowsInTreatmentTableAfter == ( noOfRowsInTreatmentTableBefore +1)); 
	 			
	 			noOfRowsInTreatmentTableBefore = noOfTreatmentsInTransactionEntry();
	 			
	 			stepInfo="Click on Proths fixed plan"; 
	 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_ProsthRemove);
	 			
	 			stepInfo="Double Click on procedure code row for first diagnostic service from the list";
	 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_TE_ProcedureFromProcedureTable1);
	 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_DiagnosticsPopup);
	 					
	 			Thread.sleep(4000);
	 			noOfRowsInTreatmentTableAfter= noOfTreatmentsInTransactionEntry();
	 			Assert.assertTrue(noOfRowsInTreatmentTableAfter == ( noOfRowsInTreatmentTableBefore +1)); 
	 			
	 			noOfRowsInTreatmentTableBefore = noOfTreatmentsInTransactionEntry();
	 			
	 			stepInfo="Click on Proths fixed plan"; 
	 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_OralSurgery);
	 			
	 			stepInfo="Double Click on procedure code row for first diagnostic service from the list";
	 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_TE_CoronalRemanantsProcedure);
	 					
	 			stepInfo = "Select Tooth Number";
	 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_selectToothNumber);
	 			flag=CommonMethods.clickIfEnable(ITransaction.LNK_selectToothA);
	 			
	 			stepInfo = "Save Tooth/Surface/Quadrant";
	 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_saveToothNumber);
	 			
	 			
	 			Thread.sleep(4000);
	 			noOfRowsInTreatmentTableAfter= noOfTreatmentsInTransactionEntry();
	 			Assert.assertTrue(noOfRowsInTreatmentTableAfter == ( noOfRowsInTreatmentTableBefore +1)); 
	 			
	 			noOfRowsInTreatmentTableBefore = noOfTreatmentsInTransactionEntry();
	 			
	 			stepInfo="Click on Proths fixed plan"; 
	 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_AdjuntServ);
	 			
	 			stepInfo="Double Click on procedure code row for first diagnostic service from the list";
	 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_TE_ProcedureFromProcedureTable1);
	 			
	 			stepInfo = "Select Tooth Number";
	 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_selectToothNumber);
	 			flag=CommonMethods.clickIfEnable(ITransaction.LNK_selectToothA);
	 			
	 			stepInfo = "Save Tooth/Surface/Quadrant";
	 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_saveToothNumber);
	 					
	 			Thread.sleep(4000);
	 			noOfRowsInTreatmentTableAfter= noOfTreatmentsInTransactionEntry();
	 			Assert.assertTrue(noOfRowsInTreatmentTableAfter == ( noOfRowsInTreatmentTableBefore +1)); 
	 			
	 				 			
	 			
	 			noOfRowsInTreatmentTableBefore = noOfTreatmentsInTransactionEntry();
	 			
	 			stepInfo="Click on Proths fixed plan"; 
	 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_AllMed);
	 			
	 			stepInfo="Double Click on procedure code row for first diagnostic service from the list";
	 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_TE_ProcedureFromProcedureTable1);
	 			flag =CommonMethods.clickIfEnable(ITransaction.BTN_TE_DiagnosticsPopup);
	 			//flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_AllMedSave);
	 					
	 			Thread.sleep(4000);
	 			noOfRowsInTreatmentTableAfter= noOfTreatmentsInTransactionEntry();
	 			Assert.assertTrue(noOfRowsInTreatmentTableAfter == ( noOfRowsInTreatmentTableBefore +1)); 
	 			
	 		} catch (Exception e) { 
	 			e.printStackTrace(); 
	 			Assert.fail(); 
	 			
	 		} 		
			return flag;
		 	}
	 	
	 	@Test(description="previously added treatment should be displayed in transaction entry")
	 	public boolean editTreatmentPage() {
	 		
	 	try{ 
	 		SearchPatientByPatientID("916");

	 		stepInfo="Click on Transactions tab";
 			flag=CommonMethods.clickIfEnable(ITransaction.TAB_TRANSACTIONS); 
 			
	 		stepInfo="Click on treatment plan"; 
 			flag=CommonMethods.clickIfEnable(ITransaction.TAB_TransactionEntry);
 			
 			stepInfo="Enter Code"; 
 			int noOfRows = noOfTreatmentsInTransactionEntry();
 			flag=CommonMethods.sendText(ITransaction.TXT_TE_ProcedureCode,"D0140");
 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_TE_ProcedureFromProcedureTable1);
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_DiagnosticsPopup);
 			
 			Thread.sleep(4000);
 			
 			stepInfo="Click on date on the added treatment"; 
 			clickOnDateFromTreatmentTable(noOfRows+1);
 			
 			Assert.assertTrue(CommonMethods.isElementPresent(ITransaction.TITL_EditTreatment));
 			
 			stepInfo="Delete Procedure Code"; 
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_DeleteTreament);
 			flag=CommonMethods.isAlertPresent();
	 	
	 	} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 
 			
 		} 		
		return flag; 		
	 	}
	 	
	 	@Test(description="previously added treatment should be displayed in transaction entry")
	 	public boolean LedgerPage() {
	 		
	 	try{ 
	 		SearchPatientByPatientID("916");

	 		stepInfo="Click on Transactions tab";
 			flag=CommonMethods.clickIfEnable(ITransaction.TAB_TRANSACTIONS); 
 			
	 		stepInfo="Click on treatment plan"; 
 			flag=CommonMethods.clickIfEnable(ITransaction.TAB_TransactionEntry);
 			
 			stepInfo="Enter Code"; 
 			int noOfRows = noOfTreatmentsInTransactionEntry();
 			flag=CommonMethods.sendText(ITransaction.TXT_TE_ProcedureCode,"D0140");
 			
 			Thread.sleep(4000);
 					
 			stepInfo="Go to Ledger"; 
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_Ledger);
 			Assert.assertTrue(CommonMethods.isElementPresent(ITransaction.TITL_TE_LedgerPage));
 				 	
	 	} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 
 			
 		} 		
		return flag; 		
	 	}
	 	
	 	@Test(description="previously added treatment should be displayed in transaction entry")
	 	public boolean createClaim() {
	 		
	 	try{ 
	 		SearchPatientByPatientID("916");
	 		
	 		stepInfo="Click on Transactions tab";
 			flag=CommonMethods.clickIfEnable(ITransaction.TAB_TRANSACTIONS); 
 			
	 		stepInfo="Click on treatment plan"; 
 			flag=CommonMethods.clickIfEnable(ITransaction.TAB_TransactionEntry);
 			
 			stepInfo="Enter Code"; 
 			flag=CommonMethods.sendText(ITransaction.TXT_TE_ProcedureCode,"D0121");
 			
 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_TE_ProcedureFromProcedureTable1);
 			flag=CommonMethods.clickIfEnable(By.xpath("//div[@id='dgTran_GridData']//table[@class='rgMasterTable rgClipCells']//tr[1]/td[1]/span/input"));
 			//flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_DiagnosticsPopup);
 			
 			Thread.sleep(4000);
 			int noOfRows = noOfTreatmentsInTransactionEntry();		
 			stepInfo="Create Claim"; 
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_CreateClaim);
 			Thread.sleep(3000);
 			Assert.assertTrue(CommonMethods.isElementPresent(ITransaction.TITL_TE_ClaimPage));
 			
 			stepInfo = "Delete Claim";
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_DeleteClaim);
 			flag=CommonMethods.isAlertPresent();
 			
 			
 				 	
	 	} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 
 			
 		} 		
		return flag; 		
	 	}
	 	
	 	@Test(description="previously added treatment should be displayed in transaction entry")
	 	public boolean preAuthTest() {
	 		
	 	try{ 
	 		
	 		SearchPatientByPatientID("916");
	 		stepInfo="Click on Transactions tab";
 			flag=CommonMethods.clickIfEnable(ITransaction.TAB_TRANSACTIONS); 
 			
	 		stepInfo="Click on treatment plan"; 
 			flag=CommonMethods.clickIfEnable(ITransaction.TAB_PreAuthorizationList);
 			
 			
 			stepInfo="Click on date field"; 
 			flag=CommonMethods.clickIfEnable(ITransaction.LNK_PreAuthDate);
 			Assert.assertTrue(CommonMethods.isElementPresent(ITransaction.TITL_PreAuthPage));
 			
 			
 				 	
	 	} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 
 			
 		} 		
		return flag; 		
	 	}
	 	
	 	@Test(description="previously added treatment should be displayed in transaction entry")//, dependsOnMethods="createClaim")
	 	public boolean insurancePayment() {
	 		
	 	try{ 
	 		SearchPatientByPatientID("916");

	 		stepInfo="Click on Transactions tab";
 			flag=CommonMethods.clickIfEnable(ITransaction.TAB_TRANSACTIONS); 
 			
	 		stepInfo="Click on treatment plan"; 
 			flag=CommonMethods.clickIfEnable(ITransaction.TAB_InsurancePayment);
 			
 			
 			stepInfo="Click on date field"; 
 			//flag=CommonMethods.clickIfEnable(ITransaction.LNK_InsurancePaymentDate);
 			//flag=CommonMethods.clickIfEnable(ITransaction.CHK_TreamentForClaims);
 			flag =CommonMethods.sendText(ITransaction.TXT_InsurancePaymentAmt, "50");
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_InsuranceApply);		
 			
 			if(CommonMethods.isAlertPresent());
 				 	
	 	} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 
 			
 		} 		
		return flag; 		
	 	}
	 	
	 	@Test(description="previously added treatment should be displayed in transaction entry", dependsOnMethods="createClaim")
	 	public boolean batchPatientPayment() {
	 		
	 	try{ 
	 		SearchPatientByPatientID("916");

	 		stepInfo="Click on Transactions tab";
 			flag=CommonMethods.clickIfEnable(ITransaction.TAB_TRANSACTIONS); 
 			
	 		stepInfo="Click on treatment plan"; 
 			flag=CommonMethods.clickIfEnable(ITransaction.TAB_BatchPatientPayment);
 			
 			stepInfo="Click on date field"; 
 			flag=CommonMethods.clickIfEnable(ITransaction.RDO_Batch_FirstName);
 			flag=CommonMethods.sendText(ITransaction.TXT_search,"test");
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_searchPatient);
 			flag=CommonMethods.clickIfEnable(ITransaction.LST_firstPatient);
 		
 			flag=CommonMethods.clickIfEnable(ITransaction.LST_payment);
 			flag=CommonMethods.clickIfEnable(ITransaction.SEL_procedureToPost);
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_BatchPaymentApply);
 				
 				 	
	 	} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 
 			
 		} 		
		return flag; 		
	 	}
	 	//, dependsOnMethods="createClaim"
	 	@Test(description="previously added treatment should be displayed in transaction entry" , dependsOnMethods="createClaim")
	 	public boolean batchInsurancePayment() {
	 		
	 	try{ 
	 		SearchPatientByPatientID("916");

	 		stepInfo="Click on Transactions tab";
 			flag=CommonMethods.clickIfEnable(ITransaction.TAB_TRANSACTIONS); 
 			
	 		stepInfo="Click on treatment plan"; 
 			flag=CommonMethods.clickIfEnable(ITransaction.TAB_BatchPatientPayment);
 			
 			//?check treatment for above selected claims ???
 					 	
	 	} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 
 			
 		} 		
		return flag; 		
	 	}
	 	
	 	
	 	public int noOfTreatmentsInTransactionEntry(){
			
			int noOfRows = DriverManager.getDriver().findElements(ITransaction.ROWS_preexistingTreatmentTransactionEntry).size();
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
	 	
	 	public static void checkLastTreatmentRow(int rowNo){
			try{
				DriverManager.getDriver().findElement(By.xpath("//table[@id='dgTran_ctl00']//tbody/tr["+rowNo+"]/td[1]/span/input")).click();
			}catch(Exception e){
				e.printStackTrace();
				Assert.fail();
			}
		}
	 	
	 	public void clickOnDateFromTreatmentTable(int rowNo) throws InterruptedException{
	 	String genericCodeLocatorInTreamtmentTable = "//table[@id='dgTran_ctl00']/tbody/tr[rowNo]/td/a";
	 	Thread.sleep(5000);
	 	DriverManager.getDriver().findElement(By.xpath(genericCodeLocatorInTreamtmentTable.replaceAll("rowNo", Integer.toString(rowNo)))).click();
	 	}
	 	
	 	public String returnDataFromTreamtmentTable(String field,int rowNo){
			String specificCodeLocator = null;
			String genericCodeLocatorInTreamtmentTable = null;
			switch (field) {
			case "Code":
				genericCodeLocatorInTreamtmentTable = "//table[@id='dgTran_ctl00']//tbody/tr[rowNo]/td[6]";
				specificCodeLocator = DriverManager.getDriver().findElement(By.xpath(genericCodeLocatorInTreamtmentTable.replaceAll("rowNo", Integer.toString(rowNo)))).getText();
				break;
			case "discount":
				genericCodeLocatorInTreamtmentTable = "//table[@id='dgTran_ctl00']//tbody/tr[rowNo]/td[23]/span";
				specificCodeLocator = DriverManager.getDriver().findElement(By.xpath(genericCodeLocatorInTreamtmentTable.replaceAll("rowNo", Integer.toString(rowNo)))).getText();
				break;
			case "Councelor":
				genericCodeLocatorInTreamtmentTable = "//table[@id='dgTran_ctl00']//tbody/tr[rowNo]/td[24]";
				specificCodeLocator = DriverManager.getDriver().findElement(By.xpath(genericCodeLocatorInTreamtmentTable.replaceAll("rowNo", Integer.toString(rowNo)))).getText();
				break;
			case "Provider":
				genericCodeLocatorInTreamtmentTable = "//table[@id='dgTran_ctl00']//tbody/tr[rowNo]/td[19]";
				specificCodeLocator = DriverManager.getDriver().findElement(By.xpath(genericCodeLocatorInTreamtmentTable.replaceAll("rowNo", Integer.toString(rowNo)))).getText();
				break;//Status
			case "Status":
				genericCodeLocatorInTreamtmentTable = "//table[@id='dgTran_ctl00']//tbody/tr[rowNo]/td[6]/span";
				specificCodeLocator = DriverManager.getDriver().findElement(By.xpath(genericCodeLocatorInTreamtmentTable.replaceAll("rowNo", Integer.toString(rowNo)))).getText();
				break;
			case "TID":
				genericCodeLocatorInTreamtmentTable = "//table[@id='dgTran_ctl00']//tbody/tr[rowNo]/td[3]";
				specificCodeLocator = DriverManager.getDriver().findElement(By.xpath(genericCodeLocatorInTreamtmentTable.replaceAll("rowNo", Integer.toString(rowNo)))).getText();
				break;
			case "PID":
				genericCodeLocatorInTreamtmentTable = "//table[@id='dgTran_ctl00']//tbody/tr[rowNo]/td[4]";
				specificCodeLocator = DriverManager.getDriver().findElement(By.xpath(genericCodeLocatorInTreamtmentTable.replaceAll("rowNo", Integer.toString(rowNo)))).getText();
				break;
			case "OrderID":
				genericCodeLocatorInTreamtmentTable = "//table[@id='dgTran_ctl00']//tbody/tr[rowNo]/td[5]";
				specificCodeLocator = DriverManager.getDriver().findElement(By.xpath(genericCodeLocatorInTreamtmentTable.replaceAll("rowNo", Integer.toString(rowNo)))).getText();
				break;
			default:
				break;
			}
						
			return specificCodeLocator;
		}
	 	
	 	public void SearchPatientByPatientID(String PatientID){
			
			try{ 
				stepInfo="Go to Search Patient Tab";
	 			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
	 			flag=CommonMethods.clickIfEnable(ISearchPatient.TAB_SearchPatient);
				
				//stepInfo="Select Search By First Name";
	 			//flag=CommonMethods.clickIfEnable(ISearchPatient.RADIOBTN_searchByFirstName); 
	 			
	 			flag=CommonMethods.clickIfEnable(ISearchPatient.RADIOBTN_searchByPatientID);
	 			
	 			//stepInfo="Enter First Name"; 
	 			//flag=CommonMethods.sendText(ISearchPatient.TXT_searchText, FirstName); 
	 			
	 			flag = CommonMethods.sendText(ISearchPatient.TXT_searchText, PatientID);
	 			
	 			stepInfo="Search Patient";
	 			flag=CommonMethods.clickIfEnable(ISearchPatient.BTN_search);	
	 			
	 			//stepInfo="Select First Patient from Result";
	 			//flag = selectNthRowFromResults(ISearchPatient.TABLE_searchResults, 1);
	 			
	 			 			 
	 		} catch (Exception e) { 
	 			e.printStackTrace(); 
	 			Assert.fail(); 
	 			
	 		}
	 	
	 	}
}

