package com.tyss.exception;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank();
		bank.deposit(1000);
		System.out.println(bank.getBalance());
		bank.withdraw(5000);
		bank.withdraw(500);
		System.out.println(bank.getBalance());
		
	}

}
