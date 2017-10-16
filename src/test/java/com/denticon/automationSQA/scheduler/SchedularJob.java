package com.denticon.automationSQA.scheduler;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.IScheduler;
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
 			
 			
 			while(CommonMethods.isElementPresent(By.cssSelector("div.modal img"))) {
 				CommonMethods.clickIfEnable(By.cssSelector("div.modal img"));
 			}
 			
 			flag = CommonMethods.clickIfEnable(By.cssSelector("input#cmdSave")); 
 			
 			
 			if(CommonMethods.isAlertPresent());
 			
 			
 			
 			flag=CommonMethods.rightClickIfEnable(By.cssSelector("table.schapt"));
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

	@Test(description="verify create appointment off days")
 	public boolean VerifyCreateAppointmentOffDays(){ 
 		try{ 
 			flag=verifySchedulerPage();
 			
 			flag = CommonMethods.clickIfEnable(By.cssSelector("img#ApptMenu_imgDate"));
 			flag = CommonMethods.clickIfEnable(By.xpath("//font[contains(text(),'"+29+"')]"));
 			
 			flag=CommonMethods.clickIfEnable(IScheduler.SLC_TIME_APPOINTMENT);
 			Thread.sleep(3000);
 			flag = CommonMethods.doubleClickIfEnable(IScheduler.SLC_TIME_APPOINTMENT);
 			
 			
 			 flag = CommonMethods.isAlertPresent();
 			 
 			 flag = CommonMethods.sendText(By.cssSelector("input#txtSearch"), "abi");
 			 flag = CommonMethods.clickIfEnable(By.cssSelector("input#cmdSearch"));
 			 
 			 flag  = CommonMethods.clickIfEnable(By.cssSelector("table#dgPatientList  tr:nth-of-type(2)"));
 			 flag  = CommonMethods.doubleClickIfEnable(By.cssSelector("table#dgPatientList  tr:nth-of-type(2)"));
 			
 			
 			while(CommonMethods.isElementPresent(By.cssSelector("div.modal img"))) {
 				CommonMethods.clickIfEnable(By.cssSelector("div.modal img"));
 			}
 			 
 			flag = CommonMethods.clickIfEnable(By.cssSelector("input#cmdSave")); 
 						
 			if(CommonMethods.isAlertPresent());

 			//change time

 			flag=CommonMethods.rightClickIfEnable(By.cssSelector("table.schapt"));
 			flag = CommonMethods.clickIfEnable(By.cssSelector("#divEdit\\2e \\2e \\2e"));
 			
 			flag = CommonMethods.isAlertPresent();
 			Select time = new Select(driver.findElement(By.id("cboStartTime")));
 			time.selectByValue("09:00");
 			 
 			flag = CommonMethods.clickIfEnable(By.cssSelector("input#cmdSave")); 
			if(CommonMethods.isAlertPresent());
 			
			//change provider

 			flag=CommonMethods.rightClickIfEnable(By.cssSelector("table.schapt"));
 			flag = CommonMethods.clickIfEnable(By.cssSelector("#divEdit\\2e \\2e \\2e"));
 			
 			flag = CommonMethods.isAlertPresent();
 			flag  = CommonMethods.clickIfEnable(By.cssSelector("div#tabStrip_TxPlan_Panel_TxPlan_tvwTxPlann1Nodes table:nth-of-type(1) span:nth-of-type(1)"));
 			flag = CommonMethods.clickIfEnable(By.cssSelector("input#tabStrip_TxPlan_Panel_TxPlan_cmdAddTx"));
 					
 			
 			 
 			flag = CommonMethods.clickIfEnable(By.cssSelector("input#cmdSave")); 
			if(CommonMethods.isAlertPresent());

			//change provider quick add

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
			
 			//change status
 			/*flag=CommonMethods.rightClickIfEnable(By.cssSelector("table.schapt"));
 			flag = CommonMethods.clickIfEnable(By.cssSelector("#SetStatus"));
 			flag = CommonMethods.clickIfEnable(By.xpath("//*[contains(@id,'divSet as Confirmed')]"));
 			*/
			//Reschedule
			/*
			flag=CommonMethods.rightClickIfEnable(By.cssSelector("table.schapt"));
 			flag = CommonMethods.clickIfEnable(By.cssSelector("#divReschedule\\2e \\2e \\2e"));
 			
 			*/
 			
			//delete
 			flag=CommonMethods.rightClickIfEnable(By.cssSelector("table.schapt"));
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
 	
 	
}
