package com.empower.demo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1) Chair\r\n" + 
				"2) BookShelf\r\n" + 
				"3) Exit\r\n" + 
				"");
		int choice=sc.nextInt();
		Furniture f=null;		//reference variable of type Furniture
		switch(choice)
		{
		case 1:
			System.out.println("You have chosen Chair");
			f=new Chair();
			break;
		case 2:
			System.out.println("You have chosen BookShelf");
			f=new BookShelf();
			break;
		default:
			return;
		}
		
		f.acceptDetails();
		f.displayDetails();
		
		
		
	}

}
