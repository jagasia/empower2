package com.empower.demo;

public class MainShape {

	public static void main(String[] args) {
		Shape s;		//have you created an object of Shape???? NO. we have created ref var of Shape
		//When s is declared as Shape, it is confined only to Shape methods
//		s=new Circle();		//only when you use new operator, you create object
//		s=new Triangle();
		s=new Circle();
		//are you able to see a polymorphism
		s.calculateArea();
	}

}
