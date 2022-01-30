import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.gson.annotations.Until;

public class Driver_exam {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub;
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();
		driver.quit();
		driver.navigate().refresh();
		driver.manage().wait();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait a=new WebDriverWait(driver,10);
		a.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".classee")));

	}

}
