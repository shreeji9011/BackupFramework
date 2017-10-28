package com.denticon.automationSQA.scheduler;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.denticon.automationSQA.DriverManager;
import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.ICharting;
import com.denticon.automationSQA.pom.IScheduler;
import com.denticon.automationSQA.pom.ITransaction;
import com.denticon.automationSQA.transaction.TransactionEntry;
import com.denticon.automationSQA.transaction.TreatmentPlan;
import com.denticon.automationSQA.utilities.CommonMethods;

public class SchedularJob extends SeleniumSuite{
	String stepInfo=""; 
 	boolean flag=false; 
 	String parent= null;
 	
 	public boolean verifySchedulerPage(){ 
 		try{ 
 			
 			parent = driver.getWindowHandle();
 			stepInfo="Click on Scheduler tab"; 
 			flag=CommonMethods.clickIfEnable(IScheduler.TAB_SCHEDULER); 
 			flag=CommonMethods.isElementPresent(IScheduler.TITLE_Scheduler); 
 			
 			for (String currentHandle : driver.getWindowHandles()) {
				if(!currentHandle.equals(parent)) {
					driver.switchTo().window(currentHandle);
					break;
				}
			} 			
 		} 
 		catch (Exception e) { 
 			e.getStackTrace(); 
 		} 
 		return flag; 
 	} 
 	
