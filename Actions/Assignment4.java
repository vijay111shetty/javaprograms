package Actions;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize(); 
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 8);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='content']//a[@target='_blank']")));
		driver.findElement(By.xpath("//div[@id='content']//a[@target='_blank']")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> window = windows.iterator();
		String parentid = window.next();
		String childid = window.next();
		driver.switchTo().window(childid);
		System.out.println(driver.findElement(By.cssSelector(".example")).getText());
		driver.switchTo().window(parentid);
		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());
		driver.close();
		driver.quit();

	}

}
