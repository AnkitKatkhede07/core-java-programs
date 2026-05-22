package string.com;

public class Count_Special_Characters {

	public static void main(String[] args) {
		String str = "Java@123#";
        int count = 0;

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(!Character.isLetterOrDigit(ch)) {
                count++;
            }
        }

        System.out.println(count);
    }
}