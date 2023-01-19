package com.exception.handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TryCatchFinallyBlockExample {

	public static void main(String[] args) throws IOException {
		
		
		//try with resource
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner scan=new Scanner(System.in);
		try(br;scan)				
		{
			System.out.println("Enter an integer:");
			int a=Integer.parseInt(br.readLine());
			
			try
			{
				String st=br.readLine();
				System.out.println(st.length());
				System.out.println(st.charAt(5));
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		
		catch(Exception e)
		{
			//e.printStackTrace();
			
			System.out.println(e.getMessage());
		}
		
		finally
		{
			
			System.out.println("This is finally block!!");
		}
		

	}

}
