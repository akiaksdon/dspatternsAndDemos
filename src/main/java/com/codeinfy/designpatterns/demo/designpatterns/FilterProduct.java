package com.codeinfy.designpatterns.demo.designpatterns;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;

@Component
public class FilterProduct {
	
	public Stream<Product> filterProducts(List<Product> products,Color color) {
		return products.stream().filter(p -> p.getColor()==color);
		
	}

}
