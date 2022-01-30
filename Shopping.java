/*
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> products = driver.findElements(By.cssSelector("h4[class='product-name']"));
		String[] item= {"Cucumber - 1 Kg","Cauliflower - 1 Kg"};
		for (int i = 0; i < products.size(); i++) {
			String product = products.get(i).getText();
			
			if (product.contains(Cucumber - 1 Kg))
			{
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			}
		}

	}

}
*/

/*
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> products = driver.findElements(By.cssSelector("h4[class='product-name']"));
		String[] item= {"Cucumber - 1 Kg","Cauliflower - 1 Kg"};
		for (int i = 0; i < products.size(); i++) {
			String product = products.get(i).getText();
			//convert array into array list for easy search
			//check weather name you extracted is present in arrary list or not
			List al = Arrays.asList(item);
			if (al.contains(product))
			{
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				//For  arrary list we canot use break;
				//break;
			}
		}

	}

}
*/
/*
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> products = driver.findElements(By.cssSelector("h4[class='product-name']"));
		String[] item = { "Cucumber", "Cauliflower" };
		// Cucumber - 1 Kg
		// Cucumber
		// - 1 Kg
		for (int i = 0; i < products.size(); i++) {
			String[] product = products.get(i).getText().split("-");
			// product[0]= "Cucumber "
			// product[l]= "- 1 Kg"
			String onlyproduct = product[0].trim();
			// trim() removesaces on left and right
			// convert array into array list for easy search
			// check weather name you extracted is present in arrary list or not
			List al = Arrays.asList(item);
			if (al.contains(onlyproduct)) {
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				// For arrary list we canot use break;
				// break;
			}
		}

	}

}
*/
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shopping {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] item = { "Cucumber", "Cauliflower","Beetroot" };
		List<WebElement> products = driver.findElements(By.cssSelector("h4[class='product-name']"));
		// Cucumber - 1 Kg
		// Cucumber
		// - 1 Kg
		for (int i = 0; i < products.size(); i++) {
			String[] product = products.get(i).getText().split("-");
			// product[0]= "Cucumber "
			// product[l]= "- 1 Kg"
			String onlyproduct = product[0].trim();
			// trim() removesaces on left and right
			// convert array into array list for easy search
			// check weather name you extracted is present in arrary list or not
			Thread.sleep(1000L); 
			List al = Arrays.asList(item);
			int j = 0;
			if (al.contains(onlyproduct)) {
				j++;
				// driver.findElements(By.xpath("//button[text()='ADD TO
				// CART']")).get(i).click();
				// Thread.sleep(2000L);
				// dont dependent on the text() paths
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				// For arrary list we canot use break;
				// break;
				if (j == 3) {
					break;
				}
			}
		}

	}

}