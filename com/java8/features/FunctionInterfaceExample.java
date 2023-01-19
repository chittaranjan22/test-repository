package com.java8.features;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionInterfaceExample {

	public static void main(String[] args) {
		
		//centigrade to fahrenheit
		Function<Integer, Double> function=c ->{ return new Double((c*9/5) + 32);};
		int c=0;
		
		System.out.println(function.apply(c));
		
		
		BiFunction<Integer, Integer, Long> biFunction=(a,b)  -> 
		{
			return (long) (a+b);  
		};
		
		System.out.println(biFunction.apply(100, 200));

	}

}
