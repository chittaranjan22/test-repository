package com.test;

public class PatternExample1 {

	public static void main(String[] args) {
	
		int i,j,lines=5;
		
		for(i=1;i<=lines;i++)
		{
			for(j=lines;j>=i;j--)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
