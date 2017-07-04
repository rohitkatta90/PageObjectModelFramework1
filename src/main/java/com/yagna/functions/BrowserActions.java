package com.yagna.functions;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserActions extends BaseClass {

	static String sBrowser = "Chrome";
	static String sUrl = "https://ingram.yagnaiq.com/Login/";

	public static void openBrowser() {

		if (sBrowser.equalsIgnoreCase("Mozilla")) {
			driver = new FirefoxDriver();
		} else if (sBrowser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\KeywordDriven\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
	}
	
	public static void goToUrl(){
		
		driver.get(sUrl);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void closeBrowser(){
		driver.close();
	}

}
