package com.tyss.upcasting;

public class User {
	String name;
	long number;
	
	
	public User(String name, long number) {
		super();
		this.name = name;
		this.number = number;
	}

	void text(String name, long number) {
		System.out.println(name + " can message with " + number);
	}
	
	void share(String name, long number) {
		System.out.println(name + " can share with " + number);
	}
	
	void videoChat(String name, long number) {
		System.out.println(name + " can video call with " + number);
	}

	

}
