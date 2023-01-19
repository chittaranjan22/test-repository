package com.java8.features;

interface Demo
{
	abstract public void test(int a,int b);
}


public class LambdaExpressionExample {

	public static void main(String[] args) {
		
		Demo t=(int a,int b) -> { 
			System.out.println(a+b);
			System.out.println("Lambda Expression");
			System.out.println("Java 8 features");
			};	

			t.test(10,50);
	}

}
