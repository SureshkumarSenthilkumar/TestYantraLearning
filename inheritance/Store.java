package com.tyss.inheritance;

public class Store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		FeaturePhone a = new FeaturePhone();
//		a.brand = "Lava";
//		a.color = "Blue";
//		a.price = 1000;
//		a.ram = 4;
//		a.call(1728166361);
//		a.fm("raati");
//		a.message("Hii How are you");
//		System.out.println("==========");
//		SmartPhone b = new SmartPhone();
//		b.brand = "Tecno";
//		b.color = "Red";
//		b.price = 20000;
//		b.ram = 8;
//		b.batteryCapacity = 40000;
//		b.cameraPixel = 12.6;
//		b.call(32719371);
//		b.fm("osaka");
//		b.message("Hii Iam fine");
//		b.camera("front");
//		b.calci(2,3);
//		System.out.println();
		
//		FeaturePhone phone1 = new FeaturePhone(8, "Pink");
//		System.out.println(phone1.ram);
//		System.out.println(phone1.color);
//		FeaturePhone phone2 = new FeaturePhone(12, "Orange");
//		System.out.println(phone2.color);
//		System.out.println(phone2.ram);
		
		SmartPhone phone3 = new SmartPhone(5, 5, 25, 4000);
		System.out.println(phone3.batteryCapacity);
		SmartPhone phone4 = new SmartPhone(25000, 5);
		System.out.println(phone4.ram);
		System.out.println(phone4.price);
		
		

	}

}
