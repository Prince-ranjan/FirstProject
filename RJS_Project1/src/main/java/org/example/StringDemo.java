package org.example;

public class StringDemo {
    public static void main(String[] args) {

        long startTime, endTime;

        String str = "hello World !";

        startTime = System.currentTimeMillis(); //  7:10
        for(int i = 0; i < 100000; i++) {
            str += "a";
        }
        endTime =System.currentTimeMillis();// 7: 11

        System.out.println(endTime - startTime);

        StringBuilder sb = new StringBuilder("Hello World !");

        startTime = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++) {
            sb.append("a");
        }
        endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);

        StringBuffer sbb = new StringBuffer("HELLO WORLD!");
        startTime = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++) {
            sbb.append("a");
        }
        endTime = System.currentTimeMillis();

        System.out.println(endTime-startTime);
    }
}
