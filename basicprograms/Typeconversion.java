package com.tyss.basicprograms;

public class Typeconversion {

	public static void main(String[] args) {
		System.out.println("--------widening----------");
		int a = 293232;
		long b = a;
		System.out.println(b);
		System.out.println("--------narrowing----------");
		long c = 6873236663l;
		int d = (int) c;
		System.out.println(d);
		
		
		System.out.println("--------ASCII Char----------"); 
		char e = 97;
		System.out.println(e);
		
		System.out.println("--------ASCII num----------");
		int f = 'f';
		System.out.println(f);
//		byte out2 = (byte) (60 + 68);
		byte out = (byte) (127 + 127);
		System.out.println("==============================");
		System.out.println(out);
		System.out.println(out & 0xff);
//		System.out.println(out1); 		

	}

}
