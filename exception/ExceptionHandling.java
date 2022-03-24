package com.tyss.exception;

import java.util.Scanner;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner b = new Scanner(System.in);
		try {
		System.out.println("Enter the number 1");
		int num1 = b.nextInt();
		System.out.println("Enter the number 2");
		int num2 = b.nextInt();
		
		int res = 0;
		res = num1 / num2;
		int a[];
		a = new int[res];
		System.out.println(a[5]);
		
		}catch(ArithmeticException | IndexOutOfBoundsException x){
			if (x instanceof ArithmeticException) {
				System.out.println("Its a arithmetic exception");
			}
			if (x instanceof IndexOutOfBoundsException) {
				System.out.println("Its a index exception");
			}
		}
		
		
		
		
//		try {
//			res = num1/num2;
//			int a[];
//			a = new int[res];
//			System.out.println(a[5]);
//		}catch(Exception w) {
//			System.out.println("There is an Exception");
//		}
//		
//		try {
//			res = num1/num2;
//		}catch (ArithmeticException y){
//			System.out.println("There is an ArithmeticException");
//		}
//		
//		
//		int a[];
//		a = new int[res];
//		try {
//			System.out.println(a[5]);
//		}catch (ArrayIndexOutOfBoundsException z) {
//			System.out.println("There is an ArrayIndexOutOfBoundsException");
//		}
//		
		
	}

}
