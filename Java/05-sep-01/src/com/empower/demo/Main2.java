package com.empower.demo;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		try(Scanner sc=new Scanner(System.in))
		{
			int i=sc.nextInt();
			float f=sc.nextFloat();
			System.out.println(i);
			System.out.println(f);
		}
	}

}
