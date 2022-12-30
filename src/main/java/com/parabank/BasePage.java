package com.parabank;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
protected WebDriver driver = null;
public static String TEST_FILE_PATH=null;
	
	

	public BasePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		 if(TEST_FILE_PATH==null) {
			 TEST_FILE_PATH = getTestFilePath();
		PageFactory.initElements(driver, this);
	}
	}
		 public String getTestFilePath() {
			 
			 
			 String path = "src/test/resource";
			 File file=new File(path);
			  
			return file.getAbsolutePath();
			 
		 }

}
