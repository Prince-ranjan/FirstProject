package org.example;

import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
        int a = 19;
        int b = 8;

        Scanner scanner = new Scanner(System.in);
        int sumOfAandB = a + b;
        System.out.println("additiopn of a and b = " + sumOfAandB);

        int diffOfAandB = a - b;
        System.out.println("diff of a and b = " + diffOfAandB);

        int mulOfAandB = a * b;
        System.out.println("multiplication of a and b = " + mulOfAandB);

        System.out.println(a++);
        System.out.println(a);

        a += 15; // a = a + 15
        System.out.println(a);

        b -= 12; // b = b - 12
        System.out.println(b);

        a /= 7; // a = a /7;
        System.out.println(a);

        if( true && true) { // true
            System.out.println("case 1");
        }
        if( true && false) { // false
            System.out.println("case 2");
        }
        if( false && false) { // false
            System.out.println("case 3");
        }
        if( true || false) { // true
            System.out.println("case 4");
        }
        if( false || false) { // false
            System.out.println("case 5");
        }
        if(!false) { // true
            System.out.println("case 6");
        }
        if(!true) { // false
            System.out.println("case 7");
        }

        while(true) {
            System.out.println("give me your age : ");
            int age = scanner.nextInt();
            if(age >= 18)
            {
                System.out.println("You are eligible to vote");
            }
            else{
                System.out.println("you are a minor");
            }
            if(age == -1 ) {
                break;
            }
        }

    }
}
/*

Arithematic operator

+ = add
- = sub
* = mul
/ = division
% = modulo
++ = increment
-- = decrement
pre = change the value in the same statement
post = changes the value after execution of the current statement


Comparison

> :- greater than
< :- lesser than
== :- equal to
!= :- not equal to
>= :-  greater than or  equal to
<= less than or equal to


Logical

&& :- logical AND

|| :- logical OR

! :- Logical NOT

 T AND T = T
 T AND F = F
 F AND T = F
 F AND F = F

 T  OR T = T
 T OR F = T
 F OR T = T
 F OR F = F

 !T = F
 !F = T




compound operators

+=  :- add and assign
-= :-  sub and assign
*=  :- mul and assign
/+ :- divide and assign
%= :-  modulo and assign



 */
