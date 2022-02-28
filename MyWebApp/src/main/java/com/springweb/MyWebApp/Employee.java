package com.springweb.MyWebApp;

public class Employee {
	
	String name;
	int age;
	int salary;
	public Employee(String name, int age, int i) {
		super();
		this.name = name;
		this.age = age;
		this.salary = i;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public Double getSalary() {
		return (double) salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	

}
