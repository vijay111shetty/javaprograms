package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		//WebDriver driver=new HtmlUnitDriver();
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.amazon.in/");
		Actions act = new Actions(driver); 
		WebElement move = driver.findElement(By.cssSelector(".nav-line-2.nav-long-width"));
		// move to element and enter in captial letters and select all
		act.moveToElement(driver.findElement(By.cssSelector("#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT)
				.sendKeys("vijay").doubleClick().build().perform();
		// Move to specific element
		act.moveToElement(move).build().perform();
		// to right click
		act.moveToElement(move).contextClick().build().perform();

	}

}
