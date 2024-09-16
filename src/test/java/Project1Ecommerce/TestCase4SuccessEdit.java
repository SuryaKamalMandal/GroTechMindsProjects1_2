package Project1Ecommerce;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import elementAmazon.editInformationPageAmazon;
import elementAmazon.homePageAmazon;
import elementAmazon.loginPageAmazon;
import elementAmazon.login_securityPageAmazon;
import elementAmazon.yourAccountPageAmazon;
@Listeners(utility.TestNG_ITestListener.class)
public class TestCase4SuccessEdit extends Launch_Quit{
	
	@Test(retryAnalyzer = utility.retryanalyzer.class)
	public void successEdit() throws Throwable {
	
		homePageAmazon hp= new homePageAmazon(driver);
		hp.signIN();
		loginPageAmazon lp= new loginPageAmazon(driver);
		lp.username("amazon", 6, 1);
		lp.pwd("amazon", 7, 1);
		hp.account_list(driver);
		hp.account_page();
		yourAccountPageAmazon ap= new yourAccountPageAmazon(driver);
		ap.edit_profile();
		login_securityPageAmazon ls= new login_securityPageAmazon(driver);
		ls.editName();
		editInformationPageAmazon eip= new editInformationPageAmazon(driver);
		eip.name("amazon", 4, 2);
		String act_name= ls.name().getText();
		Assert.assertEquals(act_name, "Amazon", "Account User Name is not Exact");
	}
}