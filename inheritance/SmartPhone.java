package com.tyss.inheritance;

public class SmartPhone extends FeaturePhone {

	String color; 
	String brand;
	double cameraPixel;
	int batteryCapacity;

	public SmartPhone(int price, int ram, double cam, int battery) {
		super(price, ram);
		cameraPixel = cam;
		batteryCapacity = battery;
		System.out.println("Calling subclass");
	}
	public SmartPhone(int price, int ram) {
		super(price, ram);
		System.out.println("Calling subclass");
	}
	

	public void camera(String cameraType) {
		System.out.println("I am taking a photo with" + cameraType + cameraPixel);
	}

	public void play(String game) {
		System.out.println("playing a game " + game);
	}

	public void calci(int a, int b) {
		System.out.println("the sum is = " + (a + b));
	}

}
