package com.test;

public class DeepCopyAndShallowCopy {

	public static void main(String[] args) {
		
		int array1[]= {1,2,3,4};
		
		int array2[]=array1;
		
		int array3[]=array1.clone();
		
		array1[0]=11;
		
		for(int i=0;i<array1.length;i++ )
		{
			System.out.print(array1[i]+" ");
		}
		
		System.out.println();
		for(int i=0;i<array2.length;i++ )
		{
			System.out.print(array2[i]+" ");
		}
		
		System.out.println();
		for(int i=0;i<array3.length;i++ )
		{
			System.out.print(array3[i]+" ");
		}
		System.out.println();
		System.out.println(array1.hashCode());
		System.out.println(array2.hashCode());
		System.out.println(array3.hashCode());
	}

}
