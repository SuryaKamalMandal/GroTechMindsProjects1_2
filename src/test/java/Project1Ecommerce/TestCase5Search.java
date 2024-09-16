package Project1Ecommerce;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import elementAmazon.homePageAmazon;
import elementAmazon.productResultPageAmazon;
@Listeners(utility.TestNG_ITestListener.class)
public class TestCase5Search extends Launch_Quit{
	
	@Test(retryAnalyzer = utility.retryanalyzer.class)
	public void amazon_search() {
		
		homePageAmazon hp= new homePageAmazon(driver);
		hp.searchField("Shoes");
		productResultPageAmazon pr= new productResultPageAmazon(driver);
		
		boolean sortby= pr.sortby().isDisplayed();
		Assert.assertEquals(sortby, true, "Sort by dropdown is Displaying");
	}
}