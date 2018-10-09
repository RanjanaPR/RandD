package com.Stream.ReferenceStream;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo5 {
	public static void main(String[] args) {
		
List<String> stream = Stream.of("a","b","c").filter(k->k.contains("b")).collect(Collectors.toList());
	
		 Optional<String> findAny = stream.stream().findAny();
		 System.out.println(findAny);
		 
		 Optional <String> findFirst=stream.stream().findFirst();
		 System.out.println(findAny);
	}
	
}
