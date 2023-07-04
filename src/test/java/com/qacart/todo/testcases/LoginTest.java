package com.qacart.todo.testcases;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qacart.todo.base.BaseTest;
import com.qacart.todo.factory.DriverFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;
import pages.TodoPage;
import utils.ConfigUtils;

public class LoginTest extends BaseTest {

	@Test
	public void ShouldBeAbleToLoginWithEmailAndPassword() {
			LoginPage loginPage=new LoginPage(driver);
			boolean isWelcomeDisplayed=
					loginPage
				    	.load()
					    .login(ConfigUtils.getInstance().getEmail(),ConfigUtils.getInstance().getPassword())
					    .isWelcomeMessageDisplayed();
		    

		    
	        Assert.assertTrue(isWelcomeDisplayed);
	    
		
	}

}
