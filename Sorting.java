package com.bridgelab;
import java.util.*;

import util.UtilitySearch;
public class Sorting {
	public static void main(String[]args) 
	{
		Scanner s=new Scanner(System.in);
//Integer section
		System.out.print("Enter the no. of elements:");
		int n=s.nextInt();
		
		int[] a=new int[n];
		float[] result=new float[6];
		System.out.print("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		
		long start=0;
		UtilitySearch.sort2(n,a);
		long stop=System.currentTimeMillis();
		result[0]=(stop-start)/1000f;
		
		
		long start1=stop;
		UtilitySearch.sort3(n,a);
		long stop1=System.currentTimeMillis();
		result[1]=(stop1-start1)/1000f;
		
		
		System.out.print("Sorted elements:");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");			
		}
		System.out.println();
		System.out.println();
		System.out.print("Enter element that you want to search:");
		int key=s.nextInt();
		int startx=0;
		int end=n-1;
		
		long start2=stop1;
		UtilitySearch.search1(key,a,n,startx,end);
		long stop2=System.currentTimeMillis();
		result[2]=(stop2-start2)/1000f;
		System.out.println();
		
//String Section	
		System.out.println();
		System.out.println("Enter how many strings you have to enter:");
		int n1=s.nextInt();
		String[] str = new String [n1];
		System.out.print("Enter the strings:");
		for(int i=0;i<n1;i++)
		{
			str[i]=s.nextLine();
		}
		
		long start3=stop2;
		UtilitySearch.sorting(str);
		long stop3=System.currentTimeMillis();
		result[3]=(stop3-start3)/1000f;
		
		
		long start4=stop3;
		UtilitySearch.sort(str);
		long stop4=System.currentTimeMillis();
		result[4]=(stop4-start4)/1000f;
	
		
		System.out.println();
		System.out.println();
		System.out.print("Enter element that you want to search:");
		String key1=s.nextLine();
		int starts=0;
		int ends=n-1;
		

		long start5=stop4;
		int results=UtilitySearch.search(key1,str,n,starts,ends);
		
		if(results==-1)
			System.out.println("String is not found");
		else
			System.out.print( key1+" is found at location "+results);
		long stop5=System.currentTimeMillis();
		result[5]=(stop5-start5)/1000f;
		
		System.out.println();
		System.out.println();
		
		System.out.println("Elapsed time for bubble sort of integer : "+result[0]+" MilliSec");//1
		System.out.println("Elapsed time for insertion sort of integer : "+result[1]+" MilliSec");//2
		System.out.println("Elapsed time for binary search of integer : "+result[2]+" MilliSec");//3
		System.out.println("Elapsed time insertion sorting of string : "+result[3]+" MilliSec");//4
		System.out.println("Elapsed time bubble sorting of string : "+result[4]+" MilliSec");//5
		System.out.println("Elapsed time for binary search of string : "+result[5]+" MilliSec");//6
		
		System.out.println();
		
		float temp;
		for(int i=0;i<6;i++)
		{
			for(int j=i+1;j<6;j++)
			{
				if(result[i]<result[j])
				{
					temp=result[i];
					result[i]=result[j];
					result[j]=temp;
				}
					
			}
		}
		
		for(int i=0;i<6;i++)
		{
			System.out.println((i+1)+":"+result[i]);
		}
	}
}
