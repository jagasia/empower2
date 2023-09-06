package com.empower.demo;

import java.util.Arrays;

public class MainEmployee {

	public static void main(String[] args) {
		Employee arr[]=new Employee[5];
		arr[0]=new Employee(12, "Steven", "King", 17000.0);
		arr[1]=new Employee(12, "Abdul", "Raheem", 24000.0);
		arr[2]=new Employee(14, "Skanda", "Smaran", 55000.0);
		arr[3]=new Employee(6, "Komal", "Gubbi", 55000.0);
		arr[4]=new Employee(8, "Chenna Keshava", "Reddy", 55000.0);
		
		//how to sort this array based on employee id?
		Arrays.sort(arr,(a,b)->b.getFirstName().compareTo(a.getFirstName()));
		
		for(Employee e : arr)
		{
			System.out.println(e);
		}
	}

}
