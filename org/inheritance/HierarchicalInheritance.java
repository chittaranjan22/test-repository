package org.inheritance;

class Parent
{
	public void testParent()
	{
		System.out.println("This is testParent method..");
	}
}


class Child1 extends Parent
{
	public void testChild1()
	{
		System.out.println("This is testChild1 method..");
	}
}

class Child2 extends Parent
{
	public void testChild2()
	{
		System.out.println("This is testChild2 method..");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Child1 ob=new Child1();
		ob.testChild1();
		ob.testParent();
		
		Child2 ob1=new Child2();
		ob1.testChild2();
		ob1.testParent();

	}

}
