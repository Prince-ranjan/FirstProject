package org.example;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());
// TreeSet is implemented using Red black tree
        treeSet.add(1);
        treeSet.add(11);
        treeSet.add(10);
        treeSet.add(1123);
        treeSet.add(112);
        treeSet.add(178);
        treeSet.add(178);
        treeSet.add(178);


        System.out.println(treeSet);

    }
}
