package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.qameta.allure.Step;
import utils.PageFunctionUtils;

public class SignupPage {
	
	//page elements 
	WebDriver driver = null;
	private By TitleField_Mr    = By.id("id_gender1");
	private By TitleField_Mrs   = By.id("id_gender2");
	private By NameFiled		= By.id("name");
	private By PasswordFiled	= By.id("password");
	private By dpDaysFiled		= By.id("days");
	private By dpMonthsFiled	= By.id("months");
	private By dpYearsFiled		= By.id("years");
	private By FirstNameField   = By.id("first_name");
	private By LastNameFiled    = By.id("last_name");
	private By AddressField 	= By.id("address1");
	private By dpCountryFiled	= By.id("country");
	private By StateField 	    = By.id("state");
	private By CityField 	    = By.id("city");
	private By ZipCodeField 	= By.id("zipcode");
	private By MobileNumberField= By.xpath("//*[@id=\"mobile_number\"]");
	private By CreateAccountButton = By.xpath("(//button[normalize-space()='Create Account'])[1]");	
	private By ContinueButton	= By.xpath("(//a[normalize-space()='Continue'])[1]");
	
	//class constructor 
	public SignupPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//page functions

	@Step("Select gender")
	public SignupPage SelectTitle(String title) throws InterruptedException
	{
		PageFunctionUtils.waitOnElement(driver, TitleField_Mr);
		if(title == "Mr")PageFunctionUtils.clickOnElement(driver, TitleField_Mr);
		else PageFunctionUtils.clickOnElement(driver, TitleField_Mrs);
		
		return this;
	}
	
	@Step("change name")
	public SignupPage ModifiyName(String NewName) throws java.lang.Exception
	{
		PageFunctionUtils.waitOnElement(driver, NameFiled);
		PageFunctionUtils.enterDataInWebElement(driver, NameFiled, NewName);
		
		return this;
	}
	
	@Step("Write password")
	public SignupPage Password(String password) throws java.lang.Exception
	{
		PageFunctionUtils.waitOnElement(driver, PasswordFiled);
		PageFunctionUtils.enterDataInWebElement(driver, PasswordFiled, password);
		
		return this;
	}
	
	@Step("select data of birth")
	public SignupPage DateOfBirth (String days , String months , String years ) throws java.lang.Exception
	{
		PageFunctionUtils.scrollUp(driver);
		PageFunctionUtils.waitOnElement(driver, dpDaysFiled);
		PageFunctionUtils.selectDropDownListByVisibleText(driver, dpDaysFiled, days);
		PageFunctionUtils.selectDropDownListByValue(driver, dpMonthsFiled, months);
		PageFunctionUtils.selectDropDownListByVisibleText(driver, dpYearsFiled, years);
		return this;
	}
	
	@Step("add address info 1")
	public SignupPage AddressInfo_Name(String FirstName , String LastName ) throws java.lang.Exception
	{
		
		PageFunctionUtils.waitOnElement(driver, FirstNameField);
		PageFunctionUtils.enterDataInWebElement(driver, FirstNameField, FirstName);
		PageFunctionUtils.enterDataInWebElement(driver, LastNameFiled, LastName);
		return this;
	}
	
	@Step("add address info 2")
	public SignupPage AddressInfo_Address(String address ) throws java.lang.Exception
	{
		PageFunctionUtils.waitOnElement(driver, AddressField);
		PageFunctionUtils.enterDataInWebElement(driver, AddressField, address);
		return this;
	}
	
	@Step("add address info 3")
	public SignupPage AddressInfo_Location(String Country , String State , String City , String ZipCode) throws java.lang.Exception
	{
		PageFunctionUtils.waitOnElement(driver, dpCountryFiled);
		
		PageFunctionUtils.selectDropDownListByVisibleText(driver, dpCountryFiled, Country);
		PageFunctionUtils.scrollUp(driver);
		PageFunctionUtils.enterDataInWebElement(driver, StateField, State);
		PageFunctionUtils.enterDataInWebElement(driver, CityField, City);
		PageFunctionUtils.enterDataInWebElement(driver, ZipCodeField, ZipCode);
		return this;
	}
	
	@Step("add mobile number")
	public SignupPage AddressInfo_MobileNumber(String mobileNumber ) throws Exception
	{
		PageFunctionUtils.scrollUp(driver);
		PageFunctionUtils.waitOnElement(driver, MobileNumberField);
		PageFunctionUtils.enterDataInWebElement(driver, MobileNumberField, mobileNumber);
		return this;
	}
	
	@Step("press create account button")
	public SignupPage PressCreateAccountButton() throws InterruptedException
	{
		
		PageFunctionUtils.waitOnElement(driver, CreateAccountButton);
		PageFunctionUtils.clickOnElement(driver, CreateAccountButton);
		return this;
	}
	
	@Step("Press Continue after account creation message")
	public SignupPage PressContinueButton() throws InterruptedException
	{
		PageFunctionUtils.waitOnElement(driver, ContinueButton);
		PageFunctionUtils.clickOnElement(driver, ContinueButton);
		return this;
	}
}
