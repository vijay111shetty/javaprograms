package Important;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calander2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdrive.chrome.driver", "C:\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.cssSelector("#travel_date")).click();
		System.out
				.println(driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']"))
						.getText().contains("December"));
		while (!driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']"))
				.getText().contains("December")) {
			driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='next']")).click();
		}
		List<WebElement> dates = driver.findElements(By.cssSelector(".day"));
		int count = dates.size();
		for (int i = 0; i < count; i++) {
			String date = dates.get(i).getText();
			if (dates.get(i).getText().equalsIgnoreCase("24")) {
				dates.get(i).click();
				break;
			}
		}
		driver.close();

	}

}
