package utils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotHelper {
	
	static int counter = 0;
	
	public static byte[] captureScreenshot(WebDriver driver) 
	{
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	}
	
	public static void captureScreenshotToFile(WebDriver driver)
	{
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destinationFile = new File(".//Screenshots/screenshot_"+counter+".png");
		counter++;
		try{FileUtils.copyFile(screenshotFile, destinationFile);}
		catch( Exception e) {}
	}
}


