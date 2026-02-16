package com.kishan.streams.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapsMergeExample {

	public static void main(String[] args) {
		Map<String,String> asiaCurrencyMap = new HashMap<>();
        asiaCurrencyMap.put("INDIA","RUPEE");
        asiaCurrencyMap.put("NEPAL","RUPEE");
        asiaCurrencyMap.put("BANGLADESH","TAKA");
        
        Map<String,String> euCurrencyMap = new HashMap<>();
        euCurrencyMap.put("UK","POUND");
        euCurrencyMap.put("GERMANY","EURO");
        
        Map<String,String> currencyMap = Stream.concat(asiaCurrencyMap.entrySet().stream(),euCurrencyMap.entrySet().stream()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        //System.out.println(currencyMap);
        currencyMap.forEach((k,v)->System.out.println(k + "-" + v));

	}

}
