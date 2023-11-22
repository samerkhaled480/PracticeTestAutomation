package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.qameta.allure.Step;
import utils.PageFunctionUtils;

public class HomePage {

	
	//page elements 
	private WebDriver driver = null;
	private By LoginButton    = By.xpath("//a[normalize-space()='Signup / Login']");
	private By LogoutButton   = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");
	private By ProductsButton = By.xpath("(//a[@href='/products'])[1]");
	private By DeleteAccountButton = By.xpath("(//a[normalize-space()='Delete Account'])[1]");
	private By ContunieButton = By.xpath("(//a[normalize-space()='Continue'])[1]");
	
	//class constructor 
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//page functions 
	@Step("Go to login page")
	public HomePage PressLoginButton() throws InterruptedException
	{
		PageFunctionUtils.waitOnElement(driver, LoginButton);
		PageFunctionUtils.clickOnElement(driver, LoginButton);
		return this;
	}
	
	@Step("Press logout ")
	public HomePage PressLogoutButton() throws InterruptedException
	{
		PageFunctionUtils.waitOnElement(driver, LogoutButton);
		PageFunctionUtils.clickOnElement(driver, LogoutButton);
		return this;
	}
	
	@Step("go to products page")
	public HomePage PressProductsButton() throws InterruptedException
	{
		PageFunctionUtils.waitOnElement(driver, ProductsButton);
		PageFunctionUtils.clickOnElement(driver, ProductsButton);
		return this;
	}
	
	@Step("delete account ")
	public HomePage PressDeleteAccountButton() throws InterruptedException
	{
		PageFunctionUtils.waitOnElement(driver, DeleteAccountButton);
		PageFunctionUtils.clickOnElement(driver, DeleteAccountButton);
		
		PageFunctionUtils.waitOnElement(driver, ContunieButton);
		PageFunctionUtils.clickOnElement(driver, ContunieButton);
		return this;
	}
}
