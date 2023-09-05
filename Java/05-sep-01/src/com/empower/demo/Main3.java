package com.empower.demo;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		int i=0;
		try {
		i=Integer.parseInt(input);
		System.out.println(i);
		}catch(NumberFormatException nfe)
		{
			System.out.println("Please enter only number.");
		}

	}

}
