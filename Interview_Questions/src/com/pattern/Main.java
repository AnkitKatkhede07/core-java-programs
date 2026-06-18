package com.pattern;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        String s = "abcabcbb";

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int max = 0;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {

            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));

            if (right - left + 1 > max) {
                max = right - left + 1;
                start = left;
            }
        }

        String longest = s.substring(start, start + max);

        System.out.println("Longest Substring = " + longest);
        System.out.println("Length = " + max);
    }
}