package SeleniumPractice;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;

public class VerifyBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the browser name");
		String Browsername = sc.next();
		if (Browsername.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (Browsername.equals("FireFox")) {
			System.setProperty("webdriver.firefox.driver", "C:\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver.id.driver", "C:\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

		driver.get("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com/");
		Assert.assertEquals(driver.getTitle(), "Google");
		driver.close();

	}

}
