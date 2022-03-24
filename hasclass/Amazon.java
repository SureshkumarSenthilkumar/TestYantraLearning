package com.tyss.hasclass;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop laptop = new Laptop();
		Battery battery = new Battery();
		battery.brand = "Samsung";
		battery.capacity = 25000;
		battery.color = "White";
		battery.type = "LithiumPolymer";
		
		Screen screen = new Screen();
		screen.brand = "Dell";
		screen.screenResolution = 1080;
		screen.size = 32;
		screen.type = "Qled";
		
		Rom rom = new Rom();
		rom.brand = "Crucial";
		rom.capacity = 12;
		rom.clockSpeeed = 2400;
		rom.type = "DDR4";
		
		laptop.brand = "Dell";
		laptop.price = 25000;
		laptop.battery = battery;
		laptop.screen = screen;
		laptop.rom = rom;
		
		System.out.println(laptop); 
	}

}
