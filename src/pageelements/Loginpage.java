package pageelements;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class Loginpage extends AbstractMethods{

	WebDriver driver;
	
	public Loginpage(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}
	
	public void GoTo() throws IOException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	@FindBy(xpath = "//*[@name='username']")
	WebElement enterusername;

	@FindBy(xpath = "//*[@name='password']")
	WebElement enterpassword;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement submitbutton;
	
	public Homepage enterlogindetails(String username, String password) throws InterruptedException {
		implicitlywaitmethod();	
		enterusername.sendKeys(username);
		enterpassword.sendKeys(password);
		submitbutton.sendKeys(Keys.ENTER);
		Homepage hp = new Homepage(driver);
		return hp;
		
	}
}
