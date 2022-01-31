package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver", "C:\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://testautomationpractice.blogspot.com/");
		WebElement ele= driver.findElement(By.id("speed"));
		Select dropdown=new Select(ele);
		dropdown.selectByIndex(0);  
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("Medium");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		//System.out.println(dropdown.getOptions());
		driver.close();
			
	}
 
}
