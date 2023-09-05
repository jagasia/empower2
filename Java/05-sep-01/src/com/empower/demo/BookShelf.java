package com.empower.demo;

import java.util.Scanner;

public class BookShelf extends Furniture{
	private Integer noOfShelves;
	
	public BookShelf() {}

	public BookShelf(Integer noOfShelves) {
		super();
		this.noOfShelves = noOfShelves;
	}

	public Integer getNoOfShelves() {
		return noOfShelves;
	}

	public void setNoOfShelves(Integer noOfShelves) {
		this.noOfShelves = noOfShelves;
	}

	@Override
	public String toString() {
		return "BookShelf [noOfShelves=" + noOfShelves + "]";
	}
	
	public void acceptDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("No. of Shelves:");
		noOfShelves=sc.nextInt();
	}
	
	public void displayDetails()
	{
		System.out.println("No. of Shelves: "+noOfShelves);
	}
	
}
