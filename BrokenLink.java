import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

/*
public class BrokenLink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String url=driver.findElement(By.cssSelector("a[href*='restapi']")).getAttribute("href");
		HttpURLConnection conn= (HttpURLConnection)new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int responsecode=conn.getResponseCode();
		System.out.println(responsecode);

	}

}
*/
/*
public class BrokenLink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List <WebElement> links=driver.findElements(By.xpath("//li[@class='gf-li']//a"));
		for(WebElement link:links)
		{
			String url=link.getAttribute("href");
			HttpURLConnection conn= (HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int responsecode=conn.getResponseCode();
			System.out.println(responsecode);
			if(responsecode>400)
			{
				System.out.println("The Link with Text"+link.getText()+"is broken with code"+responsecode);
				Assert.assertTrue(false);
			}
		}
		

	}

}
*/
public class BrokenLink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links = driver.findElements(By.xpath("//li[@class='gf-li']//a"));
		SoftAssert a = new SoftAssert();
		for (WebElement link : links) {
			String url = link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int responsecode = conn.getResponseCode();
			System.out.println(responsecode);
			a.assertTrue(responsecode < 400,
					"The Link with Text" + link.getText() + "is broken with code" + responsecode);

		}
		a.assertAll();

		/*
		 * List<WebElement> links1=driver.findElements(By.tagName("a")); SoftAssert
		 * ass=new SoftAssert(); for (WebElement lin:links1) { String
		 * url1=lin.getAttribute("href"); HttpURLConnection cnn=(HttpURLConnection)new
		 * URL(url1).openConnection(); cnn.setRequestMethod("HEAD"); cnn.connect(); int
		 * code=cnn.getResponseCode(); System.out.println(code);
		 * //ass.assertTrue(code<400,"The Link with Text"+lin.getText()
		 * +"is broken with code"+code); } //ass.assertAll();
		 * 
		 */
	}
}
