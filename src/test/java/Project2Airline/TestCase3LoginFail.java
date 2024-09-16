package Project2Airline;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import elementAirLine.loginPageAirline;
@Listeners(utility.TestNG_ITestListener.class)
public class TestCase3LoginFail extends LaunchQuit{

	@Test(retryAnalyzer = utility.retryanalyzer.class)
	public void loginfail() throws Throwable {
		
		loginPageAirline lp= new loginPageAirline(driver);
		lp.username("amazon", 6, 1);
		lp.pwd("amazon", 7, 2);
		
		String errormsg= lp.errorMsg().getText();
		boolean incorrect= errormsg.contains("password is incorrect");
		
		Assert.assertEquals(incorrect, true, "Sorry, the Message didn't display");
	}
}