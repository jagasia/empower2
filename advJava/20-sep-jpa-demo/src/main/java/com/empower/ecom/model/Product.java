package com.empower.ecom.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.apache.tomcat.util.codec.binary.Base64;

@Entity
@Table(name="PRODUCT")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
//	@Column(name = "PRODUCT_NAME")
	@Size(min = 5, message = "Product name must be atleast 5 characters")
	private String name;
	@Min(value = 0, message = "Price cannot be negative")
	private Double price;
	@Lob
	private byte[] pic;
	
	public Product() {}

	public Product(Integer id, String name, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	

	public Product(Integer id, @Size(min = 5, message = "Product name must be atleast 5 characters") String name,
			@Min(value = 0, message = "Price cannot be negative") Double price, byte[] pic) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.pic = pic;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	

	public byte[] getPic() {
		return pic;
	}
	
	public String getPic1()
	{
		//convert the byte [] into Base64 String
		return Base64.encodeBase64String(pic);
	}

	public void setPic(byte[] pic) {
		this.pic = pic;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", pic=" + pic.length + "]";
	}


	
}
