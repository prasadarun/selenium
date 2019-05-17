package com.wordpress.pagelayers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wordpress.base.TestBase;



public class Homepage extends TestBase {
	
	Homepage homepage;
	 


	
	@FindBy(partialLinkText = "Customize Your Site")
	WebElement customizebutton;
	
	@FindBy(xpath = "//a[@class='welcome-icon welcome-write-blog']")
	WebElement firstEntry;
	
	
	@FindBy(xpath="//a[@class='welcome-icon welcome-add-page']")
	WebElement Createpage;
	
	
	@FindBy(xpath = "//a[@class='welcome-icon welcome-comments']")
	WebElement Comments;
	
	
	
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public Dashboard validatecustomizesite() {
		customizebutton.click();
		return new Dashboard();
		
	}
	
	
	
	public boolean validatePostmenu() throws Exception {
		
		 Actions actions = new Actions(driver);
		 WebElement mainMenu = driver.findElement(By.xpath("//div[contains(text(),'Posts')]"));
		 actions.moveToElement(mainMenu).perform();
		 
		 // for submenu
		 WebElement subMenu = driver.findElement(By.xpath("//div[contains(text(),'Posts')]"));
		 actions.moveToElement(subMenu).perform();
		 boolean flag = subMenu.isDisplayed();
		 return flag;
		 
		
	}
	
	
	public boolean validatefirstentry() throws Exception {
		Thread.sleep(2000);
		firstEntry.click();
		return true;
		
	}
	
	
	public boolean validatecreatePage() {
		Createpage.click();
		return true;
	
	}
	
	
	public boolean validateComments() {
		Comments.click();
		return true;
	}
	

}
