package com.denticon.automationSQA.patient;

import java.lang.reflect.Method;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
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
	
	 	ExtentReports extent;
		ExtentTest test; 

	public boolean verifySearchPatientModule(Method method) {
		test=  extent.createTest(this.getClass().getSimpleName()+"::"+method.getName(), method.getName());
 		if(verifSearchPatientPage())
 			System.out.println("Search Patient page verification passed");
 		else
 			System.out.println("Search Patient page verification failed");
		return flag;
	}	

	@Test(description="Verify Search Patient functionality")
	public boolean verifSearchPatientPage(){
		
		try{ 
			extent=CommonMethods.getReport(extent,test);
			test = extent.createTest("Search Patient Module");
 			
//Patient LAST NAME//
			
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
 
 ///Patient First Name/////
 			
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
 			
/////RP Type CASH //////
 			
 			stepInfo="Go to Search Patient Tab";
 			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
 			test.log(Status.PASS, "Go to Patient Tab"); 
 			
 			flag=CommonMethods.clickIfEnable(ISearchPatient.TAB_SearchPatient);
 			test.log(Status.PASS, "Go to Search Patient Tab "); 
 			
 			stepInfo="Select Search By Responsible Party Type";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.RADIOBTN_searchForResponsibleParty);
 			flag=CommonMethods.clickIfEnable(ISearchPatient.RADIOBTN_searchByResponsiblePatientType); 
 			test.log(Status.PASS, "Select Search By Responsible Party Type "); 
 			
 			stepInfo="Enter Responsible Party type as cash"; 
 			flag=CommonMethods.clickIfEnable(ISearchPatient.INP_responsibleParty_cash); 
 			test.log(Status.PASS, "Enter Responsible Party type as cash"); 
 			
 			stepInfo="Search Patient";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.BTN_search);	
 			test.log(Status.PASS, "Search Patient "); 
 			
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

public boolean SearchPatientByFirstNamePage(String FirstName){
		
		try{ 
			stepInfo="Go to Search Patient Tab";
 			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
 			flag=CommonMethods.clickIfEnable(ISearchPatient.TAB_SearchPatient);
			
			stepInfo="Select Search By First Name";
 			flag=CommonMethods.clickIfEnable(ISearchPatient.RADIOBTN_searchByFirstName); 
 			
 			stepInfo="Enter First Name"; 
 			//String FirstName=CommonMethods.readDatafromProps(filePath,"FirstName");
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
 	    	
 	    	WebElement ele = DriverManager.getDriver().findElement(By.xpath("//tr[@id='dgSearchctl0__"+(n-1)+"']//a[@id='dgSearch__ctl0__ctl4_lnkPatientID']"));
 	    	wait.until(ExpectedConditions.visibilityOf(ele));
 	    	ele.click();
 	        return true;
 	    } catch (Exception eTO) {
 	    	eTO.printStackTrace();
 	    	return false;
 	    }
 	    
 	}
}