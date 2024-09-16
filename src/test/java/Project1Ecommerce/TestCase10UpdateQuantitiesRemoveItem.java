package Project1Ecommerce;
import java.util.Iterator;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import elementAmazon.cartPageAmazon;
import elementAmazon.homePageAmazon;
import elementAmazon.loginPageAmazon;
import elementAmazon.productDetailsPageAmazon;
import elementAmazon.productResultPageAmazon;
@Listeners(utility.TestNG_ITestListener.class)
public class TestCase10UpdateQuantitiesRemoveItem extends Launch_Quit {
	
	@Test(retryAnalyzer = utility.retryanalyzer.class)
	public void updateQuantityCart() throws Throwable {
		
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
		pd.add_to_cart();
		pd.gotoCart();
		
		cartPageAmazon cp= new cartPageAmazon(driver);		
		cp.quantity();
		cp.selectQuantities();
		
		driver.navigate().refresh();
		
		String quantities= cp.total_quantity().getText();
		
		boolean items= quantities.contains("items");
		Assert.assertTrue(items);
		cp.deleteItems();
	}
}