package com.tyss.controlstatement;

public class Decisionmaking {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int a = 20;
//		int b = 30;
//		if(b > a) {
//			System.out.println("hello all");
//		}
//		if(b < a) {
//			System.out.println("Welcome");
//		}
//	}
	public static void main(String[] args) {
		int friends = 8;
		if (friends > 5 && friends < 7) {
			System.out.println("valparai");
		}
		else if (friends > 7 && friends < 10){
			System.out.println("chennai");
		}
		else if (friends > 8 || friends == 10){
			System.out.println("bangalore");
		}
		else {
			System.out.println("anaimalai");
		}
		
	}

}
