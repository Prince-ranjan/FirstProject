package org.example;

public class IfElseDemo {

    public static void main(String[] args) {

        int i = 0;

        while (i < 25) {
            if(i % 2 == 0) {
                System.out.println(i + " is Even");
            }
            else{
                System.out.println(i + " is Odd");
            }
            i++;
        }




//        for(int i = 0 ; i < 25; i++) {
//            if(i % 2 == 0) {
//                System.out.println(i + " is Even");
//            }
//            else{
//                System.out.println(i + " is Odd");
//            }
//        }
    }
}
