package com.empower.ecom.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empower.ecom.model.Product;
import com.empower.ecom.model.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository pr;
	
	public Product addProduct(Product product) {
		return pr.save(product);
	}
	public List<Product> retrieveAllProducts() {
		return pr.findAll();
	}
	public Product findProductById(Integer id) {
		Optional<Product> temp = pr.findById(id);
		Product product=null;
		if(temp.isPresent())
		{
			product=temp.get();
		}
		return product;
	}
	public Product updateProduct(Product product) {
		//if product is already present then only update
		Product p = findProductById(product.getId());
		if(p!=null)
		{
			p=product;
			pr.save(p);
		}
		return p;
	}
	public Product deleteProduct(Integer id) {
		Product p = findProductById(id);
		if(p!=null)
		{
			pr.delete(p);
		}
		return p;
	}
}
