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


public class Scheduler extends SeleniumSuite{
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
 			//flag=CommonMethods.clickIfEnable(By.id("ApptMenu_aMenuViews"));
 			//flag=CommonMethods.clickIfEnable(By.id("ApptMenu_ancDailyView"));
 			//flag=CommonMethods.clickIfEnable(By.id("ApptMenu_aMenuUserViews"));
 			//flag=CommonMethods.clickIfEnable(By.xpath("//a[@class='menuItem'][text()='123']"));
 			//flag=CommonMethods.clickIfEnable(By.id("ApptMenu_aMenuProviders"));
 			
 			
 			flag=CommonMethods.clickIfEnable(IScheduler.SLC_TIME_APPOINTMENT);
 			flag = CommonMethods.doubleClickIfEnable(IScheduler.SLC_TIME_APPOINTMENT);
 			
 			flag = CommonMethods.isAlertPresent();
 			 
 			flag = CommonMethods.sendText(By.cssSelector("input#txtSearch"), "abi");
 			flag = CommonMethods.clickIfEnable(By.cssSelector("input#cmdSearch"));
 			flag  = CommonMethods.clickIfEnable(By.cssSelector("table#dgPatientList  tr:nth-of-type(2)"));
 			flag  = CommonMethods.doubleClickIfEnable(By.cssSelector("table#dgPatientList  tr:nth-of-type(2)"));
 			
 			if(CommonMethods.isAlertPresent());
 			while(CommonMethods.isElementPresent(By.cssSelector("div.modal img"))) {
 				CommonMethods.clickIfEnable(By.cssSelector("div.modal img"));
 			}
 			
 			flag = CommonMethods.clickIfEnable(By.cssSelector("input#cmdSave")); 
  			
 			if(CommonMethods.isAlertPresent());
 			
/* 			flag=CommonMethods.rightClickIfEnable(By.cssSelector("table.schapt"));
 			flag = CommonMethods.clickIfEnable(By.cssSelector("#divDelete\\2e \\2e \\2e"));
 			flag= CommonMethods.isAlertPresent();	 */
 			
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

	@Test(description="verify create appointment off days")
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
 			flag = CommonMethods.clickIfEnable(By.xpath("//font[contains(text(),'"+20+"')]"));
 			flag=CommonMethods.clickIfEnable(By.id("imgToDate"));
 			flag = CommonMethods.clickIfEnable(By.xpath("//font[contains(text(),'"+20+"')]"));
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
 /*			flag=CommonMethods.rightClickIfEnable(By.cssSelector("table.schapt"));
 			flag = CommonMethods.clickIfEnable(By.cssSelector("#divEdit\\2e \\2e \\2e"));
 			
 			flag = CommonMethods.isAlertPresent();
 			flag  = CommonMethods.clickIfEnable(By.cssSelector("div#tabStrip_TxPlan_Panel_TxPlan_tvwTxPlann1Nodes table:nth-of-type(1) span:nth-of-type(1)"));
 			flag = CommonMethods.clickIfEnable(By.cssSelector("input#tabStrip_TxPlan_Panel_TxPlan_cmdAddTx"));
 					
 			flag=CommonMethods.isAlertPresent();
 			 
 			flag = CommonMethods.clickIfEnable(By.cssSelector("input#cmdSave")); 
			if(CommonMethods.isAlertPresent());
			*/

			//change provider quick add

 /*			flag=CommonMethods.rightClickIfEnable(By.cssSelector("table.schapt"));
 			flag = CommonMethods.clickIfEnable(By.cssSelector("#divEdit\\2e \\2e \\2e"));
 			
 			flag = CommonMethods.isAlertPresent();
 			flag  = CommonMethods.clickIfEnable(By.cssSelector("span#__tab_tabStrip_AddProcedure_Panel"));
 			
 			flag = CommonMethods.clickIfEnable(By.cssSelector("#tabStrip_AddProcedure_Panel_AddProcedure_cmdDiagnostics"));
 			flag=CommonMethods.sendText(By.cssSelector("#tabStrip_AddProcedure_Panel_AddProcedure_txtADACode"),"D0120");
 			
 			flag =CommonMethods.clickIfEnable(By.cssSelector("#tabStrip_AddProcedure_Panel_AddProcedure_tblProcs tr:nth-of-type(2)"));
 			flag = CommonMethods.clickIfEnable(By.cssSelector("#tabStrip_AddProcedure_Panel_AddProcedure_btnAddProc"));		
 			if(CommonMethods.isAlertPresent());
 			 
 			flag = CommonMethods.clickIfEnable(By.cssSelector("input#cmdSave")); 
			if(CommonMethods.isAlertPresent());    */
			
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
 			
