package com.tyss.thissuper;

public class Child extends Parent{
	int c, d, e, f, g, h, i;

	public Child(int a, int b, int c){
		super(a,b);
		this.c = c;
	}

	public Child(int a, int b, int c, int d, int e){
		this(a,b,c);
		this.d = d;
		this.e = e;
		}
	public Child(int a, int b, int c, int d, int e, int f, int g, int h) {
		this(a,b,c,d,e);
		this.f = f;
		this.g = g;
		this.h = h;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
