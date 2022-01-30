import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		WebElement ele = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		WebElement ele1 = driver.findElement(By.id("ctl00_mainContent_ddl_Child"));
		Select dropdown = new Select(ele);
		dropdown.selectByValue("3"); 
		Select dropdown1 = new Select(ele1);
		dropdown1.selectByIndex(3); 
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "3 Adult, 3 Child");
		// System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.close();

	}

}
