package string.com;

public class Check_String_Contains_Only_Digits {

	public static void main(String[] args) {
		 String str = "12345";
	        boolean flag = true;

	        for(int i = 0; i < str.length(); i++) {
	            if(!Character.isDigit(str.charAt(i))) {
	                flag = false;
	                break;
	            }
	        }

	        if(flag)
	            System.out.println("Only Digits");
	        else
	            System.out.println("Not Only Digits");
	}
}
