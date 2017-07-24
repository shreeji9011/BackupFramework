package com.denticon.automationSQA.pom;

import org.openqa.selenium.By;

public interface IAddPatient {
	
	By TAB_PATIENT = By.id("MenuBar_aMenuPatient"); 
	By TAB_AddNewPatient = By.linkText("Add New Patient"); 
	By TAB_PatOverview = By.linkText("Patient Overview");
	By TAB_PatEditInfo = By.linkText("Patient Information");
	By Patient_Info_Title=By.id("//*[@id='HelpBar_SpanPageTitle']"); 
	 
	 
	By SLC_NickTitle=By.xpath("//*[@id='Table5']/tbody/tr[2]/td[1]"); 
	 
	By SLC_TITLE_NICKNAME= By.id("Title_Title"); 
	By TXT_Nick= By.id("txtNickName"); 
	By CHK_Patient=By.name("btnCheckPat"); 
	 

	By TXT_Last_Name=By.id("txtLastName"); 
	By TXT_First_Name=By.id("txtFirstName"); 
	By ROW_DuplicatePatient = By.xpath("//div[@id='dOptions']//table[@id='dtOptions']/tbody/tr[2]");
	By BTN_CloseIdenticalPatientPopup = By.id("btnClose");
	By TXT_MidI=By.id("txtMidInit"); 

	By TXT_Address=By.id("txtAddr"); 
	By TXT_Address2=By.id("txtAddr2"); 

	By TXT_City=By.id("txtCity"); 
	By SCR_City=By.id("State_State"); 
	By TXT_ZIP=By.id("txtZipCode_ZipCode"); 
	 
	By TXT_Email=By.id("txtEmail"); 
	By TXT_Bdate=By.id("txtBirthDate"); 
	By SCR_MStatus=By.id("MStatus_MStatus"); 
	 
	By TXT_HCGN=By.id("txtPowerOfAttorneyName"); 
	By TXT_Age=By.id("txtAge"); 
	By TXT_Sex=By.id("Sex_Sex"); 
	By SLC_HCGN=By.id("txtPowerOfAttorneyName"); 
	By TXT_HCGP=By.id("txtPowerOfAttorneyPhone_PhoneNumber_text"); 
	 
	By SLC_PatientStatus=By.linkText("Patient Status"); 
	By CHK_Active=By.xpath("//*[@id='Table5']/tbody/tr[12]/td[1]/label[1]"); 
	By CHK_ABenifits=By.xpath("//*[@id='Table5']/tbody/tr[12]/td[1]/label[2]"); 
	By CHK_HIPAAAgreement=By.xpath("//*[@id='Table5']/tbody/tr[12]/td[1]/label[3]"); 
	By CHK_Nocorrespondence=By.xpath("//*[@id='Table5']/tbody/tr[12]/td[1]/label[4]"); 
	By CHK_NoAutomail=By.xpath("//*[@id='Table5']/tbody/tr[12]/td[1]/label[5]"); 
	By CHK_AutoSMS=By.xpath("//*[@id='Table5']/tbody/tr[12]/td[1]/label[6]"); 
	 
	By SLC_CoverageType=By.xpath("//*[@id='Table5']/tbody/tr[11]/td[2]"); 
	By CHK_NoCvg=By.xpath("//*[@id='Table5']/tbody/tr[12]/td[2]/input[1]"); 
	By CHK_PrimaryDental=By.xpath("//*[@id='Table5']/tbody/tr[12]/td[1]/label[1]"); 
	By CHK_SecondaryDental=By.xpath("//*[@id='Table5']/tbody/tr[12]/td[1]/label[1]"); 
	By CHK_PrimaryMedical=By.xpath("//*[@id='Table5']/tbody/tr[12]/td[1]/label[1]"); 
	By CHK_SecondaryMedical=By.xpath("//*[@id='Table5']/tbody/tr[12]/td[1]/label[1]"); 
	 
//	By SLC_Ethinicity=By.xpath(".//*[@id='Table5']/tbody/tr[18]/td[1]"); 
	By SCR_Ethinicity=By.id("cmbNHSEthnicity"); 
	 
	By SLC_PatientNotes=By.xpath("//*[@id='Table5']/tbody/tr[19]/td[1]"); 
	By SLC_DataStamp=By.xpath(".//*[@id='btnDateStamp']"); 
	By TXT_PatientNotes=By.xpath("//*[@id='txtNotes']"); 
	
	

	By DRPDWN_RelToRes= By.id("Relation_Relation");
	By SLC_RelToRes=By.xpath("//*[@id='Table5']/tbody/tr[3]/td[3]"); 
	By TXT_RelToRes=By.xpath("//*[@id='Table5']/tbody/tr[3]/td[4]"); 
	
