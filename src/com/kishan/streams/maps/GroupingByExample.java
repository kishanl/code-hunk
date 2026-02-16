package com.kishan.streams.maps;

import java.util.Map;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Function;

public class GroupingByExample {

	public static void main(String[] args) {
		List<String> fruitList = Arrays.asList("APPLE", "BANANA", "PINEAPPLE", "APPLE", "BANANA", "PINEAPPLE",
				"PINEAPPLE");

		Map<String, Long> fruitMap = fruitList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(fruitMap);

	}

}
