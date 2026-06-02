/**15. Count Unique Integers
Description
Determine the number of unique integers in a list.
**/
package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class PresentNumber {

	public static void main(String[] args) {
		 ArrayList<Integer> list =
	                new ArrayList<>(Arrays.asList(1, 2, 3, 4, 1,5,4,6,5,6));

	        HashSet<Integer> set = new HashSet<>(list);
System.out.println(set);
	        System.out.println(set.size());
	}

}
