package com.exception.handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CustomExceptionExample {

	public static void main(String[] args) throws NumberFormatException, IOException, OrderIdNotFoundException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		boolean status=true;
		do
		{
		
		try
		{
		
			System.out.println("Enter your order Id:");
			long orderId=Integer.parseInt(br.readLine());
			
			if(orderId==0)
			{   //throw exception object
				OrderIdNotFoundException ob=new OrderIdNotFoundException("Order Id can not be Zero!!");
				throw ob;
			}
			else if(orderId<0 )
			{
				throw new OrderIdNotFoundException("Order Id can not be negative!!");
			}	
			else if( orderId>99999)
			{
				throw new OrderIdNotFoundException("Order Id can not be more than five digits!!");
			}
			else
			{
				System.out.println("OrderId is valid!!");
				status=false;
			}
		}
		catch(IOException e )
		{
			System.out.println(e.getMessage());
		}
		catch(NumberFormatException e)
		{
			System.out.println(e.getMessage());
	    }
		catch(OrderIdNotFoundException e)
		{
			System.out.println(e.getMessage()); 
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}while(status);
	}

}
