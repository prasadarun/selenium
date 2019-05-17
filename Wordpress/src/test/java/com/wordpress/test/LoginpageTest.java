package com.wordpress.test;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.wordpress.base.TestBase;
import com.wordpress.pagelayers.Homepage;
import com.wordpress.pagelayers.Loginpage;

public class LoginpageTest extends TestBase {
	
	Loginpage loginpage;
	Homepage homepage;
	
	
	public LoginpageTest() {
		super();
	}
	
@BeforeMethod
	
	public void setUp() {
		intilization();
		loginpage = new Loginpage();
	}


@Test
 public void validateloginTest() {
	homepage = loginpage.validatelogin();
}

@Test
public void validateincorrectloginTest1() {
	loginpage.validateincorrectlogin1();
}

@Test
public void validateincorrectloginTest2() {
	loginpage.validateincorrectlogin2();
}



@Test

public void validatetitleTest() {
	 String flag = loginpage.validateLoginpageTitle();
	 String flag1 = "Log In ‹ opensourcecms — WordPress";
	Assert.assertEquals(flag,flag1);
	
}


@AfterMethod
 public void tearDown() {
  driver.quit();
  
	}
	
	

}
