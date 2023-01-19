package org.multithread.example;

class TaskThread implements Runnable
{

	@Override
	public void run() {
		System.out.println("Thread is runninng..");
		
	}
	
}

public class ThreadExample2 {

	public static void main(String[] args) {
		
		TaskThread task=new TaskThread();
		Thread t1=new Thread(task);
		
		t1.start();
		
	}

}