	By TXT_ChartNo=By.id("txtChart"); 
	
	By TXT_SSN=By.id("txtSSN_SSNTel_text"); 
	
	By TXT_HomenO=By.id("txtHomePh_PhoneNumber_text"); 
	
	By TXT_WorkNo=By.id("txtWorkPh_PhoneNumber_text"); 

	By TXT_CellNo=By.id("txtCellPh_PhoneNumber_text"); 

	By TXT_DrivingLic=By.id("txtDrvLic"); 

	By TXT_Student=By.id("cmbStudent"); 
	
	By TXT_MedID=By.id("txtMedID"); 
	
	By TXT_SchoolName=By.id("txtSchName"); 

	By TXT_EmergencyContact=By.id("txtEmergencyContact"); 

	By TXT_EmergencyPhone=By.xpath("//*[@id='txtEmergencyPhone_PhoneNumber_text']"); 
	 
	By SLC_Office=By.xpath("//*[@id='Table5']/tbody/tr[11]/td[3]"); 
	By SLC_FeeSchedule=By.xpath("//*[@id='ddlFeeSchedule']"); 
	
	By SLC_PrefProvider=By.xpath("//*[@id='Table5']/tbody/tr[13]/td[1]"); 
	By TXT_PrefProvider=By.xpath("//*[@id='PrefProvider_PrefProvider']"); 
	 
	By SLC_PrefHygenist=By.xpath("//*[@id='Table5']/tbody/tr[14]/td[1]"); 
	By TXT_PrefHygenist=By.xpath("//*[@id='Hygienist_Hygienist']"); 
	 
	By SLC_ReferralType=By.xpath("//*[@id='Table5']/tbody/tr[15]/td[1]"); 
	By TXT_ReferralType=By.xpath("//*[@id='ReferralType_ReferralType']"); 
	By DRPDWN_ReferralType= By.xpath("//select[@id='ReferralType_ReferralType']");
	 
	By SLC_ReferredBy=By.xpath("//*[@id='Table5']/tbody/tr[16]/td[1]"); 
	By TXT_ReferredBy=By.xpath("//*[@id='txtRefBy']"); 

	By SLC_ReferredTo=By.xpath("//*[@id='Table5']/tbody/tr[17]/td[1]"); 
	By TXT_ReferredTo=By.xpath("//*[@id='ReferralOut_ReferralOut']"); 
	 
	By SLC_ReferedToDate=By.xpath("//*[@id='Table5']/tbody/tr[18]/td[5]"); 
	By TXT_ReferedToDate=By.xpath("//*[@id='txtRefOutDate']"); 
	
	By TXT_HIPAAInformationSharing = By.id("txtHIPAANotes");
	
	By BTN_GoToResponsibleParty = By.id("btnNext");
	
	/////////////////////////////////////// Patient Edit Information //////////////////////////////
	
	By SLC_UpdateInfo = By.xpath("//*[@id='btnUpdateAddress']");
	By SLC_MovePatient = By.xpath("//*[@id='btnMovePatient']");
	By RadiobuttonMoveP = By.xpath(".//*[@id='rbNewAccount']");
	By SLC_MoveContinue = By.xpath("//*[@id='btnContinue']");
	By SLC_MoveConfirm = By.xpath("//*[@id='btnConfirm']");
	By SLC_DeletePatient = By.xpath("//*[@id='btnDelete']");
	By SLC_PatientPic =  By.xpath("//*[@id='btnPatientPicture']");
	By SLC_PatientFingerPrint = By.xpath("//*[@id='btnPatientFP']");
	By SLC_PatientSave = By.xpath("//*[@id='btnSave']");
	By SLC_PatCancel = By.xpath("//*[@id='btnCancel']");
	
	
	
	
	
	///////////////////////// Responsible Party Section////////////////////
	By RADIOBTN_SelectResonsiblePartyType = By.id("RespPartyType_RespPartyType_0");
	By DRPDWN_SelectResponsibleParty = By.id("cmbRespParty");
	By RADIOBTN_emailStatement = By.id("chkOnlineStmt");
	By RADIOBTN_sendToCollection = By.id("chkSendColl");
	By SCL_colAgency= By.id("CollAgency_CollAgency");
	By TXT_customStatementMessage = By.id("txtStmtMsg");
	By BTN_financialNotesDateStamp = By.id("btnDateStamp");
	By BTN_ResponsiblePartyNotesDateStamp = By.id("Button1");
	By BTN_AddMedicalInformation = By.id("btnNext");
	
	///////////////////////// Medical Information Section////////////////////
	
