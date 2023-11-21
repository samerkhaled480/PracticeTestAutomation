package procedures;

import org.openqa.selenium.WebDriver;

import data.swaglabs_LoginData;
import pageobjects.swaglabs_LoginPage;

public class swaglabs_LoginProcedures {
	
	public static void swaglabs_Login(WebDriver driver , swaglabs_LoginData data) throws Exception
	{
		swaglabs_LoginPage swaglabs_LoginPage = new swaglabs_LoginPage(driver);
		
		swaglabs_LoginPage
		.WriteUsername(data.getUsername())
		.WritePassword(data.getPassword())
		.PressLoginButton();
		
	}
}
