package com.tyss.basicprograms;

import java.util.Scanner;

public class AscendingNumber { 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a[] = new int[5]; 
		int num;
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter the limit");
//		int l = input.nextInt();
//		//getting the inputs of array
//		for (int i = 0; i < l; i++) {
//			System.out.println("Enter the number");
//			num = input.nextInt();
//			a[i] = num;
//		}
//		printing the elements of array
//		for (int i = 0; i < a.length - 1 ; i++) {
//			num = a[i];
//			System.out.print(num);
//		}
		int temp;
		int array[] = {1, 6, 3, 8, 5};
		for(int i = 0; i < array.length; i++) {
			for(int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		//printing the elements of array
		for (int i = 0; i < array.length ; i++) {
			num = array[i];
			System.out.print(num + " ");
		}
		
		
		
		
	}

}
