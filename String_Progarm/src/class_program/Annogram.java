package class_program;

public class Annogram {
    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        int[] freq = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i)]++;
            freq[str2.charAt(i)]--;
        }

        boolean flag = true;

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                flag = false;
                break;
            }
        }

        System.out.println(flag ? "Anagram" : "Not Anagram");
    }
}
