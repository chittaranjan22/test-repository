package com.string;

import java.util.Scanner;

public class SubStringExample {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in); 
		System.out.println("Enter any string:");
		String st=scan.nextLine();
		
		
		for(int i=0;i<st.length();i++)
		{
			for(int j=i+1;j<=st.length();j++)
			{
				System.out.println(st.substring(i, j));
			}
		}

	}

}
