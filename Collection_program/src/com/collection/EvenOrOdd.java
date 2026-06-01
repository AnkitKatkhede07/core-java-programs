/**8. Separate Even and Odd Numbers
Description

Create a list where all even numbers appear before odd numbers.
**/
package com.collection;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenOrOdd {

	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(2,10,30,4,5,7,9,1);
		ArrayList<Integer>Even=new ArrayList<>();
		ArrayList<Integer>odd=new ArrayList<>();
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i)%2==0)
			{
				Even.add(list.get(i));
			}
			else {
				odd.add(list.get(i));
			}
		}
		System.out.println(Even);
		System.out.println(odd);
		

	}

}
