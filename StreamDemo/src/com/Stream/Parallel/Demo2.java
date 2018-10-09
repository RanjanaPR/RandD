package com.Stream.Parallel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo2 {
	 static void Process(StudentPojo n) {
			System.out.println("using lamda" +n);
			
	 }

	public static void main(String[] args) {
			
		
		List<StudentPojo> list1= new ArrayList<StudentPojo>();
		list1.add(new StudentPojo("Ranju", 21));
		list1.add(new StudentPojo("Aanjana", 24));	
	list1.add(new StudentPojo("eshu", 27));
	list1.add(new StudentPojo("yeshu", 27));

	
	Stream<StudentPojo> stream=list1.parallelStream();
	//stream.forEach(System.out::println);
	
	
	stream.forEach((n -> Process(n)));


	
	}
	}

