package com.exception.handling;
//Custom or user defined Exception
public class OrderIdNotFoundException extends Exception {
	
	public OrderIdNotFoundException(String message)
	{
		super(message);
	}

}
