package com.codeinfy.designpatterns.demo.designpatterns;

import org.springframework.stereotype.Component;

@Component
public class Research {
	
	public void research(Relationships relationships) {
		
		relationships.getRelations()
		.stream()
		.filter(t-> t.getValue0().getName()== "akshay" 
		        && t.getValue1()==Relationship.Child)
		.forEach(ch ->
		System.out.println(ch.getValue0().getName() + " has a parent " +ch.getValue2().getName()));
		
		
		
	}

}
