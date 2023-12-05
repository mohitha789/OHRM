package pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class Dependencypage extends AbstractMethods{

WebDriver driver;
	
	public Dependencypage(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//a[@class='orangehrm-tabs-item --active']")
	WebElement Dependents;
	
	@FindBy(xpath = "(//button[@type='button'])[3]")
	WebElement Add;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement Name;
	
	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])")
	WebElement Relationship;
	
	@FindBy(xpath = "//*[text()= 'Child']")
	WebElement Relationselect;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[4]")
	WebElement Dateofbirth;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement save;
	
	By add_Dependents1 = By.xpath("(//div[@class='oxd-file-button'])[2]");
	By add_Add1 = By.xpath("(//div[@class='oxd-file-button'])[1]");
	By add_Name1 = By.xpath("(//div[@class='oxd-file-button'])[3]");
	By add_Relationship1 = By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])");
	By add_Relationselect1 = By.xpath("//*[text()= 'Child']");
	By add_Dateofbirth1 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]");
	
	public Immigrationpage dependencypage() throws InterruptedException { 
		
		Dependents.click();
		
		Wait_Till_Link_Is_Clickable(add_Dependents1);
		
		Add.click();
		Wait_Till_Link_Is_Clickable(add_Add1);
		
		Name.sendKeys(Keys.CONTROL + "a");
		Name.sendKeys(Keys.DELETE);
		Name.sendKeys("krishna");
		
		Wait_Till_Link_Is_Clickable(add_Name1);
		
		Relationship.click();
		Relationselect.click();
		Wait_Till_Link_Is_Clickable(add_Relationship1);
		Wait_Till_Link_Is_Clickable(add_Relationselect1);
		  	
		Dateofbirth.sendKeys(Keys.CONTROL + "a"); 
		Dateofbirth.sendKeys(Keys.DELETE);
		Dateofbirth.sendKeys("1990-10-20");
		 
		Wait_Till_Link_Is_Clickable(add_Dateofbirth1);
		
		save.sendKeys(Keys.ENTER);
		
		Immigrationpage Ip = new Immigrationpage(driver);
		
		return Ip;
	}

}
