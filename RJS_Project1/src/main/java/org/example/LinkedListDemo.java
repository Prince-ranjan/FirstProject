package org.example;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        ArrayList<Integer> arrayList = new ArrayList<>();

        linkedList.add(1);
        linkedList.add(11);
        linkedList.add(10);
        linkedList.add(1123);
        linkedList.add(112);
        linkedList.add(178);
        linkedList.add(null);

        System.out.println(linkedList);


        arrayList.add(1);
        arrayList.add(11);
        arrayList.add(10);
        arrayList.add(1123);
        arrayList.add(112);
        arrayList.add(178);

        long startTime, endTime;

        startTime = System.currentTimeMillis();

        for(int i = 0; i < 500000; i++) {
            linkedList.add(100 + i);
        }

        endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);


        startTime = System.currentTimeMillis();

        for(int i = 0; i < 500000; i++) {
            arrayList.add(100 + i);
        }

        endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);

    }
}

/*
Adding an element in an arraylist in middle is much much expensive that adding an element in middle in a linkedlist
 */