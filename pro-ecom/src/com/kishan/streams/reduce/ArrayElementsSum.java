package com.kishan.streams.reduce;

import java.util.Map;
import java.util.Arrays;
import java.util.List;

import java.util.Optional;
import java.util.function.Function;
public class ArrayElementsSum {

	public static void main(String[] args) {
		Integer[] numArray = {1,2,3,4,5};
	       List<Integer> numList = Arrays.asList(numArray);
	       
	       for(int i=0;i<numArray.length;i++){
	           System.out.println(numArray[i]);
	       }
	        //fruitMap.forEach((k,v)->System.out.println(k + "-" + v));
	        
	        Optional<Integer> sum = numList.stream().reduce((a,b)->a+b);
	        System.out.println(sum);
	        

	}

}
