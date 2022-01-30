import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@text='Belagavi (IXG)']")).click();
		Thread.sleep(2000L);
		driver.findElement( 
				By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@text='Bengaluru (BLR)']"))
				.click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		if (driver.findElement(By.xpath("//label[@for='ctl00_mainContent_rbtnl_Trip_1']")).getAttribute("class")
				.contains("label")) { 
			System.out.println("Is Enabled");
			Assert.assertTrue(false);

		} else {
			Assert.assertTrue(true);
		}
		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		WebElement ele = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		Thread.sleep(2000L);
		WebElement ele1 = driver.findElement(By.id("ctl00_mainContent_ddl_Child"));
		Select dropdown = new Select(ele);
		Thread.sleep(2000L);
		dropdown.selectByVisibleText("3");
		Select dropdown1 = new Select(ele1);
		dropdown1.selectByIndex(3);
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "3 Adult, 3 Child");
		driver.findElement(By.cssSelector("#ctl00_mainContent_chk_friendsandfamily")).click();
		driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
		driver.close();
	}

}
