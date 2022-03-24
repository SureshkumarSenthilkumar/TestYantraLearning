package com.tyss.inheritance;

public class FeaturePhone {
	int ram;
	String color;
	int price;
	String brand;
	
	public FeaturePhone(int c, int r){ 
		price = c;
		ram = r;
	}
	
	public void call(long number){
		System.out.println("I am making call for " + number);
	}
	public void message(String message) {
		System.out.println("I writing a messsage of " + message);
	}
	public void fm(String songName) {
		System.out.println("playing a song of" + songName);
	}
	
	

	 

}
