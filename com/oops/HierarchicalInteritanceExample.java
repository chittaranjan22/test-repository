package com.oops;
class X
{
	public void testX()
	  {
		  System.out.println("This is  X class method");
	  }
}

class Y extends  X
{
	public void testY()
	  {
		  System.out.println("This is  Y class method");
	  }
}

class Z extends X
{
	public void testZ()
	  {
		  System.out.println("This is Z class method");
	  }
}






public class HierarchicalInteritanceExample {

	public static void main(String[] args) {
		
		Y y=new Y();
		y.testX();
		y.testY();
		
		
		Z z=new Z();
		z.testX();
		z.testZ();

	}

}
