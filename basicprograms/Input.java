package com.tyss.basicprograms;

import java.util.Scanner;

public class Input {

	private static Scanner number;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int output;
		String names;
		System.out.println("enter the name");
		number = new Scanner(System.in);
		names = number.nextLine();
		System.out.println(names.toUpperCase());
		output = number.nextInt();
		System.out.println("enter the number");
		System.out.println(output);
		System.out.println(output + " " + names);
	}

}
