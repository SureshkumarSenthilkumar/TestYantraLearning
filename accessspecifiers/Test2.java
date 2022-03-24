package com.tyss.accessspecifiers;

public class Test2 extends Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 test2 = new Test2();
		System.out.println(test2.a);
//		System.out.println(test2.b);
		System.out.println(test2.c);
		System.out.println(test2.d);
		
		test2.testing1();
//		test2.testing2(); //private
		test2.testing3();
		test2.testing4();
		
		 

	}

}
