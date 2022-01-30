import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shopping2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		String[] item = { "Cucumber", "Cauliflower","Beetroot"};
		//Static method is defined (static void)
		items(driver,item);
		WebDriverWait wait=new WebDriverWait(driver,5); 
		//Static method is not defined (static void)
		//we have to create the object for main class and then we can access the methods of that class as shown below
		//Shopping2 t=new Shopping2();
		//t.items(driver, item);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),\"PROCEED TO CHECKOUT\")]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoCode")));
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
		System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
		
	}
	
	
	
	public static void items(WebDriver driver,String[] item) throws InterruptedException
	{
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
			//Thread.sleep(2000L);
			List al = Arrays.asList(item);
			int j = 0;
			if (al.contains(onlyproduct)) {
				j++;
				// driver.findElements(By.xpath("//button[text()='ADD TO
				// CART']")).get(i).click();
				 Thread.sleep(2000L);
				// dont dependent on the text() paths
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				// For arrary list we canot use break;
				// break;
				if (j == 3) 
				{
					break;
				}
			}
		}

	}

}

