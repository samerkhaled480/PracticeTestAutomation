package utils;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;


	public class WebdriverFactory {
		public static WebDriver initiateWebDriver(String Browser) throws MalformedURLException, URISyntaxException 
		{
			switch(Browser)
			{
				case "chrome":
				{
					DesiredCapabilities cap = new DesiredCapabilities();
					ChromeOptions options = new ChromeOptions();
					
					cap.setBrowserName("chrome");
					cap.setPlatform(Platform.WINDOWS);
			
					/* add addblock extention to chrome */
					//options.addExtensions(new File(path.CHROMEADBLOCKER));

					WebDriver driver = new ChromeDriver(options);
					driver.manage().window().maximize();
					
					/* arguments for remote driver setup*/
					/*	
				 	options.merge(cap);
					options.addArguments("--proxy-server='direct://'");
					options.addArguments("--proxy-bypass-list=*");
					options.addArguments("--dissable-gpu");
					*/
					
					return driver;
					
				}
				case "edge" :
				{
					DesiredCapabilities cap = new DesiredCapabilities();
					EdgeOptions options = new EdgeOptions();
					
					cap.setBrowserName("chrome");
					cap.setPlatform(Platform.WINDOWS);

					WebDriver driver = new EdgeDriver(options);
					driver.manage().window().maximize();
					
					/* arguments for remote driver setup*/
					/*	
				 	options.merge(cap);
					options.addArguments("--proxy-server='direct://'");
					options.addArguments("--proxy-bypass-list=*");
					options.addArguments("--dissable-gpu");
					*/
					
					return driver;//temprary to be implemnted 
				}
				default:
				{
					System.out.println("Enter valid browser name");
					return null;
					
				}
			}	
		}
	}