package utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageelements.Loginpage;

public class Basetest {
	
	public WebDriver driver;
	
	public WebDriver intialisebrowser() {
		
		driver = new ChromeDriver();
		return driver;
	}
	
	public Loginpage LaunchApplication() throws IOException {
		driver = intialisebrowser();
		Loginpage lp = new Loginpage(driver);
		lp.GoTo();
		return lp;
		
	}
	
}
