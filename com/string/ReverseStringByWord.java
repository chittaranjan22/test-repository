package com.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseStringByWord {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any string");
		String st=br.readLine();
		
		String array[]=st.split(" ");
		
		for(int i=array.length-1;i>=0;i--)
		{
			System.out.print(array[i]+" ");
		}
		
		
		
		

	}

}
