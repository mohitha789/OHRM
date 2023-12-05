package pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class Homepage extends AbstractMethods{

WebDriver driver;
	
	public Homepage(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//ul//span[text()='My Info']")
	WebElement Myinfo;
	
	public Personaldetails myinfoclick() throws InterruptedException {
		implicitlywaitmethod();	
		Myinfo.click();
		Personaldetails pd = new Personaldetails(driver);
		return pd;
	}
}
