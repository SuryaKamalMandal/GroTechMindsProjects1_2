package Project1Ecommerce;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import elementAmazon.homePageAmazon;
import elementAmazon.loginPageAmazon;
@Listeners(utility.TestNG_ITestListener.class)
public class TestCase2Login extends Launch_Quit{

	@Test(retryAnalyzer = utility.retryanalyzer.class)
	public void loginamazon() throws Throwable {
		
		homePageAmazon hp= new homePageAmazon(driver);
		hp.signIN();
		loginPageAmazon lp= new loginPageAmazon(driver);
		lp.username("amazon", 6, 1);
		lp.pwd("amazon", 7, 1);
		
		String act_name= hp.gettext().getText();
		Assert.assertEquals(act_name, "Hello, Amazon", "Sorry, the Name didn't match");
	}
}