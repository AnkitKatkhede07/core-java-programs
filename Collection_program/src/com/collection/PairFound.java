/**18. Find Pair with Given Sum
Description
Check whether any two integers in the list add up to a specified target value.
List<Integer> = [2, 7, 11, 15]
Target = 9
**/
package com.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class PairFound {

	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<>(Arrays.asList(2, 7, 11, 15));
		int sum=0;
		int target=60;
		boolean found=false;
		for(int i=0;i<list.size();i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				sum=list.get(i)+list.get(j);
				if(sum==target)
				{
					System.out.println("pair found");
					found=true;
					break;
				}
				
			}
		}
		
		if(!found) {
			System.out.println("pair not found");
		}

	}

}
