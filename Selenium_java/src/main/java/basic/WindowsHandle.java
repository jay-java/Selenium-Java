package basic;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChormeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");

		driver.findElement(By.linkText("Click Here")).click();

		String mainWindow = driver.getWindowHandle();
		System.out.println(mainWindow);

		Set<String> allWindows = driver.getWindowHandles();
		for (String s : allWindows) {
			if (!s.equals(mainWindow)) {
				driver.switchTo().window(s);
			}
		}

		String email = "tops@gmail.com";
		driver.findElement(By.name("emailid")).sendKeys(email);
		driver.findElement(By.name("btnLogin")).click();

//		driver.close();
//		driver.switchTo().window(mainWindow);
//		driver.close();
		driver.quit();

	}
}
