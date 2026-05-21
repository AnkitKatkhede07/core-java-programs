package array.com;

public class MinArray {

	public static void main(String[] args) {
		int arr[]= {2,5,8,9,10,5};
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Min is :"+min);

	}

}
