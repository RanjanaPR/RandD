package com.Stream.Builder;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class demo6 {
	public static void main(String[] args) {

		Stream <String>build = Stream.<String>builder().add("fa").add("bb").add("ac").build();
		build.forEach(System.out::println);
		System.out.println("-----------");
		
		 Stream<String> supplies = Stream.generate(() ->"ranju").limit(11);
		supplies.forEach(System.out::println);
}
}
