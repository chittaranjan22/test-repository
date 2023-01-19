package com.java8.features;

import java.util.function.Supplier;

public class SupplierInterfaceExample {
	
	public static void main(String args[])
	{
	  
	  Supplier<Person> supplier= () -> {return new Person("kunal", 23); };	
	  
	  System.out.println(supplier.get().getName());
	  System.out.println(supplier.get().getAge());
	  
	  
	  
	}

}