	By TAB_MedicalHistory = By.linkText("Medical History");
	By SLC_AddNewMH = By.xpath("//*[@id='btnAddNew']");
	By SLC_Edit = By.xpath("//*[@id='btnEdit']");
	By SLC_Cancel = By.xpath("//*[@id='btnCancel']");
	By CHK_Premedicate=By.xpath("//td[contains(text(),'Premedicate')]/preceding-sibling::td/input[contains(@id,'Y')]");
	By CHK_Aspirin=By.xpath("//td[contains(text(),'Aspirin')]/preceding-sibling::td/input[contains(@id,'Y')]");
	By CHK_BarbituratesOrSleepingPills=By.xpath("//td[contains(text(),'Barbiturates/Sleeping Pills')]/preceding-sibling::td/input[contains(@id,'Y')]");
	By CHK_CodeineOrOthernarcotics=By.xpath("//td[contains(text(),'Codeine/Other narcotics')]/preceding-sibling::td/input[contains(@id,'Y')]");
	By CHK_Erythromycin=By.xpath("//td[contains(text(),'Erythromycin')]/preceding-sibling::td/input[contains(@id,'Y')]");
	By CHK_Iodine=By.xpath("//td[contains(text(),'Iodine')]/preceding-sibling::td/input[contains(@id,'Y')]");
	By CHK_LatexRubber=By.xpath("//td[contains(text(),'Latex Rubber')]/preceding-sibling::td/input[contains(@id,'Y')]");
	By CHK_LocalAnesthetics=By.xpath("//td[contains(text(),'Local Anesthetics')]/preceding-sibling::td/input[contains(@id,'Y')]");
	By CHK_Metals=By.xpath("//td[contains(text(),'Metals')]/preceding-sibling::td/input[contains(@id,'Y')]");
	By CHK_Nuts=By.xpath("//td[contains(text(),'Nuts')]/preceding-sibling::td/input[contains(@id,'Y')]");
	By CHK_Penicillin=By.xpath("//td[contains(text(),'Penicillin')]/preceding-sibling::td/input[contains(@id,'Y')]");
	By CHK_PriorHepatitis=By.xpath("//td[contains(text(),'Prior Hepatitis')]/preceding-sibling::td/input[contains(@id,'Y')]");
	By CHK_SulfaDrugs=By.xpath("//td[contains(text(),'Sulfa Drugs')]/preceding-sibling::td/input[contains(@id,'Y')]");
	By CHK_AIDSOrHIVinfection=By.xpath("//td[contains(text(),'AIDS/HIV infection')]/preceding-sibling::td/input[contains(@id,'Y')]");
	By CHK_AlcoholOrDrugAbuse=By.xpath("//td[contains(text(),'Alcohol/Drug Abuse')]/preceding-sibling::td/input[contains(@id,'Y')]");
	By CHK_AnemiaOrLeukemia=By.xpath("//td[contains(text(),'Anemia/Leukemia')]/preceding-sibling::td/input[contains(@id,'Y')]");
	By CHK_AnklesSwell=By.xpath("//td[contains(text(),'Ankles Swell')]/preceding-sibling::td/input[contains(@id,'N')]");
	By CHK_AnorexiaOrBulimia=By.xpath("//td[contains(text(),'Anorexia/Bulimia')]/preceding-sibling::td/input[contains(@id,'N')]");
	By CHK_Arthritis=By.xpath("//td[contains(text(),'Arthritis')]/preceding-sibling::td/input[contains(@id,'N')]");
	By CHK_ASA1=By.xpath("//td[contains(text(),'ASA 1')]/preceding-sibling::td/input[contains(@id,'N')]");
	By CHK_Asthma=By.xpath("//td[contains(text(),'Asthma')]/preceding-sibling::td/input[contains(@id,'N')]");
	By CHK_Bloodclottingproblems=By.xpath("//td[contains(text(),'Blood clotting problems')]/preceding-sibling::td/input[contains(@id,'N')]");
	By CHK_BloodTransfusion=By.xpath("//td[contains(text(),'Blood Transfusion')]/preceding-sibling::td/input[contains(@id,'N')]");
	By CHK_Bronchitis=By.xpath("//td[contains(text(),'Bronchitis')]/preceding-sibling::td/input[contains(@id,'N')]");
	By CHK_CancerOrtumororGrowth=By.xpath("//td[contains(text(),'Cancer/ tumor or Growth')]/preceding-sibling::td/input[contains(@id,'N')]");
	By CHK_CardiacPacemaker=By.xpath("//td[contains(text(),'Cardiac Pacemaker')]/preceding-sibling::td/input[contains(@id,'N')]");
	By CHK_ChestPainuponExertion=By.xpath("//td[contains(text(),'Chest Pain upon Exertion')]/preceding-sibling::td/input[contains(@id,'N')]");
	By CHK_ColorBlindness=By.xpath("//td[contains(text(),'Color Blindness')]/preceding-sibling::td/input[contains(@id,'N')]");
	By CHK_ContactLenses=By.xpath("//td[contains(text(),'Contact Lenses')]/preceding-sibling::td/input[contains(@id,'N')]");
	By CHK_Coumadin=By.xpath("//td[contains(text(),'Coumadin')]/preceding-sibling::td/input[contains(@id,'N')]");
	By CHK_DamagedHeartValve=By.xpath("//td[contains(text(),'Damaged Heart Valve')]/preceding-sibling::td/input[contains(@id,'N')]");
	By CHK_Diabetes=By.xpath("//td[contains(text(),'Diabetes')]/preceding-sibling::td/input[contains(@id,'N')]");
	By CHK_Emphysema=By.xpath("//td[contains(text(),'Emphysema')]/preceding-sibling::td/input[contains(@id,'N')]");
	By CHK_EnvironmentalAllergies=By.xpath("//td[contains(text(),'Environmental Allergies')]/preceding-sibling::td/input[contains(@id,'N')]");
	By CHK_Epilepsy=By.xpath("//td[contains(text(),'Epilepsy')]/preceding-sibling::td/input[contains(@id,'N')]");
	By CHK_FaintingSpellsOrSeizures=By.xpath("//td[contains(text(),'Fainting Spells/Seizures')]/preceding-sibling::td/input[contains(@id,'N')]");
	By CHK_Fosamax=By.xpath("//td[contains(text(),'Fosamax')]/preceding-sibling::td/input[contains(@id,'N')]");
	By CHK_FrequentHeadaches=By.xpath("//td[contains(text(),'Frequent Headaches')]/preceding-sibling::td/input[contains(@id,'N')]");
	By CHK_Frequentlydrymouth=By.xpath("//td[contains(text(),'Frequently dry mouth')]/preceding-sibling::td/input[contains(@id,'N')]");
	By CHK_GallBladderTrouble=By.xpath("//td[contains(text(),'Gall Bladder Trouble')]/preceding-sibling::td/input[contains(@id,'N')]");
	By CHK_HayFever=By.xpath("//td[contains(text(),'Hay Fever')]/preceding-sibling::td/input[contains(@id,'N')]");
	By CHK_HeartAttackOrStroke=By.xpath("//td[contains(text(),'Heart Attack/Stroke')]/preceding-sibling::td/input[contains(@id,'N')]");
	By CHK_HeartdiseaseOrAngina=By.xpath("//td[contains(text(),'Heart disease/Angina')]/preceding-sibling::td/input[contains(@id,'N')]");
	By CHK_Heartmurmur=By.xpath("//td[contains(text(),'Heart murmur')]/preceding-sibling::td/input[contains(@id,'N')]");
	By CHK_HepatitisOrJaundice=By.xpath("//td[contains(text(),'Hepatitis/Jaundice')]/preceding-sibling::td/input[contains(@id,'N')]");
	By CHK_HighBloodPressure=By.xpath("//td[contains(text(),'High Blood Pressure')]/preceding-sibling::td/input[contains(@id,'N')]");
	By CHK_HivesOrSkinRash=By.xpath("//td[contains(text(),'Hives/Skin Rash')]/preceding-sibling::td/input[contains(@id,'N')]");
	By CHK_JointReplacement=By.xpath("//td[contains(text(),'Joint Replacement')]/preceding-sibling::td/input[contains(@id,'N')]");
	By CHK_KidneyOrBladdertrouble=By.xpath("//td[contains(text(),'Kidney/Bladder trouble')]/preceding-sibling::td/input[contains(@id,'N')]");
	By CHK_LiverDisease=By.xpath("//td[contains(text(),'Liver Disease')]/preceding-sibling::td/input[contains(@id,'N')]");
	By CHK_LowBloodPressure=By.xpath("//td[contains(text(),'Low Blood Pressure')]/preceding-sibling::td/input[contains(@id,'N')]");
	By CHK_Mentalhealthproblems=By.xpath("//td[contains(text(),'Mental health problems')]/preceding-sibling::td/input[contains(@id,'N')]");
	By CHK_MitralValveProlapse=By.xpath("//td[contains(text(),'Mitral Valve Prolapse')]/preceding-sibling::td/input[contains(@id,'N')]");
	By CHK_NoEpinephrine=By.xpath("//td[contains(text(),'No Epinephrine')]/preceding-sibling::td/input[contains(@id,'N')]");
	By CHK_PersistentDiarrhea=By.xpath("//td[contains(text(),'Persistent Diarrhea')]/preceding-sibling::td/input[contains(@id,'N')]");
	By CHK_RheumaticFever=By.xpath("//td[contains(text(),'Rheumatic Fever')]/preceding-sibling::td/input[contains(@id,'N')]");
	By CHK_RheumaticHeartdisease=By.xpath("//td[contains(text(),'Rheumatic Heart disease')]/preceding-sibling::td/input[contains(@id,'N')]");
	By CHK_Sexuallytransmitteddisease=By.xpath("//td[contains(text(),'Sexually transmitted disease')]/preceding-sibling::td/input[contains(@id,'N')]");
	By CHK_ShortnessofBreath=By.xpath("//td[contains(text(),'Shortness of Breath')]/preceding-sibling::td/input[contains(@id,'N')]");
	By CHK_Sinustrouble=By.xpath("//td[contains(text(),'Sinus trouble')]/preceding-sibling::td/input[contains(@id,'N')]");
	By CHK_StomachUlcers=By.xpath("//td[contains(text(),'Stomach Ulcers')]/preceding-sibling::td/input[contains(@id,'N')]");
	By CHK_ThyroidProblems=By.xpath("//td[contains(text(),'Thyroid Problems')]/preceding-sibling::td/input[contains(@id,'N')]");
	By CHK_Tuberculosis=By.xpath("//td[contains(text(),'Tuberculosis')]/preceding-sibling::td/input[contains(@id,'N')]");
	By CHK_UnusualWeightLoss=By.xpath("//td[contains(text(),'Unusual Weight Loss')]/preceding-sibling::td/input[contains(@id,'N')]");
	By CHK_UrinateFrequently=By.xpath("//td[contains(text(),'Urinate Frequently')]/preceding-sibling::td/input[contains(@id,'N')]");

