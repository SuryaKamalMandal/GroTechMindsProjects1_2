package Project1Ecommerce;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import elementAmazon.homePageAmazon;
@Listeners(utility.TestNG_ITestListener.class)
public class TestCase6SearchFilter extends Launch_Quit{

	@Test(retryAnalyzer = utility.retryanalyzer.class)
	public void search_filter() {
		
		homePageAmazon hp= new homePageAmazon(driver);
		hp.categorySelect("Books");
		hp.searchField("Books");
		String act_title= driver.getTitle();
		
		Assert.assertEquals(act_title, "Amazon.in : Books");
	}
}