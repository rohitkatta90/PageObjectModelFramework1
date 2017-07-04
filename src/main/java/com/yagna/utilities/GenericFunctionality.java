package com.yagna.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.yagna.functions.BaseClass;


public class GenericFunctionality extends BaseClass{

	public static void genericWait()
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("genericLoadingMaskId")));
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.id("yagnaProgressBarId")));
	}
	
	public static void switchingToActiveWindow(){
		driver.switchTo().activeElement();
	}
}
