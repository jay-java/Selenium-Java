package basic;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.setProperty("webdriver.chrome.driver", "D:\\ChormeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		System.setProperty("webdriver.edge.driver", "D:\\EdgeDriver\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.manage().window().maximize();
//		driver.findElement(By.linkText("Create new account")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.findElement(By.name("firstname")).sendKeys("selenium");
//		driver.findElement(By.name("lastname")).sendKeys("java");
//		driver.findElement(By.name("reg_email__")).sendKeys("selenium@gmail.com");
//		driver.findElement(By.name("reg_passwd__")).sendKeys("1234");
//		
//		WebElement day = driver.findElement(By.id("day"));
//		Select days = new Select(day);
//		days.selectByVisibleText("21");
//		
//		WebElement month = driver.findElement(By.id("month"));
//		Select months = new Select(month);
//		months.selectByValue("6");
//		
//		WebElement year = driver.findElement(By.id("year"));
//		Select years = new Select(year);
//		years.selectByIndex(3);
//		
//		List<WebElement> gender = driver.findElement(By.name("sex"));
//		gender.get(1).click();
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("java@gmail.com");
//		driver.findElement(By.cssSelector("#email")).sendKeys("java@gmail.com");
		driver.findElement(By.id("email")).sendKeys("java@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("java123");
		driver.findElement(By.name("login")).click();
//		String msg =  driver.findElement(By.className("_9ay7")).getText();
//		System.out.println(msg);
////		driver.close();
//		driver.quit();
	}
}
