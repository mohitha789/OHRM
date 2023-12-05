package pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class Emergencycontacts extends AbstractMethods{

WebDriver driver;
	
	public Emergencycontacts(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath = "//ul//span[text()='My Info']")
	WebElement Myinfo;
	
	@FindBy(xpath = "//a[@class='orangehrm-tabs-item --active']")
	WebElement Emergencycontacts;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement Add;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement Name;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
	WebElement Relationship;
	
	@FindBy(xpath= "(//input[@class='oxd-input oxd-input--active'])[4]")
	WebElement Home;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[5]")
	WebElement Mobile;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement save;
	
	By add_Myinfo1 = By.xpath("//ul//span[text()='My Info']");
	By add_Emergencycontacts1 = By.xpath("//a[@class='orangehrm-tabs-item --active']");
	By add_Add1 = By.xpath("//button[@type='submit']");
	By add_Name1 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	By add_Relationship1 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]");
	By add_Home1 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]");
	By add_Mobile1 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[5]");
	
	
	public Dependencypage emergencypage() throws InterruptedException {
		implicitlywaitmethod();	
		
		Myinfo.click();
		
		Wait_Till_Link_Is_Clickable(add_Myinfo1);
		
		Emergencycontacts.click();
		
		Wait_Till_Link_Is_Clickable(add_Emergencycontacts1);
		
		Add.click();
		
		Wait_Till_Link_Is_Clickable(add_Add1);
		
		Name.sendKeys(Keys.CONTROL + "a");
		Name.sendKeys(Keys.DELETE);
		Name.sendKeys("krishna");
		
		Wait_Till_Link_Is_Clickable(add_Name1);
		
		Relationship.sendKeys(Keys.CONTROL + "a");
		Relationship.sendKeys(Keys.DELETE);
		Relationship.sendKeys("child"); 
		
		Wait_Till_Link_Is_Clickable(add_Relationship1);
		
		Home.sendKeys(Keys.CONTROL + "a");
		Home.sendKeys(Keys.DELETE);
		Home.sendKeys("456325");
		
		Wait_Till_Link_Is_Clickable(add_Home1);
		
		Mobile.sendKeys(Keys.CONTROL + "a");
		Mobile.sendKeys(Keys.DELETE);
		Mobile.sendKeys("8931456789");
		
		Wait_Till_Link_Is_Clickable(add_Mobile1);
		
		save.sendKeys(Keys.ENTER);
		
		Dependencypage Dp = new Dependencypage(driver);
		
		return Dp;
	}
	
}
