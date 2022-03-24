package com.tyss.upcasting;

public class Group {

	public static void main(String[] args) {
		User user = new Admin("Ajith", 4829492747l);
		Admin admin = (Admin) user;
		
		admin.addMember("Vijay");
		admin.videoChat("Lalith", 23723762362l);
		admin.removedMember("Vijay");
		
	
		
		

	}

}
