package com.test;

public class PatternExample4 {

	public static void main(String[] args) {
	int i,j,lines=5;
		
		for(i=5;i>=1;i--)
		{
			for(int k=i;k<=lines;k++)
			{
				System.out.print(" ");
			}
			
			for(j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