	By BTN_DentalQuestionnaire = By.xpath("//b[contains(text(),'Dental Questionnaire')]");
	By BTN_MedicalQuestionnaire = By.xpath("//b[contains(text(),'Medical Questionnaire')]");
	
	By QUE_IfYesWhat=By.xpath("//*[contains(text(),'If Yes What ? ')]/following-sibling::td/input");
	By QUE_AdditionalComments=By.xpath("//*[contains(text(),'Additional Comments')]/following-sibling::td/input");
	By QUE_AnyDiseaseConditionorProblemnotListedPleaselist=By.xpath("//*[contains(text(),'Any Disease, Condition or Problem not Listed ? Please list ')]/following-sibling::td/textarea");
	By QUE_AreyouCurrentlyNursing=By.xpath("//*[contains(text(),'Are you Currently Nursing ?')]/following-sibling::td/select");
	By QUE_AreyoucurrentlyundercareofaPhysician=By.xpath("//*[contains(text(),'Are you currently under care of a Physician ? ')]/following-sibling::td/input");
	By QUE_Areyouhappywiththecolorofyourteeth=By.xpath("//*[contains(text(),'Are you happy with the color of your teeth?')]/following-sibling::td/select");
	By QUE_AreyouHappywithyourDentures=By.xpath("//*[contains(text(),'Are you Happy with your Dentures ?')]/following-sibling::td/select");
	By QUE_AreyouHappywithyourSmile=By.xpath("//*[contains(text(),'Are you Happy with your Smile?')]/following-sibling::td/select");
	By QUE_Areyouhavinganyspecificproblemswithyourteethgumsormouthatthistime=By.xpath("//*[contains(text(),'Are you having any specific problems with your teeth, gums, or mouth at this time ?')]/following-sibling::td/select");
	By QUE_AreyouonBirthControlPillsFertilityDrugs=By.xpath("//*[contains(text(),'Are you on Birth Control Pills/Fertility Drugs ?')]/following-sibling::td/input");
	By QUE_AreyouonHormoneReplacementTherapy=By.xpath("//*[contains(text(),'Are you on Hormone Replacement Therapy ?')]/following-sibling::td/select");
	By QUE_AreyouPregnant=By.xpath("//*[contains(text(),'Are you Pregnant?')]/following-sibling::td/input");
	By QUE_AreyourteethSensitivetoHotColdorSweets=By.xpath("//*[contains(text(),'Are your teeth Sensitive to Hot, Cold or Sweets ?')]/following-sibling::td/select");
	By QUE_Datehistoryfilledout=By.xpath("//*[contains(text(),'Date history filled out')]/following-sibling::td/span/input");
	By QUE_DateofyourLastCleaning=By.xpath("//*[contains(text(),'Date of your Last Cleaning')]/following-sibling::td/span/input");
	By QUE_DateofyourLastFullSeriesXRays=By.xpath("//*[contains(text(),'Date of your Last Full Series X-Rays')]/following-sibling::td/span/input");
	By QUE_DoyouChewSmokeTobaccoinanyform=By.xpath("//*[contains(text(),'Do you Chew/Smoke Tobacco in any form ?')]/following-sibling::td/select");
	By QUE_DoyouClenchorGrindyourteeth=By.xpath("//*[contains(text(),'Do you Clench or Grind your teeth ?')]/following-sibling::td/select");
	By QUE_DoyougetFrequentFeverBlistersMouthUlcersorSoresonyourLipsorinyourMouth=By.xpath("//*[contains(text(),'Do you get Frequent Fever Blisters, Mouth Ulcers or Sores on your Lips or in your Mouth ?')]/following-sibling::td/select");
	By QUE_DoyouhaveanUnpleasenttasteorOdorinyourteeth=By.xpath("//*[contains(text(),'Do you have an Unpleasent taste or Odor in your teeth ?')]/following-sibling::td/select");
	By QUE_Doyouhavediabetes=By.xpath("//*[contains(text(),'Do you have diabetes?')]/following-sibling::td/input");
	By QUE_Doyouhavedifficultyinopeningyourmouthwidely=By.xpath("//*[contains(text(),'Do you have difficulty in opening your mouth widely ?')]/following-sibling::td/select");
	By QUE_DoyouhaveMenstrualPeriodProblems=By.xpath("//*[contains(text(),'Do you have Menstrual Period Problems ?')]/following-sibling::td/select");
	By QUE_Doyouhaveosteoperosis=By.xpath("//*[contains(text(),'Do you have osteoperosis?')]/following-sibling::td/select");
	By QUE_Doyouhaveproblemswithteethfillingsbreaking=By.xpath("//*[contains(text(),'Do you have problems with teeth/fillings breaking ?')]/following-sibling::td/select");
	By QUE_DoyouNoticePoppingClickingorSorenessoftheJawsorpointsjustinfrontoftheEars=By.xpath("//*[contains(text(),'Do you Notice Popping, Clicking or Soreness of the Jaws or points just in front of the Ears ?')]/following-sibling::td/select");
	By QUE_DoyouSmoke=By.xpath("//*[contains(text(),'Do you Smoke ?')]/following-sibling::td/select");
	By QUE_DoyouuseAlcoholicBeverages=By.xpath("//*[contains(text(),'Do you use Alcoholic Beverages ?')]/following-sibling::td/select");
	By QUE_Doyouwanttolearntocontrolyourdentaldiseaseandretainyourteeth=By.xpath("//*[contains(text(),'Do you want to learn to control your dental disease and retain your teeth ?')]/following-sibling::td/select");
	By QUE_DoyouwearDenturesorPartials=By.xpath("//*[contains(text(),'Do you wear Dentures or Partials ?')]/following-sibling::td/select");
	By QUE_DoyourGumsBleedwhileBrushingorFlossing=By.xpath("//*[contains(text(),'Do your Gums Bleed while Brushing or Flossing ?')]/following-sibling::td/select");
	By QUE_Doesfoodcatchbetweenyourteeth=By.xpath("//*[contains(text(),'Does food catch between your teeth ?')]/following-sibling::td/select");
	By QUE_FamilyPhysician=By.xpath("//*[contains(text(),'Family Physician')]/following-sibling::td/input");
	By QUE_feeof$25forcancellationslessthan24hours=By.xpath("//*[contains(text(),'fee of $25 for cancellations less than 24 hours')]/following-sibling::td/input");
	By QUE_HaveeverbeentoldyouhavePyorrheagumdisease=By.xpath("//*[contains(text(),'Have ever been told you have Pyorrhea/gum disease?')]/following-sibling::td/select");
	By QUE_HaveyoueverhadBurningoftheTongueorCrackingoftheCornersofyourMouth=By.xpath("//*[contains(text(),'Have you ever had Burning of the Tongue or Cracking of the Corners of your Mouth ?')]/following-sibling::td/select");
	By QUE_HaveyoueverhadOrthodonticTreatment=By.xpath("//*[contains(text(),'Have you ever had Orthodontic Treatment ?')]/following-sibling::td/select");
	By QUE_HaveyouevertakentheDietControlDrugFenPhen=By.xpath("//*[contains(text(),'Have you ever taken the Diet Control Drug Fen-Phen ?')]/following-sibling::td/select");
	By QUE_HaveyouhadanyHeadNeckorJawinjuries=By.xpath("//*[contains(text(),'Have you had any Head, Neck or Jaw injuries ?')]/following-sibling::td/select");
	By QUE_HaveyouhadanySeriousIllnessOperationorbeenHospitalizedwithinthepast5years=By.xpath("//*[contains(text(),'Have you had any Serious Illness, Operation or been Hospitalized within the past 5 years ?')]/following-sibling::td/select");
	By QUE_HaveyouorareyoucurrentlytakinganybiphosonatesieFosomaxetc=By.xpath("//*[contains(text(),'Have you or are you currently taking any biphosonates ie; Fosomax, etc.')]/following-sibling::td/select");
	By QUE_HelloNitor=By.xpath("//*[contains(text(),'Hello Nitor')]/following-sibling::td/select");
	By QUE_HowdoyouReceiveFluoride=By.xpath("//*[contains(text(),'How do you Receive Fluoride? ')]/following-sibling::td/input");
	By QUE_Howdoyoureceivefluoride=By.xpath("//*[contains(text(),'How do you receive fluoride')]/following-sibling::td/input");
	By QUE_IfYesDateofPlacementofDentures=By.xpath("//*[contains(text(),'If Yes Date of Placement of Dentures ?')]/following-sibling::td/select");
	By QUE_IfYesDateofPlacement=By.xpath("//*[contains(text(),'If Yes Date of Placement')]/following-sibling::td/select");
	By QUE_IfYeswhatillnessorProblem=By.xpath("//*[contains(text(),'If Yes, what illness or Problem ')]/following-sibling::td/input");
	By QUE_IfYesWhatistheconditionbeingtreated=By.xpath("//*[contains(text(),'If Yes, What is the condition being treated ?')]/following-sibling::td/input");
	By QUE_IfYeswhatisyourDueDate=By.xpath("//*[contains(text(),'If Yes, what is your Due Date ? ')]/following-sibling::td/input");
	By QUE_LastCavityDetectionXRays=By.xpath("//*[contains(text(),'Last Cavity Detection(Bitewing) X-Rays')]/following-sibling::td/span/input");
	By QUE_LastExamDate=By.xpath("//*[contains(text(),'Last Exam Date')]/following-sibling::td/span/input");
	By QUE_NameofDentist=By.xpath("//*[contains(text(),'Name of Dentist')]/following-sibling::td/input");
	By QUE_Phone=By.xpath("//*[contains(text(),'Phone')]/following-sibling::td/input");
	By QUE_Pleaseselecthowyouwouldcurrentlyrateyourownhygiene=By.xpath("//*[contains(text(),'Please select how you would currently rate your own hygiene: ')]/following-sibling::td/select");
	By QUE_testpicklisyt=By.xpath("//*[contains(text(),'test picklisyt')]/following-sibling::td/select");
	By QUE_TestQuestion=By.xpath("//*[contains(text(),'Test Question ')]/following-sibling::td/select");
	By QUE_WhoamI=By.xpath("//*[contains(text(),'Who am I?')]/following-sibling::td/select");
	
