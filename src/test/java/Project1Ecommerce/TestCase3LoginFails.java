package Project1Ecommerce;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import elementAmazon.homePageAmazon;
import elementAmazon.loginPageAmazon;
@Listeners(utility.TestNG_ITestListener.class)
public class TestCase3LoginFails extends Launch_Quit{
	
	@Test//(retryAnalyzer = utility.retryanalyzer.class)
	public void loginfailamazon() throws Throwable {
		
		homePageAmazon hp= new homePageAmazon(driver);
		hp.signIN();
		loginPageAmazon lp= new loginPageAmazon(driver);
		lp.username("amazon", 6, 1);
		lp.pwd("amazon", 7, 2);
		String act_title= driver.getTitle();
		
		Assert.assertEquals(act_title, "Amazon Sign In", "The Title didn't matched");
	}
}