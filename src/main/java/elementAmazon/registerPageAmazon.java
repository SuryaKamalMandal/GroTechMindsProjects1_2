package elementAmazon;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.username_pass_ddt;

public class registerPageAmazon extends username_pass_ddt {
	WebDriver driver;
	public username_pass_ddt ddt= new username_pass_ddt();
	public registerPageAmazon(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name= "email")
	WebElement username_tf;
	
	@FindBy(id = "ap_phone_number")
	WebElement mob_no;
	
	@FindBy(id = "ap_customer_name")
	WebElement full_name;
	
	@FindBy(id = "ap_password")
	WebElement pass;
	
	@FindBy(id = "auth-continue")
	WebElement verify_mob;
	
	@FindBy(className = "a-button-input")
	WebElement proceed;
	
	public void username(String sheetname,int row,int cell) throws Throwable {
		username_tf.sendKeys(pass_string,Keys.ENTER);
	}
	public void process() {
		proceed.click();
	}
	public void register_user(String sheetname,int row,int cell) throws Throwable {
		ddt.getDataFromExcelSheet1(sheetname, row, cell);
		full_name.sendKeys(pass_string);
	}
	public void register_user1(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
		ddt.getDataFromExcelSheet1(sheetname, row, cell);
		mob_no.sendKeys(un_num);
	}
	public void register_user2(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
		ddt.getDataFromExcelSheet1(sheetname, row, cell);
		pass.sendKeys(pass_string);
	}
	public void verify() {
		verify_mob.click();
	}
}