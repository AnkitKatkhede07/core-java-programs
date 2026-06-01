/**
 7. Find Missing Number
Description
Numbers from 1 to N are stored in a list with one number missing. Find the missing number.

 **/
package com.collection;
import java.util.*;
public class FindMissingNumber {

	public static void main(String[] args) {
		
//		 List<Integer> list = Arrays.asList(1, 2, 4, 5);
//
//	        int n = list.size() + 1;
//
//	        int totalSum = n * (n + 1) / 2;
//
//	        int actualSum = 0;
//	        for (int num : list) {
//	            actualSum += num;
//	        }
//
//	        int missingNumber = totalSum - actualSum;
//
//	        System.out.println("Missing number is: " + missingNumber);
		
//      int num[]= {1,2,4,5};
//      int n=5;
//      int total=n*(n+1)/2;
//      int sum=0;
//      for(int no:num)
//      {
//    	  sum+=no;
//      }
//      int missing=total-sum;
//      System.out.println(missing);
      
	        
	        List<Integer> list = Arrays.asList(1, 2, 4,5);

	        int n = 5;

	        Set<Integer> set = new HashSet<>(list);

	        System.out.println("Missing numbers:");

	        for (int i = 1; i <= n; i++) {
	            if (!set.contains(i)) {
	                System.out.println(i);
	            }
	        }

	}

}
