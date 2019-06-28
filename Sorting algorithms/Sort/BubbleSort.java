package com.bridgelab;
import java.util.*;
public class BubbleSort {
	public static void main(String[]args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the no. of elements:");
		int n=s.nextInt();
		
		int[] a=new int[n];
		System.out.print("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}	
		sort(n,a);
		System.out.print("Sorted elements:");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
			
		}
		
	}

	private static void sort(int n, int[] a) {
		
		int temp;
		for(int i=0;i<n;i++)
		{
			if(i+1<n)
			{
			if(a[i]>a[i+1])
			{
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
			}
		}
		for(int i=0;i<n;i++)
		{
			if(i+1<n)
			{
			if(a[i]>a[i+1])
			{
				sort(n,a);
			}
			}
		}
		
		
	}
}
