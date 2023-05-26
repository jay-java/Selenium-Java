package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverConnection {
	public static WebDriver getConnection(String url) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChormeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
}
