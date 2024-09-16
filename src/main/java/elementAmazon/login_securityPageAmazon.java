package elementAmazon;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_securityPageAmazon {
	
	WebDriver driver;
	
	public login_securityPageAmazon(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Edit")
	WebElement edit_name;
	
	@FindBy(xpath = "((//span[@class='a-list-item'])[3]/div//span)[1]")
	WebElement act_name;
	
	public void editName() {
		edit_name.click();
	}
	
	public WebElement name() {
		return act_name;
	}
}