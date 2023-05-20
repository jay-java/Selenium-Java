package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) {
		String url = "https://www.globalsqa.com/demo-site/draganddrop/";
		WebDriver driver = DriverConnection.getConnection(url);
		
		WebElement iframe = driver.findElement(By.xpath("//div[@rel-title='Photo Manager']/p/iframe"));
		driver.switchTo().frame(iframe);
		
		WebElement from = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]/img"));
		WebElement to = driver.findElement(By.xpath("//*[@id=\"trash\"]"));
		
		Actions action = new Actions(driver);
		action.clickAndHold(from).moveToElement(to).release().build().perform();
		
		
		
	}
}
