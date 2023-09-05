package com.empower.demo;

import java.util.Scanner;

public class Chair extends Furniture {
	private Integer noOfLegs;
	
	public Chair() {
		super();
		System.out.println("hi");
		
	}

	public Chair(Integer noOfLegs) {
		super();
		this.noOfLegs = noOfLegs;
	}

	public Integer getNoOfLegs() {
		return noOfLegs;
	}

	public void setNoOfLegs(Integer noOfLegs) {
		this.noOfLegs = noOfLegs;
	}

	@Override
	public String toString() {
		return "Chair [noOfLegs=" + noOfLegs + "]";
	}
	
	public void acceptDetails()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of legs");
		noOfLegs=sc.nextInt();
		super.acceptDetails();
	}
	
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("No. of legs: "+noOfLegs);
	}
	
}
