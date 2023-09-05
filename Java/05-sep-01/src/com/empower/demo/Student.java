package com.empower.demo;

public class Student implements Person{
	public void speak()
	{
		System.out.println("Student speaks");
	}
	
	public void walk()
	{
		System.out.println("Student walks");
	}
	public static void laugh()
	{
		System.out.println("Student laughs");
	}
	public static void main(String args[])
	{
		Student.laugh();
		System.out.println("hello world");
		Student shahnawaz=new Student();		
		shahnawaz.speak();
		shahnawaz.laugh();
		Person.run();
		shahnawaz.walk();
	}

}
