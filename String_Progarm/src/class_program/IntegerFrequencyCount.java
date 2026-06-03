package class_program;

import java.util.ArrayList;

public class IntegerFrequencyCount {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(20);
        list.add(40);

        for (int i = 0; i < list.size(); i++) {

            boolean alreadyCounted = false;

            // Check if current element appeared before
            for (int k = 0; k < i; k++) {
                if (list.get(i).equals(list.get(k))) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    count++;
                }
            }

            System.out.println(list.get(i) + " -> " + count);
        }
    }
}