	/////Recall Due Dates
	
	By TAB_RecallDueDate = By.linkText("Recall Due Dates");
	By BTN_AddRecallInformation = By.xpath("//input[@id='btnNext']");
	By BTN_Save = By.xpath("//*[@id='btnSave']");
	
	By SLC_RecallIntType = By.xpath("//*[@id='dgRecalls_ctl02_RecallUnits_RecallUnits'] ");
	
	By Recall_FluShot_dueDate = By.xpath("//*[@id='dgRecalls__ctl2_txtRecallDate']");
	By Recall_FluShot_SchDate = By.xpath("//*[@id='dgRecalls__ctl2_txtSchDate']");
	By Recall_FluShot_SchTimeHours = By.xpath("//*[@id='dgRecalls__ctl2_SchTime_hh']");
	By Recall_FluShot_SchTimeMinutes = By.xpath("//*[@id='dgRecalls__ctl2_SchTime_mm']");
	By Recall_FluShot_SchTimeFormat = By.xpath("//*[@id='dgRecalls__ctl2_SchTime_tm']");
	
	By Recall_Interoral_dueDate = By.xpath("//*[@id='dgRecalls__ctl3_txtRecallDate']");
	By Recall_Interoral_SchDate = By.xpath("//*[@id='dgRecalls__ctl3_txtSchDate']");
	By Recall_Interoral_SchTimeHours = By.xpath("//*[@id='dgRecalls__ctl3_SchTime_hh']");
	By Recall_Interoral_SchTimeMinutes = By.xpath("//*[@id='dgRecalls__ctl3_SchTime_mm']");
	By Recall_Interoral_SchTimeFormat = By.xpath("//*[@id='dgRecalls__ctl3_SchTime_tm']");
	
