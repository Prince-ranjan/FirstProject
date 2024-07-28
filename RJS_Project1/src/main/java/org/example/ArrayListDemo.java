package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

    public static void main(String[] args) {
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



       System.out.println(arrayList);

        arrayList.addFirst(12);

     //   System.out.println(arrayList);

        arrayList.add(3,121);
      //  System.out.println(arrayList);

        System.out.println("size of the array list = " + arrayList.size());

        arrayList.remove(3);

//        arrayList.add(null);

        for(int index = 0; index < arrayList.size(); index++) {
            System.out.println("Index = " + index + " value = " + arrayList.get(index));
        }

      //  Collections.sort(arrayList);

        System.out.println(arrayList);

     //   System.out.println( Collections.binarySearch(arrayList,45));


    }


}
