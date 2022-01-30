import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@text='Belagavi (IXG)']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		Thread.sleep(2000L);  
		// driver.findElement(By.xpath("(//a[@text='Bengaluru (BLR)'])[2]")).click();
		driver.findElement(
				By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@text='Bengaluru (BLR)']"))
				.click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).getText());
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		System.out.println(
				driver.findElement(By.xpath("//label[@for='ctl00_mainContent_rbtnl_Trip_1']")).getAttribute("class"));
		// Assert.assertFalse(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		Assert.assertTrue(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		System.out.println(
				driver.findElement(By.xpath("//label[@for='ctl00_mainContent_rbtnl_Trip_1']")).getAttribute("class"));
		if (driver.findElement(By.xpath("//label[@for='ctl00_mainContent_rbtnl_Trip_1']")).getAttribute("class")
				.contains("label")) {
			System.out.println("Is Enabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		driver.close();
	}

}
