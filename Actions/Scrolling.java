package Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// to scroll the whole page
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		// to scroll the specific coloumn in page
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		List<WebElement> nums = driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[4]"));
		System.out.println(nums.size()); 
		int sum = 0;
		for (int i = 0; i < nums.size(); i++) {
			System.out.println(Integer.parseInt(nums.get(i).getText()));
			sum = sum + Integer.parseInt(nums.get(i).getText());
		}
		System.out.println(sum);
		int totl = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		Assert.assertEquals(sum, totl);
		System.out.println("Test passed");
		driver.close();

	}

}
