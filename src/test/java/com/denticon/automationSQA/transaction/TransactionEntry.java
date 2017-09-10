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



public class TransactionEntry extends SeleniumSuite{  
		String stepInfo=""; 
		boolean flag=false; 
	 	String filePath=System.getProperty("user.dir") + "\\src\\main\\resources\\TreatmentPlan.properties"; 
	 	Properties prop= new Properties();
	
//	 	@Test(description="previously added treatment should be displayed in transaction entry")					/*   PASS   */	
	 	public boolean verifyPreviousTreatmentPlanInTransactionEntry() {
	 		
	 	try{ 
	 		stepInfo="Click on Transactions tab";
 			flag=CommonMethods.clickIfEnable(ITransaction.TAB_TRANSACTIONS); 
 			
	 		stepInfo="Click on treatment plan"; 
 			flag=CommonMethods.clickIfEnable(ITransaction.TAB_TreatmentPlan);
 			
 			stepInfo="Enter Code"; 
 			flag=CommonMethods.sendText(ITransaction.TXT_ProcedureCode,"D0150");
 			int noOfRows = TreatmentPlan.noOfTreatments();
 			
 			Thread.sleep(3000);
 			TreatmentPlan.checkLastTreatmentRow(noOfRows+1);
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_PostToLedger);
 			
 			stepInfo="Click on Transactions tab";
 			flag=CommonMethods.clickIfEnable(ITransaction.TAB_TRANSACTIONS); 
 			
 			stepInfo="Click on treatment plan"; 
 			flag=CommonMethods.clickIfEnable(ITransaction.TAB_TransactionEntry);
 			noOfRows = noOfTreatmentsInTransactionEntry();
 			Thread.sleep(4000);
 			Assert.assertTrue(returnDataFromTreamtmentTable("Code", noOfRows).equals("D0150"));
	 	
	 	} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 
 			
 		} 		
		return flag; 		
	 	}
	 	
	 	@Test(description="verify Add Treatment Plan Using Different Codes")
		public boolean verifyAddTreatmentPlanUsingDifferentCodes() {
	 		
			try{ 
				
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
	 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_TE_ProcedureFromProcedureTable);
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
	 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_TE_ProcedureFromProcedureTable);
	 			 			
	 			stepInfo = "Select Upper Left Quadrant";
	 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_SelectQuadrant);
	 			flag=CommonMethods.clickIfEnable(ITransaction.LNK_UpperLeftQuadrant);
	 			 							
	 			stepInfo = "Save Tooth/Surface/Quadrant";
	 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_saveToothNumber);
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
	 			flag=CommonMethods.clickIfEnable(ITransaction.LNK_selectToothA);
	 			 	
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
	 			flag=CommonMethods.sendText(ITransaction.TXT_TE_UserCode,"Exam");
	 			Thread.sleep(4000);
	 			noOfRowsInTreatmentTableAfter= noOfTreatmentsInTransactionEntry();
	 			Assert.assertTrue(noOfRowsInTreatmentTableAfter == ( noOfRowsInTreatmentTableBefore +1));
	 			
	 			noOfRowsInTreatmentTableBefore = noOfTreatmentsInTransactionEntry();
	 			
	 			stepInfo="Enter Description"; 
	 			flag=CommonMethods.sendText(ITransaction.TXT_TE_Description,"Compsve Oral");
	 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_TE_ProcedureFromProcedureTable);
	 			Thread.sleep(4000);
	 			noOfRowsInTreatmentTableAfter= noOfTreatmentsInTransactionEntry();
	 			Assert.assertTrue(noOfRowsInTreatmentTableAfter == ( noOfRowsInTreatmentTableBefore +1));
	 			
	 			noOfRowsInTreatmentTableBefore = noOfTreatmentsInTransactionEntry();
	 			
	 			
	 			stepInfo="Click on Diagnostic plan"; 
	 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_Diagnostics);
	 			
	 			stepInfo="Double Click on procedure code row for first diagnostic service from the list";
	 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_TE_ProcedureFromProcedureTable);
	 			
	 			stepInfo="Click on Diagnostic plan"; 
	 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_DiagnosticsPopup);
	 			
	 			 			 		 							
	 			Thread.sleep(4000);
	 			noOfRowsInTreatmentTableAfter= noOfTreatmentsInTransactionEntry();
	 			Assert.assertTrue(noOfRowsInTreatmentTableAfter == ( noOfRowsInTreatmentTableBefore +1));
	 			
	 			noOfRowsInTreatmentTableBefore = noOfTreatmentsInTransactionEntry();
	 			stepInfo="Click on Maxillo Prosth plan"; 
	 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_MaxilloProsth);
	 			
	 			stepInfo="Double Click on procedure code row for first diagnostic service from the list";
	 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_TE_ProcedureFromProcedureTable);
	 			 			 		 							
	 			Thread.sleep(4000);
	 			noOfRowsInTreatmentTableAfter= noOfTreatmentsInTransactionEntry();
	 			Assert.assertTrue(noOfRowsInTreatmentTableAfter == ( noOfRowsInTreatmentTableBefore +1));
	 			
	 			noOfRowsInTreatmentTableBefore = noOfTreatmentsInTransactionEntry();
	 			
	 			stepInfo="Click on Proths fixed plan"; 
	 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_ProsthFixed);
	 			
	 			stepInfo="Double Click on procedure code row for first diagnostic service from the list";
	 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_TE_ProcedureFromProcedureTable);
	 			
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
	 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_TE_ProcedureFromProcedureTable);
	 					
	 			Thread.sleep(4000);
	 			noOfRowsInTreatmentTableAfter= noOfTreatmentsInTransactionEntry();
	 			Assert.assertTrue(noOfRowsInTreatmentTableAfter == ( noOfRowsInTreatmentTableBefore +1)); 
	 			
	 			noOfRowsInTreatmentTableBefore = noOfTreatmentsInTransactionEntry();
	 			
	 			stepInfo="Click on Proths fixed plan"; 
	 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_Other);
	 			
	 			stepInfo="Double Click on procedure code row for first diagnostic service from the list";
	 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_TE_ProcedureFromProcedureTable);
	 					
	 			Thread.sleep(4000);
	 			noOfRowsInTreatmentTableAfter= noOfTreatmentsInTransactionEntry();
	 			Assert.assertTrue(noOfRowsInTreatmentTableAfter == ( noOfRowsInTreatmentTableBefore +1)); 
	 			
	 			noOfRowsInTreatmentTableBefore = noOfTreatmentsInTransactionEntry();
	 			
	 			stepInfo="Click on Proths fixed plan"; 
	 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_Preventive);
	 			
	 			stepInfo="Double Click on procedure code row for first diagnostic service from the list";
	 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_TE_ProcedureFromProcedureTable);
	 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_PreventiveSave);	
	 			Thread.sleep(4000);
	 			noOfRowsInTreatmentTableAfter= noOfTreatmentsInTransactionEntry();
	 			Assert.assertTrue(noOfRowsInTreatmentTableAfter == ( noOfRowsInTreatmentTableBefore +1)); 
	 			
	 			noOfRowsInTreatmentTableBefore = noOfTreatmentsInTransactionEntry();
	 			
	 			stepInfo="Click on Proths fixed plan"; 
	 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_Endodontics);
	 			
	 			stepInfo="Double Click on procedure code row for first diagnostic service from the list";
	 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_TE_ProcedureFromProcedureTable);
	 			
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
	 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_TE_ProcedureFromProcedureTable);
	 					
	 			Thread.sleep(4000);
	 			noOfRowsInTreatmentTableAfter= noOfTreatmentsInTransactionEntry();
	 			Assert.assertTrue(noOfRowsInTreatmentTableAfter == ( noOfRowsInTreatmentTableBefore +1)); 
	 			
	 			noOfRowsInTreatmentTableBefore = noOfTreatmentsInTransactionEntry();
	 			
	 			stepInfo="Click on Proths fixed plan"; 
	 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_OralSurgery);
	 			
	 			stepInfo="Double Click on procedure code row for first diagnostic service from the list";
	 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_TE_ProcedureFromProcedureTable);
	 					
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
	 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_TE_ProcedureFromProcedureTable);
	 					
	 			Thread.sleep(4000);
	 			noOfRowsInTreatmentTableAfter= noOfTreatmentsInTransactionEntry();
	 			Assert.assertTrue(noOfRowsInTreatmentTableAfter == ( noOfRowsInTreatmentTableBefore +1)); 
	 			
	 			noOfRowsInTreatmentTableBefore = noOfTreatmentsInTransactionEntry();
	 			
	 			stepInfo="Click on Proths fixed plan"; 
	 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_AllMed);
	 			
	 			stepInfo="Double Click on procedure code row for first diagnostic service from the list";
	 			flag=CommonMethods.doubleClickIfEnable(ITransaction.ROW_TE_ProcedureFromProcedureTable);
	 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_AllMedSave);
	 					
	 			Thread.sleep(4000);
	 			noOfRowsInTreatmentTableAfter= noOfTreatmentsInTransactionEntry();
	 			Assert.assertTrue(noOfRowsInTreatmentTableAfter == ( noOfRowsInTreatmentTableBefore +1)); 
	 			
	 		} catch (Exception e) { 
	 			e.printStackTrace(); 
	 			Assert.fail(); 
	 			
	 		}
	 	
		 		
			return flag;
		 	}
	 	
