 package com.denticon.automationSQA.patient;

import java.util.Properties;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.IAddPatient;
import com.denticon.automationSQA.pom.IDentalInsPlan;
import com.denticon.automationSQA.utilities.CommonMethods;

public class AddPSDentalInsurance extends SeleniumSuite{
	
	String stepInfo=""; 
	boolean flag=false; 
 	String filePath=System.getProperty("user.dir") + "\\src\\main\\resources\\AddNewPatient.properties"; 
 	Properties prop= new Properties();

 
 	@Test(description="Primary Dental Insurance Module")
 	public boolean verifyParimaryDentalInsurancePage(){
	
 		try{ 
 			Thread.sleep(5000);
			stepInfo="Click on Patient tab";
			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
			test.log(Status.PASS, "Click on Patient tab"); 
	 
			
			stepInfo="Click on Primary Dental Insurance"; 
			flag=CommonMethods.clickIfEnable(IDentalInsPlan.TAB_InsInfo);
			Thread.sleep(1000);
			flag=CommonMethods.clickIfEnable(IDentalInsPlan.TAB_PrimaryDental);
			test.log(Status.PASS, "Click on Primary Dental Insurance");
			
			stepInfo="Search Primary Dental Insurance"; 
			flag=CommonMethods.clickIfEnable(IDentalInsPlan.TXT_SearchText);
			flag=CommonMethods.sendText(IDentalInsPlan.TXT_SearchText,"%%%");
			test.log(Status.PASS, "Search Primary Dental Insurance");
			
			stepInfo="Click on Search"; 
			flag=CommonMethods.clickIfEnable(IDentalInsPlan.TAB_Search);
			test.log(Status.PASS, "Click on Search");
			
			stepInfo="Select Insurance Plan"; 
			flag=CommonMethods.doubleClickIfEnable(IDentalInsPlan.SLC_250CIGNA);
			test.log(Status.PASS, "Select Insurance Plan");
			
 			stepInfo="Enter First name"; 
 			String firstName=CommonMethods.readDatafromProps(filePath,"FirstName");
 			flag=CommonMethods.sendText(IAddPatient.TXT_First_Name, firstName);
 			test.log(Status.PASS, "Enter First name");

 			stepInfo="Click on Address";
 			String address=CommonMethods.readDatafromProps(filePath,"Address");
 			flag=CommonMethods.sendText(IAddPatient.TXT_Address, address);
 			flag=CommonMethods.sendText(IAddPatient.TXT_Address2, address);
 			test.log(Status.PASS, "Click on Address");
 			
 			stepInfo="Enter Birthdate";
 			String birthdate = CommonMethods.readDatafromProps(filePath, "Bdate");
 			flag=CommonMethods.sendText(IAddPatient.TXT_Bdate, birthdate);
 			test.log(Status.PASS, "Enter Birthdate");
 			
 		 	stepInfo="Relationship to Responsible Party";
 			String reltoparty = CommonMethods.readDatafromProps(filePath, "RelToRes");
 			flag=CommonMethods.selectFromList(IAddPatient.DRPDWN_RelToRes, reltoparty);
 			test.log(Status.PASS, "Relationship to Responsible Party");
 			
 			stepInfo="Enter SSN Number";
 			String ssn = CommonMethods.readDatafromProps(filePath, "SSN");
 			flag=CommonMethods.sendText(IDentalInsPlan.TXT_SSNSubID , ssn);
 			test.log(Status.PASS, "Enter SSN Number");
 			
 			flag=CommonMethods.clickIfEnable(IDentalInsPlan.TAB_Save);
 			test.log(Status.PASS, "Save Information");
 			test.log(Status.PASS, "Navigate to  Patient Overview Page");

			Alert alert =com.denticon.automationSQA.DriverManager.getDriver().switchTo().alert(); 
 			alert.accept(); 
 			Thread.sleep(1000);
 			
 			
	} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 
 			
 		}
	return flag;
 	
}
 	
 	
 	 
 	@Test(description="Secondary Dental Insurance Module")
 	public boolean verifySecondaryDentalInsurancePage(){
	
 		try{ 
 			
 			Thread.sleep(5000);
			stepInfo="Click on Patient tab";
			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
			test.log(Status.PASS, "Click on Patient tab"); 
	 
			
			stepInfo="Click on Dental Insurance"; 
			flag=CommonMethods.clickIfEnable(IDentalInsPlan.TAB_InsInfo);
			Thread.sleep(1000);
			flag=CommonMethods.clickIfEnable(IDentalInsPlan.TAB_SecondaryDental);
			test.log(Status.PASS, "Click on Secondary Dental Insurance");
			
			stepInfo="Search Secondary Dental Insurance"; 
			flag=CommonMethods.clickIfEnable(IDentalInsPlan.TXT_SearchText);
			flag=CommonMethods.sendText(IDentalInsPlan.TXT_SearchText,"%%%");
			test.log(Status.PASS, "Search Primary Dental Insurance");
			
			stepInfo="Click on Search"; 
			flag=CommonMethods.clickIfEnable(IDentalInsPlan.TAB_Search);
			test.log(Status.PASS, "Click on Search");
			
			stepInfo="Select Insurance Plan"; 
			flag=CommonMethods.doubleClickIfEnable(IDentalInsPlan.SLC_BrightSmileIns);
			test.log(Status.PASS, "Select Insurance Plan");
			
 			stepInfo="Enter First name"; 
 			String firstName=CommonMethods.readDatafromProps(filePath,"FirstName");
 			flag=CommonMethods.sendText(IAddPatient.TXT_First_Name, firstName);
 			test.log(Status.PASS, "Enter First name");

 			stepInfo="Click on Address";
 			String address=CommonMethods.readDatafromProps(filePath,"Address");
 			flag=CommonMethods.sendText(IAddPatient.TXT_Address, address);
 			flag=CommonMethods.sendText(IAddPatient.TXT_Address2, address);
 			test.log(Status.PASS, "Click on Address");
 			
 			stepInfo="Enter Birthdate";
 			String birthdate = CommonMethods.readDatafromProps(filePath, "Bdate");
 			flag=CommonMethods.sendText(IAddPatient.TXT_Bdate, birthdate);
 			test.log(Status.PASS, "Enter Birthdate");
 			
 		 	stepInfo="Relationship to Responsible Party";
 			String reltoparty = CommonMethods.readDatafromProps(filePath, "RelToRes");
 			flag=CommonMethods.selectFromList(IAddPatient.DRPDWN_RelToRes, reltoparty);
 			test.log(Status.PASS, "Relationship to Responsible Party");
 			
 			stepInfo="Enter SSN Number";
 			String ssn = CommonMethods.readDatafromProps(filePath, "SSN");
 			flag=CommonMethods.sendText(IDentalInsPlan.TXT_SSNSubID , ssn);
 			test.log(Status.PASS, "Enter SSN Number");
 			
 			flag=CommonMethods.clickIfEnable(IDentalInsPlan.TAB_Save);
 			test.log(Status.PASS, "Save Information");
 			test.log(Status.PASS, "Navigate to  Patient Overview Page");

			Alert alert =com.denticon.automationSQA.DriverManager.getDriver().switchTo().alert(); 
 			alert.accept(); 
 			Thread.sleep(1000);
 			
 			
	} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 
 			
 		}
	return flag;
 	
}
 	

 	@Test(description="Primary Medical Insurance Module")
 	public boolean verifyParimaryMedicalInsurancePage(){
	
 		try{ 
			Thread.sleep(5000);
 			
			stepInfo="Click on Patient tab";
			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
			test.log(Status.PASS, "Click on Patient tab"); 
	 
			
			stepInfo="Click on Primary Medical Insurance"; 
			flag=CommonMethods.clickIfEnable(IDentalInsPlan.TAB_InsInfo);
			Thread.sleep(1000);
			flag=CommonMethods.clickIfEnable(IDentalInsPlan.TAB_PrimaryMedical);
			test.log(Status.PASS, "Click on Primary Medical Insurance");
			
			stepInfo="Search Primary Medical Insurance"; 
			flag=CommonMethods.clickIfEnable(IDentalInsPlan.TXT_SearchText);
			flag=CommonMethods.sendText(IDentalInsPlan.TXT_SearchText,"%%%");
			test.log(Status.PASS, "Search Primary Medical Insurance");
			
			stepInfo="Click on Search"; 
			flag=CommonMethods.clickIfEnable(IDentalInsPlan.TAB_Search);
			test.log(Status.PASS, "Click on Search");
			
			stepInfo="Select Insurance Plan"; 
			flag=CommonMethods.doubleClickIfEnable(IDentalInsPlan.SLC_250CIGNA);
			test.log(Status.PASS, "Select Insurance Plan");
			
 			stepInfo="Enter First name"; 
 			String firstName=CommonMethods.readDatafromProps(filePath,"FirstName");
 			flag=CommonMethods.sendText(IAddPatient.TXT_First_Name, firstName);
 			test.log(Status.PASS, "Enter First name");

 			stepInfo="Click on Address";
 			String address=CommonMethods.readDatafromProps(filePath,"Address");
 			flag=CommonMethods.sendText(IAddPatient.TXT_Address, address);
 			flag=CommonMethods.sendText(IAddPatient.TXT_Address2, address);
 			test.log(Status.PASS, "Click on Address");
 			
 			stepInfo="Enter Birthdate";
 			String birthdate = CommonMethods.readDatafromProps(filePath, "Bdate");
 			flag=CommonMethods.sendText(IAddPatient.TXT_Bdate, birthdate);
 			test.log(Status.PASS, "Enter Birthdate");
 			
 		 	stepInfo="Relationship to Responsible Party";
 			String reltoparty = CommonMethods.readDatafromProps(filePath, "RelToRes");
 			flag=CommonMethods.selectFromList(IAddPatient.DRPDWN_RelToRes, reltoparty);
 			test.log(Status.PASS, "Relationship to Responsible Party");
 			
 			stepInfo="Enter SSN Number";
 			String ssn = CommonMethods.readDatafromProps(filePath, "SSN");
 			flag=CommonMethods.sendText(IDentalInsPlan.TXT_SSNSubID , ssn);
 			test.log(Status.PASS, "Enter SSN Number");
 			
 			flag=CommonMethods.clickIfEnable(IDentalInsPlan.TAB_Save);
 			test.log(Status.PASS, "Save Information");
 			test.log(Status.PASS, "Navigate to  Patient Overview Page");

			Alert alert =com.denticon.automationSQA.DriverManager.getDriver().switchTo().alert(); 
 			alert.accept(); 
 			Thread.sleep(1000);
 			
 			
	} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 
 			
 		}
	return flag;
 	
}
 	
 
	@Test(description="Secondary Medical Insurance Module")
 	public boolean verifySecondaryMedicalInsurancePage(){
	
 		try{ 
 			Thread.sleep(5000);
 			
			stepInfo="Click on Patient tab";
			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
			test.log(Status.PASS, "Click on Patient tab"); 
	 
			
			stepInfo="Click on Secondray Medical Insurance"; 
			flag=CommonMethods.clickIfEnable(IDentalInsPlan.TAB_InsInfo);
			Thread.sleep(1000);
			flag=CommonMethods.clickIfEnable(IDentalInsPlan.TAB_SecondaryMedical);
			test.log(Status.PASS, "Click on Secondray Medical Insurance");
			
			stepInfo="Search Primary Dental Insurance"; 
			flag=CommonMethods.clickIfEnable(IDentalInsPlan.TXT_SearchText);
			flag=CommonMethods.sendText(IDentalInsPlan.TXT_SearchText,"%%%");
			test.log(Status.PASS, "Search Secondray Medical Insurance");
			
			stepInfo="Click on Search"; 
			flag=CommonMethods.clickIfEnable(IDentalInsPlan.TAB_Search);
			test.log(Status.PASS, "Click on Search");
			
			stepInfo="Select Insurance Plan"; 
			flag=CommonMethods.doubleClickIfEnable(IDentalInsPlan.SLC_250CIGNA);
			test.log(Status.PASS, "Select Insurance Plan");
			
 			stepInfo="Enter First name"; 
 			String firstName=CommonMethods.readDatafromProps(filePath,"FirstName");
 			flag=CommonMethods.sendText(IAddPatient.TXT_First_Name, firstName);
 			test.log(Status.PASS, "Enter First name");

 			stepInfo="Click on Address";
 			String address=CommonMethods.readDatafromProps(filePath,"Address");
 			flag=CommonMethods.sendText(IAddPatient.TXT_Address, address);
 			flag=CommonMethods.sendText(IAddPatient.TXT_Address2, address);
 			test.log(Status.PASS, "Click on Address");
 			
 			stepInfo="Enter Birthdate";
 			String birthdate = CommonMethods.readDatafromProps(filePath, "Bdate");
 			flag=CommonMethods.sendText(IAddPatient.TXT_Bdate, birthdate);
 			test.log(Status.PASS, "Enter Birthdate");
 			
 		 	stepInfo="Relationship to Responsible Party";
 			String reltoparty = CommonMethods.readDatafromProps(filePath, "RelToRes");
 			flag=CommonMethods.selectFromList(IAddPatient.DRPDWN_RelToRes, reltoparty);
 			test.log(Status.PASS, "Relationship to Responsible Party");
 			
 			stepInfo="Enter SSN Number";
 			String ssn = CommonMethods.readDatafromProps(filePath, "SSN");
 			flag=CommonMethods.sendText(IDentalInsPlan.TXT_SSNSubID , ssn);
 			test.log(Status.PASS, "Enter SSN Number");
 			
 			flag=CommonMethods.clickIfEnable(IDentalInsPlan.TAB_Save);
 			test.log(Status.PASS, "Save Information");
 			test.log(Status.PASS, "Navigate to  Patient Overview Page");

			Alert alert =com.denticon.automationSQA.DriverManager.getDriver().switchTo().alert(); 
 			alert.accept(); 
 			Thread.sleep(1000);
 			
 			
	} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 
 			
 		}
	return flag;
 	
}
 
	
	@Test(description="Third Dental Insurance Module")
 	public boolean verifyThirdDentalInsurancePage(){
	
 		try{ 
 			
 			Thread.sleep(5000);
			stepInfo="Click on Patient tab";
			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
			test.log(Status.PASS, "Click on Patient tab"); 
	 
			
			stepInfo="Click on Dental Insurance"; 
			flag=CommonMethods.clickIfEnable(IDentalInsPlan.TAB_InsInfo);
			Thread.sleep(1000);
			flag=CommonMethods.clickIfEnable(IDentalInsPlan.TAB_ThirdDental);
			test.log(Status.PASS, "Click on SThird Dental Insurance");
			
			stepInfo="Search Third Dental Insurance"; 
			flag=CommonMethods.clickIfEnable(IDentalInsPlan.TXT_SearchText);
			flag=CommonMethods.sendText(IDentalInsPlan.TXT_SearchText,"%%%");
			test.log(Status.PASS, "SearchThird Dental Insurance");
			
			stepInfo="Click on Search"; 
			flag=CommonMethods.clickIfEnable(IDentalInsPlan.TAB_Search);
			test.log(Status.PASS, "Click on Search");
			
			stepInfo="Select Insurance Plan"; 
			flag=CommonMethods.doubleClickIfEnable(IDentalInsPlan.SLC_BrightSmileIns);
			test.log(Status.PASS, "Select Insurance Plan");
			
 			stepInfo="Enter First name"; 
 			String firstName=CommonMethods.readDatafromProps(filePath,"FirstName");
 			flag=CommonMethods.sendText(IAddPatient.TXT_First_Name, firstName);
 			test.log(Status.PASS, "Enter First name");

 			stepInfo="Click on Address";
 			String address=CommonMethods.readDatafromProps(filePath,"Address");
 			flag=CommonMethods.sendText(IAddPatient.TXT_Address, address);
 			flag=CommonMethods.sendText(IAddPatient.TXT_Address2, address);
 			test.log(Status.PASS, "Click on Address");
 			
 			stepInfo="Enter Birthdate";
 			String birthdate = CommonMethods.readDatafromProps(filePath, "Bdate");
 			flag=CommonMethods.sendText(IAddPatient.TXT_Bdate, birthdate);
 			test.log(Status.PASS, "Enter Birthdate");
 			
 		 	stepInfo="Relationship to Responsible Party";
 			String reltoparty = CommonMethods.readDatafromProps(filePath, "RelToRes");
 			flag=CommonMethods.selectFromList(IAddPatient.DRPDWN_RelToRes, reltoparty);
 			test.log(Status.PASS, "Relationship to Responsible Party");
 			
 			stepInfo="Enter SSN Number";
 			String ssn = CommonMethods.readDatafromProps(filePath, "SSN");
 			flag=CommonMethods.sendText(IDentalInsPlan.TXT_SSNSubID , ssn);
 			test.log(Status.PASS, "Enter SSN Number");
 			
 			flag=CommonMethods.clickIfEnable(IDentalInsPlan.TAB_Save);
 			test.log(Status.PASS, "Save Information");
 			test.log(Status.PASS, "Navigate to  Patient Overview Page");

			Alert alert =com.denticon.automationSQA.DriverManager.getDriver().switchTo().alert(); 
 			alert.accept(); 
 			Thread.sleep(1000);
 			
 			
	} catch (Exception e) { 
 			e.printStackTrace(); 
 			Assert.fail(); 
 			
 		}
	return flag;
 	
}
 	
	
	@Test(description="Fourth Dental Insurance Module")
 	public boolean verifyFourthDentalInsurancePage(){
	
 		try{ 
 			Thread.sleep(5000);
 			
			stepInfo="Click on Patient tab";
			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
			test.log(Status.PASS, "Click on Patient tab"); 
	 
			
			stepInfo="Click on Dental Insurance"; 
			flag=CommonMethods.clickIfEnable(IDentalInsPlan.TAB_InsInfo);
			Thread.sleep(1000);
			flag=CommonMethods.clickIfEnable(IDentalInsPlan.TAB_ForthDental);
			test.log(Status.PASS, "Click on Fourth Dental Insurance");
			
			stepInfo="Search Fourth Dental Insurance"; 
			flag=CommonMethods.clickIfEnable(IDentalInsPlan.TXT_SearchText);
			flag=CommonMethods.sendText(IDentalInsPlan.TXT_SearchText,"%%%");
			test.log(Status.PASS, "Search Fourth Dental Insurance");
			
			stepInfo="Click on Search"; 
			flag=CommonMethods.clickIfEnable(IDentalInsPlan.TAB_Search);
			test.log(Status.PASS, "Click on Search");
			
			stepInfo="Select Insurance Plan"; 
			flag=CommonMethods.doubleClickIfEnable(IDentalInsPlan.SLC_BrightSmileIns);
			test.log(Status.PASS, "Select Insurance Plan");
			
 			stepInfo="Enter First name"; 
 			String firstName=CommonMethods.readDatafromProps(filePath,"FirstName");
 			flag=CommonMethods.sendText(IAddPatient.TXT_First_Name, firstName);
 			test.log(Status.PASS, "Enter First name");

 			stepInfo="Click on Address";
 			String address=CommonMethods.readDatafromProps(filePath,"Address");
 			flag=CommonMethods.sendText(IAddPatient.TXT_Address, address);
 			flag=CommonMethods.sendText(IAddPatient.TXT_Address2, address);
 			test.log(Status.PASS, "Click on Address");
 			
 			stepInfo="Enter Birthdate";
 			String birthdate = CommonMethods.readDatafromProps(filePath, "Bdate");
 			flag=CommonMethods.sendText(IAddPatient.TXT_Bdate, birthdate);
 			test.log(Status.PASS, "Enter Birthdate");
 			
 		 	stepInfo="Relationship to Responsible Party";
 			String reltoparty = CommonMethods.readDatafromProps(filePath, "RelToRes");
 			flag=CommonMethods.selectFromList(IAddPatient.DRPDWN_RelToRes, reltoparty);
 			test.log(Status.PASS, "Relationship to Responsible Party");
 			
 			stepInfo="Enter SSN Number";
 			String ssn = CommonMethods.readDatafromProps(filePath, "SSN");
 			flag=CommonMethods.sendText(IDentalInsPlan.TXT_SSNSubID , ssn);
 			test.log(Status.PASS, "Enter SSN Number");
 			
 			flag=CommonMethods.clickIfEnable(IDentalInsPlan.TAB_Save);
 			test.log(Status.PASS, "Save Information");
 			test.log(Status.PASS, "Navigate to  Patient Overview Page");

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
