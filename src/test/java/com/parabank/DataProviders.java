package com.parabank;

import org.apache.log4j.Logger;
/*import org.openqa.selenium.WebElement;*/
/*import org.openqa.selenium.support.ui.Select;*/
/*import org.testng.Assert;*/
/*import org.testng.Assert;*/
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.parabank.Constants.*;

public class DataProviders extends BaseTest {

	private static final Logger logger = Logger.getLogger(TestRegister.class.getName());

	@BeforeTest
	public void initMethod() {
		logger.info("Starting of initMethod method");

		this.driver = this.getWebDriver();
		driver.get("https://parabank.parasoft.com/parabank/admin.htm(opens%20in%20a%20new%20tab)");
		register = new BaseRegister(driver);

		logger.info("Ending of initMethod method");

	}

	@BeforeClass
	public void login() throws InterruptedException {
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

	@DataProvider(name = "testDataForList")
	public String[][] getDataFromDataprovider() {

		String data[][]= {
		{"All", "All"}, {"All", "Credit"},{"All", "Debit"},
		{"January", "All"}, {"January", "Credit"},{"January", "Debit"},
		{"February", "All"}, {"February", "Credit"},{"February", "Debit"},
		{"March", "All"}, {"March", "Credit"},{"March", "Debit"},
		{"April", "All"}, {"April", "Credit"},{"April", "Debit"},
		{"May", "All"}, {"May", "Credit"},{"May", "Debit"},
		{"June", "All"}, {"June", "Credit"},{"June", "Debit"},
		{"July", "All"}, {"July", "Credit"},{"July", "Debit"},
		{"August", "All"}, {"August", "Credit"},{"August", "Debit"},
		{"September", "All"}, {"September", "Credit"},{"September", "Debit"},
		{"October", "All"}, {"October", "Credit"},{"October", "Debit"},
		{"November", "All"}, {"November", "Credit"},{"November", "Debit"},
		{"December", "All"}, {"December", "Credit"},{"December", "Debit"},
		};
		
        return data;
	}

	@Test(priority = 1, dataProvider="testDataForList")
	public void AccountOverview(String dataOne, String dataTwo) throws Exception{
		logger.info("Starting of AccountOverview method");
		
		register.ClickOnAccountsOverview(dataOne, dataTwo);		

		logger.info("Ending of AccountOVerview method");

	}

	@AfterClass
	public void quitDriver() {
		logger.info("Starting of quitDriver method");

		quitDriver(driver);

		logger.info("Ending of quitDriver method");
	}

}