 	@Test(description="verify crate appointment closed time")
 	public boolean VerifyCreateAppointmentClosedTime(){ 
 		try{ 
 			flag=verifySchedulerPage(); 
 			
 			flag=CommonMethods.clickIfEnable(IScheduler.SLC_TIME_APPOINTMENT);
 			flag = CommonMethods.doubleClickIfEnable(IScheduler.SLC_TIME_APPOINTMENT);
 			
 			flag = CommonMethods.isAlertPresent();
 			 
 			flag = CommonMethods.sendText(By.cssSelector("input#txtSearch"), "abi");
 			flag = CommonMethods.clickIfEnable(By.cssSelector("input#cmdSearch"));
 			flag  = CommonMethods.clickIfEnable(By.cssSelector("table#dgPatientList  tr:nth-of-type(2)"));
 			flag  = CommonMethods.doubleClickIfEnable(By.cssSelector("table#dgPatientList  tr:nth-of-type(2)"));
 			
 			flag= CommonMethods.isAlertPresent();
 			while(CommonMethods.isElementPresent(By.cssSelector("div.modal img"))) {
 				CommonMethods.clickIfEnable(By.cssSelector("div.modal img"));
 			}
 			
 			flag = CommonMethods.clickIfEnable(By.cssSelector("input#cmdSave")); 
  			
 			if(CommonMethods.isAlertPresent());
 			
 			flag=CommonMethods.rightClickIfEnable(By.cssSelector("table.schapt:nth-of-type(1)"));
 			flag = CommonMethods.clickIfEnable(By.cssSelector("#divDelete\\2e \\2e \\2e"));
 			flag= CommonMethods.isAlertPresent();	 
 			
 			for (String currentHandle : driver.getWindowHandles()) {
				if(!currentHandle.equals(parent)) {
					driver.switchTo().window(currentHandle);
					driver.close();
				}
			} 
 			driver.switchTo().window(parent);
 			
 		} 
 		catch (Exception e) { 
 			e.printStackTrace(); 
 		} 
 		return flag;		 
 	} 

//	@Test(description="verify create appointment off days")
 	public boolean VerifyCreateAppointmentOffDays(){ 
 		try{ 
 			flag=verifySchedulerPage();
 			Thread.sleep(2000);
 			/*flag = CommonMethods.clickIfEnable(By.cssSelector("img#ApptMenu_imgDate"));
 			Thread.sleep(2000);
 			flag = CommonMethods.clickIfEnable(By.xpath("//font[contains(text(),'"+29+"')]"));
 			
 			flag=CommonMethods.clickIfEnable(IScheduler.SLC_TIME_APPOINTMENT);
 			Thread.sleep(3000);
 			flag = CommonMethods.doubleClickIfEnable(IScheduler.SLC_TIME_APPOINTMENT);
 			
 			
 			 flag = CommonMethods.isAlertPresent();
 			*/
 			
 			flag = CommonMethods.clickIfEnable(By.id("aMenuScheduler"));
 			Thread.sleep(2000);
 			flag= CommonMethods.clickIfEnable(By.id("ApptMenu_ancFindSlotV2"));
 			Thread.sleep(2000);
 			flag=CommonMethods.clickIfEnable(By.id("imgFromDate"));
 			flag = CommonMethods.clickIfEnable(By.xpath("//font[contains(text(),'"+29+"')]"));
 			flag=CommonMethods.clickIfEnable(By.id("imgToDate"));
 			flag = CommonMethods.clickIfEnable(By.xpath("//font[contains(text(),'"+29+"')]"));
 			flag=CommonMethods.clickIfEnable(By.id("chkAllProvider"));
 			flag=CommonMethods.clickIfEnable(By.id("rdoAMPM_2"));
 			flag=CommonMethods.clickIfEnable(By.cssSelector("input#cmdFindSlot_V2"));
 			Thread.sleep(5000);
 			flag=CommonMethods.clickIfEnable(By.cssSelector("tr.data:nth-of-type(1)"));
 			flag=CommonMethods.doubleClickIfEnable(By.cssSelector("div.fs"));
 			
 			
 			 flag = CommonMethods.sendText(By.cssSelector("input#txtSearch"), "abi");
 			 flag = CommonMethods.clickIfEnable(By.cssSelector("input#cmdSearch"));
 			 
 			 flag  = CommonMethods.clickIfEnable(By.cssSelector("table#dgPatientList  tr:nth-of-type(2)"));
 			 flag  = CommonMethods.doubleClickIfEnable(By.cssSelector("table#dgPatientList  tr:nth-of-type(2)"));
 			
 			
 			while(CommonMethods.isElementPresent(By.cssSelector("div.modal img"))) {
 				CommonMethods.clickIfEnable(By.cssSelector("div.modal img"));
 			}
 			 
 			flag = CommonMethods.clickIfEnable(By.cssSelector("input#cmdSave")); 
 						
 			if(CommonMethods.isAlertPresent());

 			//change time and provider

 			/*flag=CommonMethods.rightClickIfEnable(By.cssSelector("table.schapt"));
 			flag = CommonMethods.clickIfEnable(By.cssSelector("#divEdit\\2e \\2e \\2e"));
 			
 			flag = CommonMethods.isAlertPresent();
 			 			
 			Select provider = new Select(driver.findElement(By.id("cboProviders")));
 			time.selectByValue("2526: Dass, Daars");
 			
 			Select time = new Select(driver.findElement(By.id("cboStartTime")));
 			time.selectByValue("09:00");
 			 
 			flag = CommonMethods.clickIfEnable(By.cssSelector("input#cmdSave")); 
			if(CommonMethods.isAlertPresent());*/
 			
			//tx plans
/* 			flag=CommonMethods.rightClickIfEnable(By.cssSelector("table.schapt"));
 			flag = CommonMethods.clickIfEnable(By.cssSelector("#divEdit\\2e \\2e \\2e"));
 			
 			flag = CommonMethods.isAlertPresent();
 			flag  = CommonMethods.clickIfEnable(By.cssSelector("div#tabStrip_TxPlan_Panel_TxPlan_tvwTxPlann1Nodes table:nth-of-type(1) span:nth-of-type(1)"));
 			flag = CommonMethods.clickIfEnable(By.cssSelector("input#tabStrip_TxPlan_Panel_TxPlan_cmdAddTx"));
 					
 			flag=CommonMethods.isAlertPresent();
 			 
 			flag = CommonMethods.clickIfEnable(By.cssSelector("input#cmdSave")); 
			if(CommonMethods.isAlertPresent());*/

			//change provider quick add

 			/*flag=CommonMethods.rightClickIfEnable(By.cssSelector("table.schapt"));
 			flag = CommonMethods.clickIfEnable(By.cssSelector("#divEdit\\2e \\2e \\2e"));
 			
 			flag = CommonMethods.isAlertPresent();
 			flag  = CommonMethods.clickIfEnable(By.cssSelector("span#__tab_tabStrip_AddProcedure_Panel"));
 			
 			flag = CommonMethods.clickIfEnable(By.cssSelector("#tabStrip_AddProcedure_Panel_AddProcedure_cmdDiagnostics"));
 			flag=CommonMethods.sendText(By.cssSelector("#tabStrip_AddProcedure_Panel_AddProcedure_txtADACode"),"D0120");
 			
 			flag =CommonMethods.clickIfEnable(By.cssSelector("#tabStrip_AddProcedure_Panel_AddProcedure_tblProcs tr:nth-of-type(2)"));
 			flag = CommonMethods.clickIfEnable(By.cssSelector("#tabStrip_AddProcedure_Panel_AddProcedure_btnAddProc"));		
 			if(CommonMethods.isAlertPresent());
 			 
 			flag = CommonMethods.clickIfEnable(By.cssSelector("input#cmdSave")); 
			if(CommonMethods.isAlertPresent());*/
			
 			//change status and set as confirmed
 			/*flag=CommonMethods.rightClickIfEnable(By.cssSelector("table.schapt"));
 			flag = CommonMethods.mourseHoverIfEnable(By.cssSelector("#SetStatus"));
 			flag = CommonMethods.clickIfEnable(By.xpath("//*[contains(@id,'divSet as Confirmed')]"));
 			*/
 			//confirm with confirm button
 			/*flag=CommonMethods.clickIfEnable(By.cssSelector("table.schapt"));
 			flag = CommonMethods.clickIfEnable(By.cssSelector("[title='Confirmed']"));
 			*/
 			
 			//copy future
 			/*flag = CommonMethods.rightClickIfEnable(By.cssSelector("table.schapt"));
 			flag = CommonMethods.clickIfEnable(By.cssSelector("#divCopy"));
 			flag = CommonMethods.clickIfEnable(By.cssSelector("#ApptMenu_imgNext"));
 			flag = CommonMethods.rightClickIfEnable(IScheduler.SLC_TIME_APPOINTMENT);
 			flag= CommonMethods.clickIfEnable(By.cssSelector("#divPaste"));
 			if(CommonMethods.isAlertPresent());
 			if(CommonMethods.isAlertPresent());*/
 			
 			//copy past
 			/*flag = CommonMethods.rightClickIfEnable(By.cssSelector("table.schapt"));
 			flag = CommonMethods.clickIfEnable(By.cssSelector("#divCopy"));
 			flag = CommonMethods.clickIfEnable(By.cssSelector("#ApptMenu_imgPrev"));
 			flag = CommonMethods.rightClickIfEnable(IScheduler.SLC_TIME_APPOINTMENT);
 			flag= CommonMethods.clickIfEnable(By.cssSelector("#divPaste"));
 			if(CommonMethods.isAlertPresent());
 			if(CommonMethods.isAlertPresent());*/
 			
 			//copy same day
 			/*
 			flag = CommonMethods.rightClickIfEnable(By.cssSelector("table.schapt"));
 			flag = CommonMethods.clickIfEnable(By.cssSelector("#divCopy"));
 			//flag = CommonMethods.clickIfEnable(By.cssSelector("div#r32"));
 			flag = CommonMethods.rightClickIfEnable(By.cssSelector("div#r32"));
 			flag = CommonMethods.clickIfEnable(By.cssSelector("#divPaste"));
 			flag=CommonMethods.isAlertPresent();
 			if(CommonMethods.isAlertPresent());
 			if(CommonMethods.isAlertPresent());
 			flag=CommonMethods.rightClickIfEnable(By.cssSelector("table.schapt"));
 			flag = CommonMethods.clickIfEnable(By.cssSelector("#divDelete\\2e \\2e \\2e"));
 			flag= CommonMethods.isAlertPresent();	 
 			
 			*///cut same day
 			/*
 			flag = CommonMethods.rightClickIfEnable(By.cssSelector("table.schapt"));
 			flag = CommonMethods.clickIfEnable(By.cssSelector("#divCut"));
 			//flag = CommonMethods.clickIfEnable(By.cssSelector("div#r32"));
 			flag = CommonMethods.rightClickIfEnable(By.cssSelector("div#r32"));
 			flag = CommonMethods.clickIfEnable(By.cssSelector("#divPaste"));
 			flag=CommonMethods.isAlertPresent();
 			if(CommonMethods.isAlertPresent());
 			if(CommonMethods.isAlertPresent());*/
 			
 			//Reschedule
			
 			/*	
 			flag=CommonMethods.rightClickIfEnable(By.cssSelector("table.schapt"));
 			flag = CommonMethods.clickIfEnable(By.cssSelector("#divReschedule\\2e \\2e \\2e"));
 			flag = CommonMethods.clickIfEnable(By.cssSelector("input#rdoAMPM_2"));
 			flag=CommonMethods.clickIfEnable(By.cssSelector("input#cmdFindSlot_V2"));
 			flag=CommonMethods.clickIfEnable(By.cssSelector("tr.data:nth-of-type(1)"));
 			flag=CommonMethods.clickIfEnable(By.cssSelector("input#cmdResched"));
 			flag = CommonMethods.clickIfEnable(By.cssSelector("input#cmdSave"));*/
 			
 			//change view
/* 			flag=CommonMethods.clickIfEnable(By.id("ApptMenu_aMenuViews"));
 			flag=CommonMethods.clickIfEnable(By.id("ApptMenu_ancWeeklyView"));
 			
 			flag=CommonMethods.clickIfEnable(By.id("ApptMenu_aMenuViews"));
 			flag=CommonMethods.clickIfEnable(By.id("ApptMenu_ancDailyView"));
*/ 			
 			
 			//change prod type
 			/*flag=CommonMethods.rightClickIfEnable(By.cssSelector("table.schapt"));
 			flag = CommonMethods.clickIfEnable(By.cssSelector("#divEdit\\2e \\2e \\2e"));
 			flag = CommonMethods.isAlertPresent();
 			flag = CommonMethods.selectFromList(By.id("cboProdType"),"Crowns");
 			flag = CommonMethods.clickIfEnable(By.cssSelector("input#cmdSave")); 
			if(CommonMethods.isAlertPresent()); 			
 			*/
 			
 			//change duration
 			
 			/*flag=CommonMethods.rightClickIfEnable(By.cssSelector("table.schapt"));
 			flag = CommonMethods.clickIfEnable(By.cssSelector("#divEdit\\2e \\2e \\2e"));
 			flag = CommonMethods.isAlertPresent();
 			flag = CommonMethods.selectFromList(By.id("cboApptLength"),"60");
 			flag = CommonMethods.clickIfEnable(By.cssSelector("input#cmdSave")); 
			if(CommonMethods.isAlertPresent()); 	*/		
 			
 			//change operatory
 			
 	/*		flag=CommonMethods.rightClickIfEnable(By.cssSelector("table.schapt"));
 			flag = CommonMethods.clickIfEnable(By.cssSelector("#divEdit\\2e \\2e \\2e"));
 			
 			flag = CommonMethods.isAlertPresent();
 			flag = CommonMethods.selectFromList(By.id("cboOperatories"), "Op6");
 			
 			if(CommonMethods.isAlertPresent());
 			 	
 			flag = CommonMethods.clickIfEnable(By.cssSelector("input#cmdSave")); 
			if(CommonMethods.isAlertPresent());
			
	*/		
 			//add note
 			
 			flag=CommonMethods.rightClickIfEnable(By.cssSelector("table.schapt"));
 			flag = CommonMethods.clickIfEnable(By.cssSelector("#divEdit\\2e \\2e \\2e"));
 			
 			flag = CommonMethods.isAlertPresent();
 			flag = CommonMethods.sendText(By.id("txtNotes"), "Note");
 			
 			if(CommonMethods.isAlertPresent());
 			 	
 			flag = CommonMethods.clickIfEnable(By.cssSelector("input#cmdSave")); 
			if(CommonMethods.isAlertPresent());
 					
 					
 			
 			
// 			deleteAppointment(); 			
  			
 			for (String currentHandle : driver.getWindowHandles()) {
				if(!currentHandle.equals(parent)) {
					driver.switchTo().window(currentHandle);
					if(driver.getCurrentUrl().contains("ReportViewer")) {
						//Assert contains
					}
					driver.close();
				}
			} 
 			driver.switchTo().window(parent);

 			 
 		} 
 		catch (Exception e) { 
 			e.printStackTrace(); 
 		} 
 		return flag;		 
 	} 	

//	@Test(description="verify add appointment for new patient")
 	public boolean VerifyCreateAppointmentNewPatient(){ 
 		try{ 
 			flag=verifySchedulerPage();
 			Thread.sleep(2000);
 			 			
 			flag = CommonMethods.clickIfEnable(By.id("aMenuScheduler"));
 			Thread.sleep(2000);
 			flag= CommonMethods.clickIfEnable(By.id("ApptMenu_ancFindSlotV2"));
 			Thread.sleep(2000);
 			flag=CommonMethods.clickIfEnable(By.id("imgFromDate"));
 			flag = CommonMethods.clickIfEnable(By.xpath("//font[contains(text(),'"+29+"')]"));
 			flag=CommonMethods.clickIfEnable(By.id("imgToDate"));
 			flag = CommonMethods.clickIfEnable(By.xpath("//font[contains(text(),'"+29+"')]"));
 			flag=CommonMethods.clickIfEnable(By.id("chkAllProvider"));
 			flag=CommonMethods.clickIfEnable(By.id("rdoAMPM_2"));
 			flag=CommonMethods.clickIfEnable(By.cssSelector("input#cmdFindSlot_V2"));
 			Thread.sleep(5000);
 			flag=CommonMethods.clickIfEnable(By.cssSelector("tr.data:nth-of-type(1)"));
 			flag=CommonMethods.doubleClickIfEnable(By.cssSelector("div.fs"));
 			
 			flag = CommonMethods.clickIfEnable(By.cssSelector("input#rdoPatientType_3"));
 			flag= CommonMethods.clickIfEnable(By.cssSelector("input#cmdAdd")); 
 			flag=CommonMethods.sendText(By.cssSelector("input#txtLName"), "abc");
 			flag=CommonMethods.sendText(By.cssSelector("input#txtFName"), "abc");
 			flag=CommonMethods.sendText(By.cssSelector("input#txtHomePhone_PhoneNumber_text"), "99999999999");
 			
 			while(CommonMethods.isElementPresent(By.cssSelector("div.modal img"))) {
 				CommonMethods.clickIfEnable(By.cssSelector("div.modal img"));
 			}
 			 
 			flag = CommonMethods.clickIfEnable(By.cssSelector("input#cmdSave")); 
 						
 			if(CommonMethods.isAlertPresent());
 			
 //			deleteAppointment(); 			
  			
 			for (String currentHandle : driver.getWindowHandles()) {
				if(!currentHandle.equals(parent)) {
					driver.switchTo().window(currentHandle);
					if(driver.getCurrentUrl().contains("ReportViewer")) {
						//Assert contains
					}
					driver.close();
				}
			} 
 			driver.switchTo().window(parent);

 		}
 			catch (Exception e) { 
 	 			e.printStackTrace(); 
 	 		} 
 	 		return flag;		 
 	 	} 
}