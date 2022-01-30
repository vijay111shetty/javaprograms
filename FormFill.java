import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class FormFill {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='form-group']//input[@name='name']")).sendKeys("vijay");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("vijay111shetty");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("1234");
		WebElement drop = driver.findElement(By.cssSelector("#exampleFormControlSelect1"));
		Select option = new Select(drop);
		option.selectByVisibleText("Male");
		driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("01030110");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement msg = driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible"));
		String mssg = msg.getText();
		System.out.println(msg.getText());
		Assert.assertTrue(msg.getText().contains("Success! The Form has been submitted successfully!."));
		//driver.close();

	}

}
