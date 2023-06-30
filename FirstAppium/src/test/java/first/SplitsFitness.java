package first;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class SplitsFitness {

	WebDriver wdriver;
	
	static AppiumDriver driver;
	AndroidDriver aDriver;
	
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		openFit();
	}
	public static void openFit() throws MalformedURLException, InterruptedException {
	DesiredCapabilities dc = new DesiredCapabilities();
		
		//for real device
		dc.setCapability("deviceName", "Galaxy A6+");
		dc.setCapability("udid", "bb46e055");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "10");
		dc.setCapability("appPackage", "splits.splitstraining.dothesplits.spiltsin30days");
		dc.setCapability("appActivity", "splits.splitstraining.dothesplits.splitsin30days.activities.RecentActivity");
		
		//for emulator
//		dc.setCapability("automationName": "UIAutomator2"); 
//		dc.setCapability("app", "C:\\Users\\jay-pc\\Desktop\\Appium\\myfirstapp.apk");
		
		
//		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver(url, dc);
		
//		WebElement three = driver.findElement(By.id("com.android2.calculator3:id/digit_3"));
//		WebElement plus = driver.findElement(By.id("com.android2.calculator3:id/op_add"));
//		WebElement six = driver.findElement(By.id("com.android2.calculator3:id/digit_6"));
//		WebElement eq = driver.findElement(By.id("com.android2.calculator3:id/eq"));
//		WebElement res = driver.findElement(By.id("com.android2.calculator3:id/formula"));
//		three.click();
//		plus.click();
//		six.click();
//		eq.click();
//		String result = res.getText();
		System.out.println("app started");
		Thread.sleep(2000);
		
	}
}
