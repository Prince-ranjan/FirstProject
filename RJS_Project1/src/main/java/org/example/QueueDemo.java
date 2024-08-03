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

        firstUniqChar("leetcodelovecode");
    }
/*
ViratKohli
 */
    public static int firstUniqChar(String s) {

        char[] sChar = s.toCharArray();
        for(int i = 0; i < s.length(); i++) {
            boolean foundRepeatedChar = false;
            for(int j =  0; j < s.length();j++) {
                if(sChar[i] == sChar[j] && i != j) {
                    foundRepeatedChar = true;
                    break;
                }
            }
            if(foundRepeatedChar == false) {
                return i;
            }
        }

        return  -1;
    }

    public static int firstUniqCharWithQueue(String s) {
        return 0;
    }
}
