package Project2Airline;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import elementAirLine.flightDetailPageAirline;
import elementAirLine.flightResultPageAirline;
import elementAirLine.homePageAirline;
import elementAirLine.loginPageAirline;
import elementAirLine.paymentPageAirline;
@Listeners(utility.TestNG_ITestListener.class)
public class TestCase15Payment extends LaunchQuit {

	@Test(retryAnalyzer = utility.retryanalyzer.class)
	public void payment() throws Throwable {
		
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
		fd.proceedToTravelButton();
		fd.addNewAdultOption();
		fd.genderDropClick();
		fd.genderDropMale();
		fd.firstNametf("flight", 1, 0);
		fd.lastNametf("flight", 1, 1);
		fd.addAdultButton();
		fd.passengerCheckBox();
		fd.emailID("flight", 13, 1);
		fd.proceesToSeatSelectionButton();
		Thread.sleep(1000);
		fd.skipSeatSelection();
		fd.agreementCheckBox();
		fd.proceedPaymentButton();
		
		paymentPageAirline pa= new paymentPageAirline(driver);
		pa.creditDebitRadioButton();
		pa.nickNameTf("flight", 10, 1);
		pa.cardNumTf("flight", 11, 1);
		pa.expiryDateDrop();
		pa.expiryDateDrop1();
		pa.expiryMonthDrop();
		pa.expiryMonthDrop1();
		pa.enterCVV("flight", 12, 1);
		pa.cardNumTf1();
//		pa.payButton();
	}
}