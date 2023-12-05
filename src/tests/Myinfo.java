package tests;

import java.io.IOException;

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
	 public void login() throws IOException, InterruptedException {
		 ExcelUtility1 xs = new ExcelUtility1();
		 lp = LaunchApplication();
		String username = xs.Get_Username(1, 0).toString();
		String password = xs.Get_password(1, 1).toString();
		hp = lp.enterlogindetails(username,password);
	    }
	@Test(dependsOnMethods = { "login" })
	 public void home() throws IOException, InterruptedException {
		
		 pd = hp.myinfoclick();
		
	    }
	@Test(dependsOnMethods = {"login", "home"})
	 public void personal() throws IOException, InterruptedException {
		
		cd = pd.personalinfo();
		
	    }
	@Test(dependsOnMethods = { "login", "home" ,"personal"})
	 public void contact() throws IOException, InterruptedException {
		
		Ec = cd.info();
		
	    }
	@Test(dependsOnMethods = { "login","home","personal","contact"})
	 public void emergency() throws IOException, InterruptedException {
		
		  Dp = Ec.emergencypage();
		
	    }
	@Test(dependsOnMethods = {  "login","home","personal","contact","emergency" })
	 public void dependents() throws IOException, InterruptedException {
		
	    Ip = Dp.dependencypage();
		
	    }
	@Test(dependsOnMethods = { "login","home","personal","contact","emergency","dependents" })
	 public void immigration() throws IOException, InterruptedException {
		
		Qp = Ip.immigrationpage();
		
	    }
	@Test(dependsOnMethods = { "login","home","personal","contact","emergency","dependents","immigration"})
	 public void qualification() throws IOException, InterruptedException {
		
		 Mp = Qp.qualifications();
		
	    }
	@Test(dependsOnMethods = { "login","home","personal","contact","emergency","dependents","immigration","qualification"})
	 public void membership() throws IOException, InterruptedException {
		
		 Qs = Mp.membership();
		    
		
	    }
	@Test(dependsOnMethods = { "login","home","personal","contact","emergency","dependents","immigration","qualification","membership" })
	 public void quit() throws IOException, InterruptedException {
		
		  Qs.Quitbrowser();
		
	    }
	
	
	
}

