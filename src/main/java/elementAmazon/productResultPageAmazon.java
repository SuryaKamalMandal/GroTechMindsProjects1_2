package elementAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class productResultPageAmazon {
	public static WebDriver driver;
	public productResultPageAmazon(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "((//span[@class='rush-component'])/a/div)[1]")
	WebElement product_item;
	
	@FindBy(xpath = "//span[.='Sort by:']")
	WebElement sort_by;
	
	@FindBy(className = "a-dropdown-prompt")
	WebElement sort_by_displayed;
	
	@FindBy(xpath = "(//ul[@id='filter-n']/span/span/li)[4]")
	WebElement category;
	
	@FindBy(linkText = "Featured")
	WebElement sort_by_dowpdown;
	
	@FindBy(xpath = "//div[@id='reviewsRefinements']/ul/span/span/li/span/a/section/i")
	WebElement rating;
	
	@FindBy(xpath = "//span[.='Clear']")
	WebElement clear_button;
	
	@FindBy(xpath = "//span[@class='a-dropdown-container']/select")
	WebElement sort_dowpdown;
	
	public void item() {
		product_item.click();
	}
	public void category_result() {
		category.click();
	}
	public void sortByName(String sortbyName) {
		//sort_by.click();
		Select s= new Select(sort_dowpdown);
		s.selectByVisibleText(sortbyName);
	}
	public void ratings() {
		rating.click();
	}
	public void dropdownSelect() {
		Select s= new Select(sort_dowpdown);
		s.selectByVisibleText("Price: Low to High");
	}
	
	
	public WebElement sortby() {
		return sort_by;
	}
	public WebElement clearButton() {
		return clear_button;
	}
	public WebElement sortTextisDisplayed() {
		return sort_by_displayed;
	}
}