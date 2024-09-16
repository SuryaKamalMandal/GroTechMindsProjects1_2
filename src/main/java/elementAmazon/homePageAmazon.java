package elementAmazon;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class homePageAmazon {
	public static WebDriver driver;
	
	public homePageAmazon(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "//span[.='Hello, sign in']")
	WebElement signin;
	
	@FindBy(id= "twotabsearchtextbox")
	WebElement search_tf;
	
	@FindBy(xpath= "//select[@id='searchDropdownBox']")
	WebElement category_dropdown;
	
	@FindBy(id= "nav-link-accountList")
	WebElement account;
	
	@FindBy(linkText = "Start here.")
	WebElement register_button;
	
	@FindBy(xpath= "//span[.='Your Account']")
	WebElement your_account;
	
	@FindBy(xpath= "//a[@id='nav-cart']")
	WebElement cart_view;
	
	@FindBy(id= "nav-orders")
	WebElement orders;
	
	@FindBy(id = "nav-link-accountList-nav-line-1")
	WebElement display_name;
	
	public void signIN() {
		signin.click();
	}
	
	public void searchField(String productName) {
		search_tf.sendKeys(productName,Keys.ENTER);
	}
	
	public void account_list(WebDriver driver) {
		
		Actions a= new Actions(driver);
		a.moveToElement(account).perform();
	}
	
	public void register() {
		register_button.click();
	}
	
	public void account_page() {
		your_account.click();
	}
	
	public void cartOption() {
		cart_view.click();
	}
	
	public void order_click() {
		orders.click();
	}
	
	public void categorySelect(String categoryName) {
		
		Select s=new Select(category_dropdown);
		s.selectByVisibleText(categoryName);
	}
	
	public WebElement gettext() {
		return display_name;
	}
}