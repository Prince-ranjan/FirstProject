package org.example;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapDemo {

    public String[] sortPeople(String[] names, int[] heights) {

        TreeMap<Integer,String>  heightNameMap = new TreeMap<>();

        for(int i = 0; i < names.length; i++) {
            int currentHeight = heights[i];

            String currentName = names[i];

            heightNameMap.put(currentHeight,currentName);
        }
        heightNameMap.reversed();

        System.out.println(heightNameMap);

        String[] sortedPeople = new String[names.length];
        int i =0;

        for(String value : heightNameMap.descendingMap().values()) {
            sortedPeople[i++] = value;
        }



        return sortedPeople;
    }
}
