package string;
import java.util.Scanner;
public class CountofEcahCharater {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str =sc.nextLine();
		
		char ch[]=str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			int count=1;
			// already counted character skip
			if(ch[i]=='0')
				continue;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j]) {
					count++;
					
					ch[j] = '0';
				}
				
			}
			System.out.println(ch[i]+" = "+count);
		}
		sc.close();
		
	}

}
