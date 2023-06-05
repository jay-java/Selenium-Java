package listenerPractical;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class FBTest implements ITestListener{

	public void onTestSuccess(ITestResult result) {
		System.out.println("test passed");
	}
	
	public void onTestFailure(ITestResult result) {
		WebDriver driver = (WebDriver)result.getTestContext().getAttribute("myattr");
		TakesScreenshot ss = (TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\jay-pc\\Pictures\\ss\\title.png");

		try {
			FileUtils.copyFile(source, dest);
			System.out.println("screen shot taken");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
