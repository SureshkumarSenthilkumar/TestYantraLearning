package com.tyss.basicprograms;
import java.util.Scanner;
public class ArithmeticOperation {
	static void add(int a, int b) {
		int out = a + b;
		System.out.println("add " + out);
	}
	static void sub(int a, int b) {
		int out = a - b;
		System.out.println("sub " + out);
	}
	static void mul(int a, int b) {
		int out = a * b;
		System.out.println("mul " + out);
	}
	static void div(int a, int b) {
		int out = a / b;
		System.out.println("div " + out);
	}
	static void rem(int a, int b) {
		int out = a % b;
		System.out.println("rem " + out);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter the numbers");
		int a = input.nextInt();
		int b = input.nextInt();
		
		add(a, b);
		sub(a, b);
		mul(a, b);
		div(a, b);
		rem(a, b);
		
	}

}
