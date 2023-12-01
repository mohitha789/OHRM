package pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

WebDriver driver;
	
	public Homepage(WebDriver driverhere) {
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a/span")
	WebElement Myinfo;
	
	public Personaldetails myinfoclick() throws InterruptedException {
		Thread.sleep(3000);
		Myinfo.click();
		Personaldetails pd = new Personaldetails(driver);
		return pd;
	}
}
