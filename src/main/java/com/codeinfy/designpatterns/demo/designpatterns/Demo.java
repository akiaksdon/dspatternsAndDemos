package com.codeinfy.designpatterns.demo.designpatterns;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//Specification pattern demo example
//implements open closed principle  of (S.(O).L.I.D)

@Component
public class Demo implements CommandLineRunner {

	@Autowired
	FilterProduct filter;
	
	@Autowired
	ImprovedFilter ifilter;
	
	@Autowired
	Relationships relationships ;
	
	@Autowired
	Research research;
	
	@Override
	public void run(String... args) throws Exception {
//		openClosedPrinciple();
//		dependencyInversionPrinciple();
//		builderExample();
//		stringReplacer();
		stringPatternRepalcer();
		
	}
	
	private void stringPatternRepalcer() {
		StringBuilder sb = new StringBuilder("X032883 - EOC Assessment & Plan - Review - 02-01-2019.pdf");
		String[] dates = getandReplaceDate(sb.toString());
		
		System.out.println(dates[0]);
		System.out.println(dates[1]);
	}
	private static String[] getandReplaceDate(String desc) {
		  int count=0;
		  String[] allMatches = new String[2];
			StringBuilder sbDate = new StringBuilder();
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
			String todaysDate = simpleDateFormat.format(new Date());
		  Matcher m = Pattern.compile("(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d").matcher(desc);
		  if (m.find()) {
		    allMatches[0] = m.group(); 
		    allMatches[1] = m.replaceFirst(todaysDate);
		  }
		  return allMatches;
		}

	private void stringReplacer() {
		StringBuilder sb = new StringBuilder("X032883 - EOC Assessment & Plan - Review - 02-01-2019.pdf");
		StringBuilder sbDate = new StringBuilder();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
		String todaysDate = simpleDateFormat.format(new Date());
		sbDate.append(todaysDate).append(".pdf");
		System.out.println(sbDate);
		System.out.println(sb);
		sb.replace(43,sb.length(),sbDate.toString());
		System.out.println(sb);

	}

	private void builderExample() {
		String [] content = {"akshay","hello"};
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("<ul>\n");
		
		for (String singleWord : content) {
			
			sb.append(String.format("  <li> %s </li>\n", singleWord));
			
		}
		sb.append("</ul>");
		
		System.out.println(sb);
		
	}

	private void dependencyInversionPrinciple() {
		Person parent = new Person("John");
		Person child1 = new Person("akshay");
		Person child2 = new Person("tanmay");
		
		relationships.addRelationParentChild(parent, child1);
		relationships.addRelationParentChild(parent, child2);
		
		research.research(relationships);
		
		
	}

	private void openClosedPrinciple() {
		List<Product> products = new ArrayList<>();
		Product Apple = new Product("apple",Color.Red,Size.Small);
		Product Building = new Product("building",Color.Blue,Size.Huge);
		products.add(Apple);
		products.add(Building);
		
		Stream<Product> filteredProducts =filter.filterProducts(products, Color.Red);
		filteredProducts.forEach(filteredProduct ->
		System.out.println("product is " + filteredProduct.getName() +
				            " color is " + filteredProduct.getColor()));
		ColorSpecification cspecification = new ColorSpecification(Color.Red);
		SizeSpecification sizespecification = new SizeSpecification(Size.Huge); 
		
		Stream<Product> filteredProductsByIfilter = ifilter.filterBySpecifictation(cspecification, products);
		displayFilteredProducts(filteredProductsByIfilter);
		
		filteredProductsByIfilter = ifilter.filterBySpecifictation(sizespecification, products);
		displayFilteredProducts(filteredProductsByIfilter);		
	}

	public void displayFilteredProducts(Stream<Product> filteredProductsByIfilter){
		filteredProductsByIfilter.forEach(filteredProductByIfilter ->
		System.out.println("filtered product is " + filteredProductByIfilter.getName() +
	            " filtered product color is " + filteredProductByIfilter.getColor()));
	}


}
