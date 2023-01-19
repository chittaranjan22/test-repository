package org.multithread.example;

class SampleThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				try 
				{
					Thread.currentThread().sleep(5000,4000);//5000 millsecs + 4000 nanoseconds
				} 
				catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
			}
			
			if(i==9)
			{
				//Thread.currentThread().stop();
				//Thread.currentThread().suspend();
				/*
				 * try { Thread.currentThread().wait(); } catch(InterruptedException e) {
				 * System.out.println(e.getMessage()); }
				 */
			}
			System.out.println(i);
		}
	}
}


public class SleepExample {
	
	public static void main(String args[])
	{
		SampleThread t1=new SampleThread();
		t1.start();
	}

}
