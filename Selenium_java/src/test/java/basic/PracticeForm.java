package basic;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PracticeForm {
	public static void main(String[] args) {
		String url ="https://demoqa.com/automation-practice-form";
		WebDriver driver = DriverConnection.getConnection(url);
		driver.findElement(By.id("firstName")).sendKeys("jay");
		driver.findElement(By.id("lastName")).sendKeys("prajapati");
		driver.findElement(By.id("userEmail")).sendKeys("jay@gmail.com");
		List<WebElement> gender = driver.findElements(By.xpath("//*[@name='gender']/following-sibling::label"));
		gender.get(0).click();
		driver.findElement(By.id("userNumber")).sendKeys("9876543120");
		driver.findElement(By.id("dateOfBirthInput")).click();
		
		WebElement month = driver.findElement(By.className("react-datepicker__month-select"));
		Select months = new Select(month);
		months.selectByVisibleText("May");
		WebElement year = driver.findElement(By.className("react-datepicker__year-select"));
		Select years = new Select(year);
		years.selectByVisibleText("2000");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<WebElement> dates = driver.findElements(By.xpath("//div[@class='react-datepicker__month']/div/div"));
		for(WebElement date : dates) {
			String dt = date.getText();
			System.out.println(dt);
		}
	}
}