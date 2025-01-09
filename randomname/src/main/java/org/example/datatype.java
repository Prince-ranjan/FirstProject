package org.example;

import java.util.Scanner;

public class datatype {
    public static void main(String[] args) {
        String str;
        int number;
        char alphabet ;
        double real;
        boolean isTrue;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a number");
        number = scanner.nextInt();

        System.out.println("Give me a character");
        alphabet = scanner.nextLine().charAt(0);

        System.out.println("Give a double : ");
        real = scanner.nextDouble();

        System.out.println("Give a boolean: ");
        isTrue = scanner.nextBoolean();

        System.out.println("Give me a string: ");
        str = scanner.nextLine();

//        isTrue = true;
//
//        str = "This is a string data-type variable";
//
//        number = 10;
//
//        real = 12.25;
//
//        alphabet = 'a';

        System.out.println("this is string "+ str);
        System.out.println("this is a integer" + number);
        System.out.println("this is a boolean" + isTrue);
        System.out.println("this is a Character" + alphabet);
        System.out.println("this is a double" + real);


    }
}
/*

int = integer value
char = Character value = a b c d e f g h i
double = floating (1.345)
boolean = true and false
string = "Ranjan", "Hyderabad", "Java"

 */
