package com.oops;

class GreaterNumberChecking
{
	public void greaterChecking(int a,int b)
	{
		if(a>=b)
		{
			System.out.println (a);
		}
		else
		{
			System.out.println (b);
		}
	}
	
	
	public void greaterChecking(float a,float b)
	{
		if(a>=b)
		{
			System.out.println (a);
		}
		else
		{
			System.out.println (b);
		}
	}
	public void greaterChecking(float a,float b,float c)
	{
		if(a>=b && a>=c)
		{
			System.out.println (a);
		}
		else if(b>a && b>c)
		{
			System.out.println (b);
		}
		else 
		{
			System.out.println(c);
		}
	}
	
}



public class FunctionOverloadingExample {

	public static void main(String[] args) {
		
		GreaterNumberChecking ob=new GreaterNumberChecking();
		ob.greaterChecking(12.78f,89.34f,45f);
		
		
	}

}
