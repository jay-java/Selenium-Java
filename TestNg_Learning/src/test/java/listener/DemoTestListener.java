package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class DemoTestListener implements ITestListener{
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("test succesful");
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("test fail");
	}
	
}