 			/*flag=CommonMethods.rightClickIfEnable(By.cssSelector("table.schapt"));
 			flag = CommonMethods.clickIfEnable(By.cssSelector("#divEdit\\2e \\2e \\2e"));
 			
 			flag = CommonMethods.isAlertPresent();
 			flag = CommonMethods.sendText(By.id("txtNotes"), "Note");
 			
 			if(CommonMethods.isAlertPresent());
 			 	
 			flag = CommonMethods.clickIfEnable(By.cssSelector("input#cmdSave")); 
			if(CommonMethods.isAlertPresent());*/
 					
 			//change user view
 			/*flag=CommonMethods.clickIfEnable(By.id("ApptMenu_aMenuUserViews"));
 			flag=CommonMethods.clickIfEnable(By.xpath("//a[@class='menuItem'][text()='123']"));
 			flag=CommonMethods.clickIfEnable(By.id("ApptMenu_aMenuViews"));
 			flag=CommonMethods.clickIfEnable(By.id("ApptMenu_ancDailyView"));
 			*/
 			
 			deleteAppointment(); 			
  			
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
	
//	@Test(description="Add appointment at lunch time with no authorization")
	public boolean verifyAddAppointmentLunchTimeNoAuthorization() {
		try{ 
			
			flag=CommonMethods.clickIfEnable(By.id("MenuBar_aMenuSetup"));
			flag=CommonMethods.clickIfEnable(By.xpath("//span[@class='menuItemText'][text()='Security']"));
			flag=CommonMethods.clickIfEnable(By.xpath("//a[@class='menuItem'][text()='Groups']"));
			//flag=CommonMethods.selectFromList(By.id("lbOffices"), "Irvine Dentistry");
			Thread.sleep(4000);
			flag=CommonMethods.selectFromList(By.id("lbGroups"),"Back Office (3)");
			flag=CommonMethods.clickIfEnable(By.id("btnEdit"));
			
			try {
				flag=CommonMethods.selectFromList(By.id("ucMultiSelectListBox_lbUnSelectedItems"), "Appointments - Override lunch and closed times to add appointment");
				flag=CommonMethods.clickIfEnable(By.id("ucMultiSelectListBox_imgbtnSelect"));	
			}catch(Exception e) {
				
			}
			
			flag=CommonMethods.clickIfEnable(By.id("Save"));
			//
 			flag=verifySchedulerPage();
 			Thread.sleep(4000);
 			 			
 			flag = CommonMethods.clickIfEnable(By.cssSelector("img#ApptMenu_imgDate"));
 			Thread.sleep(2000);
 			flag = CommonMethods.clickIfEnable(By.xpath("//font[contains(text(),'"+30+"')]"));
 			
 			Thread.sleep(6000);
			flag=CommonMethods.mourseHoverIfEnable(By.xpath("//*[@t='12:00 PM'][1]"));
 			flag=CommonMethods.clickIfEnable(By.xpath("//*[@t='12:00 PM'][1]"));
 			Thread.sleep(3000);
 			flag = CommonMethods.doubleClickIfEnable(By.xpath("//*[@t='12:00 PM'][1]"));
 			Thread.sleep(5000);
 			flag=CommonMethods.isAlertPresent();
 			
 			flag = CommonMethods.sendText(By.cssSelector("input#txtSearch"), "abi");
 			flag = CommonMethods.clickIfEnable(By.cssSelector("input#cmdSearch"));
 			 
 			flag  = CommonMethods.clickIfEnable(By.cssSelector("table#dgPatientList  tr:nth-of-type(2)"));
 			flag  = CommonMethods.doubleClickIfEnable(By.cssSelector("table#dgPatientList  tr:nth-of-type(2)"));
 			
 			flag=CommonMethods.isAlertPresent();
 			
 			while(CommonMethods.isElementPresent(By.cssSelector("div.modal img"))) {
 				CommonMethods.clickIfEnable(By.cssSelector("div.modal img"));
 			}
 			 
 			CommonMethods.isAlertPresent();
 			flag = CommonMethods.clickIfEnable(By.cssSelector("input#cmdSave")); 
 						
 			if(CommonMethods.isAlertPresent());
 			
 			deleteAppointment(); 			
  			
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

//	@Test(description="Add appointment at Reserved time with no authorization")
	public boolean verifyAddAppointmentReservedTimeNoAuthorization() {
		try{ 
			
			flag=CommonMethods.clickIfEnable(By.id("MenuBar_aMenuSetup"));
			flag=CommonMethods.clickIfEnable(By.xpath("//span[@class='menuItemText'][text()='Security']"));
			flag=CommonMethods.clickIfEnable(By.xpath("//a[@class='menuItem'][text()='Groups']"));
			
			Thread.sleep(4000);
			flag=CommonMethods.selectFromList(By.id("lbGroups"),"Back Office (3)");
			flag=CommonMethods.clickIfEnable(By.id("btnEdit"));
			
			try {
				flag=CommonMethods.selectFromList(By.id("ucMultiSelectListBox_lbUnSelectedItems"), "Appointments - Override reserved slots to add appointment");
				flag=CommonMethods.clickIfEnable(By.id("ucMultiSelectListBox_imgbtnSelect"));	
			}catch(Exception e) {
				
			}
			
			flag=CommonMethods.clickIfEnable(By.id("Save"));
			//
 			flag=verifySchedulerPage();
 			Thread.sleep(2000);
 			 			
 			flag = CommonMethods.clickIfEnable(By.cssSelector("img#ApptMenu_imgDate"));
 			Thread.sleep(2000);
 			flag = CommonMethods.clickIfEnable(By.xpath("//font[contains(text(),'"+30+"')]"));
 	 			
 			Thread.sleep(3000);
			flag=CommonMethods.mourseHoverIfEnable(By.xpath("//*[@t='12:00 PM'][1]"));
 			flag=CommonMethods.clickIfEnable(By.xpath("//*[@t='12:00 PM'][1]"));
 			Thread.sleep(3000);
 			flag = CommonMethods.doubleClickIfEnable(By.xpath("//*[@t='12:00 PM'][1]"));
 			Thread.sleep(5000);
 			flag=CommonMethods.isAlertPresent();
 			
 			flag = CommonMethods.sendText(By.cssSelector("input#txtSearch"), "abi");
 			flag = CommonMethods.clickIfEnable(By.cssSelector("input#cmdSearch"));
 			 
 			flag  = CommonMethods.clickIfEnable(By.cssSelector("table#dgPatientList  tr:nth-of-type(2)"));
 			flag  = CommonMethods.doubleClickIfEnable(By.cssSelector("table#dgPatientList  tr:nth-of-type(2)"));
 			
 			flag=CommonMethods.isAlertPresent();

 			
 			while(CommonMethods.isElementPresent(By.cssSelector("div.modal img"))) {
 				CommonMethods.clickIfEnable(By.cssSelector("div.modal img"));
 			}
 			 
 			CommonMethods.isAlertPresent();
 			flag = CommonMethods.clickIfEnable(By.cssSelector("input#cmdSave")); 
 						
 			if(CommonMethods.isAlertPresent());
 			
 			deleteAppointment(); 			
  			
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
 	public boolean VerifyCreateCustomView(){ 
		try{
			flag=CommonMethods.clickIfEnable(By.id("MenuBar_aMenuSetup"));
			flag=CommonMethods.clickIfEnable(By.xpath("//span[@class='menuItemText'][text()='Security']"));
			flag=CommonMethods.clickIfEnable(By.xpath("//a[@class='menuItem'][text()='Groups']"));
			
 			 			
 			
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
 			Calendar day = nextDayOfWeek(Calendar.SUNDAY);
 			if(day.MONTH != Calendar.MONTH) {
 				flag= CommonMethods.clickIfEnable(By.xpath("//div[@id='VicPopCal']//td[@align='right']//input[@name='PrevMonth']"));
 			}
 			flag = CommonMethods.clickIfEnable(By.xpath("//font[contains(text(),'"+day.DATE+"')]"));
 			flag=CommonMethods.clickIfEnable(By.id("imgToDate"));
 			flag = CommonMethods.clickIfEnable(By.xpath("//font[contains(text(),'"+day.DATE+"')]"));
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
 			
 			deleteAppointment(); 			
  			
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
	
	
	
	
//	@Test(description="Change time test case")
	public void changeTime() throws InterruptedException {
		VerifyCreateAppointmentOffDays();
		
		flag=CommonMethods.rightClickIfEnable(By.cssSelector("table.schapt"));
		flag = CommonMethods.clickIfEnable(By.cssSelector("#divEdit\\2e \\2e \\2e"));
			
		flag = CommonMethods.isAlertPresent();
		Select time = new Select(driver.findElement(By.id("cboStartTime")));
		time.selectByValue("09:00");
			 
		flag = CommonMethods.clickIfEnable(By.cssSelector("input#cmdSave")); 
		if(CommonMethods.isAlertPresent());
		
		deleteAppointment();
	}
	
//	@Test(description="Apply Tx Plan test case")
	public void ApplyTxPlan() throws InterruptedException {
		VerifyCreateAppointmentOffDays();
		
		flag = CommonMethods.rightClickIfEnable(By.cssSelector("table.schapt"));
		flag = CommonMethods.clickIfEnable(By.cssSelector("#divEdit\\2e \\2e \\2e"));
			
		flag = CommonMethods.isAlertPresent();
		flag = CommonMethods.clickIfEnable(By.cssSelector("div#tabStrip_TxPlan_Panel_TxPlan_tvwTxPlann1Nodes table:nth-of-type(1) span:nth-of-type(1)"));
		flag = CommonMethods.clickIfEnable(By.cssSelector("input#tabStrip_TxPlan_Panel_TxPlan_cmdAddTx"));
					
		flag = CommonMethods.isAlertPresent();
			 
		flag = CommonMethods.clickIfEnable(By.cssSelector("input#cmdSave")); 
		if(CommonMethods.isAlertPresent());
		
		deleteAppointment();
	}
	
//	@Test(description="Change Provider Quick Add")
	public void changeProviderQuickAdd() throws InterruptedException {
		VerifyCreateAppointmentOffDays();
		
		flag=CommonMethods.rightClickIfEnable(By.cssSelector("table.schapt"));
		flag = CommonMethods.clickIfEnable(By.cssSelector("#divEdit\\2e \\2e \\2e"));
		
		flag = CommonMethods.isAlertPresent();
		flag  = CommonMethods.clickIfEnable(By.cssSelector("span#__tab_tabStrip_AddProcedure_Panel"));
			
		flag = CommonMethods.clickIfEnable(By.cssSelector("#tabStrip_AddProcedure_Panel_AddProcedure_cmdDiagnostics"));
		flag=CommonMethods.sendText(By.cssSelector("#tabStrip_AddProcedure_Panel_AddProcedure_txtADACode"),"D0120");
			
		flag =CommonMethods.clickIfEnable(By.cssSelector("#tabStrip_AddProcedure_Panel_AddProcedure_tblProcs tr:nth-of-type(2)"));
		flag = CommonMethods.clickIfEnable(By.cssSelector("#tabStrip_AddProcedure_Panel_AddProcedure_btnAddProc"));		
		if(CommonMethods.isAlertPresent());
			 
		flag = CommonMethods.clickIfEnable(By.cssSelector("input#cmdSave")); 
		if(CommonMethods.isAlertPresent());
		
		deleteAppointment();
	}
	
//	@Test(description="Change status test case")
	public void changeStatus() throws InterruptedException {
		VerifyCreateAppointmentOffDays();
		
		flag=CommonMethods.rightClickIfEnable(By.cssSelector("table.schapt"));
		flag = CommonMethods.mourseHoverIfEnable(By.cssSelector("#SetStatus"));
		flag = CommonMethods.clickIfEnable(By.xpath("//*[contains(@id,'divSet as Confirmed')]"));
		
		deleteAppointment();
	}
	
//	@Test(description="copy Appointment To Future Date test case")
	public void copyAppointmentToFutureDate() throws InterruptedException {
		VerifyCreateAppointmentOffDays();
		
		flag = CommonMethods.rightClickIfEnable(By.cssSelector("table.schapt"));
		flag = CommonMethods.clickIfEnable(By.cssSelector("#divCopy"));
		flag = CommonMethods.clickIfEnable(By.cssSelector("#ApptMenu_imgNext"));
		flag = CommonMethods.rightClickIfEnable(IScheduler.SLC_TIME_APPOINTMENT);
		flag= CommonMethods.clickIfEnable(By.cssSelector("#divPaste"));
		if(CommonMethods.isAlertPresent());
		if(CommonMethods.isAlertPresent());
		
		deleteAppointment();
	}
	
//	@Test(description="copy Appointment To Past Date test case")
	public void copyAppointmentToPastDate() throws InterruptedException {
		VerifyCreateAppointmentOffDays();
		
		flag = CommonMethods.rightClickIfEnable(By.cssSelector("table.schapt"));
			flag = CommonMethods.clickIfEnable(By.cssSelector("#divCopy"));
			flag = CommonMethods.clickIfEnable(By.cssSelector("#ApptMenu_imgPrev"));
			flag = CommonMethods.rightClickIfEnable(IScheduler.SLC_TIME_APPOINTMENT);
			flag= CommonMethods.clickIfEnable(By.cssSelector("#divPaste"));
			if(CommonMethods.isAlertPresent());
			if(CommonMethods.isAlertPresent());
		
		deleteAppointment();
	}
	
//	@Test(description="copy Appointment To Same Date test case")
	public void copyAppointmentToSameDate() throws InterruptedException {
		VerifyCreateAppointmentOffDays();
		
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
		
		deleteAppointment();
	}
	
//	@Test(description="Cut Appointment To Same Date test case")
	public void CutAppointmentToSameDate() throws InterruptedException {
		VerifyCreateAppointmentOffDays();
		
		flag = CommonMethods.rightClickIfEnable(By.cssSelector("table.schapt"));
		flag = CommonMethods.clickIfEnable(By.cssSelector("#divCut"));
		//flag = CommonMethods.clickIfEnable(By.cssSelector("div#r32"));
		flag = CommonMethods.rightClickIfEnable(By.cssSelector("div#r32"));
		flag = CommonMethods.clickIfEnable(By.cssSelector("#divPaste"));
		flag=CommonMethods.isAlertPresent();
		if(CommonMethods.isAlertPresent());
		if(CommonMethods.isAlertPresent());	 
		
		deleteAppointment();
	}
	
//	@Test(description="Reschedule Appointment test case")
	public void RescheduleAppointment() throws InterruptedException {
		VerifyCreateAppointmentOffDays();
		
		flag=CommonMethods.rightClickIfEnable(By.cssSelector("table.schapt"));
		flag = CommonMethods.clickIfEnable(By.cssSelector("#divReschedule\\2e \\2e \\2e"));
		flag = CommonMethods.clickIfEnable(By.cssSelector("input#rdoAMPM_2"));
		flag=CommonMethods.clickIfEnable(By.cssSelector("input#cmdFindSlot_V2"));
		flag=CommonMethods.clickIfEnable(By.cssSelector("tr.data:nth-of-type(1)"));
		flag=CommonMethods.clickIfEnable(By.cssSelector("input#cmdResched"));
		flag = CommonMethods.clickIfEnable(By.cssSelector("input#cmdSave"));
		
		deleteAppointment();
	}
	
	public void deleteAppointment() throws InterruptedException {
		//delete
		Thread.sleep(2000);
		flag=CommonMethods.mourseHoverIfEnable(By.cssSelector("table.schapt img"));
		flag=CommonMethods.rightClickIfEnable(By.cssSelector("table.schapt img"));
		flag = CommonMethods.clickIfEnable(By.cssSelector("#divDelete\\2e \\2e \\2e"));
		flag= CommonMethods.isAlertPresent();	 
	}
	
	public int getNextSunday() {
		/*Calendar calendar = Calendar.getInstance();
		int weekday = calendar.get(Calendar.DAY_OF_WEEK);
		int days = Calendar.SUNDAY - weekday;
		if (days <= 0)
		{
		    // this will usually be the case since Calendar.SUNDAY is the smallest
		    days += 7;
		}
		calendar.add(Calendar.DAY_OF_YEAR, days);
		return calendar.DATE;*/

		Calendar c=Calendar.getInstance();
		c.set(Calendar.DAY_OF_WEEK,Calendar.SUNDAY);
		c.set(Calendar.HOUR_OF_DAY,0);
		c.set(Calendar.MINUTE,0);
		c.set(Calendar.SECOND,0);
		DateFormat df=new SimpleDateFormat("EEE yyyy/MM/dd HH:mm:ss");
		System.out.println(df.format(c.getTime()));      // This past Sunday [ May include today ]
		c.add(Calendar.DATE,7);
		System.out.println(df.format(c.getTime()));      // Next Sunday
		return c.DATE;
		//c.add(Calendar.DATE,7);
		//System.out.println(df.format(c.getTime()));      // Sunday after next
	}
 	
	public static Calendar nextDayOfWeek(int dow) {
        Calendar date = Calendar.getInstance();
        int diff = dow - date.get(Calendar.DAY_OF_WEEK);
        if (!(diff > 0)) {
            diff += 7;
        }
        date.add(Calendar.DAY_OF_MONTH, diff);
        return date;
    }
}
