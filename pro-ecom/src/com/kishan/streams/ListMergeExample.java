package com.kishan.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListMergeExample {

	public static void main(String[] args) {
		List<String> asianCountries = Arrays.asList("INDIA","BHUTAN","NEPAL");
		List<String> europeanCountries = Arrays.asList("RUSSIA","BRITAIN","GERMANY");
		List<String> mergedList = Stream.concat(asianCountries.stream(), europeanCountries.stream()).collect(Collectors.toList());
		System.out.println(mergedList);
		
		List<String> fruitList = Arrays.asList("APPLE", "BANANA", "GRAPES", "PINEAPPLE");
		List<String> vegetableList = Arrays.asList("POTATO", "TOMATO", "SPINACH", "BRINJAL");
		
		List<String> foodList = Stream.concat(fruitList.stream(), vegetableList.stream()).collect(Collectors.toList());
		foodList.forEach(e->System.out.println(e));
	}

}
