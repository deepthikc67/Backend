package com.niit.BackendApp;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.Config.DBConfig;
import com.niit.DAO.ProductDAO;
import com.niit.model.Product;


public class TestDemo {
	public static void main(String []arg)
	{
		
	
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DBConfig.class);
	


	ProductDAO productDAO=(ProductDAO)context.getBean("product");
	
	Product product=new Product();
	product.setProductName("Karboon k9");
	product.setProductDesc("2g A40");
	product.setProductPrice(1200);
	product.setProductInStock(35);
	
	productDAO.addProduct(product);


	/*UserDAO userDAO=(UserDAO)context.getBean("user");
	
	User user=new User();
	
	user.setUserName("deepu");
	user.setPassword("abcd");
	user.setMobileNO(143322569);
	user.setUserAddress("Bangalore");
	
	
	
	userDAO.addUser(user);*/
	
	
	/*SupplierDAO supplierDAO=(SupplierDAO)context.getBean("supplier");
	Supplier supplier=new Supplier();
	
	supplier.setSupplierName("mahi");
	supplier.setSupplierMobileNO(1234234689);
	supplier.setSupplierAddress("Bangalore");

	supplierDAO.addSupplier(supplier);

	
*/
	
     
	
	}
	}
