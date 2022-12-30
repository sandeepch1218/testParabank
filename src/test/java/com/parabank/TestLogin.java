package com.parabank;
import org.apache.log4j.Logger;
/*import org.testng.Assert;*/
/*import org.testng.Assert;*/
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.parabank.Constants.*;

public class TestLogin extends BaseTest{

	
	private static final Logger logger = Logger.getLogger(TestRegister.class.getName());
	
	@BeforeTest
	public void initMethod()
	{
		logger.info("Starting of initMethod method");
		
		this.driver = this.getWebDriver();
		driver.get("https://parabank.parasoft.com/parabank/admin.htm(opens%20in%20a%20new%20tab)");
		register = new BaseRegister(driver);
		
		logger.info("Ending of initMethod method");
			
	}
	
	@BeforeClass
	public void login() throws InterruptedException
	{
		logger.info("Starting of login method");
			
		register.LoginUserName(testdataprop.getProperty(LOGIN_USER_NAME));
		
		register.LoginPassword(testdataprop.getProperty(LOGIN_USER_PASSWORD));
		
		register.ClickOnLoginButton();
		
		Thread.sleep(3000);
		
		register.ClickOnAccountsOverviewButton();
			
		/*
		 * String LoginButtonMessage = this.register.getLoginButtonMessage();
		 * Assert.assertEquals(LoginButtonMessage,
		 * expectedAssertionsProp.getProperty(INVALID_LOGIN_MESSAGE_REQUIRED));
		 */
		
		logger.info("Starting of login method");
		
	}
	
	@Test(priority=1)
	/*
	 * public void AccountOverview() throws Exception {
	 * logger.info("Starting of AccountOVerview method");
	 * 
	 * register.ClickOnActivityPeriodJan();
	 * 
	 * Thread.sleep(3000);
	 * 
	 * register.ClickOnTypeCredit();
	 * 
	 * Thread.sleep(3000);
	 * 
	 * register.ClickOnGoButton();
	 * 
	 * Thread.sleep(3000);
	 * 
	 * String AccountActivityMessage = this.register.getAccountActivityMessage();
	 * Assert.assertEquals(AccountActivityMessage,
	 * expectedAssertionsProp.getProperty(ACCOUNT_ACTIVITY_MESSAGE_REQUIRED));
	 * 
	 * logger.info("Ending of AccountOVerview method");
	 * 
	 * }
	 * 
	 */	
	
	/*
	 * @Test(priority=2) public void AccountOVerview1() throws Exception {
	 * logger.info("Starting of AccountOverview1 method");
	 * 
	 * register.ClickOnTypeDebit();
	 * 
	 * Thread.sleep(3000);
	 * 
	 * register.ClickOnGoButton();
	 * 
	 * Thread.sleep(3000);
	 * 
	 * String AccountActivityMessage = this.register.getAccountActivityMessage();
	 * Assert.assertEquals(AccountActivityMessage,
	 * expectedAssertionsProp.getProperty(ACCOUNT_ACTIVITY_MESSAGE_REQUIRED));
	 * 
	 * logger.info("Ending of AccountOverview1 method");
	 * 
	 * }
	 */
	
	/*
	 * @Test(priority=3) public void AccountOverview2() throws Exception {
	 * logger.info("Starting of AccountOVerview method");
	 * 
	 * register.ClickOnActivityPeriodFeb();
	 * 
	 * Thread.sleep(3000);
	 * 
	 * register.ClickOnTypeCredit();
	 * 
	 * Thread.sleep(3000);
	 * 
	 * register.ClickOnGoButton();
	 * 
	 * Thread.sleep(3000);
	 * 
	 * String AccountActivityMessage = this.register.getAccountActivityMessage();
	 * Assert.assertEquals(AccountActivityMessage,
	 * expectedAssertionsProp.getProperty(ACCOUNT_ACTIVITY_MESSAGE_REQUIRED));
	 * 
	 * logger.info("Ending of AccountOVerview method");
	 * 
	 * }
	 * 
	 * @Test(priority=4) public void AccountOVerview3() throws Exception {
	 * logger.info("Starting of AccountOverview1 method");
	 * 
	 * register.ClickOnTypeDebit();
	 * 
	 * Thread.sleep(3000);
	 * 
	 * register.ClickOnGoButton();
	 * 
	 * Thread.sleep(3000);
	 * 
	 * String AccountActivityMessage = this.register.getAccountActivityMessage();
	 * Assert.assertEquals(AccountActivityMessage,
	 * expectedAssertionsProp.getProperty(ACCOUNT_ACTIVITY_MESSAGE_REQUIRED));
	 * 
	 * logger.info("Ending of AccountOverview1 method");
	 * 
	 * }
	 */	
	@AfterClass
	public void quitDriver() {	
		logger.info("Starting of quitDriver method");
		
		quitDriver(driver);
		
		logger.info("Ending of quitDriver method");
	}

	
}
