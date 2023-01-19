package com.exception.handling;
class Myclass
{
	public void method1()
	{
		String st=null;
		try
		{
		   System.out.println(st.length());    //throw - developer wants to throw an exception object
		   									   	
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("This is method1");  
	}
	
	
	public void method2()
	{
		
			this.method1();
		
		
		System.out.println("This is method2");
	}
	
	
	public void method3()
	{
		this.method2();
		System.out.println("This is method3");
	}
	
}

public class ExceptionPropagationExample {

	public static void main(String[] args) {
		
		Myclass ob=new Myclass();
		ob.method3();
	}

}
