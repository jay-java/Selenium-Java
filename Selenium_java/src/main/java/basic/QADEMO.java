package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QADEMO {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChormeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		WebElement currency = driver.findElement(By.xpath("//*[@id=\"countries\"]/tbody/tr[3]/td[4]"));
		String data = currency.getText();
		System.out.println(data);
	}
}
