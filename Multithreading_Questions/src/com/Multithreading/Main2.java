package com.Multithreading;

import java.util.LinkedList;
import java.util.Queue;

class SharedQueue {
    private Queue<Integer> queue = new LinkedList<>();
    private final int SIZE = 5;

    public synchronized void produce(int value) throws Exception {
        while (queue.size() == SIZE) {
            wait();
        }

        queue.add(value);
        System.out.println("Produced : " + value);
        notify();
    }

    public synchronized void consume() throws Exception {
        while (queue.isEmpty()) {
            wait();
        }

        int value = queue.remove();
        System.out.println("Consumed : " + value);
        notify();
    }
}

public class Main2 {
    public static void main(String[] args) {

        SharedQueue sq = new SharedQueue();

        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    sq.produce(i);
                }
            } catch (Exception e) {}
        });

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    sq.consume();
                }
            } catch (Exception e) {}
        });

        producer.start();
        consumer.start();
    }
}