package Project1Ecommerce;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utility.TestNG_ITestListener;

public class Launch_Quit extends TestNG_ITestListener
{
	//public static WebDriver driver;
	@BeforeMethod
	public void launchBrowser() {
		
//		ChromeOptions co=new ChromeOptions();
//		co.addArguments("--headless");
//		driver= new ChromeDriver(co);
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@AfterMethod
	public void quitBrowser() {
		driver.quit();
	}
}