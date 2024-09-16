package Project2Airline;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import elementAirLine.homePageAirline;
import elementAirLine.loginPageAirline;
@Listeners(utility.TestNG_ITestListener.class)
public class TestCase5RoundTrip extends LaunchQuit {
	
	@Test(retryAnalyzer = utility.retryanalyzer.class)
	public void roundTrip() throws Throwable {
		
		loginPageAirline lp= new loginPageAirline(driver);
		lp.username("amazon", 6, 1);
		lp.pwd("amazon", 7, 1);
		
		homePageAirline hp= new homePageAirline(driver);
		hp.fromSearch("Kolkata");
		Thread.sleep(2000);
		hp.selectFromSearch();
		hp.toSearch("Bangalore");
		Thread.sleep(2000);
		hp.selectFromSearch1();
		Thread.sleep(2000);
		hp.dateSelect();
		hp.dateSelectDate();
		hp.searchButton();
		hp.passengerOptions();
		hp.adultsChoice1();
		
		boolean datecontain= driver.getCurrentUrl().contains("2024-10-13");
		Assert.assertEquals(datecontain, true, "Return Date is Missing");
	}
}