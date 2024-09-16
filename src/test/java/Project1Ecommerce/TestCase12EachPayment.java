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
public class TestCase12EachPayment extends Launch_Quit {
	
	@Test(retryAnalyzer = utility.retryanalyzer.class)
	public void select_each_payment() throws Throwable {
		
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
		cop.creditDebitRadioButton().click();
		boolean act_ans= cop.creditDebitRadioButton().isSelected();
		
		if(cop.creditDebitRadioButton().isSelected()) {
			Assert.assertEquals(act_ans, true);
			cop.netBankingRadioButton().click();
			boolean act_ans1= cop.netBankingRadioButton().isSelected();
			if(cop.netBankingRadioButton().isSelected()) {
				Assert.assertEquals(act_ans1, true);
				cop.otherUpiOptionRadioButton().click();
				boolean act_ans2= cop.otherUpiOptionRadioButton().isSelected();
				if(cop.otherUpiOptionRadioButton().isSelected()) {
					Assert.assertEquals(act_ans2, true);
					cop.cashOnDeliveryRadioButton().click();
					boolean act_ans3= cop.cashOnDeliveryRadioButton().isSelected();
					if(cop.cashOnDeliveryRadioButton().isSelected()) {
						Assert.assertEquals(act_ans3, true);
					}
				}
			}
		}
	}
}