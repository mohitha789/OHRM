package pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Qualificationspage {

WebDriver driver;
	
	public Qualificationspage(WebDriver driverhere) {
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
		
	}

	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[10]/a")
	WebElement Qualifications;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/div/button")
	WebElement Add;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input")
	WebElement company;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/input")
	WebElement Job;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[2]/div/div[1]/div/div[2]/div/div/input")
	WebElement from;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[2]/div/div[2]/div/div[2]/div/div/input")
	WebElement To;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[4]/button[2]")
	WebElement save1;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/div/button")
	WebElement Add1;
	
	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]/i")
	WebElement Leveldropdown;
	  
	@FindBy(xpath = "//*[text()= 'College Undergraduate']") 
	WebElement LevelSelect;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/form/div[1]/div/div[2]/div/div[2]/input")
	WebElement Institute;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/form/div[1]/div/div[3]/div/div[2]/input")
	WebElement Specialization;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/form/div[1]/div/div[4]/div/div[2]/input")
	WebElement year;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/form/div[1]/div/div[5]/div/div[2]/input")
	WebElement GPA;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/form/div[2]/div/div[1]/div/div[2]/div/div/input")
	WebElement startdate;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/form/div[2]/div/div[2]/div/div[2]/div/div/input")
	WebElement Enddate;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/form/div[3]/button[2]")
	WebElement save2;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[4]/div[1]/div/button")
	WebElement Add2;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[4]/div[1]/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]/i")
	WebElement Skilldropdown;
	
	@FindBy(xpath = "//*[text()= 'Java']")
	WebElement Skillselect;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[4]/div[1]/form/div[1]/div/div[2]/div/div[2]/input")
	WebElement YearsofExperience;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[4]/div[1]/form/div[3]/button[2]")
	WebElement save3;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[5]/div[1]/div/button")
	WebElement Add3;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[5]/div[1]/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]/i")
	WebElement Languagedropdown;
	
	@FindBy(xpath = "//*[text()= 'French']")
	WebElement Languageselect;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[5]/div[1]/form/div[1]/div/div[2]/div/div[2]/div/div/div[2]/i")
	WebElement Fluencydropdown;
	
	@FindBy(xpath = "//*[text()= 'Reading']")
	WebElement Fluencyselect;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[5]/div[1]/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]/i")
	WebElement Competencydropdown;
	
	@FindBy(xpath = "//*[text()= 'Good']")
	WebElement Competencyselect;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[5]/div[1]/form/div[3]/button[2]")
	WebElement save4;
	
	public Membershippage Qualifications() throws InterruptedException {
		
		Thread.sleep(2000);
		
		WebElement E1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[8]/a"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView();", E1);
	    
		Thread.sleep(2000);
	    
		Qualifications.click();
		
		Thread.sleep(2000);
		
		Add.click();
		
		Thread.sleep(2000);
		
		company.sendKeys(Keys.CONTROL + "a");
		company.sendKeys(Keys.DELETE);
		company.sendKeys("CTS");	
		
		Thread.sleep(2000);
		
		Job.sendKeys(Keys.CONTROL + "a");
		Job.sendKeys(Keys.DELETE);
		Job.sendKeys("Tester");
		
		Thread.sleep(2000);
		  
		from.sendKeys(Keys.CONTROL + "a"); 
		from.sendKeys(Keys.DELETE);
		from.sendKeys("2020-12-28");
		
		Thread.sleep(2000);
		  
		To.sendKeys(Keys.CONTROL + "a"); 
		To.sendKeys(Keys.DELETE);
		To.sendKeys("2023-11-29");
		
		Thread.sleep(2000);
		
		save1.sendKeys(Keys.ENTER);
		
		Thread.sleep(4000);
		
		WebElement E2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[1]/a"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
	    js1.executeScript("arguments[0].scrollIntoView();", E2);
		
		Thread.sleep(4000);
		
		Add1.click();
		
		Thread.sleep(4000);
		  
		Leveldropdown.click();
		
		Thread.sleep(4000);
		
		LevelSelect.click();
		 
		Thread.sleep(2000);
		
		Institute.sendKeys(Keys.CONTROL + "a");
		Institute.sendKeys(Keys.DELETE);
		Institute.sendKeys("Andhra University");	
		
		Thread.sleep(2000);
		
		Specialization.sendKeys(Keys.CONTROL + "a");
		Specialization.sendKeys(Keys.DELETE);
		Specialization.sendKeys("MCA");

		Thread.sleep(2000);
		
		year.sendKeys(Keys.CONTROL + "a");
		year.sendKeys(Keys.DELETE);
		year.sendKeys("2023");	
		
		Thread.sleep(2000);
		
		GPA.sendKeys(Keys.CONTROL + "a");
		GPA.sendKeys(Keys.DELETE);
		GPA.sendKeys("8.5");
		
		Thread.sleep(2000);
		  
		startdate.sendKeys(Keys.CONTROL + "a"); 
		startdate.sendKeys(Keys.DELETE);
		startdate.sendKeys("2021-12-28");
		
		Thread.sleep(2000);
		  
		Enddate.sendKeys(Keys.CONTROL + "a"); 
		Enddate.sendKeys(Keys.DELETE);
		Enddate.sendKeys("2023-08-06");
		
		Thread.sleep(2000);
		
		save2.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		Add2.click();
		
		Thread.sleep(2000);
		
		Skilldropdown.click();
		Skillselect.click();
		
		Thread.sleep(2000);
		
		YearsofExperience.sendKeys(Keys.CONTROL + "a");
		YearsofExperience.sendKeys(Keys.DELETE);
		YearsofExperience.sendKeys("3");
		
		Thread.sleep(2000);
		
		save3.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		Add3.click();
		
		Thread.sleep(2000);
		
		Languagedropdown.click();
		Languageselect.click();
		
		Thread.sleep(4000);
		
		Fluencydropdown.click();
		Fluencyselect.click();
		
		Thread.sleep(2000);
		
		Competencydropdown.click();
		Competencyselect.click();
		
		Thread.sleep(2000);
		
		save4.sendKeys(Keys.ENTER);
		
		Membershippage Mp = new Membershippage(driver);
		
		return Mp;
	}
}
