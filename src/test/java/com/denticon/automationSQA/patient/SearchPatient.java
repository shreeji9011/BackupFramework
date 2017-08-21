package com.denticon.automationSQA.patient;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.denticon.automationSQA.DriverManager;
import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.IAddPatient;
import com.denticon.automationSQA.pom.ISearchPatient;
import com.denticon.automationSQA.utilities.CommonMethods;


public class SearchPatient extends SeleniumSuite{
	
		String stepInfo=""; 
		boolean flag=false; 
	 	String filePath=System.getProperty("user.dir") + "\\src\\main\\resources\\AddNewPatient.properties"; 
	 	Properties prop= new Properties();

	@Test(description="Verify Search Patient functionality")
	public boolean verifySearchPatientPage(){
		
		try	{ 
			
			Thread.sleep(1000);
			stepInfo="Go to Search Patient Tab";
			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
			test.log(Status.PASS, "Go to Patient Tab"); 
			
			flag=CommonMethods.clickIfEnable(ISearchPatient.TAB_SearchPatient);
			test.log(Status.PASS, "Go to Search Patient Tab"); 
			
			stepInfo="Select Search By LastName";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.RADIOBTN_searchByLastName); 
			test.log(Status.PASS, "Select Search By LastName "); 
			
 			stepInfo="Enter Last name"; 
 			String lastName=CommonMethods.readDatafromProps(filePath,"LastName");
 			flag=CommonMethods.sendText(ISearchPatient.TXT_searchText, lastName); 
 			test.log(Status.PASS, "Enter Last name "); 
 			
 			stepInfo="Search Patient";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.BTN_search);	
 			test.log(Status.PASS, "Search Patient "); 
 			
 			stepInfo="Select First Patient from Result";
 			flag = selectNthRowFromResults(ISearchPatient.TABLE_searchResults, 1);
 			test.log(Status.PASS, "Select First Patient from Result "); 
 			test.log(Status.PASS, "Navigate to Overview Tab"); 				
 			
 		} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 			
 		} 		
		return flag;
	 	}

 ///Patient First Name/////
@Test(description="Verify Patient First Name")
public boolean verifyPatientFirstNamePage(){
	
	try{ 		
 			stepInfo="Go to Search Patient Tab";
 			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
 			test.log(Status.PASS, "Go to Patient Tab"); 
 			
 			flag=CommonMethods.clickIfEnable(ISearchPatient.TAB_SearchPatient);
 			test.log(Status.PASS, "Go to Search Patient Tab "); 
 		 
 			stepInfo="Select Search By First Name";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.RADIOBTN_searchByFirstName); 
 			test.log(Status.PASS, "Select Search By First Name "); 
 			
 			stepInfo="Enter First Name"; 
 			String FirstName=CommonMethods.readDatafromProps(filePath,"FirstName");
 			flag=CommonMethods.sendText(ISearchPatient.TXT_searchText, FirstName); 
 			test.log(Status.PASS, "Enter First Name"); 
 			
 			stepInfo="Search Patient";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.BTN_search);	
 			test.log(Status.PASS, "Search Patient"); 
 			
 			stepInfo="Select First Patient from Result";
 			flag = selectNthRowFromResults(ISearchPatient.TABLE_searchResults, 1);
 			test.log(Status.PASS, "Select First Patient from Result"); 
 			test.log(Status.PASS, "Navigate to Overview Tab"); 		
 			
		} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 			
 		} 		
		return flag;
	 	}

////Patient Type//////
			
@Test(description="Verify Patient tab functionality")
public boolean verifyPatientType() {
		
	try{ 
		
			stepInfo="Go to Search Patient Tab";
 			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
 			test.log(Status.PASS, "Go to Patient Tab"); 
 			
 			flag=CommonMethods.clickIfEnable(ISearchPatient.TAB_SearchPatient);
 			test.log(Status.PASS, "Go to Search Patient Tab "); 
 		 
 			stepInfo="Select Search By Patient Type";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.RADIOBTN_searchByPatientType); 
 			test.log(Status.PASS, "Select Search By Patient Type "); 
 			
 			stepInfo="Enter Patient Type"; 
 			flag=CommonMethods.clickIfEnable(ISearchPatient.INP_patienttype_Cash); 
 			test.log(Status.PASS, "Enter Patient Type"); 
 			
 			stepInfo="Search Patient Type";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.BTN_search);	
 			test.log(Status.PASS, "Search Patient Type"); 
 			
 			stepInfo="Select First Patient from Result";
 			flag = selectNthRowFromResults(ISearchPatient.TABLE_searchResults, 1);
 			test.log(Status.PASS, "Select First Patient from Result"); 
 			test.log(Status.PASS, "Navigate to Overview Tab"); 					
	
} catch (Exception e) { 
			e.printStackTrace(); 
			Assert.fail(); 			
		} 		
	return flag;
 	}
