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
		String email1 ="incorrect@gmail.com";
		String pass1 = "incorrect";
		String email2 ="correct@gmail.com";
		String pass2 = "incorrect";
		String email3 ="incorrect@gmail.com";
		String pass3 = "correct";
		String email4 ="correct@gmail.com";
		String pass4 = "correct";
		for(int i=1;i<=4;i++) {
			if(i == 1) {
				System.out.println(1);
//				driver.findElement(By.id("email")).sendKeys(email1);
//				driver.findElement(By.id("pass")).sendKeys(pass1);
//				driver.findElement(By.name("login")).click();
//				driver.close();
			}
			else if(i == 2) {
				System.out.println(2);
//				driver.findElement(By.id("email")).sendKeys(email2);
//				driver.findElement(By.id("pass")).sendKeys(pass2);
//				driver.findElement(By.name("login")).click();
//				driver.close();
			}
			else if(i == 3) {
				System.out.println(3);
//				driver.findElement(By.id("email")).sendKeys(email3);
//				driver.findElement(By.id("pass")).sendKeys(pass3);
//				driver.findElement(By.name("login")).click();
//				driver.close();
			}
			else if(i == 4) {
				System.out.println(4);
//				driver.findElement(By.id("email")).sendKeys(email4);
//				driver.findElement(By.id("pass")).sendKeys(pass4);
//				driver.findElement(By.name("login")).click();
			}
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
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
