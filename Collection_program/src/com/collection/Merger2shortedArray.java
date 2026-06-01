/*6. Merge Two Sorted Integer Lists
Description
Merge two sorted integer lists into a single sorted list.
*/
package com.collection;
import java.util.*;
public class Merger2shortedArray {

	public static void main(String[] args) {
		
		   List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9);
	        List<Integer> list2 = Arrays.asList(2, 4, 6, 8, 10);

	        List<Integer> merged = new ArrayList<>();

	        merged.addAll(list1);
	        merged.addAll(list2);

	        Collections.sort(merged);

	        System.out.println(merged);
		
//        TreeSet<Integer> set1=new TreeSet<>(Arrays.asList(5,4,2,3,1));
//        TreeSet<Integer> set2=new TreeSet<>(Arrays.asList(6,8,7,9,10));
//       set1.addAll(set2);
//       System.out.println(set1);
	}

}
