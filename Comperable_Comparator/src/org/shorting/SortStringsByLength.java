package org.shorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortStringsByLength {

    public static void main(String[] args) {

        ArrayList<String> list =
                new ArrayList<>(Arrays.asList(
                        "Java",
                        "Spring",
                        "SQL",
                        "Microservices"
                ));

        System.out.println("Before Sorting:");
        System.out.println(list);

        Collections.sort(list, new Comparator<String>() {

            @Override
            public int compare(String s1, String s2) {

                return s1.length() - s2.length();
            }
        });

        System.out.println("After Sorting:");
        System.out.println(list);
    }
}