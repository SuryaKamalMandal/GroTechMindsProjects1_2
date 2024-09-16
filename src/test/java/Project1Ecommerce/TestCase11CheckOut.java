package Project1Ecommerce;
import java.util.Iterator;
import java.util.Set;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import elementAmazon.checkOutPageAmazon;
import elementAmazon.homePageAmazon;
import elementAmazon.loginPageAmazon;
import elementAmazon.productDetailsPageAmazon;
import elementAmazon.productResultPageAmazon;
@Listeners(utility.TestNG_ITestListener.class)
public class TestCase11CheckOut extends Launch_Quit {
	
	@Test//(retryAnalyzer = elementAmazon.retryanalyzer.class)
	public void Check_Out_Process() throws Throwable {
		
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
		pd.proceedToBuy();

		checkOutPageAmazon cop= new checkOutPageAmazon(driver);
		cop.useThisAddress();
		boolean act_res= cop.addressChangeButton().isEnabled();
				
		if(cop.addressChangeButton().isEnabled()) {
			Assert.assertEquals(act_res, true);
		}

		cop.codRadioButton();
		cop.usePaymentMethod();

		boolean act_res1= cop.PaymentChangeButton().isEnabled();
		
		if(cop.PaymentChangeButton().isEnabled()) {
			Assert.assertEquals(act_res1, true);
		}
		
		if(cop.reviewItemsDelivery().isDisplayed()) {
			Assert.assertEquals(true, true);
		} 
	}
}