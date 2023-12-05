package pageelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

@SuppressWarnings("unused")
public class Personaldetails extends AbstractMethods {

		WebDriver driver;
		
		public Personaldetails(WebDriver driverhere) {
			super(driverhere);
			this.driver = driverhere;
			PageFactory.initElements(driver, this);
			
		}
		@FindBy(xpath = "//input[@class='oxd-input oxd-input--active orangehrm-firstname']")
		WebElement firstname;
		
		@FindBy(xpath = "//input[@class='oxd-input oxd-input--active orangehrm-lastname']")
		WebElement lastname;
		
		@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
		WebElement Employeeid;
		
		@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[5]")
		WebElement DriversLicenseNumber;
		
		@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[6]")
		WebElement LicenseExpiryDate;
		
		@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[7]")
		WebElement SSNNumber;
		
		@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[8]")
		WebElement SINNumber;
		
		@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[1]")
		WebElement Nationalitydropdown;
		
		@FindBy(xpath = "//*[text()= 'Indian']")
		WebElement Nationalityselect;
		
		@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[2]")
		WebElement MaritalStatus;
		
		@FindBy(xpath = "//*[text()= 'Single']")
		WebElement Maritalselect;
		
		@FindBy(xpath = "//input[@class='oxd-input oxd-input--active'])[9]")
		WebElement DateofBirth;
		
		@FindBy(xpath = "(//button[@type='submit'])[1]")
		WebElement save1;
		
		@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[3]")
		WebElement Customdropdown;
		
		@FindBy(xpath = "//*[text()= 'B+']")
		WebElement Customselect;
		
		@FindBy(xpath = "(//button[@type='submit'])[2]")
		WebElement save2;
		
		By add_firstname1 = By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-firstname']");
		By add_lastname1 = By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-lastname']");
		By add_Employeeid1 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]");
		By add_DriversLicenseNumber1 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[5]");
		By add_LicenseExpiryDate1 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[6]");
		By add_SSNNumber1 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[7]");
		By add_SINNumber1 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[8]");
		By add_Nationalitydropdown1 = By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]");
		By add_Nationalityselect1 = By.xpath("//*[text()= 'Indian']");
		By add_MaritalStatus1 = By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[2]");
		By add_Maritalselect1 = By.xpath("//*[text()= 'Single']");
		By add_DateofBirth1 = By.xpath("//input[@class='oxd-input oxd-input--active'])[9]");
		By add_save12 = By.xpath("(//button[@type='submit'])[1]");
		By add_Customdropdown1 = By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[3]");
		By add_Customselect1 = By.xpath("//*[text()= 'B+']");
		By add_save21 = By.xpath("(//button[@type='submit'])[2]");
		
		
		
		public Contactdetailspage personalinfo() throws InterruptedException {	
			implicitlywaitmethod();
			
			firstname.sendKeys(Keys.CONTROL + "a");
			firstname.sendKeys(Keys.DELETE);
			firstname.sendKeys("Krishna");
			Wait_Till_Link_Is_Clickable(add_firstname1);
			
			lastname.sendKeys(Keys.CONTROL + "a");
			lastname.sendKeys(Keys.DELETE);
			lastname.sendKeys("A");
			Wait_Till_Link_Is_Clickable(add_lastname1);
			
			Employeeid.sendKeys(Keys.CONTROL + "a");
			Employeeid.sendKeys(Keys.DELETE);
			Employeeid.sendKeys("24");
			Wait_Till_Link_Is_Clickable(add_Employeeid1);
			
			DriversLicenseNumber.sendKeys(Keys.CONTROL + "a");
			DriversLicenseNumber.sendKeys(Keys.DELETE);
			DriversLicenseNumber.sendKeys("2afed");
			Wait_Till_Link_Is_Clickable(add_DriversLicenseNumber1);
			
			LicenseExpiryDate.sendKeys(Keys.CONTROL + "a");
			LicenseExpiryDate.sendKeys(Keys.DELETE);
			LicenseExpiryDate.sendKeys("2024-12-30");
			Wait_Till_Link_Is_Clickable(add_LicenseExpiryDate1);
			
			SSNNumber.sendKeys(Keys.CONTROL + "a");
			SSNNumber.sendKeys(Keys.DELETE);
			SSNNumber.sendKeys("2345");
			Wait_Till_Link_Is_Clickable(add_SSNNumber1);
			
			SINNumber.sendKeys(Keys.CONTROL + "a");
			SINNumber.sendKeys(Keys.DELETE);
			SINNumber.sendKeys("12567");
			Wait_Till_Link_Is_Clickable(add_SINNumber1);
			
			WebElement E1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[3]/a"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("arguments[0].scrollIntoView();", E1);
		    
			Nationalitydropdown.click();
			Nationalityselect.click();
			Wait_Till_Link_Is_Clickable(add_Nationalitydropdown1);
			Wait_Till_Link_Is_Clickable(add_Nationalityselect1);
			
			MaritalStatus.click();
			Maritalselect.click();
			Wait_Till_Link_Is_Clickable(add_MaritalStatus1);
			Wait_Till_Link_Is_Clickable(add_Maritalselect1);
			
			DateofBirth.sendKeys(Keys.CONTROL + "a");
			DateofBirth.sendKeys(Keys.DELETE);
			DateofBirth.sendKeys("1999-09-20");
			Wait_Till_Link_Is_Clickable(add_DateofBirth1);
			
			save1.sendKeys(Keys.ENTER);
			Wait_Till_Link_Is_Clickable(add_save12);
			
			Customdropdown.click();
			Customselect.click();
			Wait_Till_Link_Is_Clickable(add_Customdropdown1);
			Wait_Till_Link_Is_Clickable(add_Customselect1);
			
			save2.sendKeys(Keys.ENTER);
			Wait_Till_Link_Is_Clickable(add_save21);
			
			Contactdetailspage cd = new Contactdetailspage(driver);
			
			return cd;
			
			
			
		}
		
	}


