package pageelements;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Immigrationpage {


WebDriver driver;
	
	public Immigrationpage(WebDriver driverhere) {
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[5]/a")
	WebElement Immigration;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/button")
	WebElement Add;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[1]/div/div[2]/input")
	WebElement Number;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[2]/div/div[2]/div/div/input")
	WebElement Issueddate;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[3]/div/div[2]/div/div/input")
	WebElement Expirydate;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[4]/div/div[2]/input")
	WebElement Eligiblestatus;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[5]/div/div[2]/div/div/div[2]/i")
	WebElement Issuedby;
	
	@FindBy(xpath = "//*[text()= 'India']")
	WebElement Issued;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[6]/div/div[2]/div/div/input")
	WebElement EligibleReviewDate;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/button[2]")
	WebElement save;
	
	public Qualificationspage Immigrationpage() throws InterruptedException {
		
		Immigration.click();
		
		Thread.sleep(2000);
		
		Add.click();
		
		Thread.sleep(2000);
		
		Number.sendKeys(Keys.CONTROL + "a");
		Number.sendKeys(Keys.DELETE);
		Number.sendKeys("edctp456");
		
		Thread.sleep(2000);
		  
		
		Issueddate.sendKeys(Keys.CONTROL + "a"); 
		Issueddate.sendKeys(Keys.DELETE);
		Issueddate.sendKeys("2023-10-20");
		
		Thread.sleep(2000);
		  
		Expirydate.sendKeys(Keys.CONTROL + "a"); 
		Expirydate.sendKeys(Keys.DELETE);
		Expirydate.sendKeys("2030-12-28");
		
		Thread.sleep(2000);
		
		Eligiblestatus.sendKeys(Keys.CONTROL + "a");
		Eligiblestatus.sendKeys(Keys.DELETE);
		Eligiblestatus.sendKeys("Yes");
		
		Thread.sleep(2000);
		
		Issuedby.click();
		Issued.click();
		
		Thread.sleep(2000);
		
		EligibleReviewDate.sendKeys(Keys.CONTROL + "a");
		EligibleReviewDate.sendKeys(Keys.DELETE);
		EligibleReviewDate.sendKeys("2023-12-28");
		
		Thread.sleep(2000);
		
		save.sendKeys(Keys.ENTER);
		
		Qualificationspage Qp = new Qualificationspage(driver);
		
		return Qp;
	}

}
