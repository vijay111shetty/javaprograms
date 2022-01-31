package Actions;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		int rows = driver.findElements(By.cssSelector(".table-display tbody tr")).size();
		System.out.println(rows);
		int columns = driver.findElements(By.cssSelector(".table-display tbody tr th")).size();
		System.out.println(columns);
		List<WebElement> nm = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr[3]/td"));
		int count = nm.size();
		for (int i = 0; i < count; i++) {
			System.out.println(nm.get(i).getText());
		}
		driver.close();

	}

}
