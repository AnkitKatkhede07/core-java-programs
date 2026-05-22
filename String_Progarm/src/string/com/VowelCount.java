package string.com;
import java.util.Scanner;

public class VowelCount {

	public static void main(String[] args) {
		System.out.println("Enter a String : ");
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		int count=0;
		 int consonants=0;
		for(int i=0;i<str.length();i++) {
			
	 char ch =  Character.toLowerCase(str.charAt(i));//Important method convert string character
	 
	 
	 if(ch=='a'||ch=='e'|| ch=='i' || ch=='o'|| ch=='u')
	 {
		 count++;
	 }
	 else if(ch >= 'a' && ch <= 'z') {
        
		 consonants++;
     }
		
		sc.close();
		
	}System.out.println("VowelCount : "+count);
	System.out.println("consonants Count : "+consonants);
	}

}
