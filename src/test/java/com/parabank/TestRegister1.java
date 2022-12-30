package com.parabank;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.parabank.Constants.*;

public class TestRegister1 extends BaseTest{

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
		
		register.CreateAccount();
		
		String LastNameRequiredMessage = this.register.getLastNameRequiredMessage();
		Assert.assertEquals(LastNameRequiredMessage, expectedAssertionsProp.getProperty(LAST_NAME_REQUIRED));
		
		String AddressRequiredMessage = this.register.getAddressRequiredMessage();
		Assert.assertEquals(AddressRequiredMessage, expectedAssertionsProp.getProperty(ADDRESS_REQUIRED));
		
		String CityRequiredMessage = this.register.getCityRequiredMessage();
		Assert.assertEquals(CityRequiredMessage, expectedAssertionsProp.getProperty(CITY_REQUIRED));
		
		String StateRequiredMessage = this.register.getStateRequiredMessage();
		Assert.assertEquals(StateRequiredMessage, expectedAssertionsProp.getProperty(STATE_REQUIRED));
		
		String ZipcodeRequiredMessage = this.register.getZipcodeRequiredMessage();
		Assert.assertEquals(ZipcodeRequiredMessage, expectedAssertionsProp.getProperty(ZIPCODE_REQUIRED));
		
		String SSNRequiredMessage = this.register.getSSNRequiredMessage();
		Assert.assertEquals(SSNRequiredMessage, expectedAssertionsProp.getProperty(SSN_REQUIRED));
		
		String UserNameRequiredMessage = this.register.getUsernameRequiredMessage();
		Assert.assertEquals(UserNameRequiredMessage, expectedAssertionsProp.getProperty(USERNAME_REQUIRED));
		
		String PasswordRequiredMessage = this.register.getPasswordRequiredMessage();
		Assert.assertEquals(PasswordRequiredMessage, expectedAssertionsProp.getProperty(PASSWORD_REQUIRED));
		
		String ConfirmPasswordRequiredMessage = this.register.getConfirmPasswordRequiredMessage();
		Assert.assertEquals(ConfirmPasswordRequiredMessage, expectedAssertionsProp.getProperty(CONFIRM_PASSWORD_REQUIRED));
		
