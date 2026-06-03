package class_program;

import java.util.HashMap;
import java.util.ArrayList;

public class GroupAnagrams {

    public static void main(String[] args) {

        String[] words = {"eat", "tea", "ate", "tan", "nat", "bat"};

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (String word : words) {

            int[] freq = new int[26];

            for (int i = 0; i < word.length(); i++) {
                freq[word.charAt(i) - 'a']++;
            }

            String key = "";

            for (int i = 0; i < 26; i++) {
                key += freq[i] + "#";
            }

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(word);
        }

        for (ArrayList<String> group : map.values()) {
            System.out.println(group);
        }
    }
}