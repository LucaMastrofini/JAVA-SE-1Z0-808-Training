package com.training.datatypes.fieldsdemo;

public class Person {

	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age < 18 || age > 65) {
			throw new IllegalArgumentException("Age is out of range");
			//Exception(e) is a checked exception.  Java then requires to handle the exception by a try/catch clause.
			//IllegalArgumentException is an UnchedException and Java doesn't require to handle the exception. Therefore
			//The exception could potentially crash our application
		}
		this.age = age;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	
}
