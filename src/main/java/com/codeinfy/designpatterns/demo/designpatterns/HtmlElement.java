package com.codeinfy.designpatterns.demo.designpatterns;

import java.util.ArrayList;

public class HtmlElement {
	
	public String element,text;
	public ArrayList<HtmlElement> elements = new ArrayList<>();
	
	private final int indentSize = 2;
	private final String newLine = System.lineSeparator();
	
	public HtmlElement() {
		
	}

	public HtmlElement(String element, String text) {
		super();
		this.element = element;
		this.text = text;
	}
	
	

}
