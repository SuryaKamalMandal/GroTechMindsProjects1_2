package Project2Airline;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import utility.TestNG_ITestListener;

public class LaunchQuit extends TestNG_ITestListener
{
/*	@Parameters("browser")
	@BeforeMethod
	public void launchBrowser(String nameofbrowsers) {

		if(nameofbrowsers.equals("chrome")) {
		
			ChromeOptions co=new ChromeOptions();
			co.addArguments("--headless");
			driver= new ChromeDriver(co);
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/flights?ref_=nav_em_sbc_desktop_flights_0_1_1_32");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}
		if(nameofbrowsers.equals("edge")) {
			EdgeOptions co=new EdgeOptions();
			co.addArguments("--headless");
			driver= new EdgeDriver(co);
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/flights?ref_=nav_em_sbc_desktop_flights_0_1_1_32");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--headless");
		driver= new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/flights?ref_=nav_em_sbc_desktop_flights_0_1_1_32");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	} */
	
	@BeforeMethod
	public void launchBrowser1() {

//		ChromeOptions co=new ChromeOptions();
//		co.addArguments("--headless");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/flights?ref_=nav_em_sbc_desktop_flights_0_1_1_32");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@AfterMethod
	public void quitBrowser() {
//		driver.quit();
	}
}