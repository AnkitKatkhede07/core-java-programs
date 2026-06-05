package com.Multithreading;
class NumberPrinter1 {
    private int num = 1;
    private final int LIMIT = 100;

    public synchronized void printOdd() {
        while (num <= LIMIT) {
            while (num % 2 == 0) {
                try { wait(); } catch (Exception e) {}
            }
            if (num <= LIMIT) {
                System.out.println("Odd Thread : " + num++);
                notify();
            }
        }
    }

    public synchronized void printEven() {
        while (num <= LIMIT) {
            while (num % 2 != 0) {
                try { wait(); } catch (Exception e) {}
            }
            if (num <= LIMIT) {
                System.out.println("Even Thread : " + num++);
                notify();
            }
        }
    }
}