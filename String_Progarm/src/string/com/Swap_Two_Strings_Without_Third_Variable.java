package string.com;

public class Swap_Two_Strings_Without_Third_Variable {

	public static void main(String[] args) {
		String a = "Hello";
        String b = "Java";

        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());

        System.out.println("a = " + a);
        System.out.println("b = " + b);
	}

}
