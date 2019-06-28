package com.bridgelab;
import java.util.Scanner;

import util.UtilitySearch;
public class BubbleSortInteger {
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
		UtilitySearch.sort2(n,a);
		System.out.print("Sorted elements:");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
			
		}
		
	}

}
