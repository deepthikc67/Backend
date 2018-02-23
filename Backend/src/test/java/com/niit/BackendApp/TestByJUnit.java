package com.niit.BackendApp;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.DAO.CategoryDAO;
import com.niit.model.Category;

public class TestByJUnit {

	

	@Autowired static AnnotationConfigApplicationContext context;
	
	 static CategoryDAO  categoryDAO;
	


	@BeforeClass
	public static void initialize()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
	
		categoryDAO =  (CategoryDAO) context.getBean("categoryDAO");
	
		
		
		
	}

	
	
	 
	@Test
	public void updateUserTestCase()
	{
		

		
		Category category= new Category();
		category.setCategoryName("karboon");
		categoryDAO.addCategory(category);	
		assertEquals(category.getCategoryName(),category.getCategoryName());
		
	}
}
