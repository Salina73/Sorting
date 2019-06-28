package com.bridgelab;

import java.util.Scanner;

public class MergeSort {
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
		int start=0,end=n-1;
		int mid=(start+end)/2;
		int d=mid+1;
		int temp,j;
		for(int i=0; i<=mid; i++)   
	    {  
	        temp = a[i];  
	        j= i-1;  
	        while(j>=0 && temp <= a[j])  
	        {  
	            a[j+1] = a[j];   
	            j--;  
	        }  
	        a[j+1] = temp;  
	    }
		for(int i=d; i<n; i++)   
	    {  
	        temp = a[i];  
	        j= i-1;  
	        while(j>=0 && temp <= a[j])  
	        {  
	            a[j+1] = a[j];   
	            j--;  
	        }  
	        a[j+1] = temp;  
	    }		
	}
	

}
