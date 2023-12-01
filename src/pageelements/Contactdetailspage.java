package pageelements;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contactdetailspage {


	WebDriver driver;
	
	public Contactdetailspage(WebDriver driverhere) {
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
		
	}

	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a/span")
	WebElement Myinfo;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input")
	WebElement street1;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[2]/a")
	WebElement contactdetails;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/input")
	WebElement street2;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[3]/div/div[2]/input")
	WebElement city;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[4]/div/div[2]/input")
	WebElement state;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[5]/div/div[2]/input")
	WebElement pincode;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[6]/div/div[2]/div/div/div[2]/i")
	WebElement country;
	
	@FindBy(xpath = "//*[text()= 'India']")
	WebElement Countryselect;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[1]/div/div[2]/input")
	WebElement Home;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[2]/div/div[2]/input")
	WebElement Mobile;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div/div[1]/div/div[2]/input")
	WebElement Email;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button")
	WebElement save;
	
	public Emergencycontacts info() throws InterruptedException {
		
		Myinfo.click();
		
		Thread.sleep(2000);
		
		contactdetails.click();
		
		Thread.sleep(2000);
		
		street1.sendKeys(Keys.CONTROL + "a");
		street1.sendKeys(Keys.DELETE);
		street1.sendKeys("oc colony");
		
		Thread.sleep(2000);
		
		street2.sendKeys(Keys.CONTROL + "a");
		street2.sendKeys(Keys.DELETE);
		street2.sendKeys("colony");
		
		Thread.sleep(2000);
		
		city.sendKeys(Keys.CONTROL + "a");
		city.sendKeys(Keys.DELETE);
		city.sendKeys("Hyderbad");
		
		Thread.sleep(2000);
		
		state.sendKeys(Keys.CONTROL + "a");
		state.sendKeys(Keys.DELETE);
		state.sendKeys("AP");
		
		Thread.sleep(2000);
		
		pincode.sendKeys(Keys.CONTROL + "a");
		pincode.sendKeys(Keys.DELETE);
		pincode.sendKeys("513583");
		
		Thread.sleep(2000);
		
		country.click();
		Countryselect.click();
		
		Thread.sleep(2000);
		
		Home.sendKeys(Keys.CONTROL + "a");
		Home.sendKeys(Keys.DELETE);
		Home.sendKeys("520469");
		
		Thread.sleep(2000);
		
		Mobile.sendKeys(Keys.CONTROL + "a");
		Mobile.sendKeys(Keys.DELETE);
		Mobile.sendKeys("8931456789");
		
		Thread.sleep(2000);
		
		Email.sendKeys(Keys.CONTROL + "a");
		Email.sendKeys(Keys.DELETE);
		Email.sendKeys("admin@example.com");
		
		Thread.sleep(2000);
		
		save.sendKeys(Keys.ENTER);
		
		Emergencycontacts Ec = new Emergencycontacts(driver);
		
		return Ec;
	}
	
}
