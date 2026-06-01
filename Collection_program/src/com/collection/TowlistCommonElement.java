/*
 * 
 5. Find Common Integers Between Two Lists
Description
Find all common integers between two lists.
Example
Input:
List1 = [1,2,3,4]
List2 = [3,4,5,6]
Expected Output:
[3,4]

 *
 */
package com.collection;
import java.util.*;
import java.util.Arrays;

public class TowlistCommonElement {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 5, 6));

        ArrayList<Integer> common = new ArrayList<>();

        for (Integer num : list1) {
            if (list2.contains(num)) {
                common.add(num);
            }
        }

        System.out.println(common);
		
//ArrayList<Integer>list1=new ArrayList<>(Arrays.asList(1,2,3,4));
//
//ArrayList<Integer>list2=new ArrayList<>(Arrays.asList(3,4,5,6));
//list2.addAll(list1);
//
//ArrayList<Integer>list3=new ArrayList<>();
//list3.addAll(list2);
//System.out.println(list3);
//
//for(int i=0;i<list3.size();i++)
//{
//   if(list3.get(i)==0)
//	   continue;
//   for(int j=i+1;j<list3.size();j++)
//   {
//	   if(list3.get(i)==list3.get(j))
//	   {
//		   System.out.print(+ list3.get(i)+" ");
//		   break;
//		   
//	   }
//	   
//   }
//   
//}

	}

}
