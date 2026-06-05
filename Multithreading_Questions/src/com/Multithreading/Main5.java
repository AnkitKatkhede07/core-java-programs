package com.Multithreading;
class SumThread extends Thread {
    int[] arr;
    int start, end;
    int sum = 0;

    SumThread(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i < end; i++) {
            sum += arr[i];
        }
    }
}

public class Main5 {
    public static void main(String[] args) throws Exception {

        int[] arr = {10,20,30,40,50,60};

        SumThread t1 = new SumThread(arr,0,3);
        SumThread t2 = new SumThread(arr,3,6);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        int total = t1.sum + t2.sum;

        System.out.println("Total Sum = " + total);
    }
}