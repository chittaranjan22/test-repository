package com.java8.features;
interface IAverage
{
	double avg(int[] array);
}


public class LEExamples {

	public static void main(String[] args) {
		
		//Without lambda expression, Iaverage implementation using anonymous class
		IAverage average=new IAverage() {
			
			@Override
			public double avg(int[] array) {
				
				double sum=0;
				int arraySize=array.length;
				System.out.println(arraySize);
				
				for(int i=0;i<array.length;i++)
				{
					sum+=array[i];
				}
				return sum/arraySize;
			}
		};
		
		
		
		int array[]= {1,4,8,9,12};
		System.out.println(average.avg(array));
		
		
   //Using lambda expression		
		IAverage withLambda=(withLambdaArray)->
		{
			double sum=0;
			int arraySize=array.length;
			System.out.println(arraySize);
			
			for(int i=0;i<array.length;i++)
			{
				sum+=array[i];
			}
			return sum/arraySize;
		};
		
		System.out.println(withLambda.avg(array));
	}

}
