package com.Multithreading;
class SequencePrinter {
    private int num = 1;
    private int max = 12;

    public synchronized void print(int remainder) {
        while (num <= max) {

            while (num % 3 != remainder && num <= max) {
                try { wait(); } catch (Exception e) {}
            }

            if (num <= max) {
                System.out.println(Thread.currentThread().getName()
                        + " : " + num++);
                notifyAll();
            }
        }
    }
}

public class Main3 {
    public static void main(String[] args) {

        SequencePrinter sp = new SequencePrinter();

        Thread t1 = new Thread(() -> sp.print(1), "Thread-1");
        Thread t2 = new Thread(() -> sp.print(2), "Thread-2");
        Thread t3 = new Thread(() -> sp.print(0), "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}