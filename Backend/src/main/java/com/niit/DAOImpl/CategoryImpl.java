package com.niit.DAOImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.niit.DAO.CategoryDAO;
import com.niit.model.Category;

@Repository(value="categoryDAO")
public class CategoryImpl implements CategoryDAO {
	@Autowired
	SessionFactory sessionFactory;

	public void addCategory(Category category) {

		Session session=sessionFactory.openSession();
session.beginTransaction(); session.save(category);
session.getTransaction().commit();
session.close();
	
	}
	public void deleteCategory(Category category) {

		Session session=sessionFactory.openSession();
session.beginTransaction(); session.save(category);
session.getTransaction().commit();
session.close();
	
	}
	public void updateCategory(Category category) {

		Session session=sessionFactory.openSession();
session.beginTransaction(); session.save(category);
session.getTransaction().commit();
session.close();
	
	}
	public void getCategory1(int  categoryId) {

		Session session=sessionFactory.openSession();
session.beginTransaction(); session.save( categoryId);
session.getTransaction().commit();
session.close();
	
	}
	public void getCategory(int categoryId) {
		// TODO Auto-generated method stub
		
	}

}