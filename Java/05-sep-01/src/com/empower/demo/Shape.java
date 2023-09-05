package com.empower.demo;


public abstract class Shape {
	String name;
	String bgColor;
	String borderColor;
	
	public Shape() {}

	public Shape(String name, String bgColor, String borderColor) {
		super();
		this.name = name;
		this.bgColor = bgColor;
		this.borderColor = borderColor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBgColor() {
		return bgColor;
	}

	public void setBgColor(String bgColor) {
		this.bgColor = bgColor;
	}

	public String getBorderColor() {
		return borderColor;
	}

	public void setBorderColor(String borderColor) {
		this.borderColor = borderColor;
	}
//	public void calculateArea() {}
	
	public abstract void calculateArea();
	
}
