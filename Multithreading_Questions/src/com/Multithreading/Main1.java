package com.Multithreading;

public class Main1 {
    public static void main(String[] args) {
        NumberPrinter1 np = new NumberPrinter1();

        Thread odd = new Thread(() -> np.printOdd());
        Thread even = new Thread(() -> np.printEven());

        odd.start();
        even.start();
    }
}