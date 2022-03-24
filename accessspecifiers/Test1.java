package com.tyss.accessspecifiers;

public class Test1 {

	public int a = 10;
	private int b = 20;
	protected int c = 30;
	int d = 40;
	
	public void testing1() {
		System.out.println("public");
	}
	
	private void testing2() {
		System.out.println("private");
	}
	
	protected void testing3() {
		System.out.println("protected");
	}
	
	void testing4() {
		System.out.println("default");
	}
	
	
	public static void main(String[] args) {
		Test1 test1 = new Test1();
		System.out.println(test1.a);
		System.out.println(test1.b);
		System.out.println(test1.c);
		System.out.println(test1.d);
		//=====================================
		test1.testing1();
		test1.testing2();
		test1.testing3();
		test1.testing4();

	}

}
