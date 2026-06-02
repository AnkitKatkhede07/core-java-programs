/**17. Remove Duplicate Characters from String
Description
Remove duplicate characters while preserving the first occurrence.
Example
Input:
programming
Expected Output:
progamin
**/
package com.String.Collection;

import java.util.LinkedHashSet;

public class StringDupblicate {

	public static void main(String[] args) {
//		String str = "programming";
//
//		LinkedHashSet<Character> set = new LinkedHashSet<>();
//
//		for (char ch : str.toCharArray()) {
//		    set.add(ch);
//		}
//
//		StringBuilder result = new StringBuilder();
//
//		for (char ch : set) {
//		    result.append(ch);
//		}
//
//		System.out.println(result);
	
//		String str="Programming";
//		char ch[]=str.toCharArray();
//		for(int i=0;i<ch.length;i++)
//		{
//			if(ch[i]=='0')
//				continue;
//			
//			for(int j=i+1;j<ch.length;j++)
//			{
//				if(ch[i]==ch[j])
//				{
//					ch[j]='0';
//				}
//			}
//			System.out.print(ch[i]);
//		}
		
		
		String str = "programming";
		String result = "";

		for (int i = 0; i < str.length(); i++) {
		    char ch = str.charAt(i);

		    if (result.indexOf(ch) == -1) {
		        result += ch;
		    }
		}

		System.out.println(result);
	}
}