/////Patient Medicaid ID /////
			
	@Test(description="Verify Patient tab functionality")
	public boolean verifyPatientMedicaidID() {
 		
		try{ 
			Thread.sleep(4000);
			stepInfo="Go to Search Patient Tab";
 			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
 			test.log(Status.PASS, "Go to Patient Tab"); 
 			
 			flag=CommonMethods.clickIfEnable(ISearchPatient.TAB_SearchPatient);
 			test.log(Status.PASS, "Go to Search Patient Tab "); 
 		 
 			stepInfo="Select Search By Medicaid ID";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.RADIOBTN_searchByMedicaid); 
 			test.log(Status.PASS, "Select Search By Medicaid ID "); 
 			
 			stepInfo="Enter Medicaid ID"; 
 			flag=CommonMethods.sendText(ISearchPatient.TXT_searchText,"156");  
 			test.log(Status.PASS, "Enter Medicaid ID"); 
 			
 			stepInfo="Search Medicaid ID";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.BTN_search);	
 			test.log(Status.PASS, "Search Medicaid ID"); 
 			
 			stepInfo="Select First Patient from Result";
 			flag = selectNthRowFromResults(ISearchPatient.TABLE_searchResults, 1);
 			test.log(Status.PASS, "Select First Patient from Result"); 
 			test.log(Status.PASS, "Navigate to Overview Tab"); 				
 		} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 			
 		} 		
		return flag;
	 	}
///// Patient Chart # //////////
			
		@Test(description="Verify Patient tab functionality")
		public boolean verifyPatientChartNo() {
	 		
			try{ 
				
			stepInfo="Go to Search Patient Tab";
 			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
 			test.log(Status.PASS, "Go to Patient Tab"); 
 			
 			flag=CommonMethods.clickIfEnable(ISearchPatient.TAB_SearchPatient);
 			test.log(Status.PASS, "Go to Search Patient Tab "); 
 		 
 			stepInfo="Select Search By Patient Chart #";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.RADIOBTN_searchByChartNo); 
 			test.log(Status.PASS, "Select Search By Patient Chart # "); 
 			
 			stepInfo="Enter Medicaid ID"; 
 			flag=CommonMethods.sendText(ISearchPatient.TXT_searchText,"145");  
 			test.log(Status.PASS, "Enter Medicaid ID"); 
 			
 			stepInfo="Search Medicaid ID";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.BTN_search);	
 			test.log(Status.PASS, "Search Medicaid ID"); 
 			
 			stepInfo="Select First Patient from Result";
 			flag = selectNthRowFromResults(ISearchPatient.TABLE_searchResults, 1);
 			test.log(Status.PASS, "Select First Patient from Result"); 
 			test.log(Status.PASS, "Navigate to Overview Tab"); 					
 		} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 			
 		} 		
		return flag;
	 	}
////Patient SSN //////
			
		@Test(description="Verify Patient tab functionality")
		public boolean verifyPatientSSN() {
	 		
			try{ 
			Thread.sleep(1000);	
			stepInfo="Go to Search Patient Tab";
 			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
 			test.log(Status.PASS, "Go to Patient Tab"); 
 			
 			flag=CommonMethods.clickIfEnable(ISearchPatient.TAB_SearchPatient);
 			test.log(Status.PASS, "Go to Search Patient Tab "); 
 		 
 			stepInfo="Select Search By Patient SSN";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.RADIOBTN_searchBySSN); 
 			test.log(Status.PASS, "Select Search By Patient SSN"); 
 			
 			stepInfo="Enter Patient SSN"; 
 			flag=CommonMethods.sendText(ISearchPatient.TXT_searchText,"222-22-2222");  
 			test.log(Status.PASS, "Enter Patient SSN"); 
 			
 			stepInfo="Search Patient SSN";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.BTN_search);	
 			test.log(Status.PASS, "Search Patient SSN"); 
 			
 			stepInfo="Select First Patient from Result";
 			flag = selectNthRowFromResults(ISearchPatient.TABLE_searchResults, 1);
 			test.log(Status.PASS, "Select First Patient from Result"); 
 			test.log(Status.PASS, "Navigate to Overview Tab"); 				
 		} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 			
 		} 		
		return flag;
	 	}
