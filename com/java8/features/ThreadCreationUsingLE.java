package com.java8.features;

public class ThreadCreationUsingLE {

	public static void main(String[] args) {
		
		Runnable thread=() -> {
			System.out.println("Thread in execution");
			};
			
			thread.run();

	}

}
