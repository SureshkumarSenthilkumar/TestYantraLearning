package com.tyss.learningobjectandconstructors;

import java.util.Scanner;

public class Circle {
	static double area(int radius) {
		double out =  3.14 * radius * radius;
		return out;
		
	}
	static double perimeter(int radius) {
		double out = 4 * 3.14 * radius * radius;
		return out;
		
	}
	static double average(float a ,float b, float c) {
		double average = (a + b + c)/2;
		return average;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(perimeter(2));
		System.out.println(area(2));
		System.out.println("enter the number");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		System.out.println("the average value is " + (int) average(a, b, c));

	}

}
