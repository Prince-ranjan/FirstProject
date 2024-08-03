package org.example;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> rankingOfPlayerMap = new HashMap<>();

        rankingOfPlayerMap.put("Virat", 1);

        rankingOfPlayerMap.put("Surya", 2);

        rankingOfPlayerMap.put("pandya", 3);

        rankingOfPlayerMap.put("pandya", 3);

        rankingOfPlayerMap.put("Surya", 3);

        // key and other is value == key value remains unique

       // System.out.println(rankingOfPlayerMap);

        System.out.println(rankingOfPlayerMap.get("Surya"));

        System.out.println(rankingOfPlayerMap.keySet());

        System.out.println(rankingOfPlayerMap.containsValue(1));

        System.out.println(rankingOfPlayerMap.containsKey("Surya"));



    }

    public String[] sortPeople(String[] names, int[] heights) {

        HashMap<Integer,String> heightNameMap = new HashMap<>();

        for(int i = 0; i < names.length; i++) {
            int currentHeight = heights[i];

            String currentName = names[i];

            heightNameMap.put(currentHeight,currentName);
        }

        System.out.println(heightNameMap);

        return new String[] {};
    }
}
