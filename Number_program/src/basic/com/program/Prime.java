package basic.com.program;

public class Prime {

	public static void main(String[] args) {
		int n=4;
		boolean flag=true;
		if(n<=1) {
			flag=false;
		}
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag=false;
				break;
			}
		}
		System.out.println(flag? "prime":"not prime");
	}

}
