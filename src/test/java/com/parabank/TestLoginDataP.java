package com.parabank;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static com.parabank.Constants.*;

public class TestLoginDataP extends BaseTest{
private static final Logger logger = Logger.getLogger(TestRegister.class.getName());
	
	@BeforeClass
	public void initMethod()
	{
		logger.info("Starting of initMethod method");
		
		this.driver = this.getWebDriver();
		driver.get("https://parabank.parasoft.com/parabank/admin.htm(opens%20in%20a%20new%20tab)");
		register = new BaseRegister(driver);
		
		logger.info("Ending of initMethod method");
				
	}
	
	
	  @DataProvider (name = "data-provider") 
	  public Object[][] loginMethod(){
	  return new Object[][] {
		  {testdataprop.getProperty(LOGIN_USER_NAME), testdataprop.getProperty(LOGIN_USER_PASSWORD)},
		  {"Sandy231", "123456789"}, {"Sandy1", "123456789"},
	  {"Sandy231", "12789"}, {"hai", "123456789"}, {"hello", "123456789"},
	  {"how are you", "12789"}}; 
	  }
	 
	
   @Test (dataProvider = "data-provider")// , dataProviderClass = ExcelDataProvider.class)
   public void myTest (String user, String pass) {
	   
	   logger.info("Starting of login method");
       
	   register.LoginUserName(user);
	   register.LoginPassword(pass);
	   register.ClickOnLoginButton();
	   
	   logger.info("Starting of login method");
	 
   }
   
   @AfterClass
	public void quitDriver() {	
		logger.info("Starting of quitDriver method");
		
		quitDriver(driver);
		
		logger.info("Ending of quitDriver method");
	}

}
