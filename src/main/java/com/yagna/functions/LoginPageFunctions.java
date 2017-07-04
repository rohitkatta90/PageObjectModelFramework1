package com.yagna.functions;
import com.yagna.functions.BaseClass;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.app.pages.LoginPage;

public class LoginPageFunctions extends BaseClass{
	
	private static Logger logger = Logger.getLogger(LoginPageFunctions.class);
	
	static LoginPage login=new LoginPage();
	
	public static void loginIntoApp(WebDriver driver){
		logger.info("Starting with Login process....");
		login.inputUserName();
		login.inputPassword();
		login.clickRememberUsernameCheckbox();
		login.clickLoginButton();
	}

}
