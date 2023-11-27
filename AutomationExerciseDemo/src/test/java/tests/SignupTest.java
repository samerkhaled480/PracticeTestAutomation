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
import data.SignupData;
import procedures.SignupProcedure;


@Listeners({AllureTestNg.class})
@Test(groups = "SignUp")
public class SignupTest {
	
	
	WebDriver driver = null;
	
	@BeforeMethod( description= "initialize the browser")
	public void before( Object[] testData ) throws Exception
	{	
		SignupData data = (SignupData) testData[0];
		
		driver = WebdriverFactory.initiateWebDriver("chrome");
		driver.get(properties.WEBSITEURL);
	}
	
	@DataProvider(name = "signup test data provider")
	public Object[] dpMethod() throws Exception
	{
		Workbook workbook = new Workbook(path.RegisterUserCSV);
		workbook.save(path.RegisterUserJSON);
        Class<SignupData> targetClass = SignupData.class;
        JsonReader<SignupData> jsonReader = new JsonReader<>(targetClass);
        List<SignupData> dataList = jsonReader.readJsonFile(path.RegisterUserJSON);
        dataList.toArray();
        
        return dataList.toArray();		
	}
	
	@Test(dataProvider = "signup test data provider" , dataProviderClass = SignupTest.class)
	public void LoginTest( SignupData data) throws Exception
	{
		//reporting : update TC id
		Allure.getLifecycle().updateTestCase( tc -> tc.setName("TC ID : " + data.getTcId() ) ); 
		//reporting : add test data to report
		Allure.parameter("Data :" , data.toString());					
		
		// call of the procedures method
		SignupProcedure.SigUp(driver, data); 
		
		//validate the actual results with expected results 
		AssertionFactory.checkExpectedResult(driver, data.getexpectedResults() );
		
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
