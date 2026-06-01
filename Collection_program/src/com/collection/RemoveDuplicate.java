/*1. Remove Duplicate Integers
Description
Given a list of integers, remove all duplicate values while preserving the original insertion order.
Example
Input:
[10, 20, 10, 30, 20, 40]
Expected Output:
[10, 20, 30, 40]
*/
package com.collection;

import java.util.LinkedHashSet;

public class RemoveDuplicate {

    public static void main(String[] args) {
        int arr[] = {10, 20, 10, 30, 20, 40};

        System.out.println(passCollection(arr));
    }

   public static LinkedHashSet<Integer> passCollection(int a[]) {

	    LinkedHashSet<Integer> set = new LinkedHashSet<>();

	    for (int num : a) {
	        set.add(num);
	    }

	    return set;
	}
}
//		 LinkedHashSet<Integer>set=new LinkedHashSet<>();
//		 for(int i=0;i<arr.length;i++)
//		 {
//			 set.add(arr[i]);
//		 }
//		 System.out.println(set);
//		
//	 }
//		}
		
		