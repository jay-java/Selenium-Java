package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChormeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		for(WebElement w:frames) {
			System.out.println(w);
		}
		
		WebElement f1 = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(f1);
		
		String msg = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(msg);
	}
}
