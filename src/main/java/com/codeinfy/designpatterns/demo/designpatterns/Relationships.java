package com.codeinfy.designpatterns.demo.designpatterns;

import java.util.ArrayList;
import java.util.List;

import org.javatuples.Triplet;
import org.springframework.stereotype.Component;

@Component
public class Relationships { // low - level module beacause 
	//it performs data storage operation

	
	private List<Triplet<Person,Relationship,Person>> relations = new ArrayList<>();
	
	public void addRelationParentChild(Person parent, Person child) {
		relations.add(new Triplet<Person, Relationship, Person>(parent, 
															    Relationship.Parent, 
															    child));
		relations.add(new Triplet<Person, Relationship, Person>(child, Relationship.Child,
																parent));
		
		
	}

	public List<Triplet<Person, Relationship, Person>> getRelations() {
		return relations;
	}

	public void setRelations(List<Triplet<Person, Relationship, Person>> relations) {
		this.relations = relations;
	} 
	
}
