package com.features.stream.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReduceListToStoreItInOptional {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		
		stringList.add("a");
		stringList.add("b");
		stringList.add("a");
		
		Stream<String> stream = stringList.stream();
		
		// reduce list to store it in optional 
		System.out.println("Step 1. Reduce list to store it in optional.");
		// a container object may or may not contain a non-null value
		Optional<String> optional = stream.sorted().reduce((s1, s2)-> s1 + ", " + s2);
		
		// display optional - isPresent() will return true if a value is present
		System.out.println(optional.isPresent());
		
		// get value
		System.out.println(optional.get());
		
		// OR
		
		//optional.ifPresent(System.out::println);
		String str = stringList.stream().sorted().collect(Collectors.joining(","));
		System.out.println(str);
		
	}

}
