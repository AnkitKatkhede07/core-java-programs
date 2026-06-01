/**4. Move All Zeroes to End
Description
Move all zero values to the end while maintaining the order of non-zero elements.
Example
Input:
[0,1,0,3,12]
Expected Output:
[1,3,12,0,0]
**/
package com.collection;
import java.util.*;
import java.util.Arrays;

public class lastindex {
	
	public static void main(String args[]) {
	
	ArrayList<Integer> list=new ArrayList<>(Arrays.asList(0,1,0,3,12));
	System.out.println(list);
	
	ArrayList<Integer> result=new ArrayList<>();
	for(int i=0;i<list.size();i++)
	{
		if(list.get(i)!=0)
		{
			result.add(list.get(i));//1,3,12
		}
	}
	

	for(int i=0;i<list.size();i++)
	{
		if(list.get(i)==0)
		{
			result.add(0);//1,3,12,0,0
		}
	}
	System.out.println(result);
	

}
}
