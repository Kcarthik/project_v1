package com.niit.carmel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	public HomeController() {
		System.out.println("Home Controller Instantiation");
	}

	// localhost:8080/PickBook/
	// localhost:8080/PickBook/index
	@RequestMapping({ "/index", "/" })
	public String index() {
		return "index"; // logical name of a page
	}

	

}
