package com.test;

public class PatternExample3 {

	public static void main(String[] args) {
	
		int i,j,lines=5;
		
		for(i=1;i<=lines;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			
			
			for(int k=lines*2-1;k>=i*2-1;k--)
			{
				System.out.print("*");
			}
			
			System.out.println();
			
		}

	}

}
