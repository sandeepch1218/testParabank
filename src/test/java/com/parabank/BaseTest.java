package com.parabank;
import org.apache.log4j.Logger;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	private static final Logger logger = Logger.getLogger(TestRegister.class.getName());
	
	protected WebDriver driver = null;
	protected BaseRegister register = null;
	protected static Properties expectedAssertionsProp = null;
	protected static Properties testdataprop = null;
	
	public WebDriver getWebDriver()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	@BeforeSuite
	public void initTestData() {
		logger.info("Starting of initTestData method");
		
		if (testdataprop == null) {
			FileReader testDataReader = null;
			FileReader assertionsReader = null;

			try {
				testDataReader = new FileReader("src/main/resources/testdata.properties");
				assertionsReader = new FileReader("src/main/resources/expectedassertions.properties");
				
				testdataprop = new Properties();
				testdataprop.load(testDataReader);
				
				expectedAssertionsProp = new Properties();
				expectedAssertionsProp.load(assertionsReader);

				

			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {

					testDataReader.close();
					
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			logger.info("Ending of initTestData method");
		}
	}
	
	
	protected synchronized void quitDriver(WebDriver driver) {
		logger.info("Starting of quitDriver method");

		try {
			if (driver != null) {
				driver.close();
				driver.quit();
				driver = null;
			}
		} catch (Exception ex) {
			driver = null;
		}
		logger.info("Ending of quitDriver method");
		
	}
	public static Logger getLogger() {
		
		return logger;
	}
	
	
}
