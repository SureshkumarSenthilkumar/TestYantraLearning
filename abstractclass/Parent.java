package com.tyss.abstractclass;

public abstract class Parent {
	int x ;
	static int y;
	
	Parent (int x){
		this.x = x;
	}
	
	abstract void m1();
	
	void m2() {
		System.out.println("This is called concurrent method");
	}

	
	
	 

}
