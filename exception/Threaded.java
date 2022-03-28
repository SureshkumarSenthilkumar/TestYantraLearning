package com.tyss.exception;

public class Threaded implements Runnable {

	public void run() {
		int amount = 0;
		amount++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threaded threaded = new Threaded();
		Thread thread = new Thread(threaded);
		thread.start();
		System.out.println("Thread is started");
		int amount = 0;
		System.out.println(amount);
		amount++;
		System.out.println(amount++);
	}

}
