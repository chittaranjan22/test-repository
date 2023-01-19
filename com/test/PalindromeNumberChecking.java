package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeNumberChecking {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int input,rem,rev=0;
		
		System.out.println("Enter a number:");
		input=Integer.parseInt(br.readLine());
		
		int copyOfInput=input;
		
		while(input>0)            
		{
			rem=input%10;
			rev=rev*10+rem;
			input=input/10;
		}
		
		if(copyOfInput==rev )
		{
			System.out.println(copyOfInput + " is a palindrome number.");
		}
		else
		{
			System.out.println(copyOfInput + " is a non palindrome number.");
		}
		
	}

}
