package com.empower.ecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.empower.ecom.model.Product;
import com.empower.ecom.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService ps;
	
	@GetMapping
	public ModelAndView showProductPage()
	{
		//retrieve all products and store in model
		List<Product> products = ps.retrieveAllProducts();
		ModelAndView mv=new ModelAndView();
		mv.setViewName("product");
		mv.addObject("products", products);
		return mv;
	}
	
	@RequestMapping(value = "dml", method = RequestMethod.POST, params = "add")
	public ModelAndView addProduct(Product product)
	{
		ps.addProduct(product);
		return showProductPage();
	}
	
	@RequestMapping(value = "dml", method = RequestMethod.POST, params = "update")
	public ModelAndView updateProduct(Product product)
	{
		ps.updateProduct(product);
		return showProductPage();
	}
	
	@RequestMapping(value = "dml", method = RequestMethod.POST, params = "delete")
	public ModelAndView deleteProduct(Product product)
	{
		ps.deleteProduct(product.getId());
		return showProductPage();
	}
}
