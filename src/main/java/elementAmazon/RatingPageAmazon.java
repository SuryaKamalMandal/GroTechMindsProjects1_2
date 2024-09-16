package elementAmazon;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RatingPageAmazon {
	
public static WebDriver driver;
	
	public RatingPageAmazon(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[@class='a-dropdown-prompt']")
	WebElement year_dropdown;
	
	@FindBy(xpath = "//select[@name='timeFilter']")
	WebElement year_number;
	
	@FindBy(xpath = "(//div[@class='a-popover-wrapper']/div/ul/li)[5]")
	WebElement year_num;
	
	@FindBy(xpath = "//div[@class='yohtmlc-shipment-level-connections']/span[2]/span/a")
	WebElement write_review_button;

	public void dropdownYear() {
		year_dropdown.click();
	}
	
	public void yearNumber() {
		year_num.click();
	}
	
	public void writeReviewButton() {
		write_review_button.click();
	}
	
	public void yearNumberSelect(String yearNum) {
		Select s= new Select(year_number);
		s.selectByValue(yearNum);
	}
}