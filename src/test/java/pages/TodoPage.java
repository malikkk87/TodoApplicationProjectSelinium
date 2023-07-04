package pages;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qacart.todo.base.BasePage;

public class TodoPage extends BasePage {

	public TodoPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(css = "[data-testid=\"welcome\"]")
	private WebElement welcomeMessage;
	
	
	@FindBy(css = "[data-testid=\"add\"]")
	private WebElement addButton;
	
	@FindBy(css = "[data-testid=\"todo-item\"]")
	private WebElement todoItem;
	
	@FindBy(css = "[data-testid=\"delete\"]")
	private WebElement deleteButton;
	
	
	@FindBy(css = "[data-testid=\"no-todos\"]")
	private WebElement noTodosMessage;
	
    public boolean isWelcomeMessageDisplayed() {
        return 	welcomeMessage.isDisplayed();	
    }
    
    public NewTodoPage clickOnPlusButton() {
    	addButton.click();
    	return new NewTodoPage(driver);
    }
    
    public String getTodoText() {
        return	todoItem.getText();
    }
    
    public TodoPage clickOnDleteButton() {
    	
    	deleteButton.click();
    	return this;
    	
    }
    public boolean isNotTodosMesageDispled() {
    	return noTodosMessage.isDisplayed();
    }
}
