package com.oops;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//call the private method from outside the class by changing the runtime behaviour of the class 

 class Test
{
	
	private void test()
	{
		System.out.println("private method invoked!!");
	}
	
	public void demo()
	{
		this.test();
	}
}




public class TestExample {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, InvocationTargetException {
	
		Class c=Class.forName("com.oops.Test"); //creating instance of Class class
		Object obj=c.newInstance();//creating object of Test class
		
		
		Method method=c.getDeclaredMethod("test", null);//creating Method object
		
		method.setAccessible(true);//setting accessability to true
		
		method.invoke(obj, null);//calling private test method
		
		
		Test t=new Test();
		t.demo();
		
		
		

	}

}
