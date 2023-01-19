package com.test;

public class PatternExample2 {

	public static void main(String[] args) {
	
		int i,j,lines=5;
		
		for(i=1;i<=lines;i++)
		{
			for(j=lines;j>=i;j--)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=i*2-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
