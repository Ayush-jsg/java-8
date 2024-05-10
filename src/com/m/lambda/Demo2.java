package com.m.lambda;

public class Demo2 {
	public static void main(String[] args) {

		Runnable myThread = () -> {
			Thread.currentThread().setName("my Thread");
			System.out.println(Thread.currentThread().getName() + " is running");

		};
		Thread run = new Thread(myThread);
		run.start();
	}

}
