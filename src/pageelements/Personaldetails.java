package pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@SuppressWarnings("unused")
public class Personaldetails {

	
		

		WebDriver driver;
		
		public Personaldetails(WebDriver driverhere) {
			this.driver = driverhere;
			PageFactory.initElements(driver, this);
			
		}
		@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input")
		WebElement firstname;
		
		@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/input")
		WebElement lastname;
		
		@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[2]/input")
		WebElement Employeeid;
		
		@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/input")
		WebElement DriversLicenseNumber;
		
		@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div/input")
		WebElement LicenseExpiryDate;
		
		@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[3]/div[1]/div/div[2]/input")
		WebElement SSNNumber;
		
		@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[3]/div[2]/div/div[2]/input")
		WebElement SINNumber;
		
		@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div/div[2]/i")
		WebElement Nationalitydropdown;
		
		@FindBy(xpath = "//*[text()= 'Indian']")
		WebElement Nationalityselect;
		
		@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div/div[2]/i")
		WebElement MaritalStatus;
		
		@FindBy(xpath = "//*[text()= 'Single']")
		WebElement Maritalselect;
		
		@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div/div/input")
		WebElement DateofBirth;
		
		@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[5]/button")
		WebElement save1;
		
		@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div/div/div[2]/div/div/div[2]/i")
		WebElement Customdropdown;
		
		@FindBy(xpath = "//*[text()= 'B+']")
		WebElement Customselect;
		
		@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[2]/button")
		WebElement save2;
		
		public Contactdetailspage personalinfo() throws InterruptedException {
			Thread.sleep(4000);
			
			firstname.sendKeys(Keys.CONTROL + "a");
			firstname.sendKeys(Keys.DELETE);
			firstname.sendKeys("Krishna");
			
			Thread.sleep(2000);
			
			lastname.sendKeys(Keys.CONTROL + "a");
			lastname.sendKeys(Keys.DELETE);
			lastname.sendKeys("A");
			
			Thread.sleep(2000);
			
			Employeeid.sendKeys(Keys.CONTROL + "a");
			Employeeid.sendKeys(Keys.DELETE);
			Employeeid.sendKeys("24");
			
			Thread.sleep(2000);
			
			DriversLicenseNumber.sendKeys(Keys.CONTROL + "a");
			DriversLicenseNumber.sendKeys(Keys.DELETE);
			DriversLicenseNumber.sendKeys("2afed");
			
			Thread.sleep(2000);
			
			LicenseExpiryDate.sendKeys(Keys.CONTROL + "a");
			LicenseExpiryDate.sendKeys(Keys.DELETE);
			LicenseExpiryDate.sendKeys("2024-12-30");
			
			Thread.sleep(2000);
			
			SSNNumber.sendKeys(Keys.CONTROL + "a");
			SSNNumber.sendKeys(Keys.DELETE);
			SSNNumber.sendKeys("2345");
			
			Thread.sleep(2000);
			
			SINNumber.sendKeys(Keys.CONTROL + "a");
			SINNumber.sendKeys(Keys.DELETE);
			SINNumber.sendKeys("12567");
			
			Thread.sleep(2000);
			
			WebElement E1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[3]/a"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("arguments[0].scrollIntoView();", E1);
		    
			Nationalitydropdown.click();
			Nationalityselect.click();
			
			Thread.sleep(2000);
			
			MaritalStatus.click();
			Maritalselect.click();
			
			Thread.sleep(2000);
			
			DateofBirth.sendKeys(Keys.CONTROL + "a");
			DateofBirth.sendKeys(Keys.DELETE);
			DateofBirth.sendKeys("1999-09-20");
			
			Thread.sleep(2000);
			
			save1.sendKeys(Keys.ENTER);
			
			Thread.sleep(2000);
			
			Customdropdown.click();
			Customselect.click();
			
			Thread.sleep(2000);
			
			save2.sendKeys(Keys.ENTER);
			
			Contactdetailspage cd = new Contactdetailspage(driver);
			
			return cd;
			
			
			
		}
		
	}


