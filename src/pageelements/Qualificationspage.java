package pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class Qualificationspage extends AbstractMethods{

WebDriver driver;
	
	public Qualificationspage(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
		
	}

	
	@FindBy(xpath = "//a[@class='orangehrm-tabs-item --active']")
	WebElement Qualifications;
	
	@FindBy(xpath = "(//button[@type='button'])[3]")
	WebElement Add;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement company;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
	WebElement Job;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[4]")
	WebElement from;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[5]")
	WebElement To;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement save1;
	
	@FindBy(xpath = "(//button[@type='button'])[6]")
	WebElement Add1;
	
	@FindBy(xpath ="(//div[@class='oxd-select-text-input'])[1]")
	WebElement Leveldropdown;
	  
	@FindBy(xpath = "//*[text()= 'College Undergraduate']") 
	WebElement LevelSelect;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement Institute;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
	WebElement Specialization;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[4]")
	WebElement year;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[5]")
	WebElement GPA;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[6]")
	WebElement startdate;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[7]")
	WebElement Enddate;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement save2;
	
	@FindBy(xpath = "(//button[@type='button'])[9]")
	WebElement Add2;
	
	@FindBy(xpath = "(//div[@class='oxd-select-text-input'])[1]")
	WebElement Skilldropdown;
	
	@FindBy(xpath = "//*[text()= 'Java']")
	WebElement Skillselect;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement YearsofExperience;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement save3;
	
	@FindBy(xpath = "(//button[@type='button'])[10]")
	WebElement Add3;
	
	@FindBy(xpath = "(//div[@class='oxd-select-text-input'])[1]")
	WebElement Languagedropdown;
	
	@FindBy(xpath = "//*[text()= 'French']")
	WebElement Languageselect;
	
	@FindBy(xpath = "(//div[@class='oxd-select-text-input'])[2]")
	WebElement Fluencydropdown;
	
	@FindBy(xpath = "//*[text()= 'Reading']")
	WebElement Fluencyselect;
	
	@FindBy(xpath = "(//div[@class='oxd-select-text-input'])[3]")
	WebElement Competencydropdown;
	
	@FindBy(xpath = "//*[text()= 'Good']")
	WebElement Competencyselect;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement save4;
	
	By add_Qualifications1 = By.xpath("//a[@class='orangehrm-tabs-item --active']");
	By add_Add11 = By.xpath("(//button[@type='button'])[3]");
	By add_company1 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	By add_Job1 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]");
	By add_from1 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]");
	By add_To1 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[5]");
	By add_save11 = By.xpath("//button[@type='submit']");
	By add_Add12 = By.xpath("(//button[@type='button'])[6]");
	By add_Leveldropdown1 = By.xpath("(//div[@class='oxd-select-text-input'])[1]");
	By add_LevelSelect1 = By.xpath("//*[text()= 'College Undergraduate']");
	By add_Institute1 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	By add_Specialization1 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]");
	By add_year1 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]");
	By add_GPA1 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[5]");
	By add_startdate1 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[6]");
	By add_Enddate1 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[7]");
	By add_save21 = By.xpath("//button[@type='submit']");
	By add_Add21 = By.xpath("(//button[@type='button'])[9]");
	By add_Skilldropdown1 = By.xpath("(//div[@class='oxd-select-text-input'])[1]");
	By add_Skillselect1 = By.xpath("//*[text()= 'Java']");
	By add_YearsofExperience1 = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	By add_save31 = By.xpath("//button[@type='submit']");
	By add_Add31 = By.xpath("(//button[@type='button'])[10]");
	By add_Languagedropdown1 = By.xpath("(//div[@class='oxd-select-text-input'])[1]");
	By add_Languageselect1 = By.xpath("//*[text()= 'French']");
	By add_Fluencydropdown1 = By.xpath("(//div[@class='oxd-select-text-input'])[2]");
	By add_Fluencyselect1 = By.xpath("//*[text()= 'Reading']");
	By add_Competencydropdown1 = By.xpath("(//div[@class='oxd-select-text-input'])[3]");
	By add_Competencyselect1 = By.xpath("//*[text()= 'Good']");
	
	
	public Membershippage qualifications() throws InterruptedException {
		implicitlywaitmethod();	
		
		WebElement E1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[8]/a"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView();", E1);
	    
		Qualifications.click();
		Wait_Till_Link_Is_Clickable(add_Qualifications1);
		
		Add.click();
		Wait_Till_Link_Is_Clickable(add_Add11);
		
		company.sendKeys(Keys.CONTROL + "a");
		company.sendKeys(Keys.DELETE);
		company.sendKeys("CTS");	
		Wait_Till_Link_Is_Clickable(add_company1);
		
		Job.sendKeys(Keys.CONTROL + "a");
		Job.sendKeys(Keys.DELETE);
		Job.sendKeys("Tester");
		Wait_Till_Link_Is_Clickable(add_Job1);
		  
		from.sendKeys(Keys.CONTROL + "a"); 
		from.sendKeys(Keys.DELETE);
		from.sendKeys("2020-12-28");
		Wait_Till_Link_Is_Clickable(add_from1);
		  
		To.sendKeys(Keys.CONTROL + "a"); 
		To.sendKeys(Keys.DELETE);
		To.sendKeys("2023-11-29");
		Wait_Till_Link_Is_Clickable(add_To1);
		
		save1.sendKeys(Keys.ENTER);
		Wait_Till_Link_Is_Clickable(add_save11);
		
		WebElement E2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[1]/a"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
	    js1.executeScript("arguments[0].scrollIntoView();", E2);
		
		Add1.click();
		Wait_Till_Link_Is_Clickable(add_Add11);
		  
		Leveldropdown.click();
		Wait_Till_Link_Is_Clickable(add_Leveldropdown1);
		
		LevelSelect.click();
		Wait_Till_Link_Is_Clickable(add_LevelSelect1);
		
		Institute.sendKeys(Keys.CONTROL + "a");
		Institute.sendKeys(Keys.DELETE);
		Institute.sendKeys("Andhra University");	
		Wait_Till_Link_Is_Clickable(add_Institute1);
		
		Specialization.sendKeys(Keys.CONTROL + "a");
		Specialization.sendKeys(Keys.DELETE);
		Specialization.sendKeys("MCA");
		Wait_Till_Link_Is_Clickable(add_Specialization1);
		
		year.sendKeys(Keys.CONTROL + "a");
		year.sendKeys(Keys.DELETE);
		year.sendKeys("2023");	
		Wait_Till_Link_Is_Clickable(add_year1);
		
		GPA.sendKeys(Keys.CONTROL + "a");
		GPA.sendKeys(Keys.DELETE);
		GPA.sendKeys("8.5");
		Wait_Till_Link_Is_Clickable(add_GPA1);
		  
		startdate.sendKeys(Keys.CONTROL + "a"); 
		startdate.sendKeys(Keys.DELETE);
		startdate.sendKeys("2021-12-28");
		Wait_Till_Link_Is_Clickable(add_startdate1);
		  
		Enddate.sendKeys(Keys.CONTROL + "a"); 
		Enddate.sendKeys(Keys.DELETE);
		Enddate.sendKeys("2023-08-06");
		Wait_Till_Link_Is_Clickable(add_Enddate1);
		
		save2.sendKeys(Keys.ENTER);
		Wait_Till_Link_Is_Clickable(add_save21);
		
		Add2.click();
		Wait_Till_Link_Is_Clickable(add_Add21);
		
		Skilldropdown.click();
		Skillselect.click();
		Wait_Till_Link_Is_Clickable(add_Skilldropdown1);
		Wait_Till_Link_Is_Clickable(add_Skillselect1);
		
		YearsofExperience.sendKeys(Keys.CONTROL + "a");
		YearsofExperience.sendKeys(Keys.DELETE);
		YearsofExperience.sendKeys("3");
		Wait_Till_Link_Is_Clickable(add_YearsofExperience1);
		
		save3.sendKeys(Keys.ENTER);
		Wait_Till_Link_Is_Clickable(add_save31);
		
		Add3.click();
		Wait_Till_Link_Is_Clickable(add_Add31);
		
		Languagedropdown.click();
		Languageselect.click();
		Wait_Till_Link_Is_Clickable(add_Languagedropdown1);
		Wait_Till_Link_Is_Clickable(add_Languageselect1);
		
		Fluencydropdown.click();
		Fluencyselect.click();
		Wait_Till_Link_Is_Clickable(add_Fluencydropdown1);
		Wait_Till_Link_Is_Clickable(add_Fluencyselect1);
		
		Competencydropdown.click();
		Competencyselect.click();
		Wait_Till_Link_Is_Clickable(add_Competencydropdown1);
		Wait_Till_Link_Is_Clickable(add_Competencyselect1);
		
		save4.sendKeys(Keys.ENTER);
		
		Membershippage Mp = new Membershippage(driver);
		
		return Mp;
	}
}
