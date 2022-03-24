package com.tyss.basicprograms;

import java.util.Scanner;

public class SeriesNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a;
//		int b;
//		int c; 
		System.out.println("enter the number");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		int out = 0;
		for (int i = 0; i <= c; i++) {
			out += (int) (out + (Math.pow(2, i)) * b);
			System.out.println(a + out);
			}
			
		}
		

	}


