
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.CapabilityType;

public class Chromeoption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeOptions c = new ChromeOptions();
		c.addArguments("--headless");
		WebDriver driver = new ChromeDriver(c);
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		ch.acceptInsecureCerts();
		c.merge(ch);
		System.out.println("Page Title is=" + driver.getTitle());
		driver.close();
	}

	/*
	 * ChromeOption option=new ChromeOption();
	 * option.addArguments("Window-size=1400,800");---this is helpfull when the web page is not config for the mobiles
	 * option.addArguments("--headless"); WebDriver driver=new ChromeDriver(option);
	 */

}

/*
 * import org.openqa.selenium.Capabilities; import
 * org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.chrome.ChromeOptions; import
 * org.openqa.selenium.remote.CapabilityType; import
 * org.openqa.selenium.remote.DesiredCapabilities;
 * 
 * public class ChromeOptions {
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * 
 * //SSl certificates
 * 
 * //Desired capabilities= //general chrome profile DesiredCapabilities ch =
 * DesiredCapabilities.chrome(); //ch.acceptInsecureCerts();
 * ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
 * ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
 * 
 * //Belows to your local browser ChromeOptions c = new ChromeOptions();
 * c.merge(ch); System.setProperty("webdriver.chrome.driver", ""); WebDriver
 * driver = new ChromeDriver(c);
 * 
 * }
 * 
 * }
 */
