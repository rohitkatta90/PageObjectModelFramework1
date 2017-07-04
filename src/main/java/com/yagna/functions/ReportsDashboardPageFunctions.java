package com.yagna.functions;

import com.app.pages.ReportsDashboardPage;

public class ReportsDashboardPageFunctions extends BaseClass{

	public static void createNewProjectReport(){
		
		ReportsDashboardPage.clickOnCreateNewReport();
		ReportsDashboardPage.inputReportName();
		ReportsDashboardPage.clickSaveAndContinueBtn();
	}
}
