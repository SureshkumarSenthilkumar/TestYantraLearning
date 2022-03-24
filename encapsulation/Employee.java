package com.tyss.encapsulation;

public class Employee {
	
	private String Name;
	private int age;
	private double salary;
	private String department;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	

}
