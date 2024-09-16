package Project1Ecommerce;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import elementAmazon.homePageAmazon;
import elementAmazon.productResultPageAmazon;
@Listeners(utility.TestNG_ITestListener.class)
public class TestCase8RelevanceRating extends Launch_Quit{

	@Test(retryAnalyzer = utility.retryanalyzer.class)
	public void relevance_rating() {
		
		homePageAmazon hp= new homePageAmazon(driver);
		hp.searchField("Shoes");
		productResultPageAmazon pr= new productResultPageAmazon(driver);
		
		pr.sortByName("Featured");

		String sort_display_name= pr.sortTextisDisplayed().getText();
		Assert.assertEquals(sort_display_name, "Featured", "The Text didn't match");
		
		pr.sortByName("Price: Low to High");
		
		String sort_display_name1= pr.sortTextisDisplayed().getText();
		Assert.assertEquals(sort_display_name1, "Price: Low to High", "The Text didn't match");
		
		pr.sortByName("Avg. Customer Review");
		
		String sort_display_name2= pr.sortTextisDisplayed().getText();
		Assert.assertEquals(sort_display_name2, "Avg. Customer Review", "The Text didn't match");

	}
}