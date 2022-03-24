package com.tyss.upcasting;

public class Admin extends User{

	public Admin(String name, long number) {
		super(name, number);
		// TODO Auto-generated constructor stub
	}
	
	void addMember(String name) {
		System.out.println(name +" member added");
	}
	
	void removedMember(String name) {
		System.out.println(name +" member removed");
	}

	 

}
