package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.qameta.allure.Step;
import utils.PageFunctionUtils;

public class swaglabs_LoginPage {

	//page elements
	private	WebDriver driver;
	private By usernamefield = By.xpath("(//input[@id='user-name'])[1]");
	private By passwordfield = By.xpath("(//input[@id='password'])[1]");
	private By LoginButton   = By.xpath("(//input[@id='login-button'])[1]");
	
	//data from csv
	public static String TcIdCsvColumnName = "TcID";
	public static String UsernameCsvColumnName = "username";
	public static String passwordCsvCoulmnName = "password";
	
	public swaglabs_LoginPage(WebDriver driver) //constructor
	{
		
		this.driver = driver;
	}
	
	@Step("write username")
	public  swaglabs_LoginPage WriteUsername(String username) throws Exception
	{
		PageFunctionUtils.enterDataInWebElement(driver, usernamefield, username);
		return this;
	}
	
	@Step("write password")
	public swaglabs_LoginPage WritePassword(String password) throws Exception
	{
		PageFunctionUtils.enterDataInWebElement(driver, passwordfield, password);
		return this;
	}
	
	@Step("Press the Login button")
	public swaglabs_LoginPage PressLoginButton()
	{
		PageFunctionUtils.clickOnElement(driver, LoginButton);
		return this;
	}
	
	
	
	
			
	
}
