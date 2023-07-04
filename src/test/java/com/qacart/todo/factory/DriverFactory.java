package com.qacart.todo.factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	

     public WebDriver intializeDriver() {
    	  WebDriver driver;
    	 String browser=System.getProperty("browser", "CHROME");
    	 switch(browser) {
    	 case "CHROME":
	    	 WebDriverManager.chromedriver().setup();
	    	 driver=new ChromeDriver(); 
	    	 break;
	     case "Firfox":
	    	 WebDriverManager.firefoxdriver().setup();
	    	  driver=new FirefoxDriver();
	    	break;
	     default:
	    	 throw new RuntimeException("the browser is not supported");
    	 }
    
    	 
    	 WebDriverManager.chromedriver().setup();
    	 driver=new ChromeDriver();
    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    		driver.manage().window().maximize();
    		return driver;
    		
     }
}
