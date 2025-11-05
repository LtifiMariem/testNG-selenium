package com.todo.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.todo.page.TodosPage;
import com.todo.utils.Setup;

public class AddTodosTest extends Setup {
	public AddTodosTest() throws IOException{
		super();
	}
	TodosPage todosPage;
	@Test
	public void iaddTodo () throws IOException {
		
		todosPage = new TodosPage();
		
		boolean fieldTodo = todosPage.isElementDisplayed(TodosPage.inputField);
		Assert.assertTrue(fieldTodo);
		
		todosPage.submitTodo(prop.getProperty("test1"));
		
		String todoText = todosPage.checkElementContain(TodosPage.textTodo);
		Assert.assertTrue(todoText.contains(prop.getProperty("test1")));
		
		Boolean boxChecked = todosPage.isElementSelected(TodosPage.checkbox);
		Assert.assertFalse(boxChecked);
	}
	
	
	
	
	

}
