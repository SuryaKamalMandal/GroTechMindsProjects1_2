package Project2Airline;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import elementAirLine.flightDetailPageAirline;
import elementAirLine.flightResultPageAirline;
import elementAirLine.homePageAirline;
import elementAirLine.loginPageAirline;
@Listeners(utility.TestNG_ITestListener.class)
public class TestCase13AppliedCoupon extends LaunchQuit {
	
	@Test(retryAnalyzer = utility.retryanalyzer.class)
	public void appliedCoupon() throws Throwable {
		
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
		fd.applyCouponButton();
		boolean act_discount= fd.discountDisplay().isDisplayed();
		Assert.assertTrue(act_discount, "Discount is not Showing");
	}
}