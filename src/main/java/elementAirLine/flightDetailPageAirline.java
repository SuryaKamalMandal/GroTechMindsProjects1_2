package elementAirLine;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.username_pass_ddt;

public class flightDetailPageAirline extends username_pass_ddt{

	public static WebDriver driver;
	public username_pass_ddt ddt= new username_pass_ddt();
	public flightDetailPageAirline(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Proceed to traveller details")
	WebElement proceed_to_traveller_details;
	@FindBy(xpath = "//button[.='Proceed to seat selection']")
	WebElement procees_to_seat_selection;
	@FindBy(xpath = "//button[.='Proceed to Payment']")
	WebElement proceed_to_payment;

	@FindBy(xpath = "(//div[@id='fl_tr_add']/div)[1]/span")
	WebElement add_new_adult;
	
	@FindBy(className = "edb7cb84")
	WebElement gender_drop;
	@FindBy(xpath = "//div[@class='edb7cb84']/button")
	WebElement gender_drop1;
	
	@FindBy(xpath = "//li[.='Male']")
	WebElement gender_male;
	
	@FindBy(xpath = "//input[@id='input-first_name']")
	WebElement first_name_tf;
	@FindBy(xpath = "//input[@id='input-last_name']")
	WebElement last_name_tf;
	@FindBy(xpath = "//button[.='Add adult']")
	WebElement add_button_button;
	
	@FindBy(xpath = "//div[@class='c172d511']/label/i")
	WebElement passenger_checkbox;
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement email_id;
	
	@FindBy(xpath = "(((//div[@class='_07eca528']/div/div)[2]/div)[45]/div)[6]/div")
	WebElement seat_selection;
	
	@FindBy(xpath = "//button[.='Next']")
	WebElement next_button_seat;
	
	@FindBy(xpath = "((((//div[@id='fl_or_lbl']/div)[1]/div)[1]/div/div)[1]/span)[1]")
	WebElement fromplacenamedisplay;
	@FindBy(xpath = "((((//div[@id='fl_or_lbl']/div)[1]/div)[1]/div/div)[1]/span)[3]")
	WebElement toplacenamedisplay;
	
	@FindBy(xpath = "//div[@class='_7c598c35 ']/span")
	WebElement viewbaggagepolicy;
	
	@FindBy(xpath = "(//button[.='Apply'])[1]")
	WebElement applyCouponbutton;

	@FindBy(xpath = "(//div[.='Discount Applied'])[1]")
	WebElement discountapplied;
	
	@FindBy(xpath = "//h2[.='Select Seat']")
	WebElement selectseattext;
	
	@FindBy(className = "bbcaaa85")
	WebElement flightinfo;
	@FindBy(xpath = "((//div[@class='_6dd480f7']/div)[1]/div)[2]/h3")
	WebElement flightfareprice;
	@FindBy(xpath = "(//div[@class='_6f50d214']/div)[2]")
	WebElement flightbaggage;
	@FindBy(xpath = "(//div[@class='b948a4af']/div)[2]")
	WebElement flightcancellation;
	@FindBy(xpath = "(//div[@class='tabListInner'])[2]")
	WebElement flightcancellationlink;
	
	
	@FindBy(xpath = "(//div[@class='c172d511'])[1]/label/i")
	WebElement passenger_checkboxmany1;
	@FindBy(xpath = "(//div[@class='c172d511'])[2]/label/i")
	WebElement passenger_checkboxmany2;
	@FindBy(xpath = "(//div[@class='c172d511'])[3]/label/i")
	WebElement passenger_checkboxmany3;
	@FindBy(xpath = "(//div[@class='c172d511'])[4]/label/i")
	WebElement passenger_checkboxmany4;
	@FindBy(xpath = "(//div[@class='c172d511'])[5]/label/i")
	WebElement passenger_checkboxmany5;
	
	@FindBy(xpath = "//div[@class='c172d511']/label/i")
	WebElement agreementcheckbox;
	
	@FindBy(xpath = "(//div[.='Skip seat selection'])[2]")
	WebElement skipseatselection;
	//try
	@FindBy(id = "fl_sl_selected_seat")
	WebElement seat;
	@FindBy(xpath = "(((//div[@class='_07eca528']/div/div)[2]/div)[27]/div)[5]/div")
	WebElement seatSelect;
	public void seatSelection1() {
		seat.click();
	}
	public void seatSelection2() {
		seatSelect.click();
	}
	public void passengerCheckBoxClick() {
		passenger_checkboxmany1.click();
		passenger_checkboxmany2.click();
		passenger_checkboxmany3.click();
		passenger_checkboxmany4.click();
		passenger_checkboxmany5.click();
	}
	public void proceedToTravelButton() {
		proceed_to_traveller_details.click();
	}
	public void proceesToSeatSelectionButton() {
		procees_to_seat_selection.click();
	}
	public void proceedPaymentButton() {
		proceed_to_payment.click();
	}
	
	public void addNewAdultOption() {
		add_new_adult.click();
	}
	
	public void genderDropClick() {
		gender_drop.click();
	}
	public void genderDropClick1() {
		gender_drop1.click();
	}
	public void genderDropMale() {
		gender_male.click();
	}
	public void firstNametf(String sheetname,int rownum,int cellnum) throws EncryptedDocumentException, IOException {
//		String firstname= ddt.getDataFromExcelSheet(sheetname, rownum, cellnum);
		ddt.getDataFromExcelSheet1(sheetname, rownum, cellnum);
		first_name_tf.sendKeys(pass_string);
	}
	public void lastNametf(String sheetname,int rownum,int cellnum) throws EncryptedDocumentException, IOException {
//		String lastname= ddt.getDataFromExcelSheet(sheetname, rownum, cellnum);
		ddt.getDataFromExcelSheet1(sheetname, rownum, cellnum);
		last_name_tf.sendKeys(pass_string);
	}
	public void addAdultButton() {
		add_button_button.click();
	}
	public void passengerCheckBox() {
		passenger_checkbox.click();
	}
	public void seatSelection() {
		seat_selection.click();
	}
	public void emailID(String sheetname,int rownum,int cellnum) throws EncryptedDocumentException, IOException {
//		String emailid= ddt.getDataFromExcelSheet(sheetname, rownum, cellnum);
		ddt.getDataFromExcelSheet1(sheetname, rownum, cellnum);
		email_id.sendKeys(pass_string);
	}
	public void nextButtonafterSeat() {
		next_button_seat.click();
	}
	public void viewBaggagePolicy() {
		viewbaggagepolicy.click();
	}
	public void applyCouponButton() {
		applyCouponbutton.click();
	}
	public void flightCancellationLink() {
		flightcancellationlink.click();
	}
	public void agreementCheckBox() {
		agreementcheckbox.click();
	}
	public void skipSeatSelection() {
		skipseatselection.click();
	}
	
	public WebElement discountDisplay() {
		return discountapplied;
	}
	
	public WebElement fromPlaceNameDisplay() {
		return fromplacenamedisplay;
	}
	public WebElement toPlaceNameDisplay() {
		return toplacenamedisplay;
	}
	
	public WebElement flightInfoDetails() {
		return flightinfo;
	}
	public WebElement flightFareDetails() {
		return flightfareprice;
	}
	public WebElement flightBaggageDetails() {
		return flightbaggage;
	}
	public WebElement flightCancellationDetails() {
		return flightcancellation;
	}
	public WebElement firstNameTfEnable() {
		return first_name_tf;
	}
	public WebElement lastNameTfEnable() {
		return last_name_tf;
	}
	public WebElement emailIDTfEnable() {
		return email_id;
	}
	public WebElement selectSeatText() {
		return selectseattext;
	}
}