//	 	@Test(description="editTreatmentPage")			/*   PASS   */		
	 	public boolean editTreatmentPage() {
	 		
	 	try{ 
	 		stepInfo="Click on Transactions tab";
 			flag=CommonMethods.clickIfEnable(ITransaction.TAB_TRANSACTIONS); 
 			
	 		stepInfo="Click on treatment plan"; 
 			flag=CommonMethods.clickIfEnable(ITransaction.TAB_TransactionEntry);
 			
 			stepInfo="Enter Code"; 
 			int noOfRows = noOfTreatmentsInTransactionEntry();
 			flag=CommonMethods.sendText(ITransaction.TXT_TE_ProcedureCode,"D0150");
 			flag=CommonMethods.clickIfEnable(ITransaction.SLC_D0150PC);
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_AddPC);
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
	 	
//	 	@Test(description="LedgerPage")				/*   PASS   */			
	 	public boolean LedgerPage() {
	 		
	 	try{ 
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
	 	
	 	
//	 	@Test(description="createClaim")					/*   PASS   */
	 	public boolean createClaim() {
	 		
	 	try{ 
	 		Thread.sleep(6000);
	 		stepInfo="Click on Transactions tab";
 			flag=CommonMethods.clickIfEnable(ITransaction.TAB_TRANSACTIONS); 
 			
	 		stepInfo="Click on treatment plan"; 
 			flag=CommonMethods.clickIfEnable(ITransaction.TAB_TransactionEntry);
 			
 			stepInfo="Enter Code"; 
 			flag=CommonMethods.sendText(ITransaction.TXT_TE_ProcedureCode,"D0150");
 			flag=CommonMethods.clickIfEnable(ITransaction.SLC_D0150PC);
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_AddPC);
 			Thread.sleep(4000);
 //			int noOfRows = noOfTreatmentsInTransactionEntry();		
 			stepInfo="Create Claim"; 
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_CreateClaim);
 			Thread.sleep(2000);
 			Assert.assertTrue(CommonMethods.isElementPresent(ITransaction.TITL_TE_ClaimPage));
 			
 //			stepInfo = "Delete Claim";
 //			flag=CommonMethods.clickIfEnable(ITransaction.BTN_TE_DeleteClaim);
 //			flag=CommonMethods.isAlertPresent();
 			
 			
 				 	
	 	} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 
 			
 		} 		
		return flag; 		
	 	}
	 	
	 	
