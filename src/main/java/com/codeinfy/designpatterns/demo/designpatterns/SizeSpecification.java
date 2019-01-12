package com.codeinfy.designpatterns.demo.designpatterns;

public class SizeSpecification implements Specification<Product>{

	Size size;
	
	
	
	public SizeSpecification(Size size) {
		super();
		this.size = size;
	}

	@Override
	public boolean isCriteriaMatched(Product product) {
		// TODO Auto-generated method stub
		
		return (this.size == product.getSize()) ? true : false ;
	}

}
