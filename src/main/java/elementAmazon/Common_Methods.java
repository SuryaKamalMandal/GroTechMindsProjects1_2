package elementAmazon;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Common_Methods {
	public static WebDriver driver;
	
	public Common_Methods(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "nav-link-accountList-nav-line-1")
	WebElement display_name;
	
	public void name_is_displayed(String actual_name, String expName) {
	
		Assert.assertEquals(actual_name, expName,"Sorry, It Didn't Matched");		
	}
	
	public String gettext(String expName) {
		String actual_name= display_name.getText();
		name_is_displayed(actual_name, expName);
		return actual_name;
	}
	
	public String page_title(WebDriver driver, String expName) {
		
		String title= driver.getTitle();
		name_is_displayed(title, expName);
		return title;
	}
}