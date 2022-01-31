
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class AutoSuggestiveDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
     driver.findElement(By.id("autosuggest")).sendKeys("Ind");
     Thread.sleep(2000L);
     //ArrayList<WebElement> options=(ArrayList<WebElement>) driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
     List<WebElement> options= driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
     for (WebElement option :options)
     { 
    	 if (option.getText().equalsIgnoreCase("India"))
    	 {
    		 option.click();
    		 break;
    	 }
     }
	//driver.close();
		
	}

}
