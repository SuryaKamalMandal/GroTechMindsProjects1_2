package Project1Ecommerce;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import elementAmazon.RatingPageAmazon;
import elementAmazon.homePageAmazon;
import elementAmazon.loginPageAmazon;
@Listeners(utility.TestNG_ITestListener.class)
public class TestCase14OrdersRating extends Launch_Quit {

	@Test(retryAnalyzer = utility.retryanalyzer.class)
	public void ordersRatings() throws Throwable {
		
		homePageAmazon hp= new homePageAmazon(driver);
		hp.signIN();
		loginPageAmazon lp= new loginPageAmazon(driver);
		lp.username("amazon", 6, 1);
		lp.pwd("amazon", 7, 1);
		hp.order_click();
		RatingPageAmazon rp= new RatingPageAmazon(driver);
	}
}