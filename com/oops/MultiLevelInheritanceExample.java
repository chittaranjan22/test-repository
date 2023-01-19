package com.oops;

class Parent
{
	 public void parentTest()
	  {
		  System.out.println("This is a parent class method");
	  }
}


class Child extends Parent
{
	 public void childTest()
	  {
		  System.out.println("This is a child class method");
	  }
}


class SubChild extends Child
{
	 public void subchildTest()
	  {
		  System.out.println("This is a subchild class method");
	  }
}



public class MultiLevelInheritanceExample {

	public static void main(String[] args) {
		
		SubChild sc=new SubChild();
		
		sc.parentTest();
		sc.childTest();
		sc.subchildTest();

	}

}
