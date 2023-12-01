package pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Membershippage {

WebDriver driver;
	
	public Membershippage(WebDriver driverhere) {
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[11]/a")
	WebElement Membership;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/button")
	WebElement Add;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]/i")
	WebElement Membershipdropdown;
	
	@FindBy(xpath = "//*[text()= 'CIMA']")
	WebElement Membershipselect;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/div/div/div[2]/i")
	WebElement SubscriptionPaidBydropdown;
	
	@FindBy(xpath = "//*[text()= 'Company']")
	WebElement SubscriptionPaidselect;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[3]/div/div[2]/input")
	WebElement SubscriptionAmount;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[4]/div/div[2]/div/div/div[2]/i")
	WebElement Currencydropdown;
	
	@FindBy(xpath = "//*[text()= 'Indian Rupee']")
	WebElement Currencyselect;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[5]/div/div[2]/div/div/input")
	WebElement SubscriptionCommenceDate;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[6]/div/div[2]/div/div/input")
	WebElement SubscriptionRenewalDate;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/button[2]")
	WebElement save;
	
	public Quitbrowser Quitbrowser() throws InterruptedException { 
		 
		Thread.sleep(2000);
		
		WebElement E1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[8]/a"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView();", E1);
	    
		Thread.sleep(2000);
	    
		Membership.click();
		
		Thread.sleep(2000);
		
		Add.click();
		
		Thread.sleep(2000);
		
		Membershipdropdown.click();
		Membershipselect.click();
		
		Thread.sleep(2000);
		
		SubscriptionPaidBydropdown.click();
		SubscriptionPaidselect.click();
		
		Thread.sleep(2000);
		
		SubscriptionAmount.sendKeys(Keys.CONTROL + "a");
		SubscriptionAmount.sendKeys(Keys.DELETE);
		SubscriptionAmount.sendKeys("10000");
		
		Thread.sleep(2000);
		
		Currencydropdown.click();
		Currencyselect.click();
		
		Thread.sleep(2000);
		
		SubscriptionCommenceDate.sendKeys(Keys.CONTROL + "a");
		SubscriptionCommenceDate.sendKeys(Keys.DELETE);
		SubscriptionCommenceDate.sendKeys("2023-11-30");
		
		Thread.sleep(2000);
		
		SubscriptionRenewalDate.sendKeys(Keys.CONTROL + "a");
		SubscriptionRenewalDate.sendKeys(Keys.DELETE);
		SubscriptionRenewalDate.sendKeys("2024-11-29");
		
		Thread.sleep(2000);
		
		save.sendKeys(Keys.ENTER);
		
		Quitbrowser Qs = new Quitbrowser(driver);
		
		return Qs;
		
	}
	}