///// 	Patient Email ///////
			
		@Test(description="Verify Patient tab functionality")
		public boolean verifyPatientEmail() {
	 		
			try{ 
				
			stepInfo="Go to Search Patient Tab";
 			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
 			test.log(Status.PASS, "Go to Patient Tab"); 
 			
 			flag=CommonMethods.clickIfEnable(ISearchPatient.TAB_SearchPatient);
 			test.log(Status.PASS, "Go to Search Patient Tab "); 
 		 
 			stepInfo="Select Search By Patient Email";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.RADIOBTN_searchByEmail); 
 			test.log(Status.PASS, "Select Search By Patient Email"); 
 			
 			stepInfo="Enter Patient Email"; 
 			flag=CommonMethods.sendText(ISearchPatient.TXT_searchText,"aaa@bbb.com");  
 			test.log(Status.PASS, "Enter Patient Email"); 
 			
 			stepInfo="Search Patient Email";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.BTN_search);	
 			test.log(Status.PASS, "Search Patient Email"); 
 			
 			stepInfo="Select First Patient from Result";
 			flag = selectNthRowFromResults(ISearchPatient.TABLE_searchResults, 1);
 			test.log(Status.PASS, "Select First Patient from Result"); 
 			test.log(Status.PASS, "Navigate to Overview Tab");				
 		} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 			
 		} 		
		return flag;
	 	}
/// Patient BirthDate ////
		@Test(description="Verify Patient tab functionality")
		public boolean verifyPatientBirthDate() {
	 		
			try{ 
			Thread.sleep(1000);	
			stepInfo="Go to Search Patient Tab";
 			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
 			test.log(Status.PASS, "Go to Patient Tab"); 
 			
 			flag=CommonMethods.clickIfEnable(ISearchPatient.TAB_SearchPatient);
 			test.log(Status.PASS, "Go to Search Patient Tab "); 
 		 
 			stepInfo="Select Search By  Patient BirthDate";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.RADIOBTN_searchByBirthDate); 
 			test.log(Status.PASS, "Select Search By  Patient BirthDate"); 
 			
 			stepInfo="Enter  Patient Birth Date"; 
 			flag=CommonMethods.sendText(ISearchPatient.TXT_searchText,"08/08/2010");  
 			test.log(Status.PASS, "Enter Patient Birth Date"); 
 			
 			stepInfo="Search  Patient BirthDate";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.BTN_search);	
 			test.log(Status.PASS, "Search  Patient BirthDate"); 
 			
 			stepInfo="Select First Patient from Result";
 			flag = selectNthRowFromResults(ISearchPatient.TABLE_searchResults, 1);
 			test.log(Status.PASS, "Select First Patient from Result"); 
 			test.log(Status.PASS, "Navigate to Overview Tab");    
 		} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 			
 		} 		
		return flag;
	 	}
