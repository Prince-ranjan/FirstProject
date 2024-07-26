package org.example;

public class Square extends Shape{

    double lengthOfSide;

    public Square(double lengthOfSide) {
        this.lengthOfSide = lengthOfSide;
    }

    @Override
    double area() {
        return lengthOfSide * lengthOfSide;
    }

    @Override
    double perimeter() {
        return 4 * lengthOfSide;
    }
}
