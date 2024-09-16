package elementAirLine;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.username_pass_ddt;

public class paymentPageAirline extends username_pass_ddt{
	
	public static WebDriver driver;
	public username_pass_ddt ddt= new username_pass_ddt();
	public paymentPageAirline(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//div[@class='a-radio'])[1]/label/input")
	WebElement creditdebitradiobutton;
	
	@FindBy(name = "ppw-accountHolderName")
	WebElement nicknameTf;
	
	@FindBy(name = "addCreditCardNumber")
	WebElement cardnumTf;
	
	@FindBy(xpath = "(//span[@role='button'])[1]")
	WebElement expirydate;
	
	@FindBy(xpath = "(//span[@role='button'])[2]")
	WebElement expirymonth;
	
	@FindBy(xpath = "(//div[@class='a-popover-wrapper']/div/ul/li)[1]")
	WebElement expirydate1;
	
	@FindBy(xpath = "((//div[@class='a-popover-wrapper'])[2]/div/ul/li)[1]")
	WebElement expirymonth1;
	
	@FindBy(xpath = "//input[@name='addCreditCardVerificationNumber']")
	WebElement cvvtf;
	
	@FindBy(xpath = "//span[@id='pp-6YkSHF-97']/span/input")
	WebElement entercarddetailbutton;
	
	@FindBy(xpath = "(//span[.='Pay'])[4]")
	WebElement paybutton;
	
	public void creditDebitRadioButton() {
		creditdebitradiobutton.click();
	}
	public void nickNameTf(String sheetname,int rownum,int cellnum) throws EncryptedDocumentException, IOException {
//		String nickname= ddt.getDataFromExcelSheet(sheetname, rownum, cellnum);
		ddt.getDataFromExcelSheet1(sheetname, rownum, cellnum);
		nicknameTf.clear();
		nicknameTf.sendKeys(pass_string);
	}
	public void cardNumTf(String sheetname,int rownum,int cellnum) throws EncryptedDocumentException, IOException {
//		String cardnumber= ddt.getDataFromExcelSheetphnno(sheetname, rownum, cellnum);
		ddt.getDataFromExcelSheet1(sheetname, rownum, cellnum);
		cardnumTf.sendKeys(un_num);
	}
	public void expiryDateDrop() {
		
		expirydate.click();
	}
	public void expiryMonthDrop() {
		expirymonth.click();
	}
	public void expiryDateDrop1() {
		expirydate1.click();
	}
	public void expiryMonthDrop1() {
		expirymonth1.click();
	}
	public void enterCVV(String sheetname,int rownum,int cellnum) throws EncryptedDocumentException, IOException {
//		String cvv= ddt.getDataFromExcelSheetphnno(sheetname, rownum, cellnum);
		ddt.getDataFromExcelSheet1(sheetname, rownum, cellnum);
		cvvtf.sendKeys(un_num);
	}
	public void enterCardDetailButton() {
		entercarddetailbutton.click();
	}
	public void cardNumTf1() {
		cardnumTf.sendKeys(Keys.ENTER);
	}
	public void payButton() {
		paybutton.click();
	}
}