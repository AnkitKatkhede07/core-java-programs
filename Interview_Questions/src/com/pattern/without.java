package com.pattern;
public class without {
    public static void main(String[] args) {

        String s = "abcabcbb";

        int max = 0;
        String longest = "";

        for (int i = 0; i < s.length(); i++) {

            String temp = "";

            for (int j = i; j < s.length(); j++) {

                if (temp.indexOf(s.charAt(j)) != -1) {
                    break;
                }

                temp += s.charAt(j);

                if (temp.length() > max) {
                    max = temp.length();
                    longest = temp;
                }
            }
        }

        System.out.println("Longest Substring = " + longest);
        System.out.println("Length = " + max);
    }
}