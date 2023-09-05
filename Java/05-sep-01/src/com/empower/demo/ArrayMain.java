package com.empower.demo;

import java.util.Arrays;

public class ArrayMain {

	public static void main(String[] args) {
		Integer []arr= {13,42,35,64,57,86,79};
		//how to sort this array?
		Arrays.sort(arr,(a,b)->b-a);
		
		System.out.println(Arrays.toString(arr));
	}

}
