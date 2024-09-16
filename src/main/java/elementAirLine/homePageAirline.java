package elementAirLine;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePageAirline {

	public static WebDriver driver;
	public homePageAirline(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id= "nav-link-accountList")
	WebElement accountList;
	
	@FindBy(xpath = "//span[.='Sign Out']")
	WebElement signoutlink;
	
	@FindBy(xpath = "(//div[@class='dafe1197'])[1]/label/i")
	WebElement onewayradio;
	
	@FindBy(xpath = "((//div[@class='_3cb848bf'])[1]/div/span)[2]")
	WebElement from_search;
	
	@FindBy(xpath = "((//div[@class='_3cb848bf'])[2]/div/span)[2]")
	WebElement to_search;
	
	@FindBy(xpath = "((((//div[@class='_1711da50'])[2]/div)[3]/ul)[2]/li)[3]")
	WebElement from_date_search;
	@FindBy(xpath = "((((//div[@class='_1711da50'])[2]/div)[3]/ul)[2]/li)[7]")
	WebElement to_date_search;
	
	@FindBy(xpath = "(((//div[@class='_8bd51405'])[2]/ul)[2]/li)[1]")
	WebElement date_select;
	@FindBy(xpath = "//span[.='Add Return']")
	WebElement date_select1;
	
	@FindBy(xpath = "//input[@name='searchText']")
	WebElement from_search_input_tf;
	
	@FindBy(className = "b44c2cc8")
	WebElement search_button;
	
	@FindBy(xpath = "((//div[@class='_32608d65'])[1]/p)[1]")
	WebElement loc_option_section;
	@FindBy(xpath = "(//p[@class='c9d6cfb6'])[1]")
	WebElement loc_option_section1;
	
	@FindBy(xpath = "(//div[@class='dafe1197'])[1]/label/i")
	WebElement one_way_radiobutton;
	
	@FindBy(xpath = "(//div[@class='dafe1197'])[1]/label/i")
	WebElement economy_radiobutton;
	@FindBy(xpath = "(//div[@class='dafe1197'])[2]/label/i")
	WebElement premiumeconomy_radiobutton;
	@FindBy(xpath = "(//div[@class='dafe1197'])[3]/label/i")
	WebElement businessclass_radiobutton;
	
	@FindBy(xpath = "((//div[@class='_75c05602'])[5]/div/div/span)[1]")
	WebElement passenger_option;
	
	@FindBy(xpath = "(//button[.='5'])[1]")
	WebElement adults_option;
	
	@FindBy(xpath = "(//button[.='1'])[1]")
	WebElement adults_option1;
	
	@FindBy(xpath = "((//div[@id='fl_li_sm']/div/div/div)[3]/div/div/span)[2]")
	WebElement classestextname;
	
	public void account_list(WebDriver driver) {
		
		Actions a= new Actions(driver);
		a.moveToElement(accountList).perform();
	}
	public void fromSearch(String fromloc) {
		from_search.click();
		from_search_input_tf.sendKeys(fromloc);
	}
	public void selectFromSearch() {
		loc_option_section.click();
	}
	public void toSearch(String toloc) {
		//to_search.click();
		from_search_input_tf.sendKeys(toloc);
	}
	public void selectFromSearch1() {
		loc_option_section1.click();
	}
	public void dateSelect() {
		from_date_search.click();
	}
	public void dateSelect1() {
		date_select1.click();
	}
	public void dateSelectDate() {
		to_date_search.click();
	}
	public void searchButton() {
		search_button.click();
	}
	public void oneWayRadioButton() {
		one_way_radiobutton.click();
	}
	
	public void economyRadioButton() {
		economy_radiobutton.click();
	}
	public WebElement economyRadioButtonSelected() {
		return economy_radiobutton;
	}
	public void premiumEconomyRadioButton() {
		premiumeconomy_radiobutton.click();
	}
	public WebElement premiumEconomyRadioButtonSelected() {
		return premiumeconomy_radiobutton;
	}
	public void businessRadioButton() {
		businessclass_radiobutton.click();
	}
	public WebElement businessRadioButtonSelected() {
		return businessclass_radiobutton;
	}
	public void passengerOptions() {
		passenger_option.click();
	}
	public void adultsChoice() {
		adults_option.click();
	}
	public void adultsChoice1() {
		adults_option1.click();
	}
	public void signOutLink() {
		signoutlink.click();
	}
	public WebElement diffClassesNames() {
		return classestextname;
	}
}