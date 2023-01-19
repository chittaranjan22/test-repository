package org.inheritance;

class Parent1
{
	 void test()
	{
		System.out.println("Parent's test method");
			
	}
}


class Child extends Parent1
{
	@Override  //annotation
	void test()
	{
		System.out.println("child's test method");
			
	}
}



public class OverridingExample {

	public static void main(String[] args) {
		
		Parent1 obj=new Parent1();
		obj.test();
		
		//runtime polymorphism
		Parent1 obj1=new Child();
		obj1.test();

	}

}
