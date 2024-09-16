package Project2Airline;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import elementAirLine.homePageAirline;
import elementAirLine.loginPageAirline;
@Listeners(utility.TestNG_ITestListener.class)
public class TestCase6DiffClasses extends LaunchQuit {
	
	@Test(retryAnalyzer = utility.retryanalyzer.class)
	public void diffClasses() throws Throwable {
		
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
		hp.passengerOptions();
		hp.adultsChoice1();
		hp.searchButton();
		
		hp.passengerOptions();
		Thread.sleep(2000);
		hp.premiumEconomyRadioButton();
		String premiumtext= hp.diffClassesNames().getText();
		Assert.assertEquals(premiumtext, "Premium Economy", "Premium Economy Text is not getting Displayed");
		hp.searchButton();
		
		hp.passengerOptions();
		Thread.sleep(2000);
		hp.businessRadioButton();
		String businesstext= hp.diffClassesNames().getText();
		Assert.assertEquals(businesstext, "Business", "Business is not getting Displayed");
		hp.searchButton();
		
		hp.passengerOptions();
		hp.economyRadioButton();
		String economytext= hp.diffClassesNames().getText();
		Assert.assertEquals(economytext, "Economy", "Economy is not getting Displayed");
		hp.searchButton();
	}
}