package com.denticon.automationSQA.patient;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.IAddPatient;
import com.denticon.automationSQA.pom.INotes;
import com.denticon.automationSQA.utilities.CommonMethods;
import com.denticon.automationSQA.utilities.CopyImagetoClipBoard;

public class ProgressNotes extends SeleniumSuite { 
	
	String stepInfo=""; 
	boolean flag=false; 

		String ProgressNotes;

	 	@Test(description="Verify Add Notes Module")
	 	public boolean verifyAddNotesModule(){
		
	 		try	{ 

	 			stepInfo="Click on Patient tab";
	 			flag=CommonMethods.clickIfEnable(INotes.SLC_RecentPatient);
	 			flag=CommonMethods.clickIfEnable(INotes.SLC_LastPatient);
				flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
			//	test.log(Status.PASS, "Click on Patient tab"); 
	 		//	TransactionEntry te= new TransactionEntry();
		 	//	te.SearchPatientByPatientID("916");

				stepInfo="Click on Progress Notes"; 
				flag=CommonMethods.clickIfEnable(INotes.TAB_PNotes);
		//		test.log(Status.PASS, "Click on Progress Notes");
				
				
				CommonMethods.switchToFrame(By.id("progressNotesIFrame"));
				
				stepInfo="Go to Add Progress Notes";
	 			flag=CommonMethods.clickIfEnable(INotes. SLC_AddNewNote);
	 			
	 			flag = CommonMethods.clickIfEnable(INotes.BTN_NoteColorSelector);
	 			flag = CommonMethods.clickIfEnable(INotes.CLR_Red);
	 			
	 			CommonMethods.switchToFrame(By.id("noteEditor_ifr"));
	 			
	 			ProgressNotes = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()) ;
	 			
	 			flag = CommonMethods.sendText(INotes.TXT_ProgresNote, ProgressNotes);
	 			
	 			CommonMethods.switchToDefaultContent();
	 			CommonMethods.switchToFrame(By.id("progressNotesIFrame"));
	 			
				flag=CommonMethods.clickIfEnable(INotes.BTN_SelectToothNo);
				flag=CommonMethods.clickIfEnable(INotes.LNK_SelectFirstTooth);
				flag=CommonMethods.clickIfEnable(INotes.BTN_SaveTooth);
				
				flag = CommonMethods.sendText(INotes.TXT_DateOfService, "08/01/2017");
				flag= CommonMethods.clickIfEnable(INotes.BTN_SelectToothQuardantSurface);
	 			flag= CommonMethods.clickIfEnable(INotes.LNK_SelectFirstSurface);
	 			flag= CommonMethods.clickIfEnable(INotes.LNK_SelectFirstQuadrant);
	 			flag= CommonMethods.clickIfEnable(INotes.BTN_SaveToothQuadrantSurface);
	 			
	 			flag=CommonMethods.selectFromList(INotes.SLC_SelectMacro, "ABC");
	 			flag = CommonMethods.clickIfEnable(INotes.BTN_AddMacroToNotes);
	 			
	 			CommonMethods.switchToDefaultContent();
	 			CommonMethods.switchToFrame(By.id("progressNotesIFrame"));
	 			
	 			flag= CommonMethods.clickIfEnable(INotes.Save);
				
	 			//flag=CommonMethods.selectFromList(INotes.SLC_PNSelectMacro,"ABC");
	 			
				
				//flag=CommonMethods.clickIfEnable(INotes.SLC_PNSelectMacro);
	 			//flag=CommonMethods.clickIfEnable(INotes.SLC_MacroAddNotes);
	 			//flag=CommonMethods.sendText(INotes.TXT_PNnotes,"Add my Progress Note" );
	 			//flag=CommonMethods.clickIfEnable(INotes.SLC_MacroAddNotes);
	 			//flag=CommonMethods.clickIfEnable(INotes.Save);
				//	test.log(Status.PASS, "Go to Add Progress Notes");
	 			
	 			
				
		} catch (Exception e) { 
	 			e.printStackTrace(); 
	 			Assert.fail(); 
	 			
	 		}
		return flag; 	
	}

	 	@Test(description="Verify Strike Off Notes Module",dependsOnMethods="verifyAddNotesModule")
	 	public boolean verifyStrikeOffNotesModule(){
	 		try	{ 

	 			stepInfo="Click on Patient tab";
	 			flag=CommonMethods.switchToDefaultContent();
	 			flag=CommonMethods.clickIfEnable(INotes.SLC_RecentPatient);
	 			flag=CommonMethods.clickIfEnable(INotes.SLC_LastPatient);
	 			flag=CommonMethods.isAlertPresent();
	 			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
				
				stepInfo="Click on Progress Notes"; 
				flag=CommonMethods.clickIfEnable(INotes.TAB_PNotes);
				CommonMethods.switchToFrame(By.id("progressNotesIFrame"));
				flag=CommonMethods.clickIfEnable(INotes.SLC_ProgressNoteFilter);
				flag=CommonMethods.selectFromList(INotes.SLC_ProgressNoteFilter,"Keyword");
				flag=CommonMethods.sendText(INotes.TXT_ProgressNotesFilterInput, ProgressNotes);
				flag=CommonMethods.clickIfEnable(INotes.BTN_ProgressNotesFilterSearch);
				
				flag =CommonMethods.clickIfEnable(INotes.LNK_EditFirstFilterSearchResult);
				flag=CommonMethods.clickIfEnable(INotes.BTN_StrikeOffProgressNotes);
				flag=CommonMethods.isAlertPresent();
				
				
	 		} catch (Exception e) { 
	 			e.printStackTrace(); 
	 			Assert.fail();
	 		}
		return flag;
	 	}
	 	
	 	@Test(description="Restore Strike Off Notes",dependsOnMethods="verifyStrikeOffNotesModule")
	 	public boolean verifyRestoreStrikeOff(){
	 		
	 		try	{ 
	 			
	 			stepInfo="Click on Patient tab";
	 			flag=CommonMethods.switchToDefaultContent();
	 			flag=CommonMethods.clickIfEnable(INotes.SLC_RecentPatient);
	 			flag=CommonMethods.clickIfEnable(INotes.SLC_LastPatient);
	 			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
				
				stepInfo="Click on Progress Notes"; 
				
				flag=CommonMethods.clickIfEnable(INotes.TAB_PNotes);
				CommonMethods.switchToFrame(By.id("progressNotesIFrame"));
				flag=CommonMethods.clickIfEnable(INotes.SLC_ProgressNoteFilter);
				flag=CommonMethods.selectFromList(INotes.SLC_ProgressNoteFilter, "Keyword");
				
				flag=CommonMethods.sendText(INotes.TXT_ProgressNotesFilterInput, ProgressNotes);
				flag=CommonMethods.clickIfEnable(INotes.BTN_ProgressNotesFilterSearch);
				
				flag =CommonMethods.clickIfEnable(INotes.LNK_EditFirstFilterSearchResult);
				flag=CommonMethods.clickIfEnable(INotes.BTN_StrikeOffProgressNotes);
				
				
	 		} catch (Exception e) { 
	 			e.printStackTrace(); 
	 			Assert.fail();
	 		}
		return flag;
	 	}
	 	
	 	@Test(description="Search Progress Notes",dependsOnMethods="verifyStrikeOffNotesModule")
	 	
	 	public boolean verifySearchProgressNotes(){
		try	{ 	
			
				Thread.sleep(5000);
	 			stepInfo="Click on Patient tab";
	 			flag=CommonMethods.switchToDefaultContent();
	 			flag=CommonMethods.clickIfEnable(INotes.SLC_RecentPatient);
	 			flag=CommonMethods.clickIfEnable(INotes.SLC_LastPatient);
	 			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
				
				stepInfo="Click on Progress Notes"; 
				
				flag=CommonMethods.clickIfEnable(INotes.TAB_PNotes);
				CommonMethods.switchToFrame(By.id("progressNotesIFrame"));
				flag=CommonMethods.clickIfEnable(INotes.SLC_ProgressNoteFilter);
				flag=CommonMethods.selectFromList(INotes.SLC_ProgressNoteFilter, "DOS");
				
				flag=CommonMethods.sendText(INotes.TXT_ProgressNotesFilterInput, "10/09/2017");
				flag=CommonMethods.clickIfEnable(INotes.BTN_ProgressNotesFilterSearch);
				Thread.sleep(3000);
				Assert.assertEquals(driver.findElement(INotes.LBL_DOSOfFirstFilterSearchResult).getText(), "10/09/2017");
				
				flag=CommonMethods.clickIfEnable(INotes.SLC_ProgressNoteFilter);
				flag=CommonMethods.selectFromList(INotes.SLC_ProgressNoteFilter, "Created On");
				
				flag=CommonMethods.sendText(INotes.TXT_ProgressNotesFilterInput, "10/09/2017");
				flag=CommonMethods.clickIfEnable(INotes.BTN_ProgressNotesFilterSearch);
				Thread.sleep(3000);
				Assert.assertTrue(driver.findElement(INotes.LBL_CreatedOnOfFirstFilterSearchResult).getText().contains("10/09/2017"));
				
				flag=CommonMethods.clickIfEnable(INotes.SLC_ProgressNoteFilter);
				flag=CommonMethods.selectFromList(INotes.SLC_ProgressNoteFilter, "Created By");
				
				flag=CommonMethods.sendText(INotes.TXT_ProgressNotesFilterInput, "amy.chunh");
				flag=CommonMethods.clickIfEnable(INotes.BTN_ProgressNotesFilterSearch);
				Thread.sleep(3000);
				Assert.assertTrue(driver.findElement(INotes.LBL_CreatedOnOfFirstFilterSearchResult).getText().contains("AMY.CHUNH"));
				
				flag=CommonMethods.switchToDefaultContent();
				
				
	 		} catch (Exception e) { 
	 			e.printStackTrace(); 
	 			Assert.fail();
	 		}
		return flag;	
	 	} 	
	 	
		@Test  (description="Verify Add Notes Module",dependsOnMethods="verifySearchProgressNotes")
	 	public boolean verifyAddScannedDocument(){
		
	 		try	{ 

	 			stepInfo="Click on Patient tab";
	 			flag=CommonMethods.clickIfEnable(INotes.SLC_RecentPatient);
	 			flag=CommonMethods.clickIfEnable(INotes.SLC_LastPatient);
				flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
			//	test.log(Status.PASS, "Click on Patient tab"); 
				
				
				
				stepInfo="Click on Progress Notes"; 
				flag=CommonMethods.clickIfEnable(INotes.TAB_PNotes);
		//		test.log(Status.PASS, "Click on Progress Notes");
				
				
				CommonMethods.switchToFrame(By.id("progressNotesIFrame"));
				
				stepInfo="Go to Add Progress Notes";
	 			flag=CommonMethods.clickIfEnable(INotes. SLC_AddNewNote);
	 			
	 			
	 			//flag=CommonMethods.sendText(INotes.TXT_ProgresNote);
	 			
	 			new CopyImagetoClipBoard();
	 			ProgressNotes = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()) ;
	 			CommonMethods.switchToFrame(By.id("noteEditor_ifr"));
	 			CommonMethods.sendText(INotes.TXT_ProgresNote,ProgressNotes);
	 			CommonMethods.pasteScreen(INotes.TXT_ProgresNote);
	 			
	 			CommonMethods.switchToDefaultContent();
	 			CommonMethods.switchToFrame(By.id("progressNotesIFrame"));
	 			CommonMethods.sendText(INotes.TXT_ScreenShotName, ProgressNotes);
	 			CommonMethods.clickIfEnable(INotes.BTN_UploadScreenShot);

	 			
	 			flag= CommonMethods.clickIfEnable(INotes.Save);
	 			flag=CommonMethods.switchToDefaultContent();
	 			
	 			
	 			
				
		} catch (Exception e) { 
	 			e.printStackTrace(); 
	 			Assert.fail(); 
	 			
	 		}
		return flag; 	
	}
	}