/// Patient Home/Cell/Work Phone /////////////			
 			
		@Test(description="Verify Patient tab functionality")
		public boolean verifyPatientHomePhone() {
	 		
			try{ 
			Thread.sleep(1000);	
			stepInfo="Go to Search Patient Tab";
 			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
 			test.log(Status.PASS, "Go to Patient Tab"); 
 			
 			flag=CommonMethods.clickIfEnable(ISearchPatient.TAB_SearchPatient);
 			test.log(Status.PASS, "Go to Search Patient Tab "); 
 		 
 			stepInfo="Select Search By  Patient HOME number";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.RADIOBTN_searchByPhoneNo); 
 			test.log(Status.PASS, "Select Search By  Patient HOME number"); 
 			
 			stepInfo="Enter Home Number";
 			String homeno = CommonMethods.readDatafromProps(filePath, "HomeNo");
 			flag=CommonMethods.sendText(ISearchPatient.TXT_searchText, homeno);
 			test.log(Status.PASS, "Enter Home Number");
 			
 			stepInfo="Search  Home Number";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.BTN_search);	
 			test.log(Status.PASS, "Search  Home Number"); 
 			
 			stepInfo="Select First Patient from Result";
 			flag = selectNthRowFromResults(ISearchPatient.TABLE_searchResults, 1);
 			test.log(Status.PASS, "Select First Patient from Result"); 
 			test.log(Status.PASS, "Navigate to Overview Tab");
 		} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 			
 		} 		
		return flag;
	 	}
 			////////////// Cell Phone //////////
		@Test(description="Verify Patient tab functionality")
		public boolean verifyPatientCellPhone() {
	 		
			try{ 
			Thread.sleep(1000);	
			stepInfo="Go to Search Patient Tab";
 			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
 			test.log(Status.PASS, "Go to Patient Tab"); 
 			
 			flag=CommonMethods.clickIfEnable(ISearchPatient.TAB_SearchPatient);
 			test.log(Status.PASS, "Go to Search Patient Tab "); 
 		 
 			stepInfo="Select Search By  Patient Cell Phoner";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.RADIOBTN_searchByCellPhone); 
 			test.log(Status.PASS, "Select Search By  Patient Cell Phone"); 
 			
 			stepInfo="Enter cell Number";
 			String cellno = CommonMethods.readDatafromProps(filePath, "CellNo");
 			flag=CommonMethods.sendText(ISearchPatient.TXT_searchText, cellno);
 			test.log(Status.PASS, "Enter cell Number");
 			
 			stepInfo="Search Cell Phone";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.BTN_search);	
 			test.log(Status.PASS, "Cell Phone"); 
 			
 			stepInfo="Select First Patient from Result";
 			flag = selectNthRowFromResults(ISearchPatient.TABLE_searchResults, 1);
 			test.log(Status.PASS, "Select First Patient from Result"); 
 			test.log(Status.PASS, "Navigate to Overview Tab");
 		} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 			
 		} 		
		return flag;
	 	}
 			///////////  Work Phone  //////////////
 			
		@Test(description="Verify Patient tab functionality")
		public boolean verifyPatientWorkPhone() {
	 		
			try{ 
				
			stepInfo="Go to Search Patient Tab";
 			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
 			test.log(Status.PASS, "Go to Patient Tab"); 
 			
 			flag=CommonMethods.clickIfEnable(ISearchPatient.TAB_SearchPatient);
 			test.log(Status.PASS, "Go to Search Patient Tab "); 
 		 
 			stepInfo="Select Search By  Patient Work Phone";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.RADIOBTN_searchByWorkPhone); 
 			test.log(Status.PASS, "Select Search By  Patient Work Phone"); 
 			
 			stepInfo="Enter work Number";
 			String workno = CommonMethods.readDatafromProps(filePath, "WorkNo");
 			flag=CommonMethods.sendText(ISearchPatient.TXT_searchText, workno);
 			test.log(Status.PASS, "Enter work Number");
 			
 			stepInfo="Search Work Phone";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.BTN_search);	
 			test.log(Status.PASS, "Search Work Phone"); 
 			
 			stepInfo="Select First Patient from Result";
 			flag = selectNthRowFromResults(ISearchPatient.TABLE_searchResults, 1);
 			test.log(Status.PASS, "Select First Patient from Result"); 
 			test.log(Status.PASS, "Navigate to Overview Tab");						
 		} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 			
 		} 		
		return flag;
	 	}
///// Patient ID //////
			
		@Test(description="Verify Patient tab functionality")
		public boolean verifyPatientID() {
	 		
			try{ 
			Thread.sleep(1000);	
			stepInfo="Go to Search Patient Tab";
 			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
 			test.log(Status.PASS, "Go to Patient Tab"); 
 			
 			flag=CommonMethods.clickIfEnable(ISearchPatient.TAB_SearchPatient);
 			test.log(Status.PASS, "Go to Search Patient Tab "); 
 		 
 			stepInfo="Select Search By Patient ID";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.RADIOBTN_searchByPatientID); 
 			test.log(Status.PASS, "Select Search By Patient ID"); 
 			
 			stepInfo="Enter  Patient ID"; 
 			flag=CommonMethods.sendText(ISearchPatient.TXT_searchText,"114");  
 			test.log(Status.PASS, "Enter Patient ID"); 
 			
 			stepInfo="Search Patient ID";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.BTN_search);	
 			test.log(Status.PASS, "Search  Patient ID"); 
 			
 			stepInfo="Select First Patient from Result";
 			flag = selectNthRowFromResults(ISearchPatient.TABLE_searchResults, 1);
 			test.log(Status.PASS, "Select First Patient from Result"); 
 			test.log(Status.PASS, "Navigate to Overview Tab");				
 		} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 			
 		} 		
		return flag;
	 	}
 			
/////RP Type CASH //////
 			
//		@Test(description="Verify Patient tab functionality")
		public boolean verifyResponsiblePartyType() {
	 		
			try{ 
			Thread.sleep(3000);	
 			stepInfo="Go to Search Patient Tab";
 			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
 			test.log(Status.PASS, "Go to Patient Tab"); 
 			
 			flag=CommonMethods.clickIfEnable(ISearchPatient.TAB_SearchPatient);
 			test.log(Status.PASS, "Go to Search Patient Tab "); 
 			
 			stepInfo="Select Search By Responsible Party Type";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.RADIOBTN_searchForResponsibleParty);
 			flag=CommonMethods.clickIfEnable(ISearchPatient.RADIOBTN_searchByResponsiblePatientType); 
 			test.log(Status.PASS, "Select Search By Responsible Party Type "); 
 			Thread.sleep(3000);	
 			stepInfo="Enter Responsible Party type as cash"; 
 			flag=CommonMethods.clickIfEnable(ISearchPatient.INP_responsibleParty_cash); 
 			test.log(Status.PASS, "Enter Responsible Party type as cash"); 
 			
 			stepInfo="Search Patient";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.BTN_search);	
 			test.log(Status.PASS, "Search Patient "); 
 			
 			Thread.sleep(1000);
 			
 			stepInfo="Select First Patient from Result";
 			flag = selectNthRowFromResponsiblePartyResults(ISearchPatient.TABLE_searchResults, 1);
 			flag=CommonMethods.clickIfEnable(ISearchPatient.BTN_Save);
 			test.log(Status.PASS, "Select First Patient from Result"); 
			test.log(Status.PASS, "Navigate to Overview Tab");      		
 		} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 			
 		} 		
		return flag;
	 	}
