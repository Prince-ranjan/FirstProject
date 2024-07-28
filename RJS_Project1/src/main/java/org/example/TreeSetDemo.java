package org.example;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(1);
        treeSet.add(11);
        treeSet.add(10);
        treeSet.add(1123);
        treeSet.add(112);
        treeSet.add(178);

        System.out.println(treeSet);

    }
}
