package com.tyss.basicprograms;

import java.util.Scanner;

public class EvenOdd {
	
	static void even(int limit) {
		System.out.println("For Even number");
		for (int i = 0; i < limit; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	static void odd(int limit) {
		System.out.println("For Odd number");
		for (int j = 0; j < limit; j++) {
			if (j % 2 != 0) {
				System.out.println(j);
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the limit");
		int limit = input.nextInt();
		odd(limit);
		even(limit);
		
		

	}

}