		logger.info("Ending of Create method");
	}
	
	@Test(priority=2)
	public void Create1()
	{
		logger.info("Starting of Create1 method");
		
		register.NewRegister();
		register.FirstName(testdataprop.getProperty(FIRST_NAME));
		register.LastName(testdataprop.getProperty(LAST_NAME));
		
		register.CreateAccount();
		
		
		String AddressRequiredMessage = this.register.getAddressRequiredMessage();
		Assert.assertEquals(AddressRequiredMessage, expectedAssertionsProp.getProperty(ADDRESS_REQUIRED));
		
		String CityRequiredMessage = this.register.getCityRequiredMessage();
		Assert.assertEquals(CityRequiredMessage, expectedAssertionsProp.getProperty(CITY_REQUIRED));
		
		String StateRequiredMessage = this.register.getStateRequiredMessage();
		Assert.assertEquals(StateRequiredMessage, expectedAssertionsProp.getProperty(STATE_REQUIRED));
		
		String ZipcodeRequiredMessage = this.register.getZipcodeRequiredMessage();
		Assert.assertEquals(ZipcodeRequiredMessage, expectedAssertionsProp.getProperty(ZIPCODE_REQUIRED));
		
		String SSNRequiredMessage = this.register.getSSNRequiredMessage();
		Assert.assertEquals(SSNRequiredMessage, expectedAssertionsProp.getProperty(SSN_REQUIRED));
		
		String UserNameRequiredMessage = this.register.getUsernameRequiredMessage();
		Assert.assertEquals(UserNameRequiredMessage, expectedAssertionsProp.getProperty(USERNAME_REQUIRED));
		
		String PasswordRequiredMessage = this.register.getPasswordRequiredMessage();
		Assert.assertEquals(PasswordRequiredMessage, expectedAssertionsProp.getProperty(PASSWORD_REQUIRED));
		
		String ConfirmPasswordRequiredMessage = this.register.getConfirmPasswordRequiredMessage();
		Assert.assertEquals(ConfirmPasswordRequiredMessage, expectedAssertionsProp.getProperty(CONFIRM_PASSWORD_REQUIRED));
		
		logger.info("Ending of Create1 method");
	}

	@Test(priority=3)
	public void Create2()
	{
		logger.info("Starting of Create2 method");
		
		register.NewRegister();
		register.FirstName(testdataprop.getProperty(FIRST_NAME));
		register.LastName(testdataprop.getProperty(LAST_NAME));
		register.Address(testdataprop.getProperty(ADDRESS));
		
		register.CreateAccount();
		
		String CityRequiredMessage = this.register.getCityRequiredMessage();
		Assert.assertEquals(CityRequiredMessage, expectedAssertionsProp.getProperty(CITY_REQUIRED));
		
		String StateRequiredMessage = this.register.getStateRequiredMessage();
		Assert.assertEquals(StateRequiredMessage, expectedAssertionsProp.getProperty(STATE_REQUIRED));
		
		String ZipcodeRequiredMessage = this.register.getZipcodeRequiredMessage();
		Assert.assertEquals(ZipcodeRequiredMessage, expectedAssertionsProp.getProperty(ZIPCODE_REQUIRED));
		
		String SSNRequiredMessage = this.register.getSSNRequiredMessage();
		Assert.assertEquals(SSNRequiredMessage, expectedAssertionsProp.getProperty(SSN_REQUIRED));
		
		String UserNameRequiredMessage = this.register.getUsernameRequiredMessage();
		Assert.assertEquals(UserNameRequiredMessage, expectedAssertionsProp.getProperty(USERNAME_REQUIRED));
		
		String PasswordRequiredMessage = this.register.getPasswordRequiredMessage();
		Assert.assertEquals(PasswordRequiredMessage, expectedAssertionsProp.getProperty(PASSWORD_REQUIRED));
		
		String ConfirmPasswordRequiredMessage = this.register.getConfirmPasswordRequiredMessage();
		Assert.assertEquals(ConfirmPasswordRequiredMessage, expectedAssertionsProp.getProperty(CONFIRM_PASSWORD_REQUIRED));
		
		logger.info("Ending of Create2 method");
	}
	
	@Test(priority=4)
	public void Create3()
	{
		logger.info("Starting of Create3 method");
		
		register.NewRegister();
		register.FirstName(testdataprop.getProperty(FIRST_NAME));
		register.LastName(testdataprop.getProperty(LAST_NAME));
		register.Address(testdataprop.getProperty(ADDRESS));
		register.City(testdataprop.getProperty(CITY));
		
		register.CreateAccount();
		
		String StateRequiredMessage = this.register.getStateRequiredMessage();
		Assert.assertEquals(StateRequiredMessage, expectedAssertionsProp.getProperty(STATE_REQUIRED));
		
		String ZipcodeRequiredMessage = this.register.getZipcodeRequiredMessage();
		Assert.assertEquals(ZipcodeRequiredMessage, expectedAssertionsProp.getProperty(ZIPCODE_REQUIRED));
		
		String SSNRequiredMessage = this.register.getSSNRequiredMessage();
		Assert.assertEquals(SSNRequiredMessage, expectedAssertionsProp.getProperty(SSN_REQUIRED));
		
		String UserNameRequiredMessage = this.register.getUsernameRequiredMessage();
		Assert.assertEquals(UserNameRequiredMessage, expectedAssertionsProp.getProperty(USERNAME_REQUIRED));
		
		String PasswordRequiredMessage = this.register.getPasswordRequiredMessage();
		Assert.assertEquals(PasswordRequiredMessage, expectedAssertionsProp.getProperty(PASSWORD_REQUIRED));
		
		String ConfirmPasswordRequiredMessage = this.register.getConfirmPasswordRequiredMessage();
		Assert.assertEquals(ConfirmPasswordRequiredMessage, expectedAssertionsProp.getProperty(CONFIRM_PASSWORD_REQUIRED));
		
		logger.info("Ending of Create3 method");
	}
	
	@Test(priority=5)
	public void Create4()
	{
		logger.info("Starting of Create4 method");
		
		register.NewRegister();
		register.FirstName(testdataprop.getProperty(FIRST_NAME));
		register.LastName(testdataprop.getProperty(LAST_NAME));
		register.Address(testdataprop.getProperty(ADDRESS));
		register.City(testdataprop.getProperty(CITY));
		register.State(testdataprop.getProperty(STATE));
		
		register.CreateAccount();
			
		String ZipcodeRequiredMessage = this.register.getZipcodeRequiredMessage();
		Assert.assertEquals(ZipcodeRequiredMessage, expectedAssertionsProp.getProperty(ZIPCODE_REQUIRED));
		
		String SSNRequiredMessage = this.register.getSSNRequiredMessage();
		Assert.assertEquals(SSNRequiredMessage, expectedAssertionsProp.getProperty(SSN_REQUIRED));
		
		String UserNameRequiredMessage = this.register.getUsernameRequiredMessage();
		Assert.assertEquals(UserNameRequiredMessage, expectedAssertionsProp.getProperty(USERNAME_REQUIRED));
		
		String PasswordRequiredMessage = this.register.getPasswordRequiredMessage();
		Assert.assertEquals(PasswordRequiredMessage, expectedAssertionsProp.getProperty(PASSWORD_REQUIRED));
		
		String ConfirmPasswordRequiredMessage = this.register.getConfirmPasswordRequiredMessage();
		Assert.assertEquals(ConfirmPasswordRequiredMessage, expectedAssertionsProp.getProperty(CONFIRM_PASSWORD_REQUIRED));
		
		logger.info("Ending of Create4 method");
	}
	
	@Test(priority=6)
	public void Create5()
	{
		logger.info("Starting of Create5 method");
		
		register.NewRegister();
		register.FirstName(testdataprop.getProperty(FIRST_NAME));
		register.LastName(testdataprop.getProperty(LAST_NAME));
		register.Address(testdataprop.getProperty(ADDRESS));
		register.City(testdataprop.getProperty(CITY));
		register.State(testdataprop.getProperty(STATE));
		register.Zipcode(testdataprop.getProperty(ZIPCODE));
		
		register.CreateAccount();
				
		String SSNRequiredMessage = this.register.getSSNRequiredMessage();
		Assert.assertEquals(SSNRequiredMessage, expectedAssertionsProp.getProperty(SSN_REQUIRED));
		
		String UserNameRequiredMessage = this.register.getUsernameRequiredMessage();
		Assert.assertEquals(UserNameRequiredMessage, expectedAssertionsProp.getProperty(USERNAME_REQUIRED));
		
		String PasswordRequiredMessage = this.register.getPasswordRequiredMessage();
		Assert.assertEquals(PasswordRequiredMessage, expectedAssertionsProp.getProperty(PASSWORD_REQUIRED));
		
		String ConfirmPasswordRequiredMessage = this.register.getConfirmPasswordRequiredMessage();
		Assert.assertEquals(ConfirmPasswordRequiredMessage, expectedAssertionsProp.getProperty(CONFIRM_PASSWORD_REQUIRED));
		
		logger.info("Ending of Create5 method");
	}
	
	@Test(priority=7)
	public void Create6()
	{
		logger.info("Starting of Create6 method");
		
		register.NewRegister();
		register.FirstName(testdataprop.getProperty(FIRST_NAME));
		register.LastName(testdataprop.getProperty(LAST_NAME));
		register.Address(testdataprop.getProperty(ADDRESS));
		register.City(testdataprop.getProperty(CITY));
		register.State(testdataprop.getProperty(STATE));
		register.Zipcode(testdataprop.getProperty(ZIPCODE));
		register.PhoneNumber(testdataprop.getProperty(PHONE_NUMBER));
		register.SSN(testdataprop.getProperty(SSN_NUMBER));
		
		register.CreateAccount();
				
		String UserNameRequiredMessage = this.register.getUsernameRequiredMessage();
		Assert.assertEquals(UserNameRequiredMessage, expectedAssertionsProp.getProperty(USERNAME_REQUIRED));
		
		String PasswordRequiredMessage = this.register.getPasswordRequiredMessage();
		Assert.assertEquals(PasswordRequiredMessage, expectedAssertionsProp.getProperty(PASSWORD_REQUIRED));
		
		String ConfirmPasswordRequiredMessage = this.register.getConfirmPasswordRequiredMessage();
		Assert.assertEquals(ConfirmPasswordRequiredMessage, expectedAssertionsProp.getProperty(CONFIRM_PASSWORD_REQUIRED));
		
		logger.info("Ending of Create6 method");
	}
	
	@Test(priority=8)
	public void Create7()
	{
		logger.info("Starting of Create7 method");
		
		register.NewRegister();
		register.FirstName(testdataprop.getProperty(FIRST_NAME));
		register.LastName(testdataprop.getProperty(LAST_NAME));
		register.Address(testdataprop.getProperty(ADDRESS));
		register.City(testdataprop.getProperty(CITY));
		register.State(testdataprop.getProperty(STATE));
		register.Zipcode(testdataprop.getProperty(ZIPCODE));
		register.PhoneNumber(testdataprop.getProperty(PHONE_NUMBER));
		register.SSN(testdataprop.getProperty(SSN_NUMBER));
		register.UserName(testdataprop.getProperty(USER_NAME));
		
		register.CreateAccount();
				
		String PasswordRequiredMessage = this.register.getPasswordRequiredMessage();
		Assert.assertEquals(PasswordRequiredMessage, expectedAssertionsProp.getProperty(PASSWORD_REQUIRED));
		
		String ConfirmPasswordRequiredMessage = this.register.getConfirmPasswordRequiredMessage();
		Assert.assertEquals(ConfirmPasswordRequiredMessage, expectedAssertionsProp.getProperty(CONFIRM_PASSWORD_REQUIRED));
		
		logger.info("Ending of Create7 method");
	}
	
	@Test(priority=9)
	public void Create8()
	{
		logger.info("Starting of Create8 method");
		
		register.NewRegister();
		register.FirstName(testdataprop.getProperty(FIRST_NAME));
		register.LastName(testdataprop.getProperty(LAST_NAME));
		register.Address(testdataprop.getProperty(ADDRESS));
		register.City(testdataprop.getProperty(CITY));
		register.State(testdataprop.getProperty(STATE));
		register.Zipcode(testdataprop.getProperty(ZIPCODE));
		register.PhoneNumber(testdataprop.getProperty(PHONE_NUMBER));
		register.SSN(testdataprop.getProperty(SSN_NUMBER));
		register.UserName(testdataprop.getProperty(USER_NAME));
		register.Password(testdataprop.getProperty(PASSWORD));
		
		register.CreateAccount();
			
		String ConfirmPasswordRequiredMessage = this.register.getConfirmPasswordRequiredMessage();
		Assert.assertEquals(ConfirmPasswordRequiredMessage, expectedAssertionsProp.getProperty(CONFIRM_PASSWORD_REQUIRED));
		
		logger.info("Ending of Create8 method");
	}
	
	@Test(priority=10)
	public void Create9()
	{
		logger.info("Starting of Create8 method");
		
		register.NewRegister();
		register.FirstName(testdataprop.getProperty(FIRST_NAME));
		register.LastName(testdataprop.getProperty(LAST_NAME));
		register.Address(testdataprop.getProperty(ADDRESS));
		register.City(testdataprop.getProperty(CITY));
		register.State(testdataprop.getProperty(STATE));
		register.Zipcode(testdataprop.getProperty(ZIPCODE));
		register.PhoneNumber(testdataprop.getProperty(PHONE_NUMBER));
		register.SSN(testdataprop.getProperty(SSN_NUMBER));
		register.UserName(testdataprop.getProperty(USER_NAME));
		register.Password(testdataprop.getProperty(PASSWORD));
		register.Confirm(testdataprop.getProperty(CONFIRM_PASSWORD));
		
		register.CreateAccount();
		
		logger.info("Ending of Create8 method");
	}
	
	@Test(priority=11)
	public void Create10()
	{
		logger.info("Starting of Create10 method");
		
		register.NewRegister();
		
		register.CreateAccount();
				
		String FirstNameRequiredMessage = this.register.getFirstNameRequiredMessage();
		Assert.assertEquals(FirstNameRequiredMessage, expectedAssertionsProp.getProperty(FIRSTNAME_REQUIRED));
		
		String LastNameRequiredMessage = this.register.getLastNameRequiredMessage();
		Assert.assertEquals(LastNameRequiredMessage, expectedAssertionsProp.getProperty(LAST_NAME_REQUIRED));
		
		String AddressRequiredMessage = this.register.getAddressRequiredMessage();
		Assert.assertEquals(AddressRequiredMessage, expectedAssertionsProp.getProperty(ADDRESS_REQUIRED));
		
		String CityRequiredMessage = this.register.getCityRequiredMessage();
		Assert.assertEquals(CityRequiredMessage, expectedAssertionsProp.getProperty(CITY_REQUIRED));
		
		String StateRequiredMessage = this.register.getStateRequiredMessage();
		Assert.assertEquals(StateRequiredMessage, expectedAssertionsProp.getProperty(STATE_REQUIRED));
		
		String ZipcodeRequiredMessage = this.register.getZipcodeRequiredMessage();
		Assert.assertEquals(ZipcodeRequiredMessage, expectedAssertionsProp.getProperty(ZIPCODE_REQUIRED));
		
		String SSNRequiredMessage = this.register.getSSNRequiredMessage();
		Assert.assertEquals(SSNRequiredMessage, expectedAssertionsProp.getProperty(SSN_REQUIRED));
		
		String UserNameRequiredMessage = this.register.getUsernameRequiredMessage();
		Assert.assertEquals(UserNameRequiredMessage, expectedAssertionsProp.getProperty(USERNAME_REQUIRED));
		
		String PasswordRequiredMessage = this.register.getPasswordRequiredMessage();
		Assert.assertEquals(PasswordRequiredMessage, expectedAssertionsProp.getProperty(PASSWORD_REQUIRED));
		
		String ConfirmPasswordRequiredMessage = this.register.getConfirmPasswordRequiredMessage();
		Assert.assertEquals(ConfirmPasswordRequiredMessage, expectedAssertionsProp.getProperty(CONFIRM_PASSWORD_REQUIRED));
		
		
		
		logger.info("Ending of Create10 method");
	}
@AfterClass
public void quitDriver() {	
	logger.info("Starting of quitDriver method");
	
	quitDriver(driver);
	
	logger.info("Ending of quitDriver method");
}

}
