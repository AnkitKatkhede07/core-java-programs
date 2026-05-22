package string.com;

import java.util.Scanner;

public class Repeting_charater {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String here:");
		 char ch = 0;
		String str=sc.nextLine();
	
     for(int i=0;i<str.length();i++) {
    	 ch=str.charAt(i);
    	 
    	  System.out.print(ch+" "); 
    	 
    	 
     }
     sc.close();
	}

}
