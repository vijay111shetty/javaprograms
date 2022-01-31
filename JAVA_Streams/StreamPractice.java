package JAVA_Streams;

import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.testng.Assert;

/*
public class StreamPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//table[@class='table table-bordered']/thead/tr/th[1]")).click();
		List<WebElement> ele=driver.findElements(By.xpath("//table[@class='table table-bordered']/tbody/tr/td[1]"));
		List<String>elelist=ele.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String>sortedlist=elelist.stream().sorted().collect(Collectors.toList());
		Assert.assertEquals(elelist, sortedlist);
		System.out.println(elelist);
		List<String> price=ele.stream().filter(s->s.getText().contains("Banana")).
				map(s->getPrices(s)).collect(Collectors.toList());
		price.forEach(a->System.out.println(a));
		

	}

	

	private static String getPrices(WebElement s) {
		// TODO Auto-generated method stub
		String pricevalue=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
	}

}
*/
public class StreamPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//table[@class='table table-bordered']/thead/tr/th[1]")).click();
		List<WebElement> ele = driver.findElements(By.xpath("//table[@class='table table-bordered']/tbody/tr/td[1]"));
		List<String> elelist = ele.stream().map(s -> s.getText()).collect(Collectors.toList());
		List<String> sortedlist = elelist.stream().sorted().collect(Collectors.toList());
		List<String> price;
		Assert.assertEquals(elelist, sortedlist);
		System.out.println(elelist);
		do {
			List<WebElement> rows = driver
					.findElements(By.xpath("//table[@class='table table-bordered']/tbody/tr/td[1]"));
			price = rows.stream().filter(s -> s.getText().contains("Wheat")).map(s -> getPrices(s))
					.collect(Collectors.toList());
			price.forEach(a -> System.out.println(a));
			if (price.size() < 1) {
				driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
			}

		} while (price.size() < 1);
	}

	private static String getPrices(WebElement s) {
		// TODO Auto-generated method stub
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
	}

}