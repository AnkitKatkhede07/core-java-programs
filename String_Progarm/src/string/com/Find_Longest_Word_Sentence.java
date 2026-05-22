package string.com;

public class Find_Longest_Word_Sentence {

	public static void main(String[] args) {
		  String str = "Java programming language";

	        String words[] = str.split(" ");

	        String longest = "";

	        for(String word : words) {
	            if(word.length() > longest.length()) {
	                longest = word;
	            }
	        }

	        System.out.println(longest);
	    }

}