	By Recall_Bitewings_dueDate = By.xpath("//*[@id='dgRecalls__ctl4_txtRecallDate']");
	By Recall_Bitewings_SchDate = By.xpath("//*[@id='dgRecalls__ctl4_txtSchDate']");
	By Recall_Bitewings_SchTimeHours = By.xpath("//*[@id='dgRecalls__ctl4_SchTime_hh']");
	By Recall_Bitewings_SchTimeMinutes = By.xpath("//*[@id='dgRecalls__ctl4_SchTime_mm']");
	By Recall_Bitewings_SchTimeFormat = By.xpath("//*[@id='dgRecalls__ctl4_SchTime_tm']");
	
	By Recall_Panaromic_dueDate = By.xpath("//*[@id='dgRecalls__ctl5_txtRecallDate']");
	By Recall_Panaromic_SchDate = By.xpath("//*[@id='dgRecalls__ctl5_txtSchDate']");
	By Recall_Panaromic_SchTimeHours = By.xpath("//*[@id='dgRecalls__ctl5_SchTime_hh']");
	By Recall_Panaromic_SchTimeMinutes = By.xpath("//*[@id='dgRecalls__ctl5_SchTime_mm']");
	By Recall_Panaromic_SchTimeFormat = By.xpath("//*[@id='dgRecalls__ctl5_SchTime_tm']");
	
