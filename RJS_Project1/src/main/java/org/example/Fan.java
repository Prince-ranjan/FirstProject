package org.example;

public class Fan {
    private String type;
    private String brand;
    private String color;
    private int numberOfWings;
    private int power;

    public Fan(String type, String brand, String color, int numberOfWings, int power) {
        this.type = type;
        this.brand = brand;
        this.color = color;
        this.numberOfWings = numberOfWings;
        this.power = power;
    }

    public Fan(String type) {
        this.type = type;
    }

    public Fan(String  type, String brand, String color) {
        this.type = type;
        this.brand = brand;
        this.color = color;
    }
// method overloading
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
