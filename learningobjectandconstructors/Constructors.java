package com.tyss.learningobjectandconstructors;
 

public class Constructors {
	int numbers;
	String names;
	char groups;
	Constructors(){
		numbers = 2;
		System.out.println(numbers);
	}
	Constructors(int n){
		numbers = n;
		System.out.println(numbers);
	}
	Constructors(String name, int number, char group){
		names = name;
		numbers = number;
		groups = group;
		System.out.println(name +" "+ number+" " + group);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructors obj = new Constructors("hello",336271,'O');
//		ArithmeticOperation.add(4, 5);
//		MethodOverloading.add(3,6);
		Circle.average(2, 3, 4);
		
		

	}

}
