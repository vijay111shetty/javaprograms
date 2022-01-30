
/*

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;






public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(2000L);
		//driver.switchTo().alert().accept();
		//driver.findElement(By.cssSelector(".depart_date.keyValue.span.span24.required.hasDatepicker.placeholder")).click();
		//driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active ")).click();
		WebElement ele=driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active" ));
		//System.out.println(ele.size());
		Select drop=new Select(ele);
		drop.selectByIndex(3);

	}

}
*/
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {

// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.cleartrip.com/");

		driver.findElement(By.cssSelector("#DepartDate")).click();

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active ")).click();

		WebElement Adultdropdown = driver.findElement(By.xpath("//select[@name='adults']"));

		Select Adult = new Select(Adultdropdown);

		Adult.selectByIndex(1);

		WebElement Childdropdown = driver.findElement(By.xpath("//select[@name='adults']"));

		Select Child = new Select(Childdropdown);

		Child.selectByIndex(2);

		WebElement Infantdropdown = driver.findElement(By.xpath("//select[@name='infants]"));

		Select Infant = new Select(Infantdropdown);

		Infant.selectByIndex(1);

		driver.findElement(By.id("MoreOptionsLink")).click();

		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Indigo");

		driver.findElement(By.id("SearchBtn")).click();

		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

	}

}
