package org.inheritance;

class X
{
	
	int x=100;
	public X()
	{
		System.out.println("class x constructor..");
	}
	public void testX()
	{
		System.out.println("This is testX method..");
	}
}

class Y extends X
{
	int y=200;
	public Y()
	{
		super();
		System.out.println("class y constructor..");
		System.out.println(super.x);
	}
	
	public void testY()
	{
		System.out.println("This is testY method..");
	}
}


class Z extends Y
{
	int z=300;
	public Z()
	{
		super();
		System.out.println("class z constructor..");
		System.out.println(super.y);
		System.out.println(super.x);
	}
	
	public void testZ()
	{
		
		System.out.println("This is testZ method..");
	}
}



public class MultilevelInheritance {

	public static void main(String[] args) {
		
     Z ob=new Z();
     ob.testX();
     ob.testY();
     ob.testZ();
	}

}
