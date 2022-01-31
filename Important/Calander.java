package Important;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calander {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions/");
		driver.findElement(By.cssSelector("#travel_date")).click();

		while (!driver
				.findElement(By.xpath("//table[@class=' table-condensed']/thead/tr/th[@class='datepicker-switch']"))
				.getText().contains("April 2021")) {
 
			driver.findElement(By.xpath("//table[@class=' table-condensed']/thead/tr/th[@class='next']")).click();
		}
		List<WebElement> dates = driver.findElements(By.cssSelector(".day"));
		System.out.println(dates.size());
		int count = dates.size();
		for (int i = 0; i < count; i++) {
			String date = dates.get(i).getText();
			if (date.equalsIgnoreCase("23")) {
				dates.get(i).click();
				break;
			}
		}
		driver.close();
	}

}
