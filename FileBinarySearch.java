package com.bridgelab;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileBinarySearch
{
   public static void main(String[] args) throws IOException 
   {
      File f1=new File("/home/admin265/Documents/Binary/input"); 
      FileReader fr = new FileReader(f1); 
      BufferedReader br = new BufferedReader(fr); 
      Scanner s4=new Scanner(System.in);
      String[] words=new String[100];
      String s;     
      int count=0;   
      while((s=br.readLine())!=null)   
      {
        words = s.split(" ");  
      }
      int d=words.length;
      System.out.print("Contents are: "); 
      System.out.println(); 
      for(int i=0;i<d;i++)
      {
          System.out.print(words[i]+" "); 
      }
      System.out.println(); 
      System.out.println(); 
      sort(words);
    System.out.println();
    System.out.println(); 
    		System.out.print("Enter element that you want to search:");
    		String key=s4.nextLine();
    		int start=0;
    		int end=d-1;
    		int result=search(key,words,d,start,end);
    		if(result==-1)
    		System.out.println("String is not found");
    		else
    			System.out.print( key+" is found at location "+result);
   }
      public static void sort(String[] str) {
  		int i,j;
  		String temp;
  		for(i=0;i<str.length;i++)
  		{
  			for(j=i+1;j<str.length;j++)
  			{
  				if(str[i].compareTo(str[j])>0)
  				{
  					temp=str[i];
  					str[i]=str[j];
  					str[j]=temp;
  				}
  			}
  			
  		}
  		System.out.println("Sorted strings are...");
  		for(i=0;i<str.length;i++)
  		{
  			System.out.print(str[i]+" ");
  			
  		}
  	}
      public static int search(String key, String[] str, int n, int start, int end) {
  		
  		while(start<=end)
  	{
  			int mid=(start+end)/2;
  			int result=key.compareTo(str[mid]);
  			if(result==0)
  				return mid;
  			if(result>0)
  			{
  				start=mid+1;
  			}
  			else
  			{
  				end=mid-1;
  			}
  	}
  		return -1;
  		
  	}

}
