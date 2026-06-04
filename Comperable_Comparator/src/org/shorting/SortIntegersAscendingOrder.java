/** 33. Sort Integers in Ascending Order
Description: Arrange integers from smallest to largest.
**/

package org.shorting;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;
import java.util.List;

public class SortIntegersAscendingOrder {

	public static void main(String[] args) {
		List<Integer>li=new ArrayList<>(Arrays.asList(10,20,80,40,50,30,60));
		System.out.println("Before short/");
		System.out.println(li);
		Collections.sort(li);
		System.out.println("After short/");
		System.out.println(li);

	}

}
