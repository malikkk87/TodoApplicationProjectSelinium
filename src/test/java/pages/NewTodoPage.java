package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qacart.todo.base.BasePage;

public class NewTodoPage extends BasePage {

	public NewTodoPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(css = "[data-testid=\"new-todo\"]")
	private WebElement newTodoInput;
	
	
	@FindBy(css = "[data-testid=\"submit-newTask\"]")
	private WebElement newTodoSubmit;
	
	
	public TodoPage addNewTask(String item) {
		newTodoInput.sendKeys(item);
		newTodoInput.click();
		return new TodoPage(driver);
	}
	
}
