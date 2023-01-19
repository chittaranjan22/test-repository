package org.multithread.example;

class DemoThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}
	}
}



public class ThreadPriorityExample {

	public static void main(String[] args) {
		DemoThread t1=new DemoThread();
		t1.setName("A");
		t1.setPriority(Thread.MIN_PRIORITY);
		
		DemoThread t2=new DemoThread();
		t2.setName("B");
		t2.setPriority(Thread.MAX_PRIORITY);
		
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		t1.start();
		t2.start();

	}

}
