package com.yagna.utilities;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataEngineReader {

	public String sDataEnginePath;

	FileInputStream oFis;
	XSSFWorkbook oWorkbook;

	public void setExcelData(String sExcelPath) {

		try {
			oFis = new FileInputStream(sDataEnginePath);
			oWorkbook = new XSSFWorkbook(oFis);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void totalTestCases(String sheetName, int rowNum, int colNum){
		
	}

}
