package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PartialLinkText {
	public static void main(String[] args) {
		String url="https://www.facebook.com/";
		WebDriver driver = DriverConnection.getConnection(url);
		
		List<WebElement> links = driver.findElements(By.partialLinkText("Create"));
		System.out.println(links.size());
		links.get(1).click();
//		for(WebElement link:links) {
//			System.out.println(link.getText());
//		}
	}
}
