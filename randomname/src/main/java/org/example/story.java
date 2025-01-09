package org.example;

import java.util.Scanner;

public class story {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give us your name : ");
        String name;
        name = scanner.nextLine();

        System.out.println("Please give the name of your city :");
        String city; // declaration
        city = scanner.nextLine(); // initialization

        int age = scanner.nextInt();

        System.out.println("Hi My Name is " + name + ". and i live in " + city + "." + " i am "+ age + "years old.");

    }
}
/*

        We want create a story about a person
        name
        city
        age
        profession
        pet name
 */
