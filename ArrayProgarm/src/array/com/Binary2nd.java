package array.com;

public class Binary2nd {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60};
		int target=20;
		int low=0;
		int high=arr.length-1;
		
		while(low<=high)
		{ 
			int mid = low + (high - low) / 2;
			if(arr[mid]==target)
			{
				System.out.println(arr[mid]+ " found Index: "+mid);
			     break;
			}
			else if(arr[mid]<target)
			{
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}

	}

}
