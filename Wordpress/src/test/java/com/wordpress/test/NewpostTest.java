package com.wordpress.test;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.wordpress.pagelayers.Homepage;
import com.wordpress.pagelayers.Loginpage;
import com.wordpress.pagelayers.Newpost;

public class NewpostTest extends Homepage {
	Homepage homepage;
	Newpost newpost;
	Loginpage loginpage;
	
	
	public NewpostTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setup() throws Exception {
		intilization();
		loginpage = new Loginpage();
		homepage = loginpage.validatelogin();
		
		newpost = homepage.validatefirstentry();
	}
	
	
	@Test
	public void validateposttileTest() {
		newpost.validatepostTitle();
	}
	
	
	@Test
	public void valiadateMediabtnTest() throws InterruptedException {
		newpost.validateMediabtn();
	}
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	

}
