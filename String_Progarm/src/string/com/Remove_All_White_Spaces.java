package string.com;

public class Remove_All_White_Spaces {

	public static void main(String[] args) {
		String str = " Java   Programming ";

        str = str.replaceAll("\\s", "");

        System.out.println(str);

	}

}
