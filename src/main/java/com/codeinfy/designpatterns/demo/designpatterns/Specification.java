package com.codeinfy.designpatterns.demo.designpatterns;

public interface Specification <T>{
	
	boolean isCriteriaMatched(T product);

}
