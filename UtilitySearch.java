package util;

public class UtilitySearch
{

	public UtilitySearch()
	{
	
	}

	//Bubble sorting of string
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
	
	//Insertion sorting of string
	public static void sorting(String[] str) {
		String temp;
		int i,j;
		for( i=1;i<str.length; i++)   
	    {  
	        temp = str[i];  
	        j= i-1;  
	        while(j>=0)  
	        {  
	        	if(str[i].compareTo(str[j])>0)
	        	{
	           break;
	        	} 
	        	 str[j+1] = str[j];   
		            j--;  
		       
	        } 
	        str[j+1] = temp; 
	    }
		System.out.println("Sorted strings are...");
		for(i=0;i<str.length;i++)
		{
			System.out.print(str[i]+" ");
			
		}
	}

	//Binary search of string
	public static int search(
			String key, String[] str, int n, int start, int end) {
		
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

	
	//Binary search of integer

	public static void search1(int key, int[] a, int n, int start, int end) {
		
		int mid=(start+end)/2;
		if(start<=mid)
		{
		if(a[mid]==key)
			System.out.print( key+" is found at location "+(mid+1));
		
		 if(key<a[mid])
		{
			end=mid-1;
			search1(key,a,n,start,end); 
		}
		if(key>a[mid])
		{
			start=mid+1;	
			search1(key,a,n,start,end); 
		}
		}
		else
			System.out.println("Element is not found");
	}

	
	//Bubble sort of Integer
	public static void sort2(int n, int[] a) {
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
				sort2(n,a);
			}
			}
		}
		
	}

	

	//Insertion Sorting of Integer
	public static void sort3(int n, int[] a) {
		int temp,j;
		for(int i=1; i<n; i++)   
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


