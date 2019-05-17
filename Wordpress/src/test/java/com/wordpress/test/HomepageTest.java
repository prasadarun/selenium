package com.wordpress.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.wordpress.base.TestBase;
import com.wordpress.pagelayers.Homepage;
import com.wordpress.pagelayers.Loginpage;
import com.wordpress.pagelayers.Newpost;


public class HomepageTest extends TestBase {
	
	Homepage homepage;
	Loginpage loginpage;
	Newpost newpost;
	
	public HomepageTest() {
		super();
	}
	
@BeforeMethod
	
	public void setUp() {
		intilization();
		loginpage = new Loginpage();
		homepage = loginpage.validatelogin();
	}


@Test

public void validatecustomizeTest() {
	homepage.validatecustomizesite();
	}

@Test
 public void validatepostTest() throws Exception {
	homepage.validatePostmenu();
	
	}


@Test 

public void validatefirstenrtyTest() throws Exception {
	newpost = homepage.validatefirstentry();
	
	}


@Test

public void validatecreatepageTest() {
	homepage.validatecreatePage();
	}


@Test

public void validatecommentsTest() {
	homepage.validateComments();
	}





	
@AfterMethod

	public void tearDown() {
    driver.quit();

	}

}
