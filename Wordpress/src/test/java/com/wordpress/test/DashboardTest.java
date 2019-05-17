package com.wordpress.test;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.wordpress.pagelayers.Dashboard;
import com.wordpress.pagelayers.Homepage;
import com.wordpress.pagelayers.Loginpage;


public class DashboardTest extends Homepage {
	
	Homepage homepage;
	Dashboard dashboard;
	Loginpage loginpage;
	
	public DashboardTest() {
		super();
	}
	
@BeforeMethod
	
	public void setUp() {
		intilization();
		loginpage = new Loginpage();
		homepage = loginpage.validatelogin();
		dashboard = homepage.validatecustomizesite();
	}


@Test
public void validateScollTest() {
	dashboard.validatepagescroll();
}

@AfterMethod

public void tearndown() {
	driver.quit();
}





	
	

}
