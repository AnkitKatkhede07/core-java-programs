package string.com;

public class Palindrome {

	public static void main(String[] args) {
		String s="madam";
		String str=s;
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(s.equals(rev))
		{
			System.out.println("Is Palindrome");
		}
		else {
		System.out.println("Is not Palindrome");
		}
	}

}
