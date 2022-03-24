package com.tyss.basicprograms;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		a = 2;
		b = 3;
		System.out.println("the value of a and b before swapping is " + a + " " + b);
		c = a + b;
		b = c - b;
		a = c - b;
		
//		c = a;
//		a = b;
//		b = c;
//		c = b;
//		b = a;
//		a = c;
		System.out.println("the value of a and b after swapping is " + a + " " + b);
		
		
		
		

	}

}
