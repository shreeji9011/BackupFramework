package com.denticon.automationSQA.reporting;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.denticon.automationSQA.SeleniumSuite;
import com.denticon.automationSQA.pom.IReport;
import com.denticon.automationSQA.utilities.CommonMethods;

		
public class BatchCollectionLetter extends SeleniumSuite{
	

		String startDate="10"; 
		String endDate="27"; 
		String stepInfo=" "; 
		boolean flag=false;
				
	@Test  

		public boolean BATCHCOLLECTIONLETTERS(){ 
			try {
				stepInfo="Click on Reporting tab";
				flag=CommonMethods.clickIfEnable(IReport.TAB_REPORT);
	 			stepInfo="Click on Daily Reporting";
	 			flag=CommonMethods.clickIfEnable(IReport.LNK_BATCHCOLLECTIONLETTERS);
	 			flag=CommonMethods.clickIfEnable(IReport.Lnk_sendToTransworld);

			} catch (Exception e) { 
	 			e.printStackTrace(); 
	 			Assert.fail(); 
	 			
	 		}
		return flag;
	 	
	}

}
