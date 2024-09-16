package elementAirLine;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flightResultPageAirline {

	public static WebDriver driver;
	public flightResultPageAirline(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//button[.='Book'])[6]")
	WebElement book_button;
		
	public void bookButton() {
		book_button.click();
	}

}
