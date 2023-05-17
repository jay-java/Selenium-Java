package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Captcha {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChormeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
		WebElement fname = driver.findElement(By.name("first_name"));
		fname.sendKeys("jay");
		WebElement lname = driver.findElement(By.name("last_name"));
		lname.sendKeys("prajapti");
		WebElement bname = driver.findElement(By.name("business_name"));
		bname.sendKeys("xyz");
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("jay@gmail.com");
		WebElement num1 = driver.findElement(By.id("numb1"));
		System.out.println(num1.getText());
		String numm1 = num1.getText();
		WebElement num2 = driver.findElement(By.id("numb2"));
		System.out.println(num2.getText());
		String numm2 = num2.getText();
		int n1 = Integer.parseInt(numm1);
		int n2 = Integer.parseInt(numm2);
		int res = n1+n2;
		System.out.println(res);
		driver.findElement(By.id("number")).sendKeys(String.valueOf(res));
	}
}
