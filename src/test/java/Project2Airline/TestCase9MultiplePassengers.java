package Project2Airline;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import elementAirLine.flightDetailPageAirline;
import elementAirLine.flightResultPageAirline;
import elementAirLine.homePageAirline;
import elementAirLine.loginPageAirline;
@Listeners(utility.TestNG_ITestListener.class)
public class TestCase9MultiplePassengers extends LaunchQuit {
	
	@Test(retryAnalyzer = utility.retryanalyzer.class)
	public void multiplePassengers() throws Throwable {
		
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
		hp.passengerOptions();
		hp.adultsChoice();
		Thread.sleep(2000);
		hp.searchButton();
		flightResultPageAirline fr= new flightResultPageAirline(driver);
		fr.bookButton();
		
		flightDetailPageAirline fd= new flightDetailPageAirline(driver);
		fd.proceedToTravelButton();
		
		for(int i=0;i<5;i++) {
			fd.addNewAdultOption();
			fd.genderDropClick();
			fd.genderDropMale();
			fd.firstNametf("flight", i, 0);
			fd.lastNametf("flight", i, 1);
			fd.addAdultButton();
			Thread.sleep(2000);
		}
		fd.passengerCheckBoxClick();
		fd.emailID("flight", 13, 1);
	}
}