/// RP LastName /////
	
		@Test(description="Verify Patient tab functionality")
		public boolean verifyResponsiblePartyLastName() {
	 		
			try{ 
			Thread.sleep(5000);		
			stepInfo="Go to Search Patient Tab";
 			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
 			test.log(Status.PASS, "Go to Patient Tab"); 
 			
 			flag=CommonMethods.clickIfEnable(ISearchPatient.TAB_SearchPatient);
 			test.log(Status.PASS, "Go to Search Patient Tab "); 
 			
 			stepInfo="Select Search By Responsible Party";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.RADIOBTN_searchForResponsibleParty);
 			test.log(Status.PASS, "Select Search By Responsible Party"); 
 			
			stepInfo="Select Search By LastName";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.RADIOBTN_searchByLastName); 
			test.log(Status.PASS, "Select Search By LastName ");
 			
 			stepInfo="Enter Last name"; 
 			String lastName1=CommonMethods.readDatafromProps(filePath,"LastName");
 			flag=CommonMethods.sendText(ISearchPatient.TXT_searchText, lastName1); 
 			test.log(Status.PASS, "Enter Responsible Party LastName"); 
 			
 			stepInfo="Search Patient";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.BTN_search);	
 			test.log(Status.PASS, "Search Patient "); 
 			
 			Thread.sleep(1000);
 			
 			stepInfo="Select First Patient from Result";
 			flag = selectNthRowFromResponsiblePartyResults(ISearchPatient.TABLE_searchResults, 1);
 			flag=CommonMethods.clickIfEnable(ISearchPatient.BTN_Save);
 			test.log(Status.PASS, "Select First Patient from Result"); 
			test.log(Status.PASS, "Navigate to Overview Tab");				
 		} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 			
 		} 		
		return flag;
	 	}
//// RP FirstName ///
			
		@Test(description="Verify Patient tab functionality")
		public boolean verifyResponsiblePartyFirstName() {
	 		
			try{ 
			Thread.sleep(1000);	
			stepInfo="Go to Search Patient Tab";
 			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
 			test.log(Status.PASS, "Go to Patient Tab"); 
 			
 			flag=CommonMethods.clickIfEnable(ISearchPatient.TAB_SearchPatient);
 			test.log(Status.PASS, "Go to Search Patient Tab "); 
 			
 			stepInfo="Select Search By Responsible Party";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.RADIOBTN_searchForResponsibleParty);
 			test.log(Status.PASS, "Select Search By Responsible Party"); 
 			
 			stepInfo="Select Search By First Name";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.RADIOBTN_searchByFirstName); 
 			test.log(Status.PASS, "Select Search By First Name "); 
 			
 			stepInfo="Enter First Name"; 
 			String FirstName1=CommonMethods.readDatafromProps(filePath,"FirstName");
 			flag=CommonMethods.sendText(ISearchPatient.TXT_searchText, FirstName1); 
 			test.log(Status.PASS, "Enter First Name"); 
 			
 			stepInfo="Search Patient";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.BTN_search);	
 			test.log(Status.PASS, "Search Patient "); 
 			
 			Thread.sleep(1000);	
 			
 			stepInfo="Select First Patient from Result";
 			flag = selectNthRowFromResponsiblePartyResults(ISearchPatient.TABLE_searchResults, 1);
 			Thread.sleep(3000);	
 			flag=CommonMethods.clickIfEnable(ISearchPatient.BTN_Save);
 			test.log(Status.PASS, "Select First Patient from Result"); 
			test.log(Status.PASS, "Navigate to Overview Tab");							
 		} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 			
 		} 		
		return flag;
	 	}
