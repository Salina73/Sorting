package com.bridgelab;
import java.util.*;

import util.UtilitySearch;
public class BubbleSortString {
	public static void main(String[]args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter how many strings you have to enter:");
		int n=s.nextInt();
		String[] str = new String [n];
		System.out.print("Enter the strings:");
		for(int i=0;i<n;i++)
		{
			str[i]=s.nextLine();
		}
		UtilitySearch.sort(str);
		
	}
}
