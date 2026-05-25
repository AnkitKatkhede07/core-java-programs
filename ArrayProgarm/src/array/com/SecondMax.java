package array.com;

import java.util.Scanner;

public class SecondMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Array Size : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
			
		System.out.println("Enter a Array Element : ");
		for(int i=0;i<arr.length;i++)
		{
		   arr[i]=sc.nextInt(); 
		}
		int max=arr[0];
		int Smax=arr[0];
		for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
	    	Smax=max;
	    	max=arr[i];
	    }
	    else if(arr[i]>Smax && arr[i]!=max) {
	    	Smax=arr[i];
	    }
		}
		System.out.println("Maximum is : " +max);
		if(max == Smax) {
            System.out.println("Second Maximum not found");
        } else {
            System.out.println("Second Maximum : " + Smax);
        }

         sc.close();
	
	}

}
