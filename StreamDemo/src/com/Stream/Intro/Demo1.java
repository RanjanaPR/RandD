package com.Stream.Intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo1 {

	public static void main(String[] args) {
String [] arr= new String[] {"aa","bb","cc"};
Stream<String> stream=Arrays.stream(arr);
stream.forEach(System.out::println);
System.out.println("----------------------");
List<String> list1= new ArrayList<String>();
list1.add("Ranju");
list1.add("yashu");
   Stream<String> streams=list1.stream();
   streams.forEach(System.out::println);
   System.out.println("----------------------");
   
   Stream  <String> stream1=Stream.of("Rachana","gvg");
   stream1.forEach(System.out::println);
   
	}
}
