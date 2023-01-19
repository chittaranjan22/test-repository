package com.oops;

class Demo
{  
	static int rateOfInteret;
	String msg="Hello World";
	
	static
	{
		rateOfInteret=8;
		System.out.println("static block");
	}
	
	
	static void test()
	{
		rateOfInteret=5;
		System.out.println("static method!!");
	}
	
	void sample()
	{
		msg="Hello Java";
		rateOfInteret=7;
	}
	
}



public class StaticExample {
	static
	{
		System.out.println("static block example");
	}
	
	public static void main(String[] args) {
		System.out.println(Demo.rateOfInteret);
		Demo.test();

	}

}
