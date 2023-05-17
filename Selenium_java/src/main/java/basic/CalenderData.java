package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalenderData {
	public static void main(String[] args) {
		String url = "https://www.globalsqa.com/demo-site/datepicker/";
		WebDriver driver = DriverConnection.getConnection(url);

		WebElement myframe = driver.findElement(By.xpath("//div[@class='resp-tabs-container']/div[1]/p/iframe"));
		driver.switchTo().frame(myframe);
		System.out.println("switched to iframe");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("datepicker")).click();

		String myDate = "20";
		String myMonth = "November";
		String myYear = "2021";

		String currentYear = driver.findElement(By.className("ui-datepicker-year")).getText();
		System.out.println(currentYear);
		int y1 = Integer.parseInt(myYear);
		int y2 = Integer.parseInt(currentYear);
		while (!myYear.equals(driver.findElement(By.className("ui-datepicker-year")).getText())) {
			if (y1 > y2) {
				driver.findElement(By.xpath("//a[@data-handler='next']/span")).click();
			} else {
				driver.findElement(By.xpath("//a[@data-handler='prev']/span")).click();
			}
		}
		
		while (!myMonth.equals(driver.findElement(By.className("ui-datepicker-month")).getText())) {
			if (y1 > y2) {
				driver.findElement(By.xpath("//a[@data-handler='next']/span")).click();
			} else {
				driver.findElement(By.xpath("//a[@data-handler='prev']/span")).click();
			}
		}
		List<WebElement> dates = driver.findElements(By.xpath("//table/tbody/tr/td/a"));
		for(WebElement date: dates) {
			String dt = date.getText();
			if(dt.equals(myDate)) {
				date.click();
			}
		}

	}
}
