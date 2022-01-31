package practice;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppingPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		String[] item = { "Cucumber", "Cauliflower", "Beetroot" };
		items(driver, item);             
		WebDriverWait wait = new WebDriverWait(driver, 8);
		driver.findElement(By.cssSelector(".cart-icon")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		// Thread.sleep(2000L);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".promoBtn")));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		// Thread.sleep(8000L);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".promoInfo")));
		System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
		driver.close();

	}

	public static void items(WebDriver driver, String[] item) throws InterruptedException {
		List<WebElement> products = driver.findElements(By.cssSelector("h4[class='product-name']"));
		for (int i = 0; i < products.size(); i++) {
			String[] product = products.get(i).getText().split("-");
			String onlyproduct = product[0].trim();
			List a1 = Arrays.asList(item);
			int j = 0;
			if (a1.contains(onlyproduct)) {
				j++;
				Thread.sleep(2000L);
				driver.findElements(By.cssSelector(".product-action")).get(i).click();
				if (j == 3) {
					break;
				}
			}
		}
	}

}
