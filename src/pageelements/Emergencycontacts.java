package pageelements;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Emergencycontacts {

WebDriver driver;
	
	public Emergencycontacts(WebDriver driverhere) {
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a/span")
	WebElement Myinfo;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[3]/a")
	WebElement Emergencycontacts;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/button")
	WebElement Add;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input")
	WebElement Name;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/input")
	WebElement Relationship;
	
	@FindBy(xpath= "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[1]/div/div[2]/input")
	WebElement Home;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[2]/div/div[2]/input")
	WebElement Mobile;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/button[2]")
	WebElement save;
	
	public Dependencypage Emergencypage() throws InterruptedException {
		
		Myinfo.click();
		
		Thread.sleep(2000);
		
		Emergencycontacts.click();
		
		Thread.sleep(2000);
		
		Add.click();
		
		Thread.sleep(2000);
		
		Name.sendKeys(Keys.CONTROL + "a");
		Name.sendKeys(Keys.DELETE);
		Name.sendKeys("krishna");
		
		Thread.sleep(2000);
		
		Relationship.sendKeys(Keys.CONTROL + "a");
		Relationship.sendKeys(Keys.DELETE);
		Relationship.sendKeys("child"); 
		
		Thread.sleep(2000);
		
		Home.sendKeys(Keys.CONTROL + "a");
		Home.sendKeys(Keys.DELETE);
		Home.sendKeys("456325");
		
		Thread.sleep(2000);
		
		Mobile.sendKeys(Keys.CONTROL + "a");
		Mobile.sendKeys(Keys.DELETE);
		Mobile.sendKeys("8931456789");
		
		Thread.sleep(2000);
		
		save.sendKeys(Keys.ENTER);
		
		Dependencypage Dp = new Dependencypage(driver);
		
		return Dp;
	}
	
}
