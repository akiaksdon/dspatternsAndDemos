package com.codeinfy.designpatterns.demo.designpatterns;

public class ColorSpecification implements Specification<Product>{

	Color color;
	
	
	
	public ColorSpecification(Color color) {
		super();
		this.color = color;
	}

	@Override
	public boolean isCriteriaMatched(Product product) {
		// TODO Auto-generated method stub
		
		return (this.color == product.getColor()) ? true : false ;
	}

}

