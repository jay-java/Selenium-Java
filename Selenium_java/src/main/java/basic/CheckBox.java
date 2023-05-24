package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBox {
	public static void main(String[] args) {
		String url="https://demoqa.com/automation-practice-form";
		WebDriver driver = DriverConnection.getConnection(url);
		//scroll by pixel
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,150)");
		
		
		//scroll by element
//		WebElement element = driver.findElement(By.id("uploadPicture"));
//		js.executeScript("arguments[0].scrollIntoView();", element);
		
		//scroll to bottom
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).click();
		driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\jay-pc\\Downloads\\website.jpg");
		driver.findElement(By.id("currentAddress")).sendKeys("ahmedabad");
	
	}
}
