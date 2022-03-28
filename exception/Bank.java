package com.tyss.exception;

public class Bank {
	private int balance;
	public int getBalance() {
		return balance;
	}
	
	public void deposit(int amount) {
		balance += amount;
		System.out.println("The balance after deposit is "+ balance);
	}
	
	public void withdraw(int amount) {
		if (amount <= balance && amount > 0){
		balance -= amount;
		System.out.println("The balance is "+ balance);
		}
		else {
			try {
				throw new InSufficientBalanceException("Insufficient Balance");
			} catch (InSufficientBalanceException e){
				System.out.println(e.getMessage());
			}
		}
	}
}
