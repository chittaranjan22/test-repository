package com.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringFunctions {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any string");
		String st=br.readLine();
		
		System.out.println(st.length());
		
		for(int i=0;i<st.length();i++)
		{
			System.out.print(st.charAt(i));
		}
		
		System.out.println();
		System.out.println(st.charAt(0));
		
		
		st=st.replace('h', 'H');
		System.out.println(st);
		st=st.replace("Hello", "Hi");
		System.out.println(st);
		
		String st2="Hi Java!! Welcome to Java programming.";
		st2=st2.replaceFirst("Java", "Java 19");
		System.out.println(st2);
		
		
		System.out.println(st2.contains("Program"));
		System.out.println(st2.substring(7));
		System.out.println(st2.substring(7,15));
		
		
		String a="  hello   ";
		String b="world";
		
		System.out.println(a.concat(b));
		
		String test="";
		
		//System.out.println(test.isBlank());
		System.out.println(test.isEmpty());
		
		
	  String array[]=st2.split(" ",0); //Welcome to java programming
	  
	  for(int i=0;i<array.length;i++)
	  {
		  System.out.println(array[i]);
	  }
	  
	  
	  System.out.println(st2.toUpperCase());
	  System.out.println(st2.toLowerCase());
	  System.out.println(st2.indexOf('W'));
	  System.out.println(st2.lastIndexOf("a"));
	  System.out.println(a.trim());
	  
	  
	  
	  String s=String.valueOf(123.78);
	  System.out.println(s);
	  
	  String test1="java";
	  String test2="JAVA";
	  System.out.println(st2.equals(b));
	  System.out.println(test1.equalsIgnoreCase(test2));
	  System.out.println(test1.equals(test2));
	  
	  
	}

}
