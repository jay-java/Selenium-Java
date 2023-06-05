package testNG.TestNg_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class LoginTestNG {
	
	static WebDriver driver;
	@BeforeClass
	public static void OpenBrowser() {
		String url = "https://www.facebook.com/";
		System.setProperty("webdriver.chrome.driver", "D:\\ChormeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	@Parameters({"email","password"})
	@Test(dataProvider = "dp")
	public void testLogin(String email,String password) {
		WebElement emailEle = driver.findElement(By.id("email"));
		emailEle.clear();
		emailEle.sendKeys(email);
		WebElement passele = driver.findElement(By.id("pass"));
		passele.clear();
		passele.sendKeys(password);
	}

	@DataProvider(name = "dp")
	public static Object[][] passData() {
		Object o[][] = new Object[4][2];

		o[0][0] = "invalidemail@gmail.com";
		o[0][1] = "invalipass";

		o[1][0] = "invalidemail@gmail.com";
		o[1][1] = "valipass";

		o[2][0] = "validemail@gmail.com";
		o[2][1] = "invalipass";

		o[3][0] = "validemail@gmail.com";
		o[3][1] = "valipass";

		return o;
	}

}
