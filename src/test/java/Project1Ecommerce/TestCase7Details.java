package Project1Ecommerce;
import java.util.Iterator;
import java.util.Set;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import elementAmazon.homePageAmazon;
import elementAmazon.productDetailsPageAmazon;
import elementAmazon.productResultPageAmazon;
@Listeners(utility.TestNG_ITestListener.class)
public class TestCase7Details extends Launch_Quit {
	
	@Test(retryAnalyzer = utility.retryanalyzer.class)
	public void details_page() {
		
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
		boolean price_tag= pd.price_display().isDisplayed();
		boolean reviews= pd.reviews_display().isDisplayed();
//		boolean description= pd.description_display().isDisplayed();
		
		Assert.assertEquals(price_tag, true, "Product Price is Missing");
		Assert.assertEquals(reviews, true, "Reviews Rating is Missing");
//		Assert.assertEquals(description, true, "Description is Missing");
	}
}