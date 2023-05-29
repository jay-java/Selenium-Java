package junit_framework;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.DriverConnection;

@RunWith(Parameterized.class)
public class J_004_LoginTest {

	String email;
	String password;

	public J_004_LoginTest(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	static WebDriver driver;
	@BeforeClass
	public static void OpenBrowser() {
		String url = "https://www.facebook.com/";
		driver = DriverConnection.getConnection(url);
	}
	
	@Test
	public void testLogin() {
		WebElement emailEle = driver.findElement(By.id("email"));
		emailEle.clear();
		emailEle.sendKeys(email);
		WebElement passele = driver.findElement(By.id("pass"));
		passele.clear();
		passele.sendKeys(password);
	}

	@Parameters
	public static List<Object[]> passData() {
		Object o[][] = new Object[4][2];

		o[0][0] = "invalidemail@gmail.com";
		o[0][1] = "invalipass";

		o[1][0] = "invalidemail@gmail.com";
		o[1][1] = "valipass";

		o[2][0] = "validemail@gmail.com";
		o[2][1] = "invalipass";

		o[3][0] = "validemail@gmail.com";
		o[3][1] = "valipass";

		return Arrays.asList(o);
	}

}
