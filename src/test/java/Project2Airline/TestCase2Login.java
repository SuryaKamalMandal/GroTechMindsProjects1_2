package Project2Airline;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import elementAirLine.loginPageAirline;
@Listeners(utility.TestNG_ITestListener.class)

public class TestCase2Login extends LaunchQuit {
	
	@Test(retryAnalyzer = utility.retryanalyzer.class)
	public void loginflight() throws Throwable {
		
		loginPageAirline lp= new loginPageAirline(driver);
		lp.username("amazon", 6, 1);
		lp.pwd("amazon", 7, 1);
		Thread.sleep(2000);
		String title= driver.getTitle();
		
		Assert.assertEquals(title, "Flight Bookings on Amazon", "Sorry, the title didn't match");
	}
}