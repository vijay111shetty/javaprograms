import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class Screenshotandcookies {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// driver.manage().deleteCookieNamed("sessionKey");

		// click on any link
		// login page- verify login url

		driver.get("http://google.com");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\lenovo\\screenshot.png"));
		TakesScreenshot ta=(TakesScreenshot)driver;
		File abc=ta.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(abc, new File("C:\\Users\\lenovo\\screenshot.png"));

	}

}
