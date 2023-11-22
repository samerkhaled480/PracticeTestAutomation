package listeners;

import org.testng.ITestListener;
import org.testng.ITestContext;
import org.testng.ITestResult;


public class Listeners implements ITestListener {
	
	@Override
	public void onTestStart(ITestResult result) {
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Success of test cases and its details are : "+result.getInstance());  
	} 
	
	@Override
	public void onTestFailure(ITestResult result) {  
		System.out.println("Failure of test cases and its details are : "+result.getName());
	}  
	  
	@Override
	public void onTestSkipped(ITestResult result) {  
		System.out.println("Skip of test cases and its details are : "+result.getName());  
	}  
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {  
		System.out.println("Failure of test cases and its details are : "+result.getName()); 
	}
	
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

	
	
}
