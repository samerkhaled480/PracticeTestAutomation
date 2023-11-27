package tests;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aspose.cells.Workbook;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import io.qameta.allure.testng.AllureTestNg;

import utils.AssertionFactory;
import utils.JsonReader;
import utils.PageFunctionUtils;
import utils.ScreenshotHelper;
import utils.WebdriverFactory;

import config.properties;
import config.path;
import data.LoginData;
import procedures.LoginProcedure;


@Listeners({AllureTestNg.class})
@Test(groups = "Login")
public class LoginTest {
	
	
	WebDriver driver = null;
	
	@BeforeMethod( description= "initialize the browser")
	public void before( Object[] testData ) throws Exception
	{			
		driver = WebdriverFactory.initiateWebDriver("chrome");
		driver.get(properties.WEBSITEURL);
	}
	
	@DataProvider(name = "signup test data provider")
	public Object[] dpMethod() throws Exception
	{
		Workbook workbook = new Workbook(path.LOGINUSERCSV);
		workbook.save(path.LOGINUSERJSON);
        Class<LoginData> targetClass = LoginData.class;
        JsonReader<LoginData> jsonReader = new JsonReader<>(targetClass);
        List<LoginData> dataList = jsonReader.readJsonFile(path.LOGINUSERJSON);
        dataList.toArray();
        
        return dataList.toArray();		
	}
	
	@Test(dataProvider = "signup test data provider" , dataProviderClass = LoginTest.class)
	public void Login( LoginData data) throws Exception
	{
		//reporting : update TC id
		Allure.getLifecycle().updateTestCase( tc -> tc.setName("TC ID : " + data.getTcId() ) ); 
		//reporting : add test data to report
		Allure.parameter("Data :" , data.toString());					
		
		// call of the procedures method
		LoginProcedure.Login(driver, data); 
		
		//validate the actual results with expected results 
		AssertionFactory.checkExpectedResult(driver, data.getName());
		
	}
	
	@Attachment(value = "Screenshot" , type = "image/png")
	@AfterMethod
	public void after() throws InterruptedException
	{
		ScreenshotHelper.captureScreenshot(driver);
		PageFunctionUtils.sleep();
		driver.quit();
	}
}
