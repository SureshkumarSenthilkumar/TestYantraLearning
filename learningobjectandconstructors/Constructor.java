package com.tyss.learningobjectandconstructors;

public class Constructor {
//	int number;
//	String name;
//	Constructor() {
//		System.out.println("Constructor Called");
//	}
	double point;
	String name;
	Constructor(int num, String names){
		point = num;
		name = names;
		System.out.println(point + name);
	}
	Constructor(double num, String names){
		point = num;
		name = names;
		System.out.println(num + names);
	}
	

	public static void main(String[] args) { 
//		Constructor obj = new Constructor();
//		System.out.println(obj.number);
		Constructor obj = new Constructor(3, "hello");
		Constructor object = new Constructor(3.3,"helloall");
		System.out.println(obj.point);
		System.out.println(obj.name);
		System.out.println(object.point);
		System.out.println(object.name);
		
		
		
	}

}
