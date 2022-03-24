package com.tyss.exceptionstacktrace;

public class Stacktrace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program start");
		try {
		throw new ArithmeticException(); 
		}
		catch(Exception a){
			System.out.println("HelloAll"); 
			a.printStackTrace(); 
		}
		////////////////////////////////////
		System.out.println("Program end");
		

	}

}
