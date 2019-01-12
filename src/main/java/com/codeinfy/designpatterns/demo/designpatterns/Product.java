package com.codeinfy.designpatterns.demo.designpatterns;


public class Product {
	
	private String name;
	private Color color;
	private Size size;
	
	public Product(String name, Color color, Size size) {
		super();
		this.name = name;
		this.color = color;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}
	
	
	
	
	
}

enum Color{
	
	Red,Green,Blue
}

enum Size{
	Small,Large,Huge;
}
