package org.example;

public class conditionalDemo {
    public static void main(String[] args) {
        int age = 19;

        if(age >= 25) {
            System.out.println("You are eligible to stand in the election");
        }
        else{
            System.out.println("You are not eligible to stand in the election");
        }

        findQuadrant(5,9);
    }

    static void findQuadrant(int x, int y) {
        if(x > 0 && y > 0) {
            System.out.println("first quadrant");
        }
        if(x < 0 && y > 0) {
            System.out.println("second Quadrant");
        }
        if(x < 0 && y < 0) {
            System.out.println("third quadrant");
        }
        if(x > 0 && y < 0) {
            System.out.println("Fourth Quadrant");
        }
    }
}

/*

if(condition) {
 all the statement to be executed
}

Error :- syntex



cartesian plane


 */
