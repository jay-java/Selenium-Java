package Crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v111.browser.Browser;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {
	@Parameters("browser")
	@Test
	public void test(String browser) {
		WebDriver driver = null;
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\ChormeDriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
		}
		if(browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "D:\\EdgeDriver\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.get("https://www.facebook.com/");
		}
		if(browser.equals("ff")) {
			System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.33.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://www.facebook.com/");
		}
	}	
	
}
