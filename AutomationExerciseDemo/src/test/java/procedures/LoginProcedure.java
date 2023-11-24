package procedures;

import org.openqa.selenium.WebDriver;

import data.LoginData;
import pageobjects.HomePage;
import pageobjects.LoginPage;

public class LoginProcedure {
	
	public static void Login(WebDriver driver , LoginData data) throws Exception
	{
		HomePage HomePage = new HomePage(driver);
		LoginPage LoginPage = new LoginPage(driver);
		
		HomePage
		.PressLoginButton();
		
		LoginPage
		.Login(data.getEmail(), data.getPassword())
		.PressLoginButton();
		
	}
}
