package com.collection_framework_class;
import java.util.*;

public class ArrayListVSVector 
{
	public static void main(String[] args) 
	{
		//starting time for vector
		long startingTime = System.currentTimeMillis();
		Vector<Integer> v= new Vector<>();
		for(int i=0;i<1000000;i++)
		{
			v.add(i);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken by vector is : "+(endTime-startingTime));
		
		
		//starting time for ArrayList
		 long startTime1 = System.currentTimeMillis();

      ArrayList<Integer> al = new ArrayList<Integer>();
		 for(int i=0; i<1000000; i++)
		{
			 al.add(i);
		}
		 long endTime1 = System.currentTimeMillis();

		System.out.println("Time taken by ArrayList :"+(endTime1 - startTime1)+" ms");
		
	}

}
