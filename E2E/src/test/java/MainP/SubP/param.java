package MainP.SubP;



	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.DataProvider;

	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;

	
	public class param {
	public WebDriver driver;

	@BeforeTest
	public void LinkChDriver() {
	System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\Basement_PC\\Desktop\\Selenium\\Chrome driver\\chromedriver.exe");

	driver = new ChromeDriver();
	}

	@Test
	@Parameters({"URL"})
	public void LoginUrl( String BrowserUrl) {

	driver.get(BrowserUrl);

	}


	@Test(dependsOnMethods = {"LoginUrl"},dataProvider = "getdata")

	public void Login( String Username, String Password) throws InterruptedException {


	driver.findElement(By.cssSelector("#email")).sendKeys(Username);
	driver.findElement(By.cssSelector("#pass")).sendKeys(Password);
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("#email")).clear();
	driver.findElement(By.cssSelector("#pass")).clear();


	}

	@DataProvider
	public Object[][] getdata() {

	Object[][] data = new Object[4][2];

	data[0][0] = "maldmsald@gmail.com";
	data[0][1] = "123456";

	data[1][0] = "sabira@yahoo.com";
	data[1][1] = "7894566";

	data[2][0] = "mahabubur@hotmail.com";
	data[2][1] = "analsfsalik";

	data[3][0] = "Taher@hotmail.com";
	data[3][1] = "sumon";
	return data;
	}
	@AfterTest
	public void closeBrowser() {
	driver.close();
	}

	}

