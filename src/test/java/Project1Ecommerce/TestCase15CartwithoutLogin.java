package Project1Ecommerce;
import java.util.Iterator;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import elementAmazon.cartPageAmazon;
import elementAmazon.homePageAmazon;
import elementAmazon.productDetailsPageAmazon;
import elementAmazon.productResultPageAmazon;
@Listeners(utility.TestNG_ITestListener.class)
public class TestCase15CartwithoutLogin extends Launch_Quit {

	@Test(retryAnalyzer = utility.retryanalyzer.class)
	public void cartWithoutLogin() {
		
		homePageAmazon hp= new homePageAmazon(driver);
		hp.searchField("Shoes");
		productResultPageAmazon pr= new productResultPageAmazon(driver);
		pr.item();
		
		Set<String> allid= driver.getWindowHandles();
		Iterator<String> ids= allid.iterator();
		String parentid= ids.next();
		String childid= ids.next();
		driver.switchTo().window(childid);
		
		productDetailsPageAmazon pd= new productDetailsPageAmazon(driver);
		pd.add_to_cart();
		pd.gotoCart();
		
		cartPageAmazon cp= new cartPageAmazon(driver);
		boolean ptitle= cp.productTitle().getText().contains("Shoes");
		Assert.assertEquals(ptitle, true, "Product Title is not Matching");
	}
}