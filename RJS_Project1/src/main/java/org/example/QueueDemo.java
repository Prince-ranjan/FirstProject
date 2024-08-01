package org.example;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> playerQueue = new LinkedList<>();

        playerQueue.add("Virat");
        playerQueue.offer("Rohit"); // enqueue
        playerQueue.offer("Bumrah");
        playerQueue.offer("Rahul");

        System.out.println("Queue = " + playerQueue);

        playerQueue.poll(); // dequeue;

        System.out.println("Queue = " + playerQueue);
    }
}
