package string;

public class All_method {

	public static void main(String[] args) {
		String str = "  Java Programming  ";
		String str1 = "Java";
		String str2 = "java";

		// length()
		System.out.println("length(): " + str.length());

		// charAt()
		System.out.println("charAt(): " + str1.charAt(2));

		// toUpperCase()
		System.out.println("toUpperCase(): " + str1.toUpperCase());

		// toLowerCase()
		System.out.println("toLowerCase(): " + str1.toLowerCase());

		// equals()
		System.out.println("equals(): " + str1.equals(str2));

		// equalsIgnoreCase()
		System.out.println("equalsIgnoreCase(): " + str1.equalsIgnoreCase(str2));

		// contains()
		System.out.println("contains(): " + str.contains("Java"));

		// startsWith()
		System.out.println("startsWith(): " + str.trim().startsWith("Java"));

		// endsWith()
		System.out.println("endsWith(): " + str.trim().endsWith("Programming"));

		// substring()
		System.out.println("substring(): " + str1.substring(1));

		// replace()
		System.out.println("replace(): " + str1.replace('a', 'o'));

		// trim()
		System.out.println("trim(): " + str.trim());

		// indexOf()
		System.out.println("indexOf(): " + str1.indexOf('v'));

		// lastIndexOf()
		System.out.println("lastIndexOf(): " + str1.lastIndexOf('a'));

		// isEmpty()
		String s = "";
		System.out.println("isEmpty(): " + s.isEmpty());

		// concat()
		System.out.println("concat(): " + str1.concat(" Language"));

		// split()
		String data = "Java Python C";

		String arr[] = data.split(" ");

		System.out.println("split():");

		for (String value : arr) {
			System.out.println(value);
		}

		// toCharArray()
		char ch[] = str1.toCharArray();

		System.out.println("toCharArray():");

		for (char c : ch) {
			System.out.println(c);
		}
	}
}