package com.niit.carmel.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.carmel.model.Product;

@Repository
public class ProductDAOImpl implements ProductDAO{

	@Autowired
	SessionFactory sessionFactory;
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(Product product) {
		// TODO Auto-generated method stub
		
	}

	public Product saveProduct(Product product) {
		Session session=sessionFactory.openSession();
		session.save(product);
		session.flush();
		session.close();
		return product;
		
	}

	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
