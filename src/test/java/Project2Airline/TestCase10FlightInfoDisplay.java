package Project2Airline;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import elementAirLine.flightDetailPageAirline;
import elementAirLine.flightResultPageAirline;
import elementAirLine.homePageAirline;
import elementAirLine.loginPageAirline;
@Listeners(utility.TestNG_ITestListener.class)
public class TestCase10FlightInfoDisplay extends LaunchQuit{

	@Test(retryAnalyzer = utility.retryanalyzer.class)
	public void flightInfoDetails() throws Throwable {
		
		loginPageAirline lp= new loginPageAirline(driver);
		lp.username("amazon", 6, 1);
		lp.pwd("amazon", 7, 1);
		
		homePageAirline hp= new homePageAirline(driver);
		hp.oneWayRadioButton();
		hp.fromSearch("Kolkata");
		Thread.sleep(2000);
		hp.selectFromSearch();
		hp.toSearch("Bangalore");
		Thread.sleep(2000);
		hp.selectFromSearch1();
		Thread.sleep(2000);
		hp.dateSelect();
		hp.searchButton();
		Thread.sleep(2000);
		flightResultPageAirline fr= new flightResultPageAirline(driver);
		fr.bookButton();
		
		flightDetailPageAirline fd= new flightDetailPageAirline(driver);
		fd.viewBaggagePolicy();
		boolean act_res= fd.flightInfoDetails().isDisplayed();
		Assert.assertTrue(act_res);
		
		boolean act_price= fd.flightFareDetails().isDisplayed();
		Assert.assertTrue(act_price);
		
		boolean act_baggage= fd.flightBaggageDetails().isDisplayed();
		Assert.assertTrue(act_baggage);
		fd.flightCancellationLink();
		boolean act_cancel_details= fd.flightCancellationDetails().isDisplayed();
		Assert.assertTrue(act_cancel_details);
	}
}