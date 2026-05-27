package array.com;

public class SecondduplicateMax {

	public static void main(String[] args) {
		int arr[]= {10,50,20,50,40,40,30};
		
		int max=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>smax&&arr[i]<max) {
				smax=arr[i];
			}
		}
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==smax)
			{
				count++;
			}
		}
		System.out.println("max is : "+max);
		System.out.println("second max is : "+smax);
		System.out.println("second max count is : "+count);

	}

}
