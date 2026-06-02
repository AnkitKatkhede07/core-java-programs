/**12. Find First Repeated Integer
Description
Identify the first integer that appears more than once.
**/
package com.collection;

import java.util.Arrays;
import java.util.LinkedList;

public class MoreThanOneTimeInteger {

	public static void main(String[] args) {
		LinkedList<Integer>list=new LinkedList<>(Arrays.asList(1,5,1,3,1,2));
		boolean found = false;
		
		for(int i=0;i<list.size();i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i).equals(list.get(j)))
				{
					 System.out.println("First Repeated Integer: " + list.get(i));
	                    found = true;
	                    
	                    break;
					
				}
				 if (found) {
		                break;
		            }
			}
			
		}
		 if (!found) {
            System.out.println("No Repeated Integer Found");
        }

	}

}
