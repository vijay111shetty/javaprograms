import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://www.spicejet.com/");
		//driver.navigate().to("");
		Assert.assertFalse(driver.findElement(By.cssSelector("input[name*='SeniorCitizenDiscount']")).isSelected());
		// System.out.println(driver.findElement(By.cssSelector("input[name*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[name*='SeniorCitizenDiscount']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[name*='SeniorCitizenDiscount']")).isSelected());
		// System.out.println(driver.findElement(By.cssSelector("input[name*='SeniorCitizenDiscount']")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("div[id='discount-checkbox'] div")).size());
		driver.close();
	}

}