/// RP	SSN /////
			
		@Test(description="Verify Patient tab functionality")
		public boolean verifyResponsiblePartySSN() {
	 		
			try{ 
			Thread.sleep(3000);	
			stepInfo="Go to Search Patient Tab";
 			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
 			test.log(Status.PASS, "Go to Patient Tab"); 
 			
 			flag=CommonMethods.clickIfEnable(ISearchPatient.TAB_SearchPatient);
 			test.log(Status.PASS, "Go to Search Patient Tab "); 
 			
 			stepInfo="Select Search By Responsible Party";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.RADIOBTN_searchForResponsibleParty);
 			test.log(Status.PASS, "Select Search By Responsible Party"); 
 			
 			stepInfo="Select Search By Patient SSN";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.RADIOBTN_searchBySSN); 
 			test.log(Status.PASS, "Select Search By Patient SSN"); 
 			
 			stepInfo="Enter SSN Number";
 			String ssn = CommonMethods.readDatafromProps(filePath, "SSN");
 			flag=CommonMethods.sendText(ISearchPatient.TXT_searchText, ssn);
 			test.log(Status.PASS, "Enter SSN Number");
 			
 			stepInfo="Search Patient";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.BTN_search);	
 			test.log(Status.PASS, "Search Patient "); 
 			
 			Thread.sleep(1000);
 			
 			stepInfo="Select First Patient from Result";
 			flag = selectNthRowFromResponsiblePartyResults(ISearchPatient.TABLE_searchResults, 1);
 			flag=CommonMethods.clickIfEnable(ISearchPatient.BTN_Save);
 			test.log(Status.PASS, "Select First Patient from Result"); 
			test.log(Status.PASS, "Navigate to Overview Tab");
 		} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 			
 		} 		
		return flag;
	 	}
///RP Email /////
			
		@Test(description="Verify Patient tab functionality")
		public boolean verifyResponsiblePartyEmail() {
	 		
			try{ 
			Thread.sleep(3000);		
			stepInfo="Go to Search Patient Tab";
 			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
 			test.log(Status.PASS, "Go to Patient Tab"); 
 			
 			flag=CommonMethods.clickIfEnable(ISearchPatient.TAB_SearchPatient);
 			test.log(Status.PASS, "Go to Search Patient Tab "); 
 			
 			stepInfo="Select Search By Responsible Party";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.RADIOBTN_searchForResponsibleParty);
 			test.log(Status.PASS, "Select Search By Responsible Party"); 
 			
 			stepInfo="Select Search By Patient Email";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.RADIOBTN_searchByEmail); 
 			test.log(Status.PASS, "Select Search By Patient Email"); 
 			
 			stepInfo="Enter Email";
 			String email = CommonMethods.readDatafromProps(filePath, "Email");
 			flag=CommonMethods.sendText(ISearchPatient.TXT_searchText, email);
 			test.log(Status.PASS, "Enter Email");
 			
 			stepInfo="Search Patient";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.BTN_search);	
 			test.log(Status.PASS, "Search Patient "); 
 			
 			Thread.sleep(1000);
 			
 			stepInfo="Select First Patient from Result";
 			flag = selectNthRowFromResponsiblePartyResults(ISearchPatient.TABLE_searchResults, 1);
 			flag=CommonMethods.clickIfEnable(ISearchPatient.BTN_Save);
 			test.log(Status.PASS, "Select First Patient from Result"); 
			test.log(Status.PASS, "Navigate to Overview Tab");
 		} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 			
 		} 		
		return flag;
	 	}
		
////RP BirthDate /////
			
		@Test(description="Verify Patient tab functionality")
		public boolean verifyResponsiblePartyBirthDate() {
	 		
			try{ 
			Thread.sleep(3000);	
			stepInfo="Go to Search Patient Tab";
 			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
 			test.log(Status.PASS, "Go to Patient Tab"); 
 			
 			flag=CommonMethods.clickIfEnable(ISearchPatient.TAB_SearchPatient);
 			test.log(Status.PASS, "Go to Search Patient Tab "); 
 			
 			stepInfo="Select Search By Responsible Party";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.RADIOBTN_searchForResponsibleParty);
 			test.log(Status.PASS, "Select Search By Responsible Party"); 
 			
			stepInfo="Select Search By  Patient BirthDate";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.RADIOBTN_searchByBirthDate); 
 			test.log(Status.PASS, "Select Search By  Patient BirthDate"); 
 			
 			stepInfo="Enter  Patient Birth Date"; 
 			flag=CommonMethods.sendText(ISearchPatient.TXT_searchText,"08/08/2010");  
 			test.log(Status.PASS, "Enter Patient Birth Date"); 
 			
 			stepInfo="Search Patient";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.BTN_search);	
 			test.log(Status.PASS, "Search Patient "); 
 			
 			Thread.sleep(1000);
 			
 			stepInfo="Select First Patient from Result";
 			flag = selectNthRowFromResponsiblePartyResults(ISearchPatient.TABLE_searchResults, 1);
 			flag=CommonMethods.clickIfEnable(ISearchPatient.BTN_Save);
 			test.log(Status.PASS, "Select First Patient from Result"); 
			test.log(Status.PASS, "Navigate to Overview Tab");
 		} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 			
 		} 		
		return flag;
	 	}
