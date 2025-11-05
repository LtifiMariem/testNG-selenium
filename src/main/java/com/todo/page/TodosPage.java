
package com.todo.page;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.todo.utils.BasePage;

public class TodosPage extends BasePage {

	public TodosPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//input[@placeholder='What needs to be done?']")
	public static WebElement inputField;

	@FindBy(how = How.XPATH, using = "//label[normalize-space()='Vérification de saisie']")
	public static WebElement textTodo;
	//label[normalize-space()='Vérification de saisie']
	//font[contains(text(),'Vérification de saisie')]

	
	
	@FindBy(how = How.XPATH, using = "//input[@class='toggle']")
	public static WebElement checkbox;

	// ✅ Méthode professionnelle : saisir une tâche et valider avec "Entrée"
	public void submitTodo(String todo) {
		inputField.sendKeys(todo);
		inputField.sendKeys(Keys.ENTER);

	}

	public Boolean isElementDisplayed(WebElement element) {
		return element.isDisplayed();
	}

	public String checkElementContain(WebElement element) {
		return element.getText();
	}
	public Boolean isElementSelected(WebElement element) {
		return element.isSelected();
	}

	

	
		
	}

