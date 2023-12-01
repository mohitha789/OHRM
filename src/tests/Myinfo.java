package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageelements.Contactdetailspage;
import pageelements.Dependencypage;
import pageelements.Emergencycontacts;
import pageelements.Homepage;
import pageelements.Immigrationpage;
import pageelements.Loginpage;
import pageelements.Membershippage;
import pageelements.Personaldetails;
import pageelements.Qualificationspage;
import pageelements.Quitbrowser;
import utilities.Basetest;
import utilities.ExcelUtility1;

public class Myinfo extends Basetest {

	Loginpage lp;
	Homepage hp;
	Personaldetails pd;
	Contactdetailspage cd;
	Emergencycontacts Ec;
	Dependencypage Dp;
	Immigrationpage Ip;
	Qualificationspage Qp;
	Membershippage Mp;
	Quitbrowser Qs;
	@Test
	public void Myinfoflow() throws Exception {
	   lp = LaunchApplication();
	   
	   ExcelUtility1 xs = new ExcelUtility1();
		
		String username = xs.Get_Username(1, 0).toString();
		String password = xs.Get_password(1, 1).toString();
		hp = lp.enterlogindetails(username,password);
		pd = hp.myinfoclick();
		cd = pd.personalinfo();
	    Ec = cd.info();
	    Dp = Ec.Emergencypage();
	    Ip = Dp.Dependencypage();
	    Qp = Ip.Immigrationpage();
	    Mp = Qp.Qualifications();
	    Qs = Mp.Quitbrowser();
	    Qs.Quitbrowser();
	}
	
}

