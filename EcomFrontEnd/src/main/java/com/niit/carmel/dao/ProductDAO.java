package com.niit.carmel.dao;

import java.util.List; 

import com.niit.carmel.model.Product;

public interface ProductDAO {
	// methods for CRUD Operations
	
	List<Product> getAllProducts();
	void delete(Product product);
	Product saveProduct(Product product);
	Product getProductById(int id);

}
