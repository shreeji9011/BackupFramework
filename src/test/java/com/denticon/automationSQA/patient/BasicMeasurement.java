package com.denticon.automationSQA.patient;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.IAddPatient;
import com.denticon.automationSQA.pom.IBasicMeasurement;
import com.denticon.automationSQA.utilities.CommonMethods;

public class BasicMeasurement extends SeleniumSuite {
	
		String stepInfo=""; 
		boolean flag=false; 
	 

	@Test
	public boolean verifyBasicMeasurementPage(){
		
		try	{ 
		
				Thread.sleep(3000);
				stepInfo="Go to Search Patient Tab";
				flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
				test.log(Status.PASS, "Go to Patient Tab"); 
			
				flag=CommonMethods.clickIfEnable(IBasicMeasurement.TAB_BM);
				test.log(Status.PASS, "Go to Basic Measurement Tab"); 

				flag=CommonMethods.clickIfEnable(IBasicMeasurement.AddNewMeasurement); 
				test.log(Status.PASS, "Select Add New measurement"); 
				
				flag=CommonMethods.selectFromList(IBasicMeasurement.SLC_noITR,"No ITR"); 
				flag=CommonMethods.selectFromList(IBasicMeasurement.SLC_rootFragnent,"No"); 
				test.log(Status.PASS, "Enter measurement "); 
				Thread.sleep(3000);
				stepInfo="Save Note";
				flag=CommonMethods.clickIfEnable(IBasicMeasurement.SLC_Save);	
				test.log(Status.PASS, "Save Note"); 
	
				
			} catch (Exception e) { 
				e.printStackTrace(); 
				Assert.fail(); 			
			} 		
		return flag;
	 	}
	
	
	@Test(description="Verify cancel page Module",dependsOnMethods= "verifyBasicMeasurementPage")
	public boolean verifyBasicMeasurementCancelPage(){
		
		try	{ 
		
				Thread.sleep(3000);
				stepInfo="Go to Search Patient Tab";
				flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
				test.log(Status.PASS, "Go to Patient Tab"); 
			
				flag=CommonMethods.clickIfEnable(IBasicMeasurement.TAB_BM);
				test.log(Status.PASS, "Go to Basic Measurement Tab"); 

				flag=CommonMethods.clickIfEnable(IBasicMeasurement.AddNewMeasurement); 
				test.log(Status.PASS, "Select Add New measurement"); 

				stepInfo="Cancel Note";
				flag=CommonMethods.clickIfEnable(IBasicMeasurement.SLC_Cancel);	
				test.log(Status.PASS, "Cancel measurements"); 
	
				
			} catch (Exception e) { 
				e.printStackTrace(); 
				Assert.fail(); 			
			} 		
		return flag;
	 	}
	
	
	@Test(description="Verify edit page Module",dependsOnMethods= "verifyBasicMeasurementCancelPage")
	public boolean verifyBasicMeasurementEditPage(){
		
		try	{ 
		
				Thread.sleep(5000);
				stepInfo="Go to Search Patient Tab";
				flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
				test.log(Status.PASS, "Go to Patient Tab"); 
			
				flag=CommonMethods.clickIfEnable(IBasicMeasurement.TAB_BM);
				test.log(Status.PASS, "Go to Basic Measurement Tab"); 

				flag=CommonMethods.clickIfEnable(IBasicMeasurement.SLC_Edit); 
				test.log(Status.PASS, "Select Add New measurement"); 

				stepInfo="Cancel Note";
				flag=CommonMethods.clickIfEnable(IBasicMeasurement.SLC_Cancel);	
				test.log(Status.PASS, "Cancel measurements"); 
	
				
			} catch (Exception e) { 
				e.printStackTrace(); 
				Assert.fail(); 			
			} 		
		return flag;
	 	}
	
	@Test(description="Verify delete page Module",dependsOnMethods= "verifyBasicMeasurementEditPage")
	public boolean verifyBasicMeasurementDeletePage(){
		
		try	{ 
		
				Thread.sleep(5000);
				stepInfo="Go to Search Patient Tab";
				flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
				test.log(Status.PASS, "Go to Patient Tab"); 
			
				flag=CommonMethods.clickIfEnable(IBasicMeasurement.TAB_BM);
				test.log(Status.PASS, "Go to Basic Measurement Tab"); 

				flag=CommonMethods.clickIfEnable(IBasicMeasurement.SLC_Delete); 
				test.log(Status.PASS, "Select Delete New measurement"); 
				Alert alert =com.denticon.automationSQA.DriverManager.getDriver().switchTo().alert(); 
	 			alert.accept(); 
	 			Thread.sleep(1000);
				
			} catch (Exception e) { 
				e.printStackTrace(); 
				Assert.fail(); 			
			} 		
		return flag;
	 	}
	}
