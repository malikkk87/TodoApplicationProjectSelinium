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
import pages.NewTodoPage;
import pages.TodoPage;
import utils.ConfigUtils;


public class TodoTest extends BaseTest{
	

	@Test
	public void ShouldBeAbleToAddNewTodo() {
		LoginPage loginPage=new LoginPage(driver);
	String actualResult=loginPage
		    .load()
		    .login(ConfigUtils.getInstance().getEmail(),ConfigUtils.getInstance().getPassword() )
		    .clickOnPlusButton().addNewTask("Learn Selinium")
		    .getTodoText();
		
		
	    Assert.assertEquals(actualResult,"Learn Selinium");
	
	
	}
   @Test
   public void ShouldBeAbleToDeleteTodo() {
		LoginPage loginPage=new LoginPage(driver);
	    boolean isNoTodoMessageDisplayed=loginPage
		     .load()
		     .login(ConfigUtils.getInstance().getEmail(),ConfigUtils.getInstance().getPassword() )
		     .clickOnPlusButton()
		     .addNewTask("Learn Selinium")
		     .clickOnDleteButton()
		     .isNotTodosMesageDispled();
		
		
	    Assert.assertTrue(isNoTodoMessageDisplayed);
		
	   
   }
	
	
	
}
