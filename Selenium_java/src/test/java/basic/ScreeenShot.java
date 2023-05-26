package basic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScreeenShot {

	public static void getScreeenShot(WebDriver driver, String path) {
		TakesScreenshot ss = (TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);

		try {
			FileUtils.copyFile(source, dest);
			System.out.println("screen shot taken");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String url = "https://topsint.com/topserp/index.php";
		WebDriver driver = DriverConnection.getConnection(url);

		driver.findElement(By.name("btn_login")).click();
		getScreeenShot(driver, "C:\\Users\\jay-pc\\Pictures\\ss\\loginerr.png");

	}
}
