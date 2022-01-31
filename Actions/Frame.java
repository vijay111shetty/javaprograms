package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		Actions t = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement trget = driver.findElement(By.id("droppable"));
		t.dragAndDrop(source, trget).build().perform();
		// driver.findElement(By.cssSelector("#draggable")).click();
 
	}

}
