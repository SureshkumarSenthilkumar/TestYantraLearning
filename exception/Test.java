package com.tyss.exception;

public class Test {
	static String name;
	int age;

	static void checkAge(int age){
		if (age > 18) {
			System.out.println(name + " Hey! You are eligible");
		}
		else {
			try {
				throw new InSufficientAge("Minimum Age 18 Required");
			} catch (InSufficientAge e){
				System.out.println(e.getMessage());
			}	
		}
		 
	}
	
}
