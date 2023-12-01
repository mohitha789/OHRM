package pageelements;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dependencypage {

WebDriver driver;
	
	public Dependencypage(WebDriver driverhere) {
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[4]/a")
	WebElement Dependents;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/button")
	WebElement Add;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input")
	WebElement Name;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/div/div/div[2]/i")
	WebElement Relationship;
	
	@FindBy(xpath = "//*[text()= 'Child']")
	WebElement Relationselect;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div/div/div[2]/div/div/input")
	WebElement Dateofbirth;
	
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/button[2]")
	WebElement save;
	
	public Immigrationpage Dependencypage() throws InterruptedException { 
		
		Dependents.click();
		
		Thread.sleep(2000);
		
		Add.click();
		
		Thread.sleep(2000);
		
		Name.sendKeys(Keys.CONTROL + "a");
		Name.sendKeys(Keys.DELETE);
		Name.sendKeys("krishna");
		
		Thread.sleep(2000);
		
		Relationship.click();
		Relationselect.click();
		
		
		Thread.sleep(2000);
		  
		
		Dateofbirth.sendKeys(Keys.CONTROL + "a"); 
		Dateofbirth.sendKeys(Keys.DELETE);
		Dateofbirth.sendKeys("1990-10-20");
		 
		
		Thread.sleep(2000);
		
		save.sendKeys(Keys.ENTER);
		
		Immigrationpage Ip = new Immigrationpage(driver);
		
		return Ip;
	}

}
