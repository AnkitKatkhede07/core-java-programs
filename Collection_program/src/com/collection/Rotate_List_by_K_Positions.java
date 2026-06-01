/** 9. Rotate List by K Positions
Description
Rotate elements of a list to the right by K positions.
 **/

package com.collection;
import java.util.*;
public class Rotate_List_by_K_Positions {

	public static void main(String[] args) {
		
		 List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

	        int k = 2;

	        int n = list.size();

	        // Step 1: handle case where k > n
	        k = k % n;

	        // Step 2: create new list for result
	        List<Integer> result = new ArrayList<>();

	        // Step 3: take last k elements
	        for (int i = n - k; i < n; i++) {
	            result.add(list.get(i));
	        }

	        // Step 4: take first n-k elements
	        for (int i = 0; i < n - k; i++) {
	            result.add(list.get(i));
	        }

	        // Step 5: print result
	        System.out.println(result);
	}

}
