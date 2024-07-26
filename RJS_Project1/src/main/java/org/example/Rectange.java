package org.example;

public class Rectange extends Shape{

    double length;

    double breadth;

    public Rectange(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double area() {
        return length * breadth;
    }

    @Override
    double perimeter() {
        return 2 * length* breadth;
    }
}
