package com.tyss.exception;

import java.util.Scanner;

public class RTO extends Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Name");
		name = scanner.next();
		System.out.println("Enter the age");
		int age = scanner.nextInt();
		checkAge(age);
		
		
	}

}
