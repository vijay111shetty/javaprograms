import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.itgeared.com/demo/1506-ajax-loading.html");
		WebDriverWait wait = new WebDriverWait(driver, 8);
		driver.findElement(By.xpath("//a[text()='Click to load get data via Ajax!']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results")));
		System.out.println(driver.findElement(By.cssSelector("#results")).getText());
		driver.close();
		//WebDriverWait wait1=new WebDriverWait(driver,8);
		//wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("element")));
	}

}
