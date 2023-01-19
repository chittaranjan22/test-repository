package com.oops;

class A
{
  public String message="Parent Data member";
  
  public void test()
  {
	  System.out.println("This is a parent class method");
  }
	
}


class B extends A
{
	public String message="Child Data member";
	
	 public void sample()
	  {
		  System.out.println("This is a child class method");
	  }
}



public class SingleInheritanceExample {

	public static void main(String[] args) {
		
		B ob=new B();
		System.out.println(ob.message);
		ob.test();
		ob.sample();

	}

}
