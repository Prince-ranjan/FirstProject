package org.example;

import java.util.Scanner;

public class arrayDemo {
    public static void main(String[] args) {
        findMaxElement();
//        int[] arr = new int[10];
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 3;
//        arr[3] = 4;
//        arr[4] = 5;
//
//        for(int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

    }

    static void findMaxElement() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me the size of array :  ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < size; i++) {
            System.out.println("Give the value at index " + i + " ");
            arr[i] = scanner.nextInt();
        }

        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        // 3 5 7 10 11 45 17
        int maxElem = arr[0];// 45

        for(int i = 1; i < size; i++) {
            if(maxElem < arr[i]) {
                maxElem = arr[i];
            }
        }

        System.out.println("Max Elem = " + maxElem);
    }
}
/*

ArrayOutOfBoundException
First Data Structure

Array :- ordered collection of element of the same type

0 1 2 3 4


find the max element in an array


Data-Structure:-
Array
LinkedList
Stack
Queue
hashset
treeset
hashmap
treemap
tree
Graph
Trie


container


 */
