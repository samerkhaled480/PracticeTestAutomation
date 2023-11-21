package test;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
//import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aspose.cells.Workbook;

import data.swaglabs_LoginData;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import procedures.swaglabs_LoginProcedures;
import utils.AssertionFactory;
import utils.ScreenshotHelper;
import utils.WebdriverFactory;
import utils.config;
import utils.path;
import utils.JsonReader;
import utils.PageFunctionUtils;


@Test(groups = "swagLabs Login Test")
//@Listeners( {AllureTestNg.class} )


public class swaglabs_LoginTest {
	
	WebDriver driver = null;
	
	@BeforeMethod( description= "initialize the browser")
	public void before( Object[] testData ) throws Exception
	{	
		driver = WebdriverFactory.initiateWebDriver();
		driver.get(config.WEBSITEURL);			
	}
	
	@DataProvider(name = "swaglabs login test data provider")
	public Object[] dpMethod() throws Exception
	{
		Workbook workbook = new Workbook(path.SWAGLABS_LOGINCSV);
		workbook.save(path.SWAGLABS_LOGINJSON);
        Class<swaglabs_LoginData> targetClass = swaglabs_LoginData.class;
        JsonReader<swaglabs_LoginData> jsonReader = new JsonReader<>(targetClass);
        List<swaglabs_LoginData> dataList = jsonReader.readJsonFile(path.SWAGLABS_LOGINJSON);
        return dataList.toArray();	
				
	}
	
	
	@Test(dataProvider = "swaglabs login test data provider" , dataProviderClass = swaglabs_LoginTest.class)
	public void LoginTest( swaglabs_LoginData data) throws Exception
	{
		//repting : update TC id
		Allure.getLifecycle().updateTestCase( tc -> tc.setName("TC ID : "+data.getTcID())); 
		//reporting : add test data to report
		Allure.parameter("Data :" , data.toString());					
		
		// call of the procedures method
		swaglabs_LoginProcedures.swaglabs_Login(driver, data); 
		
		//validate the actual results with expected results 
		AssertionFactory.checkExpectedResult(driver, "Products");
		
	}
	
	@Attachment(value = "Screenshot" , type = "image/png")
	@AfterMethod
	public void after( ITestResult result) throws InterruptedException
	{
		ScreenshotHelper.captureScreenshot(driver);
		PageFunctionUtils.sleep();
		driver.quit();
	}
	
}
