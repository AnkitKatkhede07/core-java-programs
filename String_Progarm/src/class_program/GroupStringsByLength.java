package class_program;

import java.util.ArrayList;
import java.util.HashMap;

public class GroupStringsByLength {

    public static void main(String[] args) {

        String[] arr = {"Java", "SQL", "Spring", "AWS"};

        HashMap<Integer, ArrayList<String>> map = new HashMap<>();

        for (String str : arr) {

            int len = str.length();

            if (!map.containsKey(len)) {
                map.put(len, new ArrayList<>());
            }

            map.get(len).add(str);
        }

        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}