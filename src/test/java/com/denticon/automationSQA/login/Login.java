/*package com.denticon.automationSQA.login;

import java.util.Properties; 
import org.testng.annotations.Test;

import com.denticon.automationSQA.pom.ILogin;
import com.denticon.automationSQA.utilities.CommonMethods;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


 public class Login { 

 	String username=""; 
 	String password=""; 
 	ExtentReports extent; 
 	ExtentTest test; 
 	
 	Properties prop= new Properties(); 
 	boolean flag=false; 
 	
 	String filePath=System.getProperty("user.dir") + "\\src\\main\\resources\\login.properties"; 
 	
 	@Test 
 	public void login() { 
 		String stepInfo=""; 
 		try{ 
			Thread.sleep(1000); 
 			extent=CommonMethods.getReport(extent); 
 			test=extent.createTest("Denticon Login"); 
 			username=CommonMethods.readDatafromProps(filePath,"user"); 
 			password=CommonMethods.readDatafromProps(filePath,"password"); 
 			flag=CommonMethods.sendText(ILogin.TXT_USERNAME, username); 
 			 
 			if(flag) 
 				test.log(Status.PASS, "Entered Username::"+username); 
 			else 
 				test.log(Status.FAIL, "Entered Username::"+username); 
 
 
 			flag=CommonMethods.sendText(ILogin.TXT_PASSWORD, password); 
 			if(flag) 
 				test.log(Status.PASS, "Entered password::"+password); 
 			else 
 				test.log(Status.FAIL, "Entered password::"+password); 
 
 
 			flag = CommonMethods.clickIfEnable(ILogin.BTN_GO);	 
 			if(flag) 
 				test.log(Status.PASS, "Clicked on Go button"); 
 			else 
 				test.log(Status.FAIL, "Clicked on Go button"); 
 			Thread.sleep(3000); 
 
 
 			CommonMethods.isElementPresent(ILogin.LNK_SIGNOFF); 
 			test.log(Status.PASS, "Successfully logged into Denticon"); 
 			CommonMethods.closeReport(extent,test); 
 			Thread.sleep(3000); 
 
 
 		} 
 		catch(Exception e){	   
 		} 
 
 
 	} 
 } */