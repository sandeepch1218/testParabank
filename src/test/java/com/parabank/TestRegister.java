package com.parabank;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import static com.parabank.Constants.*;
public class TestRegister extends BaseTest{

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
@Test(priority=1)
	public void Create()
	{
		logger.info("Starting of Create method");
		
		register.NewRegister();
		register.FirstName(testdataprop.getProperty(NE_FIRST_NAME));
		register.LastName(testdataprop.getProperty(NE_LAST_NAME));
		register.Address(testdataprop.getProperty(NE_ADDRESS));
		register.City(testdataprop.getProperty(NE_CITY));
		register.State(testdataprop.getProperty(NE_STATE));
		register.Zipcode(testdataprop.getProperty(NE_ZIPCODE));
		register.PhoneNumber(testdataprop.getProperty(NE_PHONE_NUMBER));
		register.SSN(testdataprop.getProperty(NE_SSN_NUMBER));
		register.UserName(testdataprop.getProperty(NE_USER_NAME));
		register.Password(testdataprop.getProperty(NE_PASSWORD));
		register.Confirm(testdataprop.getProperty(NE_CONFIRM_PASSWORD));
		register.CreateAccount();
		
		String invalidUserNameMessage = this.register.getInvalidUserNameMessage();
		Assert.assertEquals(invalidUserNameMessage, expectedAssertionsProp.getProperty(INVALID_USER_NAME_MESSAGE));
		
		logger.info("Ending of Create method");
	}

@AfterClass
public void quitDriver() {	
	logger.info("Starting of quitDriver method");
	
	quitDriver(driver);
	
	logger.info("Ending of quitDriver method");
}
}
