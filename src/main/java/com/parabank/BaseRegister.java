package com.parabank;

import org.apache.log4j.Logger;
/*import org.openqa.selenium.By;*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/*import org.openqa.selenium.support.ui.Select;*/
import org.openqa.selenium.support.ui.Select;

public class BaseRegister extends BasePage {

	@FindBy(xpath = "//a[text()='Register']")
	WebElement linkClick;

	@FindBy(xpath = "//input[@id='customer.firstName']")
	WebElement txtFirstName;

	@FindBy(xpath = "//input[@id='customer.lastName']")
	WebElement txtLastName;

	@FindBy(xpath = "//input[@id='customer.address.street']")
	WebElement txtAddress;

	@FindBy(xpath = "//input[@id='customer.address.city']")
	WebElement txtCity;

	@FindBy(xpath = "//input[@id='customer.address.state']")
	WebElement txtState;

	@FindBy(xpath = "//input[@id='customer.address.zipCode']")
	WebElement txtZipcode;

	@FindBy(xpath = "//input[@id='customer.phoneNumber']")
	WebElement txtPhone;

	@FindBy(xpath = "//input[@id='customer.ssn']")
	WebElement txtSSN;

	@FindBy(xpath = "//input[@id='customer.username']")
	WebElement txtUserName;

	@FindBy(xpath = "//input[@id='customer.password']")
	WebElement txtPassword;

	@FindBy(xpath = "//input[@id='repeatedPassword']")
	WebElement txtConfirmPassword;

	@FindBy(xpath = "//input[@value='Register']")
	WebElement btnRegister;

	@FindBy(xpath = "//span[@id='customer.username.errors']")
	private WebElement msgInvalidUserName;
	
	@FindBy(xpath= "//span[@id='customer.lastName.errors']")
	private WebElement msgLastNameRequired;

	@FindBy(xpath= "//span[@id='customer.address.street.errors']")
	private WebElement msgAddressRequired;
	
	@FindBy(xpath= "//span[@id='customer.address.city.errors']")
	private WebElement msgCityRequired;

	@FindBy(xpath= "//span[@id='customer.address.state.errors']")
	private WebElement msgStateRequired;
	
	@FindBy(xpath= "//span[@id='customer.address.zipCode.errors']")
	private WebElement msgZipcodeRequired;
	
	@FindBy(xpath= "//span[@id='customer.ssn.errors']")
	private WebElement msgSSNRequired;

	@FindBy(xpath= "//span[@id='customer.password.errors']")
	private WebElement msgPasswordRequired;
	
	@FindBy(xpath= "//span[@id='repeatedPassword.errors']")
	private WebElement msgConfirmPasswordRequired;
	
	@FindBy(xpath= "//span[@id='customer.username.errors']") 
	private WebElement msgUsernameRequired;
	
	@FindBy(xpath= "//span[@id='customer.firstName.errors']") 
	private WebElement msgFirstNameRequired;
	
	@FindBy(xpath= "//input[@name='username']") 
	private WebElement txtLoginUserName;

	@FindBy(xpath= "//input[@name='password']") 
	private WebElement txtLoginPassword;
	
	@FindBy(xpath= "//input[@type='submit']") 
	private WebElement btnLogin;
	
	@FindBy(xpath= "//p[@class='error']") 
	private WebElement msgLoginButtonClick;	
	
	@FindBy(xpath= "//a[@class='ng-binding']") 
	private WebElement btnAccountsOverview;

	@FindBy(xpath= "//td/select/option[contains(text(),'January')]") 
	private WebElement selectOptionJanuary;
	
	@FindBy(xpath= "//select[@id='month']") 
	private WebElement month;
	
	@FindBy(xpath= "//select[@id='transactionType']") 
	private WebElement transactionType;
	
	@FindBy(xpath= "//td/select/option[contains(text(),'February')]") 
	private WebElement selectOptionFeb;
	
	@FindBy(xpath= "//td/select/option[contains(text(),'Credit')]") 
	private WebElement selectOptionCredit;
	
	@FindBy(xpath= "//td/select/option[contains(text(),'Debit')]") 
	private WebElement selectOptionDebit;
	
	@FindBy(xpath= "//input[@type='submit']") 
	private WebElement btnGo;
	
	@FindBy(xpath= "//p[@class='ng-scope']") 
	private WebElement msgAccountActivity;

	private static final Logger logger = Logger.getLogger(BaseRegister.class.getName());

