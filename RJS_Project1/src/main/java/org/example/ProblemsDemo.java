package org.example;

import java.util.Scanner;

public class ProblemsDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the distance in Kilometer :- ");

        double kilometer = scanner.nextDouble();

        double miles = 0.62 * kilometer;

        System.out.println("Miles = " + miles);

    }

    public static void helper(){
        int distance = 100;

        System.out.println(distance* 0.62);

    }

    public static double kilometerIntoMiles(double kilometer) {
        double miles = 0.62 * kilometer;

        return miles;
    }

    // functions help us in reducing the deplicay of code

}
