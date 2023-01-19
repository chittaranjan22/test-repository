package com.exception.handling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class ExceptionExample {
	
	public static void main(String args[]) throws NumberFormatException, IOException, ArithmeticException
	{
		int a,b;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter value of a:");
		a=Integer.parseInt(br.readLine());
		
		
		System.out.println("Enter value of a:");
		b=Integer.parseInt(br.readLine());
		
		String st=null;
		
		System.out.println(a+b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a-b);
	
		System.out.println(a/b); 
	
		
	
		
		System.out.println(Math.pow(a, b));
		System.out.println(Math.pow(b, a));
		System.out.println(Math.sqrt(a));
		System.out.println(Math.sqrt(b));
		
	}

}
