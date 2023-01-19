package com.oops;
//outer class
class Outer
{
	static String message="hello world!!";
	String message1="Hello Java!!";
	
	
	//static nested class
	static class StaticNested
	{
		
		public void test()
		{
			System.out.println(message);
			
		}
		
	}
	
	//Not static Inner class
	class Inner
	{
		public void demo()
		{
			System.out.println(message);
			System.out.println(message1);
		}
	}
}



public class StaticClassExample {

	public static void main(String[] args) {
		
		Outer.StaticNested obj=new Outer.StaticNested();
		obj.test();
		
		Outer.Inner innerObj=new Outer().new Inner();
		innerObj.demo();
		
	}

}
