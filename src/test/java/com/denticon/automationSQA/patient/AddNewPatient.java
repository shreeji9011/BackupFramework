package com.denticon.automationSQA.patient;

import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.IAddPatient;
import com.denticon.automationSQA.utilities.CommonMethods;

public class AddNewPatient extends SeleniumSuite{
String stepInfo=""; 
boolean flag=false; 
String filePath=System.getProperty("user.dir") + "\\src\\main\\resources\\AddNewPatient.properties"; 
Properties prop= new Properties();

@Test(description="Verify Patient tab functionality")
public boolean verifyAddNewPatientPage(){
try{ 

Thread.sleep(3000);
stepInfo="Click on Patient tab";
  flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT);
  ////test.log(Status.PASS, "Click on Patient tab"); 
  
  stepInfo="Click on add new patient"; 
  flag=CommonMethods.clickIfEnable(IAddPatient.TAB_AddNewPatient);
  ////test.log(Status.PASS, "Click on add new patient");
  
  stepInfo="Select Title";
  String title=CommonMethods.readDatafromProps(filePath,"NIck_I");
  flag=CommonMethods.selectFromList(IAddPatient.SLC_TITLE_NICKNAME,"Mr"); 
 // //test.log(Status.PASS, "Select Title");
  
  stepInfo="Enter the Nick name";
  String nickname=CommonMethods.readDatafromProps(filePath,"Nickname"); 
  flag=CommonMethods.sendText(IAddPatient.TXT_Nick,nickname);
 // //test.log(Status.PASS, "Enter the Nick name");
/*   DateFormat dateFormat = new SimpleDateFormat("yy/MM/dd-HH:mm:ss");
  Date date = new Date();
  String currentDate = dateFormat.format(date);  */
  
  stepInfo="Enter Last name"; 
  String lastName=CommonMethods.readDatafromProps(filePath,"LastName");
  //flag=CommonMethods.sendText(IAddPatient.TXT_Last_Name, lastName+currentDate); 
  flag=CommonMethods.sendText(IAddPatient.TXT_Last_Name, lastName);
  ////test.log(Status.PASS, "Enter Last name");
  
  stepInfo="Enter First name"; 
  String firstName=CommonMethods.readDatafromProps(filePath,"FirstName");
  //flag=CommonMethods.sendText(IAddPatient.TXT_First_Name, firstName+currentDate);
  flag=CommonMethods.sendText(IAddPatient.TXT_First_Name, firstName);
  ////test.log(Status.PASS, "Enter First name");
  
  
  stepInfo="Enter Middlename Initials"; 
  String middle=CommonMethods.readDatafromProps(filePath,"MidI");
  flag=CommonMethods.sendText(IAddPatient.TXT_MidI, middle);
  ////test.log(Status.PASS, "Enter Middlename Initials");
  
  Thread.sleep(2000);
  //Handle duplicate patient pop up
   flag=CommonMethods.clickIfEnable(IAddPatient.BTN_CloseIdenticalPatientPopup);
  
  
  
  stepInfo="Click on Address";
  String address=CommonMethods.readDatafromProps(filePath,"Address");
  flag=CommonMethods.sendText(IAddPatient.TXT_Address, address);
  flag=CommonMethods.sendText(IAddPatient.TXT_Address2, address);
  ////test.log(Status.PASS, "Click on Address");
  
  stepInfo="Click on City";
  String city=CommonMethods.readDatafromProps(filePath,"City"); 
  flag=CommonMethods.sendText(IAddPatient.TXT_City, city);
  ////test.log(Status.PASS, "Click on City");
  
  stepInfo="Enter STATE"; 
  String state=CommonMethods.readDatafromProps(filePath,"State");
  flag=CommonMethods.selectFromList(IAddPatient.SCR_City, state);
  //test.log(Status.PASS, "Enter STATE");
  
    stepInfo="Enter ZIP";
  String Zip = CommonMethods.readDatafromProps(filePath, "ZIP");
  flag=CommonMethods.sendText(IAddPatient.TXT_ZIP, Zip);
  //test.log(Status.PASS, "Enter ZIP");
  
  stepInfo="Enter Email";
  String email = CommonMethods.readDatafromProps(filePath, "Email");
  flag=CommonMethods.sendText(IAddPatient.TXT_Email, email);
  //test.log(Status.PASS, "Enter Email");
  
  stepInfo="Enter Birthdate";
  String birthdate = CommonMethods.readDatafromProps(filePath, "Bdate");
  flag=CommonMethods.sendText(IAddPatient.TXT_Bdate, birthdate);
  //test.log(Status.PASS, "Enter Birthdate");
  
  stepInfo="Enter Marital Status";
  String marital = CommonMethods.readDatafromProps(filePath, "MaritalStatus");
  flag=CommonMethods.selectFromList(IAddPatient.SCR_MStatus, marital);
  //test.log(Status.PASS, "Enter Marital Status");
  
  stepInfo="Enter Sex";
  String sex = CommonMethods.readDatafromProps(filePath, "Sex");
  flag=CommonMethods.selectFromList(IAddPatient.TXT_Sex, sex);
  //test.log(Status.PASS, "Enter Sex");
  
  stepInfo="Enter Health care guardian name";
  String hcgn = CommonMethods.readDatafromProps(filePath, "HCGN");
  flag=CommonMethods.sendText(IAddPatient.SLC_HCGN, hcgn);
  //test.log(Status.PASS, "Enter Health care guardian name");
  
  stepInfo="Enter Health care guardian phone";
  String hcgp = CommonMethods.readDatafromProps(filePath, "HCGP");
  flag=CommonMethods.sendText(IAddPatient.TXT_HCGP, hcgp);
  //test.log(Status.PASS, "Enter Health care guardian phone");
  
  stepInfo="Enter Patient Status";
  //test.log(Status.PASS, "Enter Patient Status");
  flag=CommonMethods.clickIfEnable(IAddPatient.CHK_Nocorrespondence);
  flag=CommonMethods.clickIfEnable(IAddPatient.CHK_ABenifits);
  flag=CommonMethods.clickIfEnable(IAddPatient.CHK_HIPAAAgreement);
  flag=CommonMethods.clickIfEnable(IAddPatient.CHK_NoAutomail);
  flag=CommonMethods.clickIfEnable(IAddPatient.CHK_AutoSMS);
   
  stepInfo="Enter Coverage Type";
 // String coverage = CommonMethods.readDatafromProps(filePath, "CoverageType");
  flag=CommonMethods.clickIfEnable(IAddPatient.CHK_NoCvg);
  //test.log(Status.PASS, "Enter Coverage Type");
  
  stepInfo="Enter Ethnicity";
  String ethinicity = CommonMethods.readDatafromProps(filePath, "Ethinicity");
  flag=CommonMethods.selectFromList(IAddPatient.SCR_Ethinicity,ethinicity);
  //test.log(Status.PASS, "Enter Ethnicity");
  
  stepInfo="Enter Data Stamp";
    flag=CommonMethods.clickIfEnable(IAddPatient.SLC_DataStamp);
    //test.log(Status.PASS, "Enter Data Stamp");
    
    stepInfo="Relationship to Responsible Party";
  String reltoparty = CommonMethods.readDatafromProps(filePath, "RelToRes");
  flag=CommonMethods.selectFromList(IAddPatient.DRPDWN_RelToRes, reltoparty);
  //test.log(Status.PASS, "Relationship to Responsible Party");
  
  stepInfo="Enter Chart Number";
  String chartno = CommonMethods.readDatafromProps(filePath, "ChartNo");
  flag=CommonMethods.sendText(IAddPatient.TXT_ChartNo, chartno);
  //test.log(Status.PASS, "Enter Chart Number");
  
  stepInfo="Enter SSN Number";
  String ssn = CommonMethods.readDatafromProps(filePath, "SSN");
  flag=CommonMethods.sendText(IAddPatient.TXT_SSN, ssn);
  //test.log(Status.PASS, "Enter SSN Number");
  
  stepInfo="Enter Home Number";
  String homeno = CommonMethods.readDatafromProps(filePath, "HomeNo");
  flag=CommonMethods.sendText(IAddPatient.TXT_HomenO, homeno);
  //test.log(Status.PASS, "Enter Home Number");
  
  stepInfo="Enter cell Number";
  String cellno = CommonMethods.readDatafromProps(filePath, "CellNo");
  flag=CommonMethods.sendText(IAddPatient.TXT_CellNo, cellno);
  //test.log(Status.PASS, "Enter cell Number");
  
  stepInfo="Enter work Number";
  String workno = CommonMethods.readDatafromProps(filePath, "WorkNo");
  flag=CommonMethods.sendText(IAddPatient.TXT_WorkNo, workno);
  //test.log(Status.PASS, "Enter work Number");
  
  stepInfo="Enter Driving Lic";
  String dlic = CommonMethods.readDatafromProps(filePath, "DrivingLic");
  flag=CommonMethods.sendText(IAddPatient.TXT_DrivingLic, dlic);
  //test.log(Status.PASS, "Enter Driving Lic");
  
  stepInfo="Enter Student";
  String student = CommonMethods.readDatafromProps(filePath, "Student");
  flag=CommonMethods.selectFromList(IAddPatient. TXT_Student, student);
  //test.log(Status.PASS, "Enter Student");
  
  stepInfo="Enter MediID";
  String mediId = CommonMethods.readDatafromProps(filePath, "MedID");
  flag=CommonMethods.sendText(IAddPatient.TXT_MedID, mediId);
  //test.log(Status.PASS, "Enter MediID");
  
  stepInfo="Enter School Name";
  String schoolName = CommonMethods.readDatafromProps(filePath, "SchoolName");
  flag=CommonMethods.sendText(IAddPatient.TXT_SchoolName, schoolName);
  //test.log(Status.PASS, "Enter School Name");
  
  stepInfo="Enter Emergency Contact";
  String emergencyContact = CommonMethods.readDatafromProps(filePath, "EmergencyContact");
  flag=CommonMethods.sendText(IAddPatient.TXT_EmergencyContact, emergencyContact);
  //test.log(Status.PASS, "Enter Emergency Contact");
  
  stepInfo="Enter Emergency Phone";
  String emergencyPhone = CommonMethods.readDatafromProps(filePath, "EmergencyPhone");
  flag=CommonMethods.sendText(IAddPatient.TXT_EmergencyPhone, emergencyPhone);
  //test.log(Status.PASS, "Enter Emergency Phone");
  
  stepInfo="Enter Fee Schedule";
  String feeSchedule = CommonMethods.readDatafromProps(filePath, "FeeSchedule");
  flag=CommonMethods.selectFromList(IAddPatient.SLC_FeeSchedule, feeSchedule);
  //test.log(Status.PASS, "Enter Fee Schedule");
  
  stepInfo="Preferred Provider";
  String prefProvider = CommonMethods.readDatafromProps(filePath, "PrefProvider");
  flag=CommonMethods.selectFromList(IAddPatient.TXT_PrefProvider, prefProvider);
  //test.log(Status.PASS, "Preferred Provider");
  
  stepInfo="Preferred Hygienist";
  String prefHygienist = CommonMethods.readDatafromProps(filePath, "PreHygienist");
  flag=CommonMethods.selectFromList(IAddPatient.TXT_PrefHygenist, prefHygienist);
  //test.log(Status.PASS, "Preferred Hygienist");
  
  stepInfo="Referal Type";
  String refType = CommonMethods.readDatafromProps(filePath, "RefType");
  flag=CommonMethods.selectFromList(IAddPatient.DRPDWN_ReferralType,refType );
  //test.log(Status.PASS, "Referal Type");
  
  stepInfo="Referred To";
  String refTo = CommonMethods.readDatafromProps(filePath, "RefTo");
  flag=CommonMethods.selectFromList(IAddPatient.TXT_ReferredTo,refTo );
  //test.log(Status.PASS, "Referred To");
  
  stepInfo="Enter Referal Date";
  String Refdate = CommonMethods.readDatafromProps(filePath, "Refdate");
  flag=CommonMethods.sendText(IAddPatient.TXT_ReferedToDate, Refdate);
  //test.log(Status.PASS, "Enter Referal Date");
  
  stepInfo="GoToResponsibleParty";
  flag=CommonMethods.clickIfEnable(IAddPatient.BTN_GoToResponsibleParty);
  
  
  //Handle duplicate patient pop up
   flag=CommonMethods.clickIfEnable(IAddPatient.BTN_CloseIdenticalPatientPopup);
  
  stepInfo="Go To ResponsibleParty";
  flag=CommonMethods.clickIfEnable(IAddPatient.BTN_GoToResponsibleParty);
  //test.log(Status.PASS, "Go To ResponsibleParty");
  
  stepInfo="Select ResponsbileParty Type";
  flag=CommonMethods.clickIfEnable(IAddPatient.RADIOBTN_SelectResonsiblePartyType);
  //test.log(Status.PASS, "Select ResponsbileParty Type");
  
  stepInfo="Add Last Name";
  flag=CommonMethods.sendText(IAddPatient.TXT_First_Name,firstName);
  //test.log(Status.PASS, "Add Last Name");
  
  stepInfo="Select Responsible Party";
  String cmbRespParty = CommonMethods.readDatafromProps(filePath, "cmbRespParty");
  flag=CommonMethods.selectFromList(IAddPatient.DRPDWN_SelectResponsibleParty,cmbRespParty );
  //test.log(Status.PASS, "Select Responsible Party");
  
  //stepInfo="Add Email Statements";
  //flag=CommonMethods.clickIfEnable(IAddPatient.RADIOBTN_emailStatement);
  
  stepInfo="Send to Collection";
  flag=CommonMethods.clickIfEnable(IAddPatient.RADIOBTN_sendToCollection);
  //test.log(Status.PASS, "Send to Collection");
  
  stepInfo="Custom Statement Message";
  String customStatementMessage = CommonMethods.readDatafromProps(filePath, "customStatementMessage");
  flag=CommonMethods.sendText(IAddPatient.TXT_customStatementMessage,customStatementMessage);
  //test.log(Status.PASS, "Custom Statement Message");
  
  
  
  stepInfo="Add Medical Information";
  flag=CommonMethods.clickIfEnable(IAddPatient.BTN_AddMedicalInformation);
  
  
  stepInfo="Enter Medical Information";
  //test.log(Status.PASS, "Enter Medical Information");
 // flag=CommonMethods.clickIfEnable(IAddPatient.CHK_Premedicate);
 // flag=CommonMethods.clickIfEnable(IAddPatient.CHK_Asthma);
 // flag=CommonMethods.clickIfEnable(IAddPatient.CHK_Coumadin);

  stepInfo="Enter Dental QuestionnaireData";
  flag=CommonMethods.clickIfEnable(IAddPatient.BTN_DentalQuestionnaire);
  //test.log(Status.PASS, "Enter Dental Questionnaire Data");
  
  //stepInfo="Enter Phone number";
  //String phone=CommonMethods.readDatafromProps(filePath,"Phone");
  //flag=CommonMethods.sendText(IAddPatient.TXT_DentalPhone,phone);
  
 // flag=CommonMethods.selectFromList(IAddPatient.QUE_DoyouChewSmokeTobaccoinanyform,"No"); 
  
  stepInfo="Go to Add Recall Information";
  flag=CommonMethods.clickIfEnable(IAddPatient.BTN_AddRecallInformation);
  flag=CommonMethods.clickIfEnable(IAddPatient.BTN_Finish); 
  //test.log(Status.PASS, "Go to Add Recall Information");
  
  
  } catch (Exception e) { 
  e.printStackTrace(); 
  Assert.fail(); 
  
  }
  
  
return flag;
  }
}
