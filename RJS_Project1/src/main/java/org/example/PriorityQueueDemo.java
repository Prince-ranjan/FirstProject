package org.example;

import java.util.Arrays;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer>  pq = new PriorityQueue<>(Comparator.reverseOrder());
// PriorityQueue is implemented using Complete Binary Tree
        pq.offer(23);
        pq.offer(11);
        pq.offer(45);
        pq.offer(2);
        pq.offer(2);
        pq.offer(2);
        pq.offer(2);
        pq.offer(100);
        pq.offer(100);
        pq.offer(100);
        pq.offer(100);


        while(!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
