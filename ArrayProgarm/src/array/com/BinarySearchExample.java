package array.com;

import java.util.Scanner;

public class BinarySearchExample {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Array size : ");
		int n=sc.nextInt();
		int arr[]=new int [n];
		int index=-1;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter Targert Number: ");
		int target=sc.nextInt();
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid = low + (high - low) / 2;
			if(arr[mid]==target) {
				index=mid;
				break;
			}else if(arr[mid]<target) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		System.out.print("Index = "+index);
		sc.close();

	}

}
