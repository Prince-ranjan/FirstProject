package org.example;

import java.util.Scanner;

public class nestedLoopDemo {

    public static void main(String[] args) {
        printPyramid();
    }

    static void printSquareStarPattern() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me the size of square : ");

        int size = scanner.nextInt();

        for(int i = 1; i <= size; i++) {
            for(int j = 1; j <= size; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void printRectangleStarPattern() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me the length of rectangle : ");

        int length = scanner.nextInt();

        System.out.println("Give me the width of rectangle : ");

        int width = scanner.nextInt();

        for(int i = 1; i <= length; i++) {
            for(int j = 1; j <= width; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }


    static void printRightAngleTraingleStarPattern() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me the side of tringle : ");

        int side = scanner.nextInt();

        for(int i = 1; i <= side; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void printReverseRightAngleTraingleStarPattern() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me the side of tringle : ");

        int side = scanner.nextInt();

        for(int i = side; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void printPyramid() {
        System.out.println("     1");
                System.out.println("    1 2");
                        System.out.println("   1 2 3");
                                System.out.println("  1 2 3 4");
                                        System.out.println(" 1 2 3 4 5");
    }




}

/*

for(init; cond; update) { // outer loop
    for(init; cond; update {  // inner loop1

    }
    for(init; cond; update {  // inner loop2

    }
    for(init; cond; update {  // inner loop3

    }

}

print a square star patter with side =  n;

print a rectangle len * bred
e.g
 2*4
 **
 **
 **
 **





*****
*****
*****
*****
*****

print a right-angled triangle

size = 5

*
**
***
****
*****


Number Pyramid

     1
    1 2
   1 2 3
  1 2 3 4
 1 2 3 4 5



 */
