package com.empower.ecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.empower.ecom.model.Product;
import com.empower.ecom.model.ProductDaoImpl;

@Controller
public class MyController {
	@Autowired
	private ProductDaoImpl pdao;
	
	@GetMapping
	public String home()
	{
		return "index";		//prefix + index + suffix
	}
	
	@GetMapping("/showProductPage")
	public String showProductsPage(ModelMap model)
	{
		List<Product> products = pdao.read();
		model.addAttribute("products", products);
		return "product";
	}
	
	@GetMapping("/select")
	public String select(@RequestParam("id")Integer id, ModelMap model)
	{
		Product product = pdao.read(id);
		model.addAttribute("product", product);
		List<Product> products = pdao.read();
		model.addAttribute("products", products);

		return "product";
	}
}
