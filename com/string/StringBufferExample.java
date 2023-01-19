package com.string;

public class StringBufferExample {

	public static void main(String[] args) {
		
		StringBuffer st=new StringBuffer("Welcome to String Programming");
		st=new StringBuffer("Welcome to Java Programming");
		
		StringBuffer st1=new StringBuffer("Hello world");
		System.out.println(st.length());
		System.out.println(st.capacity());
		st.ensureCapacity(100);
		System.out.println(st.capacity());
		System.out.println(st.charAt(0));
		System.out.println(st.indexOf("to"));
		System.out.println(st.append('!'));
		System.out.println( st.reverse());
		
	
		
		
	
	}

}
