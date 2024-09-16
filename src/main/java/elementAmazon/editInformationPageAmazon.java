package elementAmazon;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.username_pass_ddt;

public class editInformationPageAmazon extends username_pass_ddt {
	WebDriver driver;
	public username_pass_ddt ddt= new username_pass_ddt();
	
	public editInformationPageAmazon(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "ap_customer_name")
	WebElement new_name;
	
	@FindBy(xpath = "//span[@class='a-button-text']")
	WebElement submit;
	
	public void name(String sheetname, int row, int cell) throws Throwable, Throwable {
		new_name.clear();
		ddt.getDataFromExcelSheet1(sheetname, row, cell);
//		String full_name= ddt.getDataFromExcelSheet(sheetname, row, cell);
		new_name.sendKeys(pass_string,Keys.ENTER);
	}
	public void save_changes() {
		submit.click();
	}
}