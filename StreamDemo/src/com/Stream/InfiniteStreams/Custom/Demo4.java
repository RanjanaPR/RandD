package com.Stream.InfiniteStreams.Custom;

import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo4 {
	public static void main(String[] args) {
		
		Supplier<UUID> randUUid=UUID::randomUUID;
		 Stream<UUID> randIds = Stream.generate(randUUid);
		List<UUID> UUIds = randIds.limit(10).collect(Collectors.toList());
		UUIds.forEach(System.out::println);
		
		System.out.println("----------------");
	
	Stream<Integer> iterate=Stream.iterate(0, i -> i+1);
	iterate.limit(10).collect(Collectors.toList()).forEach(System.out::println);
	}
}
