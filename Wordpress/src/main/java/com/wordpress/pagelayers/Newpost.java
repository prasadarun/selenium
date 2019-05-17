package com.wordpress.pagelayers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Newpost extends Homepage {
	
	Homepage homepage;
	
	
	@FindBy(xpath = "//input[@id='title']")
	WebElement newposttitle;
	
	
	@FindBy(xpath = "//body[@id='tinymce']")
	WebElement postdescription;
	
	
	@FindBy(xpath = "//button[@id='insert-media-button']")
	WebElement addmedia;
	
	
	@FindBy(xpath = "//button[@id='__wp-uploader-id-1']")
	WebElement uploadfile;
	
	
	
	
	public Newpost() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean validatepostTitle() {
		newposttitle.click();
		newposttitle.sendKeys(prop.getProperty("posttitle"));
		return true;
	}
	
	public boolean validatepostDescription() {
		postdescription.click();
		postdescription.sendKeys(prop.getProperty("posttitle"));
		return true;
	}
	
	public boolean validateMediabtn() throws InterruptedException {
		addmedia.click();
		uploadfile.click();
		WebElement uploadElement = driver.findElement(By.xpath("//button[@id='__wp-uploader-id-1']"));
		uploadElement.sendKeys(prop.getProperty("file"));
		return true;
		
	}
	
	
	
	
	
	
	

}
