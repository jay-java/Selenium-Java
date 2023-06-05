package listenerPractical;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class PracticalTestListener {
	@Test
	public void testTitle(ITestContext i) {
		String url = "https://www.facebook.com/";
		System.setProperty("webdriver.chrome.driver", "D:\\ChormeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		i.setAttribute("myattr", driver);
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle = "FB";
		assertEquals(actualTitle, expectedTitle);
	}
}
