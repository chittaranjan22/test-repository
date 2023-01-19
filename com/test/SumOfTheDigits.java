package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfTheDigits {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int input,rem,sum=0;
		
		System.out.println("Enter a number:");
		input=Integer.parseInt(br.readLine());
		
		while(input>0)
		{
			rem=input%10;
			sum=sum+rem;
			input=input/10;
		}
		
		System.out.println("Sum of the digits="+sum);
		

	}

}
