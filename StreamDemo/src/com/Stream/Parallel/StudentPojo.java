package com.Stream.Parallel;

public class StudentPojo {
 String name;
 int age;
/**
 * @param name
 * @param age
 */
public StudentPojo(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}
@Override
public String toString() {
	return "StudentPojo [name=" + name + ", age=" + age + "]";
}
 
}