	public BaseRegister(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void NewRegister() {
		logger.info("Starting of NewRegister method");

		this.linkClick.click();

		logger.info("Ending of NewRegister method");
	}

	public void FirstName(String str) {
		logger.info("Starting of FirstName method");
		
		this.txtFirstName.sendKeys(str);
		
		logger.info("Ending of FirstName method");
	}

	public void LastName(String str) {
		logger.info("Starting of LastName method");
		
		this.txtLastName.sendKeys(str);
		
		logger.info("Ending of LastName method");
	}

	public void Address(String str) {
		logger.info("Starting of Address method");
		
		this.txtAddress.sendKeys(str);
		
		logger.info("Ending of Address method");
	}

	public void City(String str) {
		logger.info("Starting of City method");
		
		this.txtCity.sendKeys(str);
		
		logger.info("Ending of City method");
	}

	public void State(String str) {
		logger.info("Starting of State method");
		
		this.txtState.sendKeys(str);
		
		logger.info("Ending of State method");
	}

	public void Zipcode(String str) {
		logger.info("Starting of Zipcode method");
		
		this.txtZipcode.sendKeys(str);
		
		logger.info("Ending of Zipcode method");
	}

	public void PhoneNumber(String str) {
		logger.info("Starting of PhoneNumber method");
		
		this.txtPhone.sendKeys(str);
		
		logger.info("Ending of PhoneNumber method");
	}

	public void SSN(String str) {
		logger.info("Starting of SSN method");
		
		this.txtSSN.sendKeys(str);
		
		logger.info("Ending of SSN method");
	}

	public void UserName(String str) {
		logger.info("Starting of UserName method");
		
		this.txtUserName.sendKeys(str);
		
		logger.info("Ending of UserName method");
	}

	public void Password(String str) {
		logger.info("Starting of Password method");
		
		this.txtPassword.sendKeys(str);
		
		logger.info("Ending of Password method");
	}

	public void Confirm(String str) {
		logger.info("Starting of Confirm method");
		
		this.txtConfirmPassword.sendKeys(str);
		
		logger.info("Ending of Confirm method");
	}

	public void CreateAccount() {
		logger.info("Starting of CreateAccount method");
		
		this.btnRegister.click();
		
		logger.info("Ending of CreateAccount method");
	}
	
	public void LoginUserName(String str)
	{
		logger.info("Starting of LoginUserName method");
		
		this.txtLoginUserName.sendKeys(str);;
		
		logger.info("Ending of LoginUserName method");
		
	}
	
	public void LoginPassword(String str)
	{
		logger.info("Starting of LoginPassword method");
		
		this.txtLoginPassword.sendKeys(str);;
		
		logger.info("Ending of LoginPassword method");
		
	}
	
	public void ClickOnLoginButton() {
		logger.info("Starting of ClickOnLoginButton method");
		
		this.btnLogin.click();
		
		logger.info("Ending of ClickOnLoginButton method");
	}
	
	public void ClickOnActivityPeriodJan() {
		logger.info("Starting of ClickOnActivityPeriodJan method");
		
		this.selectOptionJanuary.click();
		
		logger.info("Ending of ClickOnActivityPeriodJan method");
	}
	
	public void ClickOnActivityPeriodFeb() {
		logger.info("Starting of ClickOnActivityPeriodFeb method");
		
		this.selectOptionFeb.click();
		
		logger.info("Ending of ClickOnActivityPeriodFeb method");
	}
	
	public void ClickOnTypeCredit() {
		logger.info("Starting of ClickOnType method");
		
		this.selectOptionCredit.click();
		
		/*
		 * Select m = new Select((WebElement) transactionType); ((Select)
		 * m).selectByIndex(val);
		 */
		
		logger.info("Ending of ClickOnType method");
	}
	
	public void ClickOnTypeDebit() {
		logger.info("Starting of ClickOnType method");
		
		this.selectOptionDebit.click();
		
		logger.info("Ending of ClickOnType method");
	}
	
	public void ClickOnGoButton()
	{
		logger.info("Starting of ClickOnGoButton method");
		
		this.btnGo.click();
		
		logger.info("Ending of ClickOnGoButton method");
	}
	
	public void ClickOnMonth()
	{
		logger.info("Starting of ClickOnMonth method");
		
		this.month.click();
		
		logger.info("Ending of ClickOnMonth method");
	}
	
	public void ClickOntransactionType()
	{
		logger.info("Starting of ClickOntransactionType method");
		
		this.transactionType.click();
		
		logger.info("Ending of ClickOntransactionType method");
	}
	
	public void ClickOnAccountsOverview(String one, String two) throws Exception
	{
		Select sel1= new Select(this.month);	
		Select sel2= new Select(this.transactionType);
		
		logger.info("Starting of Activity period method");
		
		sel1.selectByVisibleText(one);
		
		logger.info("Ending of Activity period method");
		
		logger.info("Starting of Activity Type method");
		
		sel2.selectByVisibleText(two);
		
		logger.info("Ending of Activity Type method");
		
		Thread.sleep(1000);
		
		this.ClickOnGoButton();
	}
	
	public void getSelectList(String one, String two) throws InterruptedException
	{
		Select sel1= new Select(this.month);	
		Select sel2= new Select(this.transactionType);
		
		int n = sel1.getOptions().size();
		int m = sel2.getOptions().size();
		
		for(int i=0;i<n;i++)
		{
			sel1.selectByVisibleText(one);
			Thread.sleep(1000);
			
			for(int j=0;j<m;j++)
			{
				sel2.selectByVisibleText(two);
				Thread.sleep(1000);
				this.ClickOnGoButton();
				Thread.sleep(1000);
			}
		}
		
	}
	
	
	/*
	 * public void ClickOnAccountsOverviewButton() {
	 * logger.info("Starting of ClickOnAccountsOverviewButton method");
	 * 
	 * this.btnAccountsOverview.click();
	 * 
	 * logger.info("Ending of ClickOnAccountsOverviewButton method"); }
	 */

	public String getInvalidUserNameMessage() {
		logger.info("Starting of getInvalidUserNameMessage method");
		logger.info("Ending of getInvalidUserNameMessage method");
		
		return msgInvalidUserName.getText();
	}
	
	public String getLastNameRequiredMessage() {
		logger.info("Starting of getLastNameRequiredMessage method");
		logger.info("Ending of getLastNameRequiredMessage method");
		
		return msgLastNameRequired.getText();
	}
	
	public String getAddressRequiredMessage() {
		logger.info("Starting of getAddressRequiredMessage method");
		logger.info("Ending of getAddressRequiredMessage method");
		
		return msgAddressRequired.getText();
	}
	
	public String getCityRequiredMessage() {
		logger.info("Starting of getCityRequiredMessage method");
		logger.info("Ending of getCityRequiredMessage method");
		
		return msgCityRequired.getText();
	}
	
	public String getStateRequiredMessage() {
		logger.info("Starting of getStateRequiredMessage method");
		logger.info("Ending of getStateRequiredMessage method");
		
		return msgStateRequired.getText();
	}
	
	public String getZipcodeRequiredMessage() {
		logger.info("Starting of getZipcodeRequiredMessage method");
		logger.info("Ending of getZipcodeRequiredMessage method");
		
		return msgZipcodeRequired.getText();
	}
	
	public String getSSNRequiredMessage() {
		logger.info("Starting of getSSNRequiredMessage method");
		logger.info("Ending of getSSNRequiredMessage method");
		
		return msgSSNRequired.getText();
	}
	
	public String getPasswordRequiredMessage() {
		logger.info("Starting of getPasswordRequiredMessage method");
		logger.info("Ending of getPasswordRequiredMessage method");
		
		return msgPasswordRequired.getText();
	}
	
	public String getConfirmPasswordRequiredMessage() {
		logger.info("Starting of getConfirmPasswordRequiredMessage method");
		logger.info("Ending of getConfirmPasswordRequiredMessage method");
		
		return msgConfirmPasswordRequired.getText();
	}
	
	public String getUsernameRequiredMessage() {
		logger.info("Starting of getUsernameRequiredMessage method");
		logger.info("Ending of getUsernameRequiredMessage method");
		
		return msgUsernameRequired.getText();
	}
	
	public String getFirstNameRequiredMessage() {
		logger.info("Starting of getUsernameRequiredMessage method");
		logger.info("Ending of getUsernameRequiredMessage method");
		
		return msgFirstNameRequired.getText();
	}
	
	public String getLoginButtonMessage() {
		logger.info("Starting of getLoginButtonMessage method");
		logger.info("Ending of getLoginButtonMessage method");
		
		return msgLoginButtonClick.getText();
	}
	
	public String getAccountActivityMessage() {
		logger.info("Starting of getAccountActivityMessage method");
		logger.info("Ending of getAccountActivityMessage method");
		
		return msgAccountActivity.getText();
	}

	public void ClickOnAccountsOverviewButton() {
		logger.info("Starting of ClickOnAccountsOverviewButton method");
		
		this.btnAccountsOverview.click();
		
		logger.info("Ending of ClickOnAccountsOverviewButton method");	
		
	}
}
