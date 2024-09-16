package Project1Ecommerce;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import elementAmazon.checkOutPageAmazon;
import elementAmazon.homePageAmazon;
import elementAmazon.loginPageAmazon;
import elementAmazon.productDetailsPageAmazon;
import elementAmazon.productResultPageAmazon;
@Listeners(utility.TestNG_ITestListener.class)
public class TestCase13CouponCode extends Launch_Quit{

	@Test(retryAnalyzer = utility.retryanalyzer.class)
	public void couponCodeApply() throws Throwable {
		
		homePageAmazon hp= new homePageAmazon(driver);
		hp.signIN();
		loginPageAmazon lp= new loginPageAmazon(driver);
		lp.username("amazon", 6, 1);
		lp.pwd("amazon", 7, 1);
		hp.searchField("Shoes");
		productResultPageAmazon pr= new productResultPageAmazon(driver);
		pr.item();
		
		Set<String> allid= driver.getWindowHandles();
		Iterator<String> ids= allid.iterator();
		String parentid= ids.next();
		String childid= ids.next();
		driver.switchTo().window(childid);
		
		productDetailsPageAmazon pd= new productDetailsPageAmazon(driver);
		pd.buyNowButton();
		
		checkOutPageAmazon cop= new checkOutPageAmazon(driver);
		boolean coupon= cop.couponCode().isEnabled();
		Assert.assertEquals(coupon, true, "The Coupon Code text field is not Enabled");
		cop.couponCodetf("65412365");
	}
}