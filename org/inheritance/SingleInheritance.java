package org.inheritance;

class A    //super class, Base class, Parent class
{
	public void testA()
	{
		System.out.println("This is parent class method");
	}
	
	
	public void sample()
	{
		System.out.println("This is a sample method");
	}
}

class B extends A  //Sub class, child class, derived class
{
	public void testB()
	{
		System.out.println("This is child class method");
		super.sample();
	}
}



public class SingleInheritance {

	public static void main(String[] args) {
		B ob=new B();
		ob.testA();
		ob.testB();

	}

}
