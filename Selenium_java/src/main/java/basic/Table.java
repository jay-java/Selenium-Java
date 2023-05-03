package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChormeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		// Table header
		List<WebElement> thead = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr[1]/td"));
		for (int i = 1; i <= thead.size(); i++) {
			String header = driver.findElement(By.xpath("//table[@id='countries']/tbody/tr[1]/td[" + i + "]"))
					.getText();
			System.out.print(header + " | ");
		}
		System.out.println();
		System.out.println("-------------------------------------------------");
		// Table body
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr"));
		System.out.println(rows.size());
		for (int i = 2; i < rows.size(); i++) {

			List<WebElement> cols = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr[" + i + "]/td"));
			System.out.println(cols.size());
			for (int j = 2; j <= cols.size(); j++) {
				String name = driver.findElement(By.xpath("//table[@id='countries']/tbody/tr[" + i + "]/td[" + j + "]"))
						.getText();
				System.out.print(name + " | ");
			}
			System.out.println();
		}
	}
}
