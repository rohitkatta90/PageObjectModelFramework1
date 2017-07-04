package com.yagna.testcases;



import com.app.pages.DashboardPage;
import com.yagna.functions.BaseClass;
import com.yagna.functions.BrowserActions;
import com.yagna.functions.LoginPageFunctions;
import com.yagna.functions.ReportsDashboardPageFunctions;


public class LoginToApplication extends BaseClass{
	
	public static void main(String[] args ){
		System.out.println("Automation program started..");
		BrowserActions.openBrowser();
		System.out.println("Going to url..");
		BrowserActions.goToUrl();
		LoginPageFunctions.loginIntoApp(driver);
		DashboardPage.clickGetStartedOnWelcomeNote();
		DashboardPage.clickViewReportsBtn();
		//GenericFunctionality.genericWait();
		ReportsDashboardPageFunctions.createNewProjectReport();
		BrowserActions.closeBrowser();
	}
	
}