	By Recall_ProphylaxisAdult_dueDate = By.xpath("//*[@id='dgRecalls__ctl6_txtRecallDate']");
	By Recall_ProphylaxisAdult_SchDate = By.xpath("//*[@id='dgRecalls__ctl6_txtSchDate']");
	By Recall_ProphylaxisAdult_SchTimeHours = By.xpath("//*[@id='dgRecalls__ctl6_SchTime_hh']");
	By Recall_ProphylaxisAdult_SchTimeMinutes = By.xpath("//*[@id='dgRecalls__ctl6_SchTime_mm']");
	By Recall_ProphylaxisAdult_SchTimeFormat = By.xpath("//*[@id='dgRecalls__ctl6_SchTime_tm']");
	
	By Recall_ProphylaxisChild_dueDate = By.xpath("//*[@id='dgRecalls__ctl7_txtRecallDate']");
	By Recall_ProphylaxisChild_SchDate = By.xpath("//*[@id='dgRecalls__ctl7_txtSchDate']");
	By Recall_ProphylaxisChild_SchTimeHours = By.xpath("//*[@id='dgRecalls__ctl7_SchTime_hh']");
	By Recall_ProphylaxisChild_SchTimeMinutes = By.xpath("//*[@id='dgRecalls__ctl7_SchTime_mm']");
	By Recall_ProphylaxisChild_SchTimeFormat = By.xpath("//*[@id='dgRecalls__ctl7_SchTime_tm']");
	
