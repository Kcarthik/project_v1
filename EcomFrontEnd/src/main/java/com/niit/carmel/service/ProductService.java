package com.niit.carmel.service;

import java.util.List;


import com.niit.carmel.model.Product;

public interface ProductService {
	
	List<Product> getAllProducts();
	void delete(Product product);
	Product saveProduct(Product product);
	Product getProductById(int id);

}
