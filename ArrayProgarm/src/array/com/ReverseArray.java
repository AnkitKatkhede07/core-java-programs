package array.com;
import java.util.Scanner;
public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter arrya size:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		System.out.print("Enter array Element");
	
		for( int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
		
	}

}
