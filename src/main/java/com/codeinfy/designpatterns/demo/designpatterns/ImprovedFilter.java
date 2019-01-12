package com.codeinfy.designpatterns.demo.designpatterns;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;

@Component
public class ImprovedFilter implements Filter<Product> {

	@Override
	public Stream<Product> filterBySpecifictation(Specification<Product> specification, List<Product> products) {
		return products.stream().filter(p -> specification.isCriteriaMatched(p));
	}

}
