package MainP.SubP;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;





public class crossBrowTest {
	
	public WebDriver driver;
	
	@Test 
	public void setup() {
		
		String url = "saucelabs driver creation url";
		
		DesiredCapabilities cap = new DesiredCapabilities().chrome();
		cap.setCapability("platformName", "Windows 10");
		cap.setCapability("browserVersion", "89.0");
		
		// for communication
		//passed the capability information through cap
		
		WebDriver driver = new RemoteWebDriver(new URL(url),cap);
		
		
		driver.get("https://www.usps.com/");
		driver.manage().window().maximize();
		System.out.println("facebook login successfully");
		driver.getTitle();
		
	
		

}
}
