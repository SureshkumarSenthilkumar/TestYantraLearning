package com.tyss.learningobjectandconstructors;

public class Methodoverloading {
	static void add(int x, int y) {
		System.out.println(x+y);
		}
	static void add(int x, int y, int z) {
		System.out.println(x+y+z);
	}
	static void add(float x,double y) {
		System.out.println(x+y);
	}
	static void add(double x, float y) {
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverloading.add(1.0f, 3.00);
		 
		

	}

}
