package com.app.pages;

import org.openqa.selenium.By;

import com.yagna.functions.BrowserActions;

public class LoginPage extends BrowserActions{
	
	public String sUsername = "usernameField-inputEl";
		public String sPassword="passwordField-inputEl";
		public String sLoginButton="loginButtonFrontView-btnWrap";
		public String sRememberCheckbox="rememberMeChkBoxId-inputEl";
		
		public void inputUserName(){
			driver.findElement(By.id(sUsername)).sendKeys("yagnaingramindiasruser2");
		}
		
		public void inputPassword(){
			driver.findElement(By.id(sPassword)).sendKeys("Yagna123");
		}
		public void clickRememberUsernameCheckbox(){
			driver.findElement(By.id("rememberMeChkBoxId-inputEl")).click();
		}
		public void clickLoginButton(){
			driver.findElement(By.id("loginButtonFrontView-btnEl")).click();
		}
		
}
