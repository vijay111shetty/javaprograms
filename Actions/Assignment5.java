package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#checkBoxOption2")).click();
		String opt = driver.findElement(By.xpath("//label[@for='benz']")).getText();
		System.out.println(opt);
		WebElement ele = driver.findElement(By.cssSelector("#dropdown-class-example"));
		Select dk = new Select(ele); 
		dk.selectByVisibleText(opt);
		driver.findElement(By.cssSelector("#name")).sendKeys(opt);
		driver.findElement(By.cssSelector("#alertbtn")).click();
		String msg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println(msg);
		if (msg.contains(opt)) {
			Assert.assertTrue(true);
			System.out.println("Test pAss");
		} else {
			Assert.assertTrue(false);
		}
		driver.switchTo().defaultContent();
		driver.close();
	}

}
