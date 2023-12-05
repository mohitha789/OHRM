package pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class Contactdetailspage extends AbstractMethods{


	WebDriver driver;
	
	public Contactdetailspage(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
		
	}

	
	@FindBy(xpath = "//ul//span[text()='My Info']")
	WebElement Myinfo;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement street1;

	@FindBy(xpath = "//a[@class='orangehrm-tabs-item --active']")
	WebElement contactdetails;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
	WebElement street2;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[4]")
	WebElement city;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[5]")
	WebElement state;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[6]")
	WebElement pincode;
	
	@FindBy(xpath = "//div[@class='oxd-select-text-input']")
	WebElement country;
	
	@FindBy(xpath = "//*[text()= 'India']")
	WebElement Countryselect;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[7]")
	WebElement Home;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[8]")
	WebElement Mobile;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[10]")
	WebElement Email;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement save;
	
	By add_Myinfo1 = By.xpath("//ul//span[text()='My Info']");
	By add_contactdetails1 = By.xpath("//a[@class='orangehrm-tabs-item --active']");
	By add_street11 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	By add_street21 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]");
	By add_city1 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]");
	By add_state1 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[5]");
	By add_pincode1 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[6]");
	By add_country1 = By.xpath("//div[@class='oxd-select-text-input']");
	By add_Countryselect1 = By.xpath("//*[text()= 'India']");
	By add_Home1 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[7]");
	By add_Mobile1 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[8]");
	By add_Email1 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[10]");
	By add_save1 = By.xpath("//button[@type='submit']");
	
	public Emergencycontacts info() throws InterruptedException {
		
		Myinfo.click();
		
		Wait_Till_Link_Is_Clickable(add_Myinfo1);
		
		contactdetails.click();
		
		Wait_Till_Link_Is_Clickable(add_contactdetails1);
		
		street1.sendKeys(Keys.CONTROL + "a");
		street1.sendKeys(Keys.DELETE);
		street1.sendKeys("oc colony");
		
		Wait_Till_Link_Is_Clickable(add_street11);
		
		street2.sendKeys(Keys.CONTROL + "a");
		street2.sendKeys(Keys.DELETE);
		street2.sendKeys("colony");
		
		Wait_Till_Link_Is_Clickable(add_street21);
		
		city.sendKeys(Keys.CONTROL + "a");
		city.sendKeys(Keys.DELETE);
		city.sendKeys("Hyderbad");
		
		Wait_Till_Link_Is_Clickable(add_city1);
		
		state.sendKeys(Keys.CONTROL + "a");
		state.sendKeys(Keys.DELETE);
		state.sendKeys("AP");
		Wait_Till_Link_Is_Clickable(add_state1);
		
		pincode.sendKeys(Keys.CONTROL + "a");
		pincode.sendKeys(Keys.DELETE);
		pincode.sendKeys("513583");
		
		Wait_Till_Link_Is_Clickable(add_pincode1);
		
		country.click();
		Countryselect.click();
		Wait_Till_Link_Is_Clickable(add_country1);
		Wait_Till_Link_Is_Clickable(add_Countryselect1);
		
		Home.sendKeys(Keys.CONTROL + "a");
		Home.sendKeys(Keys.DELETE);
		Home.sendKeys("520469");
		
		Wait_Till_Link_Is_Clickable(add_Home1);
		
		Mobile.sendKeys(Keys.CONTROL + "a");
		Mobile.sendKeys(Keys.DELETE);
		Mobile.sendKeys("8931456789");
		
		Wait_Till_Link_Is_Clickable(add_Mobile1);
		
		Email.sendKeys(Keys.CONTROL + "a");
		Email.sendKeys(Keys.DELETE);
		Email.sendKeys("admin@example.com");
		
		Wait_Till_Link_Is_Clickable(add_Email1);
		
		save.sendKeys(Keys.ENTER);
		
		Wait_Till_Link_Is_Clickable(add_save1);
		
		Emergencycontacts Ec = new Emergencycontacts(driver);
		
		return Ec;
	}
	
}
