package class_program;
/**Problem Statement

Given a string, the task is to find the first character that does not repeat in the entire string. If no such character exists, the
program should indicate that no non-repeated character was found.

Example 1:

. Input: "swiss"
. Output: 'w' (The first non-repeated character is 'w')

Example 2:

. Input: "programming"
. Output: 'p' (The first non-repeated character is 'p')

Example 3:

. Input: "aabbcc"

. Output: No non-repeated character found.**/

public class NonRepeating {

    public static void main(String[] args) {
        String str = "swiss";
        boolean found = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println("The first non-repeated character is: " + ch);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No non-repeated character found");
        }
    }
}