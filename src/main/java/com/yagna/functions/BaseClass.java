package com.yagna.functions;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class BaseClass {

	public static WebDriver driver;
	public static Properties conf=null;
	
	public BaseClass(){
		
		String sFileName = System.getProperty("user.dir")+"src\\main\\java\\com\\yagna\\utilities\\config.properties";
		try {
			FileInputStream fis = new FileInputStream(sFileName);
			conf.load(fis);
		} catch (Exception e) {
			System.out.println("Inside BaseClass --> problem finding config file..OR loading config file...");
			e.printStackTrace();
		}
		
	}
	
}
