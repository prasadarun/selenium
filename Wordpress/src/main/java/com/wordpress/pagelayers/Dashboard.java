package com.wordpress.pagelayers;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Dashboard extends Homepage {
	
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	
	
	public Dashboard() {
		PageFactory.initElements(driver, this);
	}
	
	

	public boolean validatepagescroll() {
		js.executeScript("window.scrollBy(0,-250)", "");	
		return true;
		
		
	}
	
	
	
	

}
