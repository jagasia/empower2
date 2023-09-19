package com.empower.ecom.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.empower.ecom.model.Product;
import com.empower.ecom.model.ProductDaoImpl;

@Controller
@RequestMapping("product")
public class ProductController {
	@Autowired
	private ProductDaoImpl pdao;
	
	
	
	@GetMapping("/show")
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
	
	@GetMapping("/select1/{id}")
	public String select1(@PathVariable("id")Integer id, ModelMap model)
	{
		Product product = pdao.read(id);
		model.addAttribute("product", product);
		loadProducts(model);

		return "product";
	}

	
	
	@RequestMapping(value = "/dml",method = RequestMethod.POST, params = "add")
//	@ResponseBody
	public String addProduct(Product product, ModelMap model)
	{
		pdao.create(product);
		loadProducts(model);
//		return "product is added";
		return "product";
	}
	
	@RequestMapping(value = "/dml",method = RequestMethod.POST, params = "update")
	public ModelAndView updateProduct(Product product, HttpSession session)
	{
		pdao.update(product);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("product");
		List<Product> products = pdao.read();
		mv.addObject("products", products);
//		model.addAttribute("products", products);
//		loadProducts(model);
		return mv;
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
