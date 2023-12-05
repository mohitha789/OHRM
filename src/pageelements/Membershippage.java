package pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class Membershippage extends AbstractMethods{

WebDriver driver;
	
	public Membershippage(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath = "//a[@class='orangehrm-tabs-item --active']")
	WebElement Membership;
	
	@FindBy(xpath = "(//button[@type='button'])[3]")
	WebElement Add;
	
	@FindBy(xpath = "(//div[@class='oxd-select-text-input'])[1]")
	WebElement Membershipdropdown;
	
	@FindBy(xpath = "//*[text()= 'CIMA']")
	WebElement Membershipselect;
	
	@FindBy(xpath = "(//div[@class='oxd-select-text-input'])[2]")
	WebElement SubscriptionPaidBydropdown;
	
	@FindBy(xpath = "//*[text()= 'Company']")
	WebElement SubscriptionPaidselect;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement SubscriptionAmount;
	
	@FindBy(xpath = "(//div[@class='oxd-select-text-input'])[3]")
	WebElement Currencydropdown;
	
	@FindBy(xpath = "//*[text()= 'Indian Rupee']")
	WebElement Currencyselect;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
	WebElement SubscriptionCommenceDate;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[4]")
	WebElement SubscriptionRenewalDate;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement save;
	
	By add_Membership1 = By.xpath("//a[@class='orangehrm-tabs-item --active']");
	By add_Add1 = By.xpath("(//button[@type='button'])[3]");
	By add_Membershipdropdown1 = By.xpath("(//div[@class='oxd-select-text-input'])[1]");
	By add_Membershipselect1 = By.xpath("//*[text()= 'CIMA']");
	By add_SubscriptionPaidBydropdown1 = By.xpath("(//div[@class='oxd-select-text-input'])[2]");
	By add_SubscriptionPaidselect1 = By.xpath("//*[text()= 'Company']");
	By add_SubscriptionAmount1 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	By add_Currencydropdown1 = By.xpath("(//div[@class='oxd-select-text-input'])[3]");
	By add_Currencyselect1 = By.xpath("//*[text()= 'Indian Rupee']");
	By add_SubscriptionCommenceDate1 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]");
	By add_SubscriptionRenewalDate1 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]");
	
	public Quitbrowser membership() throws InterruptedException { 
		implicitlywaitmethod();	
		
		WebElement E1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[8]/a"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView();", E1);
	    
		Membership.click();
		Wait_Till_Link_Is_Clickable(add_Membership1);
		
		Add.click();
		Wait_Till_Link_Is_Clickable(add_Add1);
		
		Membershipdropdown.click();
		Membershipselect.click();
		Wait_Till_Link_Is_Clickable(add_Membershipdropdown1);
		Wait_Till_Link_Is_Clickable(add_Membershipselect1);
		
		
		SubscriptionPaidBydropdown.click();
		SubscriptionPaidselect.click();
		Wait_Till_Link_Is_Clickable(add_SubscriptionPaidBydropdown1);
		Wait_Till_Link_Is_Clickable(add_SubscriptionPaidselect1);
		
		SubscriptionAmount.sendKeys(Keys.CONTROL + "a");
		SubscriptionAmount.sendKeys(Keys.DELETE);
		SubscriptionAmount.sendKeys("10000");
		Wait_Till_Link_Is_Clickable(add_SubscriptionAmount1);
		
		Currencydropdown.click();
		Currencyselect.click();
		Wait_Till_Link_Is_Clickable(add_Currencydropdown1);
		Wait_Till_Link_Is_Clickable(add_Currencyselect1);
		
		SubscriptionCommenceDate.sendKeys(Keys.CONTROL + "a");
		SubscriptionCommenceDate.sendKeys(Keys.DELETE);
		SubscriptionCommenceDate.sendKeys("2023-11-30");
		
		Wait_Till_Link_Is_Clickable(add_SubscriptionCommenceDate1);
		
		SubscriptionRenewalDate.sendKeys(Keys.CONTROL + "a");
		SubscriptionRenewalDate.sendKeys(Keys.DELETE);
		SubscriptionRenewalDate.sendKeys("2024-11-29");
		
		Wait_Till_Link_Is_Clickable(add_SubscriptionRenewalDate1);
		
		save.sendKeys(Keys.ENTER);
		
		Quitbrowser Qs = new Quitbrowser(driver);
		
		return Qs;
		
	}
	}

