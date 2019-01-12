package com.codeinfy.designpatterns.demo.designpatterns;


import org.springframework.stereotype.Component;


public class Person {

	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(String name) {
		super();
		this.name = name;
	}
	
	 
		
}  
