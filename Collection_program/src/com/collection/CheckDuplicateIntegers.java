/**11. Check Duplicate Integers
Description
Determine whether a list contains duplicate integers.
Example
Input:
[1,2,3,1]
Expected Output:
Duplicate Found
**/
package com.collection;
import java.util.*;
import java.util.Arrays;

public class CheckDuplicateIntegers {

	public static void main(String[] args) {
//		ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,1));
//		boolean found=true;
//		for(int i=0;i<list.size();i++)
//		{
//			for(int j=i+1;j<list.size();j++)
//			{
//				if(list.get(i).equals(list.get(j)));
//				{
//					found=false;
//					break;
//				}
//			}
//		}
//		if(!found)
//		{
//			System.out.println("found");
//		}
//		else {
//			System.out.println("found Not");
//		}
		
		 ArrayList<Integer> list =
	                new ArrayList<>(Arrays.asList(1, 2, 3, 4, 1));

	        HashSet<Integer> set = new HashSet<>();

	        boolean duplicateFound = false;

	        for (Integer num : list) {
	            if (!set.add(num)) {
	                duplicateFound = true;
	                break;
	            }
	        }

	        System.out.println(
	                duplicateFound ? "Duplicate Found" : "No Duplicate Found");
	}

}
