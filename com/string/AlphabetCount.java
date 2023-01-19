package com.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlphabetCount {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any string");
		String st=br.readLine();
		
		int count=0,spaces=0,digits=0,special=0;
		
		
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
			{
				count++;
			}
			else if(ch==' ')
			{
				spaces++;
			}
			else if(ch>='0' && ch<='9')
			{
				digits++;
			}
			else
			{
				special++;
			}
			
		}
		
		
		System.out.println(count);
		System.out.println(spaces);
		System.out.println(spaces+1);
		System.out.println(digits);
		System.out.println(special);
		
		

	}

}
