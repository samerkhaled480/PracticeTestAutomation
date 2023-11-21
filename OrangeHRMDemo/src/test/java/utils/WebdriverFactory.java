package utils;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

	public class WebdriverFactory {
		public static WebDriver initiateWebDriver() throws MalformedURLException, URISyntaxException 
		{
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
			ChromeOptions options = new ChromeOptions();
			
			WebDriver driver = new ChromeDriver(options);
			
		/*	options.merge(cap);
			options.addArguments("--proxy-server='direct://'");
			options.addArguments("--proxy-bypass-list=*");
 	        driver.manage().window().maximize();
			options.addArguments("--dissable-gpu");*/
			return driver;
		}
	}