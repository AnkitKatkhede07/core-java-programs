/**21. Character Frequency Counter
Description: Count how many times each character appears in a string.
Example
Input: banana
Expected Output:
b=1
a=3
n=2
**/
package class_program;

public class CountEachChareter {

	public static void main(String[] args) {
		String str="banana";
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int count=1;
			if(ch[i]=='0')
				continue;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==(ch[j]))
				{
					count++;
					ch[j]='0';
				}
			}
			System.out.println(ch[i]+" "+count);
		}

	}

}
