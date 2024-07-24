package org.example;

public class Television {
    String Brand;
    String Color;
    String size;
    String DateOfManufacture;
    Boolean isWarrentyExpired;


    public void powerOn() {
        System.out.println("Start the tV");
    }

    public void powerOf() {
        System.out.println("turn of the TV");
    }

    public Television() {
    }

    public Television(String brand, String color, String size, String dateOfManufacture, Boolean isWarrentyExpired) {
        Brand = brand;
        Color = color;
        this.size = size;
        DateOfManufacture = dateOfManufacture;
        this.isWarrentyExpired = isWarrentyExpired;
    }

    public Television(String dateOfManufacture, Boolean isWarrentyExpired) {
        DateOfManufacture = dateOfManufacture;
        this.isWarrentyExpired = isWarrentyExpired;
    }

    public Television(String brand, String color, String size) {
        Brand = brand;
        Color = color;
        this.size = size;
    }


}
