package string.com;

public class Toggle_Case_Characters {

	public static void main(String[] args) {
		  String str = "JaVa";

	        String result = "";

	        for(int i = 0; i < str.length(); i++) {

	            char ch = str.charAt(i);

	            if(Character.isUpperCase(ch))
	                result += Character.toLowerCase(ch);
	            else
	                result += Character.toUpperCase(ch);
	        }

	        System.out.println(result);

	}

}
