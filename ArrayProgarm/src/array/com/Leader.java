package array.com;

public class Leader {

	public static void main(String[] args) {
		int num[]= {16,17,4,3,5,2};
		for(int i=0;i<num.length;i++)
		{
			boolean isleader=true;
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]<num[j]) {
					isleader=false;
					break;
				}
			}
			if(isleader) {
			System.out.print(num[i]+" ");	
			}
		}
		

	}

}
