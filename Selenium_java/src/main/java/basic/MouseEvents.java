package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseEvents {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.amazon.in/";
		WebDriver driver = DriverConnection.getConnection(url);
		WebElement sell = driver.findElement(By.linkText("Sell"));
		WebElement bestsell = driver.findElement(By.linkText("Best Sellers"));
		WebElement mobile = driver.findElement(By.linkText("Mobiles"));

		Actions action = new Actions(driver);
		action.moveToElement(sell).build().perform();

		Thread.sleep(2000);

		action.moveToElement(bestsell).build().perform();

		Thread.sleep(2000);

		action.moveToElement(mobile).build().perform();

		Thread.sleep(1000);
		driver.quit();
	}
}
