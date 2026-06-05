package com.fileHadling;

import java.io.*;

public class CountNumberLinesWordsandCharacters {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
                new FileReader("input.txt"));

        int lines = 0;
        int words = 0;
        int chars = 0;

        String line;

        while ((line = br.readLine()) != null) {
            lines++;
            chars += line.length();

            String[] arr = line.trim().split("\\s+");

            if (!line.trim().isEmpty()) {
                words += arr.length;
            }
        }

        br.close();

        System.out.println("Lines = " + lines);
        System.out.println("Words = " + words);
        System.out.println("Characters = " + chars);
    }
}