package pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Quitbrowser {

WebDriver driver;
	
	public Quitbrowser(WebDriver driverhere) {
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
		
	}
	
	public  void Quitbrowser() {
		
		driver.close();
	}
}
