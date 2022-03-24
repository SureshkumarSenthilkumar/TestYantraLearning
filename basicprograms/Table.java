package com.tyss.basicprograms;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number");
		int number = input.nextInt();
		for (int i = 0; i < 10 ; i++) {
//			int product = i * number;
			System.out.println(number + " * " + (i + 1) + " = "+ (number*(i+1)));
		}
		

	}

}
