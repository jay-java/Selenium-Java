package basic;

import java.nio.file.WatchEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertHandle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChormeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		//first alert
//		WebElement btn = driver.findElement(By.id("alertButton"));
//		btn.click();
//		System.out.println("button clicked");
//		Alert alert = driver.switchTo().alert();
//		System.out.println(alert.getText());
//		alert.accept();
		
		
		//second alert
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		WebElement timeBtn = driver.findElement(By.id("timerAlertButton"));
//		timeBtn.click();
//		wait.until(ExpectedConditions.alertIsPresent());
//		Alert timealert = driver.switchTo().alert();
//		System.out.println(timealert.getText());
//		timealert.accept();
		
		//third alert
//		WebElement cancelBtn = driver.findElement(By.id("confirmButton"));
//		cancelBtn.click();
//		Alert cancelAlert = driver.switchTo().alert();
//		System.out.println(cancelAlert.getText());
//		cancelAlert.dismiss();
		WebElement tag = driver.findElement(By.linkText("Alert with Textbox"));
		tag.click();
		WebElement nn = driver.findElement(By.xpath("//div[@id='Textbox']/button"));
		nn.click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("hello selenium");
		alert.accept();

		
	}
}
