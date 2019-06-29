package com.bridgelab;
import java.util.*;
public class FindNumber {
	public static void main(String[]args) throws InterruptedException
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Take a number which is the power of 2: ");
		int N=s.nextInt();
		int n=N-1,c=0;
	
		System.out.println("Cosider a number which is in the range of 0 to "+n);
		 Thread.sleep(4000);
	while(N!=1)
	{
		N=N/2;
		c++;
	}
		System.out.print("Okay!!! I wil ask you "+c+" questions");
		System.out.println();
		System.out.println();
		int start=0;
		Thread.sleep(4000);
		search(c,n,start);
		
}

	private static void search(int c, int n, int start) {
		Scanner s=new Scanner(System.in);
		
		while(start<n)
		{
			int mid=(start+n)/2;
			System.out.println("Type 1 if number is greater than "+mid);
			System.out.println("Type 2 if number is less than "+mid);
			System.out.println("Type 0 if number is equal to "+mid);
			int s1=s.nextInt();
			if(s1==1)
			{
				start=mid+1;
				if(mid==n-1)
				{
					System.out.println("your number is "+n);
				}
				
			}
			else if(s1==2)
			{
				n=mid-1;
				if(mid==start+1)
				{
					System.out.println("your number is "+start);
				}
			}
			else if(s1==0)
			{
				System.out.println("Your number is "+mid);
			break;
			}
		}
	}


}