/**
2. Find Second Largest Number
Description
Find the second largest distinct integer from a list.
Example
Input:
[10, 50, 30, 50, 20]
Expected Output:
30
**/
package com.collection;
import java.util.*;
public class SecondLargest {

	public static void main(String[] args) {
		ArrayList <Integer> list=new ArrayList<>(Arrays.asList(10,20,30,50,20));
		int max=0;
		int smax=0;
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i)>max)
			{
				smax=max;
				max=list.get(i);
				
				
			}
			else if(list.get(i)>smax&&list.get(i)!=max)
			{
				smax=list.get(i);
			}
		}
		System.out.println(smax);
	}
	}
//		int arr[]= {10,20,30,50,20};
//		int max=0;
//		int smax=0;
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]>max)
//			{
//				smax=max;
//				max=arr[i];
//				
//			}
//			else if(arr[i]>smax && arr[i]!=max)
//			{
//				smax=arr[i];
//				
//			}
//		}
//		
//System.out.println(max);
//System.out.println(smax);
//	}
//
//}
