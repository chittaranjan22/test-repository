package com.string;

public class StringDeclarationExample {

	public static void main(String[] args) {
		
		String st1="Cat";

		String st3=new String("Cat");
		System.out.println(st1.hashCode());
		System.out.println(st3.hashCode());
		
		if(st1==st3)
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("Not same");
		}

	}

}
