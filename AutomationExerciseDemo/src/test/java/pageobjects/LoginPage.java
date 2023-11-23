package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.qameta.allure.Step;
import utils.PageFunctionUtils;

public class LoginPage {

	//page elements 
	private WebDriver driver = null;
	
	private By LoginEmailFiled = By.xpath("(//input[@data-qa='login-email'])[1]");
	private By LoginPasswordField = By.xpath("//input[@placeholder='Password']");
	private By LoginButton		  = By.xpath("//button[normalize-space()='Login']");
	
	private By SignupNameFiled = By.xpath("//input[@placeholder='Name']");
	private By SignupEmailFiled = By.xpath("//input[@data-qa='signup-email']");
	private By SignupButton		   = By.xpath("//button[normalize-space()='Signup']");
	
	//data from csv
	
	//class constructor 
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//page functions 
	
	@Step("Fill login data")
	public LoginPage Login(String Email , String password) throws Exception
	{
		PageFunctionUtils.waitOnElement(driver, LoginButton);
		PageFunctionUtils.enterDataInWebElement(driver, LoginEmailFiled, Email);
		PageFunctionUtils.enterDataInWebElement(driver, LoginPasswordField, password);
		
		return this;
	}
	
	@Step("Fill signup data")
	public LoginPage Signup(String name , String Email ) throws Exception
	{
		PageFunctionUtils.waitOnElement(driver, SignupButton);
		PageFunctionUtils.enterDataInWebElement(driver, SignupNameFiled, name);
		PageFunctionUtils.enterDataInWebElement(driver, SignupEmailFiled, Email);
		
		return this;
	}
	
	@Step("press login button")
	public LoginPage PressLoginButton() throws InterruptedException
	{
		PageFunctionUtils.waitOnElement(driver, LoginButton);
		PageFunctionUtils.clickOnElement(driver, LoginButton);
		return this;
	}
	
	@Step("press signup button")
	public LoginPage PressSignupButton() throws InterruptedException
	{
		PageFunctionUtils.waitOnElement(driver, SignupButton);
		PageFunctionUtils.clickOnElement(driver, SignupButton);
		return this;
	}
	
	
	
	
	
	
	
	
	
}

