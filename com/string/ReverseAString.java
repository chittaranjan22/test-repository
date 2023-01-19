package com.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseAString {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any string");
		String st=br.readLine();
		String reverse="";
		//14  14>=0 
		for(int i=st.length()-1;i>=0;i--)
		{
			reverse=reverse+st.charAt(i);
		}
		
		System.out.println(reverse);
		
		if(st.equals(reverse))
		{
			System.out.println("It's a palindrome string");
		}
		else
		{
			System.out.println("It's not a palindrome string");
		}
		

	}

}
