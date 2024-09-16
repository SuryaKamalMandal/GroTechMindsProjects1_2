package Project1Ecommerce;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import elementAmazon.homePageAmazon;
import elementAmazon.registerPageAmazon;
@Listeners(utility.TestNG_ITestListener.class)
public class TestCase1Register extends Launch_Quit{

	@Test
	public void register_amazon() throws Throwable {
		
		homePageAmazon hp= new homePageAmazon(driver);
		hp.account_list(driver);
		hp.register();
		registerPageAmazon rp= new registerPageAmazon(driver);
//		rp.username();
//		rp.process();
		rp.register_user("amazon", 4, 1);
		rp.register_user1("amazon", 3, 1);
		rp.register_user2("amazon", 2, 2);
		rp.verify();
	}
}