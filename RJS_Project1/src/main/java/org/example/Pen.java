package org.example;

public class Pen {
    private String type;
    private String brand;
    private String inkColor;

    public String countryOfOrigin;


    public Pen(String type, String brand, String inkColor) {
        this.type = type;
        this.brand = brand;
        this.inkColor = inkColor;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public String getType() {
        return type;
    }
}
