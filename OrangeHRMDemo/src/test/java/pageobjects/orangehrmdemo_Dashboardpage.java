package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.qameta.allure.Step;

public class orangehrmdemo_Dashboardpage {

	//page elements 
	private WebDriver driver = null;
	private By UsernameField = By.name("username");
	private By PasswordField = By.name("password");
	private By LoginButton	 = By.xpath("");
	
	//data from csv
	public static String TcIdCoulmnName = "TcID";
	public static String UserColumnName = "username";
	public static String PasswordColumnName = "password";
	public static String MenuCloumnName		= "Menu";
	
	public orangehrmdemo_Dashboardpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@Step("open menu")
	public orangehrmdemo_Dashboardpage OpenPIMmenu(String menu)
	{
		
	}
	
	@Step("")
	
	
}
