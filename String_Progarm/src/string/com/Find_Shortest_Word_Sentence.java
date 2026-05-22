package string.com;

public class Find_Shortest_Word_Sentence {

	public static void main(String[] args) {
		  String str = "Java is easy";

	        String words[] = str.split(" ");

	        String shortest = words[0];

	        for(String word : words) {
	            if(word.length() < shortest.length()) {
	                shortest = word;
	            }
	        }

	        System.out.println(shortest);
	    }

}
