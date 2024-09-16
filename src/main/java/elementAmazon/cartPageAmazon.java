package elementAmazon;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartPageAmazon {
	
	public static WebDriver driver;
	
	public cartPageAmazon(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "//span[@id='sc-subtotal-amount-activecart']/span/span")
	WebElement sub_total_price;
	
	@FindBy(xpath= "//span[@id='sc-subtotal-amount-activecart']/span")
	WebElement subtotalprice;

	@FindBy(xpath= "(//form[@id='activeCartViewForm']/div)[3]/span")
	WebElement total_items_added;
	
	@FindBy(className = "a-dropdown-container")
	WebElement quantity_box;
	
	@FindBy(id = "quantity_2")
	WebElement quantities;
	
	@FindBy(xpath = "//input[@value='Delete']")
	WebElement delete_option;
	
	@FindBy(xpath = "(((//span[@class='a-list-item'])[9]/a/span)[1]/span/span)[2]")
	WebElement product_title;
	
	

	public void quantity() {
		quantity_box.click();
	}
	public void selectQuantities() {
		quantities.click();
	}
	public void deleteItems() {
		delete_option.click();
	}
	
	
	public WebElement totalprice() {
		return sub_total_price;
	}
	public WebElement pricetotal() {
		return subtotalprice;
	}
	public WebElement total_quantity() {
		return total_items_added;
	}
	public WebElement productTitle() {
		return product_title;
	}
}