package com.empower.ecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
		loadProducts(model);
		return "product";
	}
	
	@GetMapping("/select")
	public String select(@RequestParam("id")Integer id, ModelMap model)
	{
		Product product = pdao.read(id);
		model.addAttribute("product", product);
		loadProducts(model);

		return "product";
	}

	
	
	@RequestMapping(value = "/dml",method = RequestMethod.POST, params = "add")	
	public String addProduct(Product product, ModelMap model)
	{
		pdao.create(product);
		loadProducts(model);
		return "product";
	}
	
	@RequestMapping(value = "/dml",method = RequestMethod.POST, params = "update")
	public String updateProduct(Product product, ModelMap model)
	{
		pdao.update(product);
		loadProducts(model);
		return "product";
	}
	
	@RequestMapping(value = "/dml",method = RequestMethod.POST, params = "delete")
	public String deleteProduct(Product product, ModelMap model)
	{
		pdao.delete(product.getId());
		loadProducts(model);
		return "product";
	}
	
	private void loadProducts(ModelMap model) {
		List<Product> products = pdao.read();
		model.addAttribute("products", products);
	}
}
