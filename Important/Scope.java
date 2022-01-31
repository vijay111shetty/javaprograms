package Important;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize(); 
		// to get the total links present on the page
		System.out.println(driver.findElements(By.tagName("a")).size());
		// to get the total links present in footer only
		WebElement footerdriver = driver.findElement(By.cssSelector("#gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		// to get the total links present in first column of the footer
		WebElement firstblockdriver = footerdriver.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]"));
		System.out.println(firstblockdriver.findElements(By.tagName("a")).size());
		// click on each link present on the footer first column
		for (int i = 1; i < firstblockdriver.findElements(By.tagName("a")).size(); i++) {
			// to click & open in new tab
			String clickopenindifftab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			// firstblockdriver.findElements(By.tagName("a")).get(i).click();
			firstblockdriver.findElements(By.tagName("a")).get(i).sendKeys(clickopenindifftab);
			Thread.sleep(2000L);
		}
			Set<String> wet = driver.getWindowHandles();
			Iterator<String> it = wet.iterator();
		
			while (it.hasNext()) {
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}

		
		driver.close();

	}

}
