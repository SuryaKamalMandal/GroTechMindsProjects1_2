package elementAirLine;
import java.io.IOException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.username_pass_ddt;

public class loginPageAirline extends username_pass_ddt {
	public username_pass_ddt upddt= new username_pass_ddt();
	public static WebDriver driver;
	public loginPageAirline(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name= "email")
	WebElement username_tf;
	
	@FindBy(id= "ap_password")
	WebElement password_tf;
	
	@FindBy(className = "a-list-item")
	WebElement error_msg;
	
	public void username(String sheetname,int row,int cell) throws Throwable {
		//String un= upddt.getDataFromExcelSheet(sheetname, row, cell);
//		String un= upddt.getDataFromExcelSheetphnno(sheetname, row, cell);
		upddt.getDataFromExcelSheet1(sheetname, row, cell);
		username_tf.sendKeys(un_num,Keys.ENTER);
	}
	public void pwd(String sheetname,int row,int cell) throws Throwable, IOException {
//		String pass= upddt.getDataFromExcelSheet(sheetname, row, cell);
		upddt.getDataFromExcelSheet1(sheetname, row, cell);
		password_tf.sendKeys(pass_string,Keys.ENTER);
	}
	
	public WebElement errorMsg() {
		return error_msg;
	}
}