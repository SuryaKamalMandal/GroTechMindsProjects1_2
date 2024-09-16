package elementAmazon;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productDetailsPageAmazon {
	WebDriver driver;
	
	public productDetailsPageAmazon(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id= "wishListMainButton")
	WebElement add_wishlist;
	
	@FindBy(id= "add-to-cart-button")
	WebElement cart_button;
	
	@FindBy(xpath= "(//div[@id='corePriceDisplay_desktop_feature_div']/div/span)[3]/span[2]/span[2]")
	WebElement price;
	
	@FindBy(xpath= "(//a[@id='acrCustomerReviewLink'])[1]/span")
	WebElement reviews;
	
	@FindBy(xpath= "(//div[@id='productDescription_feature_div'])[2]/h2")
	WebElement description;
	
	@FindBy(id= "NATC_SMART_WAGON_CONF_MSG_SUCCESS")
	WebElement success_msg;
	
	@FindBy(xpath= "//span[@id='sw-gtc']/span/a")
	WebElement go_to_cart;
	
	@FindBy(name = "proceedToRetailCheckout")
	WebElement proceed_to_buy;
	
	@FindBy(id = "buy-now-button")
	WebElement buy_now;
	
	public void add_to_cart() {
		cart_button.click();
	}
	public void gotoCart() {
		go_to_cart.click();
	}
	public void proceedToBuy() {
		proceed_to_buy.click();
	}
	public void buyNowButton() {
		buy_now.click();
	}
	
	
	public WebElement wishlist() {
		return add_wishlist;
	}
	public WebElement price_display() {
		return price;
	}
	public WebElement reviews_display() {
		return reviews;
	}
	public WebElement description_display() {
		return description;
	}
	public WebElement successMsg() {
		return success_msg;
	}
}