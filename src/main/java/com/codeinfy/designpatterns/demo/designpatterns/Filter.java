package com.codeinfy.designpatterns.demo.designpatterns;

import java.util.List;
import java.util.stream.Stream;

public interface Filter<T> {

		 Stream<T> filterBySpecifictation(Specification<T> specification ,List<T> products);
}
