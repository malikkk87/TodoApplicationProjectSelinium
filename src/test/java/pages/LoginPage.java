package pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.dockerjava.api.model.Config;
import com.qacart.todo.base.BasePage;

import utils.ConfigUtils;
import utils.PropertiesUtils;


public final class LoginPage extends BasePage {


	public LoginPage(WebDriver driver) {
		super(driver);
		
	}



	@FindBy(css = "[data-testid=\"email\"]")
	private WebElement emailInput;
	
	@FindBy(css = "[data-testid=\"password\"]")
	private WebElement passwordInput;
	
	@FindBy(css = "[data-testid=\"submit\"]")
	private WebElement submit;

	
	
	public TodoPage login(String email,String password) {
		emailInput.sendKeys(email);
		passwordInput.sendKeys(password);
		submit.click();
		return new TodoPage(driver);
	}
	public LoginPage load() {
		
		driver.get(ConfigUtils.getInstance().getBaseUrl());
		return this;
		
	}
	
}

