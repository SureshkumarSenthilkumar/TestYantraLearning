package com.tyss.exception;

public class Exercise extends Thread{

	int max;
	public Exercise(int max) {
		this.max = max;
	}
	@Override
	public void run() {
		while(max > 0) {
			if (max % 2 == 0) {
				System.out.println(max);
				try {
					Thread.sleep(10000);
				} catch(InterruptedException e) {}
			}
			max--;
		} 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise exercise = new Exercise(10);
		exercise.start();
		Exercise exercise2 = new Exercise(20);
		exercise2.start();
	}

}