//	 	@Test(description="pre-authorization list")				/*   PASS   */
	 	public boolean preAuthTest() {
	 		
	 	try{ 
	 		Thread.sleep(5000);
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
	 	
//	 	@Test(description="insurancePayment")				/*   PASS   */
	 	public boolean insurancePayment() {
	 		
	 	try{ 
	 		stepInfo="Click on Transactions tab";
 			flag=CommonMethods.clickIfEnable(ITransaction.TAB_TRANSACTIONS); 
 			
	 		stepInfo="Click on treatment plan"; 
 			flag=CommonMethods.clickIfEnable(ITransaction.TAB_InsurancePayment);
 			
 			flag=CommonMethods.sendText(ITransaction. Txt_InsAmount,"1");

 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_InsuranceApply);		
 			
 				 	
	 	} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 
 			
 		} 		
		return flag; 		
	 	}
	 	
	 	
//	 	@Test(description="batchPatientPayment")							 /*   PASS   */
	 	public boolean batchPatientPayment() {
	 		
	 	try{ 
	 		Thread.sleep(5000);
	 		stepInfo="Click on Transactions tab";
 			flag=CommonMethods.clickIfEnable(ITransaction.TAB_TRANSACTIONS); 
 			
	 		stepInfo="Click on treatment plan"; 
 			flag=CommonMethods.clickIfEnable(ITransaction.TAB_BatchPatientPayment);
 			
 			stepInfo="Click on date field"; 
 			flag=CommonMethods.clickIfEnable(ITransaction.RDO_Batch_FirstName);
 			flag=CommonMethods.sendText(ITransaction.TXT_search,"Rahul");
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_searchPatient);
 			flag=CommonMethods.clickIfEnable(ITransaction.SLC_Patient);
 			flag=CommonMethods.clickIfEnable(ITransaction.Chk_ProcedureToPost);
 			flag=CommonMethods.clickIfEnable(ITransaction.Paymenttype);			
 			flag=CommonMethods.clickIfEnable(ITransaction.BTN_BatchPaymentApply);
 			
 				 	
	 	} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 
 			
 		} 		
		return flag; 		
	 	}
	 	
	 	
	 	//, dependsOnMethods="createClaim"
	 	
	 	@Test(description = "batchInsurancePayment")                    /*   PASS   */
	 	public boolean batchInsurancePayment() {
	 		
	 	try{ 
	 		Thread.sleep(5000);
	 		stepInfo="Click on Transactions tab";
 			flag=CommonMethods.clickIfEnable(ITransaction.TAB_TRANSACTIONS); 
 			
	 		stepInfo="Click on treatment plan"; 
 			flag=CommonMethods.clickIfEnable(ITransaction.TAB_BatchInsurancePayment );
 			Thread.sleep(3000);
 			flag=CommonMethods.selectFromList(ITransaction.SEL_Carrier,"21_22_D_C");
 			
 			flag=CommonMethods.sendText(ITransaction.TXT_Chartno,"145");
 			
 			flag=CommonMethods.sendText(ITransaction.TXT_CheckAmount,"1");
 			
 			flag=CommonMethods.clickIfEnable(ITransaction.LNK_Date);
 			
 			flag=CommonMethods.clickIfEnable(ITransaction.SLC_Apply);
 			
 			Assert.assertTrue(CommonMethods.isElementPresent(ITransaction.Title_BIP));
 			
 			Thread.sleep(3000);
 			flag=CommonMethods.clickIfEnable(ITransaction.SLC_Cancel);	
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
	 	
	 	}