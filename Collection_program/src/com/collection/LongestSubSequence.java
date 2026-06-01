/** 10. Find Longest Consecutive Integer Sequence
Description
Determine the length of the longest sequence of consecutive integers.
**/

package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestSubSequence {

	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<>(Arrays.asList(2,-2,1,3,4,6,7,3,-1,2));
		 Set<Integer> set = new HashSet<>(list);

	        int longest = 0;

	        for (int num : set) {

	            // only start if it's first element of sequence
	            if (!set.contains(num - 1)) {

	                int currentNum = num;
	                int count = 1;

	                while (set.contains(currentNum + 1)) {
	                    currentNum++;
	                    count++;
	                }

	                longest = Math.max(longest, count);
	            }
	        }

	        System.out.println("Longest consecutive sequence length: " + longest);

	}

}
