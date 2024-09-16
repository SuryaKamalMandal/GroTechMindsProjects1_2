package elementAmazon;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class yourAccountPageAmazon {
	WebDriver driver;
	
	public yourAccountPageAmazon(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[.='Edit login, name, and mobile number']")
	WebElement login_security;
	
	public void edit_profile() {
		login_security.click();
	}
}