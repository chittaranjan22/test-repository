package com.string;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		StringBuilder st=new StringBuilder("Java StringBuilder Example");
		
		System.out.println(st.append("!!"));
		System.out.println(st.replace(0,4,"Python"));
		System.out.println(st.length());
		System.out.println(st.charAt(0));
		System.out.println(st.reverse());
		System.out.println(st.lastIndexOf("e"));
		System.out.println(st.delete(0, 5));
		System.out.println(st.append("!!"));
		System.out.println(st.capacity());  //42   //oldcapacity*2+2
		
		

	}

}
