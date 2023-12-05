package pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class Immigrationpage extends AbstractMethods{


WebDriver driver;
	
	public Immigrationpage(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//a[@class='orangehrm-tabs-item --active']")
	WebElement Immigration;
	
	@FindBy(xpath = "(//button[@type='button'])[3]")
	WebElement Add;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement Number;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
	WebElement Issueddate;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[4]")
	WebElement Expirydate;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[5]")
	WebElement Eligiblestatus;
	
	@FindBy(xpath = "//div[@class='oxd-select-text oxd-select-text--active']")
	WebElement Issuedby;
	
	@FindBy(xpath = "//*[text()= 'India']")
	WebElement Issued;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[6]")
	WebElement EligibleReviewDate;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement save;
	
	By add_Immigration1 = By.xpath("//a[@class='orangehrm-tabs-item --active']");
	By add_Add1 = By.xpath("(//button[@type='button'])[3]");
	By add_Number1 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	By add_Issueddate1 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]");
	By add_Expirydate1 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]");
	By add_Eligiblestatus1 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[5]");
	By add_Issuedby1 = By.xpath("//div[@class='oxd-select-text oxd-select-text--active']");
	By add_Issued1 = By.xpath("//*[text()= 'India']");
	By add_EligibleReviewDate1 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[6]");
	
	public Qualificationspage immigrationpage() throws InterruptedException {
		implicitlywaitmethod();	
		
		Immigration.click();
		
		Wait_Till_Link_Is_Clickable(add_Immigration1);
		
		Add.click();
		
		Wait_Till_Link_Is_Clickable(add_Add1);
		
		Number.sendKeys(Keys.CONTROL + "a");
		Number.sendKeys(Keys.DELETE);
		Number.sendKeys("edctp456");
		
		Wait_Till_Link_Is_Clickable(add_Number1);
		  
		Issueddate.sendKeys(Keys.CONTROL + "a"); 
		Issueddate.sendKeys(Keys.DELETE);
		Issueddate.sendKeys("2023-10-20");
		
		Wait_Till_Link_Is_Clickable(add_Issueddate1);
		  
		Expirydate.sendKeys(Keys.CONTROL + "a"); 
		Expirydate.sendKeys(Keys.DELETE);
		Expirydate.sendKeys("2030-12-28");
		
		Wait_Till_Link_Is_Clickable(add_Expirydate1);
		
		Eligiblestatus.sendKeys(Keys.CONTROL + "a");
		Eligiblestatus.sendKeys(Keys.DELETE);
		Eligiblestatus.sendKeys("Yes");
		
		Wait_Till_Link_Is_Clickable(add_Eligiblestatus1);
		
		Issuedby.click();
		Issued.click();
		Wait_Till_Link_Is_Clickable(add_Issuedby1);
		Wait_Till_Link_Is_Clickable(add_Issued1);
		
		EligibleReviewDate.sendKeys(Keys.CONTROL + "a");
		EligibleReviewDate.sendKeys(Keys.DELETE);
		EligibleReviewDate.sendKeys("2023-12-28");
		
		Wait_Till_Link_Is_Clickable(add_EligibleReviewDate1);
		
		save.sendKeys(Keys.ENTER);
		
		Qualificationspage Qp = new Qualificationspage(driver);
		
		return Qp;
	}

}
