package com.tyss.hasclass;

public class Worker {
	Address address;
	int id;
	String name;
	String designation;
	
	
	public Worker(Address address, int id, String name, String designation) {
		super();
		this.address = address;
		this.id = id;
		this.name = name;
		this.designation = designation;
	}

	void display() {
		System.out.println(id + " " + name);
		System.out.println(address.doorno + " " + address.state);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address ad = new Address(1, "south street", "TamilNadu");
		Worker w1 = new Worker(ad, 23, "venkat", "manager");
		w1.display();
		
		

	}

}