	By Recall_SpaceMaintainer_dueDate = By.xpath("//*[@id='dgRecalls__ctl8_txtRecallDate']");
	By Recall_SpaceMaintainer_SchDate = By.xpath("//*[@id='dgRecalls__ctl8_txtSchDate']");
	By Recall_SpaceMaintainer_SchTimeHours = By.xpath("//*[@id='dgRecalls__ctl8_SchTime_hh']");
	By Recall_SpaceMaintainer_SchTimeMinutes = By.xpath("//*[@id='dgRecalls__ctl8_SchTime_mm']");
	By Recall_SpaceMaintainer_SchTimeFormat = By.xpath("//*[@id='dgRecalls__ctl8_SchTime_tm']");
	
	By Recall_Periodontal_dueDate = By.xpath("//*[@id='dgRecalls__ctl9_txtRecallDate']");
	By Recall_Periodontal_SchDate = By.xpath("//*[@id='dgRecalls__ctl9_txtSchDate']");
	By Recall_Periodontal_SchTimeHours = By.xpath("//*[@id='dgRecalls__ctl9_SchTime_hh']");
	By Recall_Periodontal_SchTimeMinutes = By.xpath("//*[@id='dgRecalls__ctl9_SchTime_mm']");
	By Recall_Periodontal_SchTimeFormat = By.xpath("//*[@id='dgRecalls__ctl9_SchTime_tm']");
	
	By BTN_Finish = By.xpath("//input[@id='btnFinish']");  
	
	//////////////////////////////////// Add New Member ////////////////////////////////////////////
	
	By TAB_AddNewMember = By.linkText("Add New Member"); 
	
	
	
}