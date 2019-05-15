package com.wordpress.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import com.wordpress.utils.LoadingTime;

public class TestBase {

	 public static WebDriver driver;
    public static Properties prop;
   
   
   /*** .... ......Created Constructor to load the data .........****/
   
   public TestBase(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/wordpress/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
   
   /*** ........ Initializing the browser .........****/
   
   public static void intilization() {
   	String browserName  = prop.getProperty("browser");
   	if(browserName.equals("chrome")) {
   		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dpindi.CORP\\Desktop\\Selenium practice\\chromedriver.exe");
   		driver = new ChromeDriver();	
   	}
   	else if(browserName.equals("Firefox")){
   		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dpindi.CORP\\Desktop\\Selenium practice\\Drivers.exe files\\geckodriver.exe");
   		driver = new FirefoxDriver();	
   	}
   	
   	else {
   		System.out.print("No other browsers are defined");
   	}
   	
   	
   	driver.manage().window().maximize();
   	driver.manage().deleteAllCookies();
   	driver.manage().timeouts().pageLoadTimeout(LoadingTime.PAGE_LAYOUT, TimeUnit.SECONDS);
   	driver.manage().timeouts().implicitlyWait(LoadingTime.IMPLICT_WAIT, TimeUnit.SECONDS);
   	
   	driver.get(prop.getProperty("url"));
   	
   	
   }
}