////RP HOME/CELL/WORK Phone ///////		
		    
		@Test(description="Verify Patient tab functionality")
		public boolean verifyResponsiblePartyHomePhone() {
	 		
			try{ 
				Thread.sleep(3000);		
			stepInfo="Go to Search Patient Tab";
 			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
 			test.log(Status.PASS, "Go to Patient Tab"); 
 			
 			flag=CommonMethods.clickIfEnable(ISearchPatient.TAB_SearchPatient);
 			test.log(Status.PASS, "Go to Search Patient Tab "); 
 			
 			stepInfo="Select Search By Responsible Party";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.RADIOBTN_searchForResponsibleParty);
 			test.log(Status.PASS, "Select Search By Responsible Party"); 
 			
 			stepInfo="Select Search By  Patient HOME number";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.RADIOBTN_searchByPhoneNo); 
 			test.log(Status.PASS, "Select Search By  Patient HOME number"); 
 			
 			stepInfo="Enter Home Number";
 			String homeno1 = CommonMethods.readDatafromProps(filePath, "HomeNo");
 			flag=CommonMethods.sendText(ISearchPatient.TXT_searchText, homeno1);
 			test.log(Status.PASS, "Enter Home Number");
 			
 			stepInfo="Search Patient";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.BTN_search);	
 			test.log(Status.PASS, "Search Patient "); 
 			
 			Thread.sleep(3000);	
 			
 			stepInfo="Select First Patient from Result";
 			flag = selectNthRowFromResponsiblePartyResults(ISearchPatient.TABLE_searchResults, 1);
 			flag=CommonMethods.clickIfEnable(ISearchPatient.BTN_Save);
 			test.log(Status.PASS, "Select First Patient from Result"); 
			test.log(Status.PASS, "Navigate to Overview Tab");
 		} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 			
 		} 		
		return flag;
	 	}
			///////// Cell Phone ////// 
			
		@Test(description="Verify Patient tab functionality")
		public boolean verifyResponsiblePartyCellPhone() {
	 		
			try{ 
				Thread.sleep(3000);		
			stepInfo="Go to Search Patient Tab";
 			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
 			test.log(Status.PASS, "Go to Patient Tab"); 
 			
 			flag=CommonMethods.clickIfEnable(ISearchPatient.TAB_SearchPatient);
 			test.log(Status.PASS, "Go to Search Patient Tab "); 
 			
 			stepInfo="Select Search By Responsible Party";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.RADIOBTN_searchForResponsibleParty);
 			test.log(Status.PASS, "Select Search By Responsible Party"); 
 			
 			stepInfo="Select Search By  Patient Cell Phoner";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.RADIOBTN_searchByCellPhone); 
 			test.log(Status.PASS, "Select Search By  Patient Cell Phone"); 
 			
 			stepInfo="Enter cell Number";
 			String cellno1 = CommonMethods.readDatafromProps(filePath, "CellNo");
 			flag=CommonMethods.sendText(ISearchPatient.TXT_searchText, cellno1);
 			test.log(Status.PASS, "Enter cell Number");
 			
 			stepInfo="Search Patient";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.BTN_search);	
 			test.log(Status.PASS, "Search Patient "); 
 			
 			Thread.sleep(1000);
 			
 			stepInfo="Select First Patient from Result";
 			flag = selectNthRowFromResponsiblePartyResults(ISearchPatient.TABLE_searchResults, 1);
 			flag=CommonMethods.clickIfEnable(ISearchPatient.BTN_Save);
 			test.log(Status.PASS, "Select First Patient from Result"); 
			test.log(Status.PASS, "Navigate to Overview Tab");
 		} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 			
 		} 		
		return flag;
	 	}
			/////// Work Phone //////
		
		@Test(description="Verify Patient tab functionality")
		public boolean verifyResponsiblePartyWorkPhone() {
	 		
			try{ 
				Thread.sleep(3000);	
			stepInfo="Go to Search Patient Tab";
 			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
 			test.log(Status.PASS, "Go to Patient Tab"); 
 			
 			flag=CommonMethods.clickIfEnable(ISearchPatient.TAB_SearchPatient);
 			test.log(Status.PASS, "Go to Search Patient Tab "); 
 			
 			stepInfo="Select Search By Responsible Party";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.RADIOBTN_searchForResponsibleParty);
 			test.log(Status.PASS, "Select Search By Responsible Party"); 
 			
 			stepInfo="Select Search By  Patient Work Phone";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.RADIOBTN_searchByWorkPhone); 
 			test.log(Status.PASS, "Select Search By  Patient Work Phone"); 
 			
 			stepInfo="Enter work Number";
 			String workno1 = CommonMethods.readDatafromProps(filePath, "WorkNo");
 			flag=CommonMethods.sendText(ISearchPatient.TXT_searchText, workno1);
 			test.log(Status.PASS, "Enter work Number");
 			
 			stepInfo="Search Patient";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.BTN_search);	
 			test.log(Status.PASS, "Search Patient "); 
 			
 			Thread.sleep(1000);
 			
 			stepInfo="Select First Patient from Result";
 			flag = selectNthRowFromResponsiblePartyResults(ISearchPatient.TABLE_searchResults, 1);
 			flag=CommonMethods.clickIfEnable(ISearchPatient.BTN_Save);
 			test.log(Status.PASS, "Select First Patient from Result"); 
			test.log(Status.PASS, "Navigate to Overview Tab");
 		} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 			
 		} 		
		return flag;
	 	}
	 	
