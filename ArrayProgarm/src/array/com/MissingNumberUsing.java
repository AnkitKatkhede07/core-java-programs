package array.com;

public class MissingNumberUsing {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		int n=arr.length+1;
	    int total=n*(n+1)/2;
	    int sum=0;
	    for(int i=0;i<arr.length;i++)
	    {
	    	sum+=arr[i];
	    }
	    int missingNo=total-sum;
	    
	    System.out.println(" Missing Number : "+missingNo);
	}

}
