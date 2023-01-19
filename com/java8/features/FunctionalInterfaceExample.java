package com.java8.features;

@FunctionalInterface
interface Test
{
	abstract public void addition(int a,int b);
	
	
}

@FunctionalInterface
interface Display
{
	abstract public void print(String message);
	
}

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		
		Test t=(a,b) -> { System.out.println(a+b);};  //Lambda expression

		t.addition(10, 20);
		
		
		Display d=(message) -> System.out.println(message);
		d.print("Hello world!!");

	}

}
