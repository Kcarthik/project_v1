package com.niit.carmel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.carmel.model.Product;
import com.niit.carmel.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	ProductService prodService;
	
	
	public ProductController()
	{
		System.out.println("Instantiating ProductController");
	}
	
	@RequestMapping("/admin/showform")
	public String showform(Model model)
	{
		
		//Product product=new Product();
		
		model.addAttribute("product", new Product());
		return "addproductform";
	}
	
	@RequestMapping("/addProduct")
	public String addProduct(@ModelAttribute("product") Product product)
	{
		Product products=prodService.saveProduct(product);
		return "redirect:/admin/showform";
	}
	
	

}
