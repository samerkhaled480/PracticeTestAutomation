package procedures;

import org.openqa.selenium.WebDriver;

import data.SignupData;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.SignupPage;

public class SignupProcedure {
	
	public static void SigUp(WebDriver driver , SignupData data) throws Exception
	{
		HomePage HomePage = new HomePage(driver);
		LoginPage LoginPage = new LoginPage(driver);
		SignupPage SignupPage = new SignupPage(driver);
		
		HomePage
		.PressLoginButton();
		
		
		LoginPage
		.Signup(data.getName(), data.getEmail())
		.PressSignupButton();
		
		
		SignupPage.SelectTitle(data.getTitle())
					.Password( data.getPassword())
					.DateOfBirth(data.getDays() , data.getMonths(), data.getYears())
					.AddressInfo_Name(data.getFirstname(), data.getLastname())
					.AddressInfo_Address(data.getAddress())
					.AddressInfo_Location( data.getCountry() , data.getState(), data.getCity() , data.getZipcode() )
					.AddressInfo_MobileNumber(data.getMobilenumber())
					.PressCreateAccountButton()
					.PressContinueButton();
	}
}