///// RP ID ////////////
		
	 	@Test(description="Verify Patient tab functionality")
		public boolean verifyResponsiblePartyID() {
	 		
			try{ 
				
				Thread.sleep(3000);	
			stepInfo="Go to Search Patient Tab";
 			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
 			test.log(Status.PASS, "Go to Patient Tab"); 
 			
 			flag=CommonMethods.clickIfEnable(ISearchPatient.TAB_SearchPatient);
 			test.log(Status.PASS, "Go to Search Patient Tab "); 
 			
 			stepInfo="Select Search By Responsible Party";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.RADIOBTN_searchForResponsibleParty);
 			test.log(Status.PASS, "Select Search By Responsible Party"); 
 			
 			stepInfo="Select Search By  Responsible Party ID";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.INP_responsibleParty_ID); 
 			flag=CommonMethods.sendText(ISearchPatient.TXT_searchText,"543");  
 			test.log(Status.PASS, "Enter Patient ID"); 
 			
 			stepInfo="Search Patient";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.BTN_search);	
 			test.log(Status.PASS, "Search Patient "); 
 			
 			Thread.sleep(1000);
 			
 			stepInfo="Select First Patient from Result";
 		//	flag = selectNthRowFromResponsiblePartyResults(ISearchPatient.TABLE_searchResults, 1);
 			flag=CommonMethods.clickIfEnable(ISearchPatient.BTN_Save);
 			test.log(Status.PASS, "Select First Patient from Result"); 
			test.log(Status.PASS, "Navigate to Overview Tab");
			

			
 		} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 
 			
 		}
 	
	 		
		return flag;
	 	}

public boolean SearchPatientByFirstNamePage(String FirstName){
		
		try{ 
			stepInfo="Go to Search Patient Tab";
 			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
 			flag=CommonMethods.clickIfEnable(ISearchPatient.TAB_SearchPatient);
			
			stepInfo="Select Search By First Name";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.RADIOBTN_searchByFirstName); 
 			
 			stepInfo="Enter First Name"; 
 			flag=CommonMethods.sendText(ISearchPatient.TXT_searchText, FirstName); 
 			
 			stepInfo="Search Patient";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.BTN_search);	
 			
 			stepInfo="Select First Patient from Result";
 			flag = selectNthRowFromResults(ISearchPatient.TABLE_searchResults, 1);
 			
 			 			 
 		} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 
 			
 		}
 	
	 		
		return flag;
	 	}
	

	public static boolean selectNthRowFromResults(By Table,int n){
 		
 		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 20);
 	    try {
 	    	Thread.sleep(2000);
 	    	WebElement ele = DriverManager.getDriver().findElement(By.xpath("//tr[@id='dgSearchctl0__"+(n-1)+"']//a[@id='dgSearch__ctl0__ctl4_lnkPatientID']"));
 	    	wait.until(ExpectedConditions.visibilityOf(ele));
 	    	ele.click();
 	        return true;
 	    } catch (Exception eTO) {
 	    	eTO.printStackTrace();
 	    	return false;
 	    }
 	    
 	}
	
	public static boolean selectNthRowFromResponsiblePartyResults(By Table,int n){
 		
 		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 20);
 	    try {
 	    	Thread.sleep(2000);
 	    	WebElement ele = DriverManager.getDriver().findElement(By.xpath("//tr[@id='dgSearchctl0__"+(n-1)+"']//a[@id='dgSearch__ctl0__ctl4_lnkRespID']"));
 	    	wait.until(ExpectedConditions.visibilityOf(ele));
 	    	ele.click();
 	        return true;
 	    } catch (Exception eTO) {
 	    	eTO.printStackTrace();
 	    	return false;
 	    }
 	    
 	}
}
