package com.Stream.InfiniteStreams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo3 {
		public static void main(String[] args) {
			Stream<Integer> list= Stream.iterate(1,i-> i+2);
			List<Integer> values=list.skip(2).limit(10).collect(Collectors.toList());
			values.forEach(System.out::println);
		}
}
