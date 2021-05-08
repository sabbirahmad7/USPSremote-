package MainP.SubP;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
	public WebDriver driver;
	
	
	@Test
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/sabbirahmad/Desktop/chromedriver");
		
		 driver = new ChromeDriver();
		
	}

}
