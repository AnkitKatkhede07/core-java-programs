package string.com;

public class Find_ASCII_Value_Characters {

	public static void main(String[] args) {
		String str = "ABC";

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            System.out.println(ch + " = " + (int)ch);
        }
	}

}
