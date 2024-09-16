package elementAmazon;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkOutPageAmazon {
	public static WebDriver driver;
	
	public checkOutPageAmazon(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[@id='orderSummaryPrimaryActionBtn']/span/input") 
	WebElement use_this_address;
	
	@FindBy(id = "addressChangeLinkId") 
	WebElement address_change_button;
	
	@FindBy(id = "payChangeButtonId") 
	WebElement payment_change_button;
	
	@FindBy(xpath = "(//input[@name='ppw-instrumentRowSelection'])[1]") 
	WebElement credit_debit;
	@FindBy(xpath = "(//input[@name='ppw-instrumentRowSelection'])[2]") 
	WebElement net_banking;
	@FindBy(xpath = "(//input[@name='ppw-instrumentRowSelection'])[3]") 
	WebElement other_upi_apps;
	@FindBy(xpath = "(//input[@name='ppw-instrumentRowSelection'])[5]") 
	WebElement cash_on_delivery;
	
	@FindBy(linkText = "Enter card details") 
	WebElement card_details_button;
	
	@FindBy(name = "ApxSecureIframe") 
	WebElement card_details_frame;
	
	@FindBy(name = "addCreditCardNumber") 
	WebElement card_number_tf;
	
	@FindBy(name = "ppw-accountHolderName") 
	WebElement holder_name_tf;
	
	@FindBy(xpath = "//option[.='01']")
	WebElement exp_date;
	
	@FindBy(xpath = "//option[.='2025']")
	WebElement exp_year;
	
	@FindBy(name = "ppw-widgetEvent:AddCreditCardEvent")
	WebElement enter_card_details_button;
	
	@FindBy(name = "apx-secure-field-addCreditCardVerificationNumber")
	WebElement cvv_frame;
	
	@FindBy(xpath = "//input[@class='card-cvv']")
	WebElement cvv_number;
		
	@FindBy(xpath = "//span[@data-action='a-tooltip-button-blocker']/span/span/span/input")
	WebElement use_this_payment_method;
	
	@FindBy(xpath = "//div[@class='prime-updp-container']/div/div/span//span/a")
	WebElement amazon_prime_cancel;
	
	@FindBy(xpath = "//div[@class='checkout-chewbacca-contract-promise-content display-inline-block']/span/span/span")
	WebElement review_item_delivery;
	
	@FindBy(xpath = "//input[@name='ppw-claimCode']")
	WebElement couponcode_tf;
	
	public void useThisAddress() {
		use_this_address.click();
	}
	public void creditDebitCardRadioButton() {
		credit_debit.click();
	}
	public void CardDetailsButton() {
		card_details_button.click();
	}
	public void switch_frame(WebDriver driver) {
		driver.switchTo().frame(card_details_frame);
	}
	public void switch_frame_back(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	public void cardNumbertf() {
		card_number_tf.sendKeys("4592000255469641",Keys.TAB);
	}
	public void cardHolderNametf() {
		holder_name_tf.sendKeys("Surya Kamal Mandal",Keys.TAB);
	}
	public void expDate() {
		exp_date.click();
	}
	public void expYear() {
		exp_year.click();
	}
	public void enterCardDetailsButton() {
		enter_card_details_button.click();
	}
	public void cvvNumber(WebDriver driver) {
		driver.switchTo().frame(cvv_frame);
		cvv_number.sendKeys("601");
	}
	public void usePaymentMethod() {
		use_this_payment_method.click();
	}
	public void primeCancel() {
		amazon_prime_cancel.click();
	}
	public void codRadioButton() {
		cash_on_delivery.click();
	}
	
	
	public WebElement addressChangeButton() {
		return address_change_button;
	}
	public WebElement PaymentChangeButton() {
		return payment_change_button;
	}
	public WebElement creditDebitRadioButton() {
		return credit_debit;
	}
	public WebElement netBankingRadioButton() {
		return net_banking;
	}
	public WebElement otherUpiOptionRadioButton() {
		return other_upi_apps;
	}
	public WebElement cashOnDeliveryRadioButton() {
		return cash_on_delivery;
	}
	public WebElement reviewItemsDelivery() {
		return review_item_delivery;
	}
	public WebElement couponCode() {
		return couponcode_tf;
	}
	public void couponCodetf(String Code) {
		couponcode_tf.sendKeys(Code, Keys.ENTER);
	}
}