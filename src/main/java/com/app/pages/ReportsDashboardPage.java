package com.app.pages;

import org.openqa.selenium.By;

import com.yagna.functions.BaseClass;
import com.yagna.utilities.GenericFunctionality;

public class ReportsDashboardPage extends BaseClass{
	
	public static String sIdCreateNewReportButton="createNewReportButton";
	public static String sIdReportNameInputBox="reportNameId-inputEl";
	public static String sIdSaveAndContinueOnCreateReportPopUp="saveContinueButtonId";
	
	public static void clickOnCreateNewReport(){
		GenericFunctionality.genericWait();
		driver.findElement(By.id(sIdCreateNewReportButton)).click();
	}

   public static void inputReportName(){
	   driver.findElement(By.id(sIdReportNameInputBox)).sendKeys("Project_report");
	}
   
   public static void clickSaveAndContinueBtn(){
	   driver.findElement(By.id(sIdSaveAndContinueOnCreateReportPopUp)).click();
	}
}
