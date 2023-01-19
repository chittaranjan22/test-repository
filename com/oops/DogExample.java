package com.oops;

 class Dog
{
	 //instance variables
	 String color;
	 String breed;
	 String name; 
	  
	  //methods
	  void waggingTail()
	  {
	    System.out.println("wagging tail!!");
	  }

	  void barking()
	  {
	   System.out.println("barking");
	  }

	  void eating()
	  {
	   System.out.println("eating");
	  }

	@Override
	public String toString() {
		return "Dog [color=" + color + ", breed=" + breed + ", name=" + name + "]";
	}
	  
}




public class DogExample {

	public static void main(String[] args) {
	
		Dog object1=new Dog();//instance of the class - Instantiation
		object1.name="ABC";
		object1.color="brown";
		object1.breed="xyz";
		System.out.println(object1);
		object1.eating();
		object1.waggingTail();
		object1.barking();
		
		System.out.println("========================================================");
		
		Dog object2=new Dog();//instance of the class
		object2.name="PQR";
		object2.color="black";
		object2.breed="zxc";
		System.out.println(object2);
		object2.eating();
		object2.waggingTail();
		object2.barking();
		

	}

}
