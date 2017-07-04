package com.app.pages;

import org.openqa.selenium.By;

import com.yagna.functions.BaseClass;
import com.yagna.utilities.GenericFunctionality;

public class DashboardPage extends BaseClass{
	
	private static String sViewReports="//*[@id='quickLinkBtnId-innerCt']/a[3]/span/span";
	
	public static void clickGetStartedOnWelcomeNote(){

		GenericFunctionality.genericWait();
		driver.findElement(By.id("welcomeBtn")).click();
	}
	
	public static void clickViewReportsBtn(){
		driver.findElement(By.xpath(sViewReports)).click();
	}
}
