package org.example;

public class Circle extends Shape{

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }

    // when ever we override something exactly giving a different form to it.
    // the concept where we override the value is called method overriding.

    // Method overloading :-

}
