package Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("#autocomplete")).sendKeys("ind");
		Thread.sleep(5000);
		List<WebElement> nm = driver.findElements(By.cssSelector(".ui-menu-item"));
		int count = nm.size();
		System.out.println(count);
		for (int j = 0; j < count; j++) {
			String country = nm.get(j).getText();
			System.out.println(country);
			if (country.equalsIgnoreCase("India")) {
				nm.get(j).click();
				break;
			}

		}

	}

}
