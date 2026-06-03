package class_program;

import java.util.*;

public class Wordusingmap {

    public static void main(String[] args) {

        String s = "java spring java sql spring java";
        String[] words = s.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}