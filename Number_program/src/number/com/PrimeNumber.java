package number.com;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
	   try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter a Number:");
		   int n=sc.nextInt();
		   boolean IsPrime=true;
	  if(n<=1)
	  {
		  System.out.println("prime number");
		  IsPrime=false;
		 
	  }
	 
	  for(int i=2;i<=n/2;i++)
	  {
		  if(n%i==0)
		  {
			  IsPrime=false;
		  }
	  }
	  
	  if(IsPrime)
	  {
		  System.out.println("Is Prime Number");
	  }
	  else
	  {
		  System.out.println("Is not a Prime Number");
	  }
	}
	   
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter a number ");
//		int no=sc.nextInt();
//		boolean flag=true;
//		if(no<=1) {
//		   flag=false;
//		}
//		for(int i=2;i<=no/2;i++)
//		{
//			if(no%i==0)
//			{
//				flag=false;
//				break;
//			}
//		}
//        System.out.println(flag?"is prime":"is not prime");
//        sc.close();
//	}

}
}
