package org.example;

import java.util.Scanner;

public class loopDemo {

    public static void main(String[] args) {

//        for(int i = 1; i <= 10; i++) {
//            int value = 5 * i; // 5
//            System.out.println("5 * " + i + " = " + value);
//        }

//        for(int i = 5; i <= 50; i+=5) {
//            System.out.println(i);
//        }
//
//        printEvenSmart();

        reverseNumber();
    }

    static void printEvenSmart() {
        for(int i = 2; i <= 100; i+=2) // i = i + 2
        {
            System.out.print(i + " ");
        }
    }
    static void printEven() {
        for(int i = 1; i <= 100; i++) {
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    static void reverseNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me the number to reverse");
        int number = scanner.nextInt();

        while(number > 0) { //  147   , 14 ,  1
            int rem = number % 10; // 7 , 4 , 1
            System.out.print(rem);
            number /= 10; // number = number / 10 // 14 14 / 10 = 1 / 10 = 0

        }


    }
}

/*


take a number from user and reverse it.

ex :- 147

147 % 10 = 7
14 % 10 =  4
1 % 10 = 1
0

return 741

print all the even number between 1 and 100



Print the table of 5 in java

loops :-

counter-controlled loop

it is also called for loop in java

for(initialization; condition; update) {

}


Sentinel Loops

while(condition)
{
}


 */