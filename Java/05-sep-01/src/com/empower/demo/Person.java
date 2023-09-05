package com.empower.demo;

public interface Person {
	int AGE=20;
	void speak();
	static void run()
	{
		System.out.println("Person runs");
	}
	
	default void walk()
	{
		System.out.println("Person walks");
	}
}
