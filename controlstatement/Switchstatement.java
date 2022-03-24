package com.tyss.controlstatement;

import java.util.Scanner;

public class Switchstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner type = new Scanner(System.in);
		System.out.println("enter a number");
		a = type.nextInt();
		switch (a) {
		case 1:
			System.out.println("norway");
			break;
		case 2:
			System.out.println("denmark");
			break;
		case 3:
			System.out.println("sweeden");
			break;
		case 4:
			System.out.println("italy");
			break;
		case 5:
			System.out.println("greece");
			break;
		case 6:
			System.out.println("granada");
			break;
		default:
			System.out.println("go to home");

		}

	}

}
