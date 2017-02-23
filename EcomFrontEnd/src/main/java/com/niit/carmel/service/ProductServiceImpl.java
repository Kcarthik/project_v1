package com.niit.carmel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.carmel.dao.ProductDAO;
import com.niit.carmel.model.Product;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductDAO productDAO;
	
	public List<Product> getAllProducts() {
		
		return productDAO.getAllProducts();
	}

	public void delete(Product product) {
		productDAO.delete(product);
		
	}

	public Product saveProduct(Product product) {
		return productDAO.saveProduct(product);
		
	}

	public Product getProductById(int id) {
		
		return productDAO.getProductById(id);
	}

}
