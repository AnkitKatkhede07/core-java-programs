package number.com;

public class Sapwing {

	public static void main(String[] args) {
		int a=10,b=5,c=2;
	   int temp=a;
	    a=b;
	    b=temp;
	    
	    temp=b;
	    b=c;
	    c=temp;
	    
	   temp=a;
	   a=b;
	   b=temp;
	    System.out.println(a+" "+b+"  "+c);
		
	}

}
