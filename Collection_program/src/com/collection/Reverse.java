/**3. Reverse a String List
Description
Reverse the order of strings in a list.
Example
Input:
["Java", "Python", "Spring"]
Expected Output:
["Spring", "Python", "Java"]
**/
package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();	
		list.add("Java");
		list.add("Python");
		list.add("Spring");
		System.out.println(list);
		//using 2 pointer
//		int left=0;
//		int right=list.size()-1;
//		while(left<=right)
//		{
//			String temp=list.get(left);  
//			list.set(left,list.get(right));
//			list.set(right,temp);
//			left++;	
//			right--;
//		}
		
//		System.out.println(list);

		//using loop
	ArrayList<String>result=new ArrayList<>();
		
		for(int i=list.size()-1;i>=0;i--)
		{
			  result.add(list.get(i));
		}
		System.out.println(result);
		
		
             // using inbuilt method
//		Collections.reverse(list);;
//		System.out.println(list);
	
		

	}

}
