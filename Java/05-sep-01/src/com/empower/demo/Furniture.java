package com.empower.demo;

import java.util.Scanner;

public class Furniture {
	private String name;
	private String color;
	private Double price;
	
	public Furniture() {}
	
	public Furniture(String name, String color, Double price) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Furniture [name=" + name + ", color=" + color + ", price=" + price + "]";
	}
	
	public void acceptDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:");
		name=sc.nextLine();
		System.out.println("Enter the color:");
		color=sc.nextLine();
		System.out.println("Enter the price:");
		price=sc.nextDouble();
	}
	
	public void displayDetails()
	{
		System.out.println("Name: "+name);
		System.out.println("Color: "+color);
		System.out.println("Price: "+price);
		
	}
	
}
