package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> stringArrayList = new ArrayList<>();

        stringArrayList.add("Virat Kohli");
        stringArrayList.add("rohit sharma");
        stringArrayList.add("Ganguly");
        stringArrayList.add("rahul Dravid");

//        for(int i = 0; i < stringArrayList.size(); i++)
//        {
//            System.out.println(stringArrayList.get(i));
//        }

        for(String player : stringArrayList) {
            System.out.println(player);
        }

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(10);
        arrayList.add(25);
        arrayList.add(7);
        arrayList.add(42);
        arrayList.add(32);
        arrayList.add(32);
        arrayList.add(32);
        arrayList.add(32);
        arrayList.add(32);arrayList.add(32);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);arrayList.add(null);
        arrayList.add(null);arrayList.add(null);



//       System.out.println(arrayList);

        arrayList.addFirst(12);

     //   System.out.println(arrayList);

        arrayList.add(3,121);
      //  System.out.println(arrayList);

     //   System.out.println("size of the array list = " + arrayList.size());

        arrayList.remove(3);

//        arrayList.add(null);
//
//        for(int index = 0; index < arrayList.size(); index++) {
//            System.out.println("Index = " + index + " value = " + arrayList.get(index));
//        }
//
//        for (int value : arrayList) {
//            System.out.println("Advanced for loop printing the values of arraylist " + value);
//        }

      //  Collections.sort(arrayList);

    //    System.out.println(arrayList);

     //   System.out.println( Collections.binarySearch(arrayList,45));




    }


}
